package com.mojang.blaze3d.systems;

@fic
public class ScissorState {
   private boolean enabled;
   private int x;
   private int y;
   private int width;
   private int height;

   public void enable(int $$0, int $$1, int $$2, int $$3) {
      this.enabled = true;
      this.x = $$0;
      this.y = $$1;
      this.width = $$2;
      this.height = $$3;
   }

   public void disable() {
      this.enabled = false;
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   public void copyFrom(ScissorState $$0) {
      this.enabled = $$0.enabled;
      this.x = $$0.x;
      this.y = $$0.y;
      this.width = $$0.width;
      this.height = $$0.height;
   }
}
