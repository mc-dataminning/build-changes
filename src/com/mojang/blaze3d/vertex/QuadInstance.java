package com.mojang.blaze3d.vertex;

import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.LightCoordsUtil;

public class QuadInstance {
   private short brightness0 = 255;
   private short brightness1 = 255;
   private short brightness2 = 255;
   private short brightness3 = 255;
   private int lightCoords0 = 15728880;
   private int lightCoords1 = 15728880;
   private int lightCoords2 = 15728880;
   private int lightCoords3 = 15728880;
   private int overlayCoords = OverlayTexture.NO_OVERLAY;
   private int color = -1;

   public int getColor() {
      return this.color;
   }

   public short getBrightness(final int vertex) {
      return switch (vertex) {
         case 0 -> this.brightness0;
         case 1 -> this.brightness1;
         case 2 -> this.brightness2;
         case 3 -> this.brightness3;
         default -> throw new IndexOutOfBoundsException();
      };
   }

   public int getLightCoords(final int vertex) {
      return switch (vertex) {
         case 0 -> this.lightCoords0;
         case 1 -> this.lightCoords1;
         case 2 -> this.lightCoords2;
         case 3 -> this.lightCoords3;
         default -> throw new IndexOutOfBoundsException();
      };
   }

   public int getLightCoordsWithEmission(final int vertex, final int lightEmission) {
      return LightCoordsUtil.lightCoordsWithEmission(this.getLightCoords(vertex), lightEmission);
   }

   public int overlayCoords() {
      return this.overlayCoords;
   }

   public void setBrightness(final int vertex, final short brightness) {
      switch (vertex) {
         case 0:
            this.brightness0 = brightness;
            break;
         case 1:
            this.brightness1 = brightness;
            break;
         case 2:
            this.brightness2 = brightness;
            break;
         case 3:
            this.brightness3 = brightness;
            break;
         default:
            throw new IndexOutOfBoundsException();
      }
   }

   public void setLightCoords(final int vertex, final int lightCoords) {
      switch (vertex) {
         case 0:
            this.lightCoords0 = lightCoords;
            break;
         case 1:
            this.lightCoords1 = lightCoords;
            break;
         case 2:
            this.lightCoords2 = lightCoords;
            break;
         case 3:
            this.lightCoords3 = lightCoords;
            break;
         default:
            throw new IndexOutOfBoundsException();
      }
   }

   public void setColor(final int color) {
      this.color = color;
   }

   public void setBrightness(final short brightness) {
      this.brightness0 = brightness;
      this.brightness1 = brightness;
      this.brightness2 = brightness;
      this.brightness3 = brightness;
   }

   public void setLightCoords(final int lightCoords) {
      this.lightCoords0 = lightCoords;
      this.lightCoords1 = lightCoords;
      this.lightCoords2 = lightCoords;
      this.lightCoords3 = lightCoords;
   }

   public void setOverlayCoords(final int overlayCoords) {
      this.overlayCoords = overlayCoords;
   }

   public void scaleBrightness(final float scale) {
      this.brightness0 = (short)Math.clamp((int)(this.brightness0 * scale), 0, 255);
      this.brightness1 = (short)Math.clamp((int)(this.brightness1 * scale), 0, 255);
      this.brightness2 = (short)Math.clamp((int)(this.brightness2 * scale), 0, 255);
      this.brightness3 = (short)Math.clamp((int)(this.brightness3 * scale), 0, 255);
   }
}
