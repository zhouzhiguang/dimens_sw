package com.github.razir.progressexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openProgressButtons.setOnClickListener {
            startActivity(ProgressButtonsActivity.getStartIntent(this))
        }

        openProgressButtonsJava.setOnClickListener {
            startActivity(com.github.razir.progressexample.java.ProgressButtonsActivity.getStartIntent(this))
        }

        openDrawableButtons.setOnClickListener {
            startActivity(DrawableButtonsActivity.getStartIntent(this))
        }

        openDrawableButtonsJava.setOnClickListener {
            startActivity(com.github.razir.progressexample.java.DrawableButtonsActivity.getStartIntent(this))
        }

        openRecyclerView.setOnClickListener {
            startActivity(RecyclerViewActivity.getStartIntent(this))
        }

        openRecyclerViewJava.setOnClickListener {
            startActivity(com.github.razir.progressexample.java.RecyclerViewActivity.getStartIntent(this))
        }
    }
}