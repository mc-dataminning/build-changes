package com.mojang.blaze3d.textures;

@fic
public abstract class GpuTexture implements AutoCloseable {
   private final TextureFormat format;
   private final int width;
   private final int height;
   private final int mipLevels;
   private final String label;
   protected AddressMode addressModeU = AddressMode.REPEAT;
   protected AddressMode addressModeV = AddressMode.REPEAT;
   protected FilterMode minFilter = FilterMode.NEAREST;
   protected FilterMode magFilter = FilterMode.LINEAR;
   protected boolean useMipmaps = true;

   public GpuTexture(String $$0, TextureFormat $$1, int $$2, int $$3, int $$4) {
      this.label = $$0;
      this.format = $$1;
      this.width = $$2;
      this.height = $$3;
      this.mipLevels = $$4;
   }

   public int getWidth(int $$0) {
      return this.width >> $$0;
   }

   public int getHeight(int $$0) {
      return this.height >> $$0;
   }

   public int getMipLevels() {
      return this.mipLevels;
   }

   public TextureFormat getFormat() {
      return this.format;
   }

   public void setAddressMode(AddressMode $$0) {
      this.setAddressMode($$0, $$0);
   }

   public void setAddressMode(AddressMode $$0, AddressMode $$1) {
      this.addressModeU = $$0;
      this.addressModeV = $$1;
   }

   public void setTextureFilter(FilterMode $$0, boolean $$1) {
      this.setTextureFilter($$0, $$0, $$1);
   }

   public void setTextureFilter(FilterMode $$0, FilterMode $$1, boolean $$2) {
      this.minFilter = $$0;
      this.magFilter = $$1;
      this.useMipmaps = $$2;
   }

   public String getLabel() {
      return this.label;
   }

   @Override
   public abstract void close();

   public abstract boolean isClosed();
}
