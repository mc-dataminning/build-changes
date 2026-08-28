package com.mojang.blaze3d.textures;

@fic
public enum TextureFormat {
   RGBA8(4),
   RED8(1),
   DEPTH32(4);

   private final int pixelSize;

   private TextureFormat(final int $$0) {
      this.pixelSize = $$0;
   }

   public int pixelSize() {
      return this.pixelSize;
   }

   public boolean hasColorAspect() {
      return this == RGBA8 || this == RED8;
   }

   public boolean hasDepthAspect() {
      return this == DEPTH32;
   }
}
