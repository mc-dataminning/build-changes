package com.mojang.blaze3d.platform;

import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import net.minecraft.client.gui.font.providers.FreeTypeUtil;
import net.minecraft.util.ARGB;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FreeType;
import org.lwjgl.util.spng.SPNG;
import org.lwjgl.util.spng.spng_ihdr;
import org.slf4j.Logger;

public final class NativeImage implements AutoCloseable {
   private static final Logger LOGGER = LogUtils.getLogger();
   private static final MemoryPool MEMORY_POOL = TracyClient.createMemoryPool("NativeImage");
   private static final Set<StandardOpenOption> OPEN_OPTIONS = EnumSet.of(
      StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   );
   private final NativeImage.Format format;
   private final int width;
   private final int height;
   private long pixels;
   private final long size;

   public NativeImage(final int width, final int height, final boolean zero) {
      this(NativeImage.Format.RGBA, width, height, zero);
   }

   public NativeImage(final NativeImage.Format format, final int width, final int height, final boolean zero) {
      if (width > 0 && height > 0) {
         this.format = format;
         this.width = width;
         this.height = height;
         this.size = (long)width * (long)height * (long)format.components();
         if (zero) {
            this.pixels = MemoryUtil.nmemCalloc(1L, this.size);
         } else {
            this.pixels = MemoryUtil.nmemAlloc(this.size);
         }

         MEMORY_POOL.malloc(this.pixels, (int)this.size);
         if (this.pixels == 0L) {
            throw new IllegalStateException("Unable to allocate texture of size " + width + "x" + height + " (" + format.components() + " channels)");
         }
      } else {
         throw new IllegalArgumentException("Invalid texture size: " + width + "x" + height);
      }
   }

   public NativeImage(final NativeImage.Format format, final int width, final int height, final long pixels) {
      if (width > 0 && height > 0) {
         this.format = format;
         this.width = width;
         this.height = height;
         this.pixels = pixels;
         this.size = (long)width * (long)height * (long)format.components();
      } else {
         throw new IllegalArgumentException("Invalid texture size: " + width + "x" + height);
      }
   }

   @Override
   public String toString() {
      return "NativeImage[" + this.format + " " + this.width + "x" + this.height + "@" + this.pixels + "]";
   }

   private boolean isOutsideBounds(final int x, final int y) {
      return x < 0 || x >= this.width || y < 0 || y >= this.height;
   }

   public static NativeImage read(final InputStream inputStream) throws IOException {
      ByteBuffer file = null;

      NativeImage var2;
      try {
         file = TextureUtil.readResource(inputStream);
         var2 = read(file);
      } finally {
         MemoryUtil.memFree(file);
         IOUtils.closeQuietly(inputStream);
      }

      return var2;
   }

   public static NativeImage read(final byte[] bytes) throws IOException {
      MemoryStack memoryStack = MemoryStack.stackGet();
      int bytesAvailable = memoryStack.getPointer();
      if (bytesAvailable < bytes.length) {
         ByteBuffer buffer = MemoryUtil.memAlloc(bytes.length);

         NativeImage var13;
         try {
            var13 = putAndRead(buffer, bytes);
         } finally {
            MemoryUtil.memFree(buffer);
         }

         return var13;
      } else {
         MemoryStack stack = MemoryStack.stackPush();

         NativeImage var5;
         try {
            ByteBuffer buffer = stack.malloc(bytes.length);
            var5 = putAndRead(buffer, bytes);
         } catch (Throwable var11) {
            if (stack != null) {
               try {
                  stack.close();
               } catch (Throwable var9) {
                  var11.addSuppressed(var9);
               }
            }

            throw var11;
         }

         if (stack != null) {
            stack.close();
         }

         return var5;
      }
   }

   private static NativeImage putAndRead(final ByteBuffer nativeBuffer, final byte[] bytes) throws IOException {
      nativeBuffer.put(bytes);
      nativeBuffer.rewind();
      return read(nativeBuffer);
   }

   public static NativeImage read(final ByteBuffer bytes) throws IOException {
      if (MemoryUtil.memAddress(bytes) == 0L) {
         throw new IllegalArgumentException("Invalid buffer");
      } else {
         long context = SPNG.spng_ctx_new(0);
         if (context == 0L) {
            throw new IllegalStateException("Failed to create new SPNG context");
         } else {
            NativeImage var12;
            try {
               MemoryStack stack = MemoryStack.stackPush();

               try {
                  SPNG.spng_set_chunk_limits(context, 1048576L, 1048576L);
                  checkSpngError("set buffer", SPNG.spng_set_png_buffer(context, bytes));
                  spng_ihdr header = spng_ihdr.calloc(stack);
                  checkSpngError("read header", SPNG.spng_get_ihdr(context, header));
                  int width = header.width();
                  int height = header.height();
                  PointerBuffer bufferSizePointer = stack.callocPointer(1);
                  checkSpngError("calculate size", SPNG.spng_decoded_image_size(context, 1, bufferSizePointer));
                  int size = Math.toIntExact(bufferSizePointer.get(0));
                  ByteBuffer pixels = null;

                  try {
                     pixels = MemoryUtil.memAlloc(size);
                     checkSpngError("decode image", SPNG.spng_decode_image(context, pixels, 1, 1));
                     long address = MemoryUtil.memAddress(pixels);
                     MEMORY_POOL.malloc(address, pixels.limit());
                     pixels = null;
                     var12 = new NativeImage(NativeImage.Format.RGBA, width, height, address);
                  } finally {
                     if (pixels != null) {
                        MemoryUtil.memFree(pixels);
                     }
                  }
               } catch (Throwable var25) {
                  if (stack != null) {
                     try {
                        stack.close();
                     } catch (Throwable var23) {
                        var25.addSuppressed(var23);
                     }
                  }

                  throw var25;
               }

               if (stack != null) {
                  stack.close();
               }
            } finally {
               SPNG.spng_ctx_free(context);
            }

            return var12;
         }
      }
   }

   private static void checkSpngError(final String operation, final int result) throws IOException {
      if (result != 0) {
         throw new IOException("SPNG operation '" + operation + "' failed: " + SPNG.spng_strerror(result) + " (" + result + ")");
      }
   }

   private void checkAllocated() {
      if (this.pixels == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   @Override
   public void close() {
      if (this.pixels != 0L) {
         MemoryUtil.nmemFree(this.pixels);
         MEMORY_POOL.free(this.pixels);
      }

      this.pixels = 0L;
   }

   public boolean isClosed() {
      return this.pixels == 0L;
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   public NativeImage.Format format() {
      return this.format;
   }

   private int getPixelABGR(final int x, final int y) {
      if (this.format != NativeImage.Format.RGBA) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixelRGBA only works on RGBA images; have %s", this.format));
      } else if (this.isOutsideBounds(x, y)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", x, y, this.width, this.height));
      } else {
         this.checkAllocated();
         long offset = ((long)x + (long)y * (long)this.width) * 4L;
         return MemoryUtil.memGetInt(this.pixels + offset);
      }
   }

   public int getPixel(final int x, final int y) {
      return ARGB.fromABGR(this.getPixelABGR(x, y));
   }

   public void setPixelABGR(final int x, final int y, final int pixel) {
      if (this.format != NativeImage.Format.RGBA) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "setPixelRGBA only works on RGBA images; have %s", this.format));
      } else if (this.isOutsideBounds(x, y)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", x, y, this.width, this.height));
      } else {
         this.checkAllocated();
         long offset = ((long)x + (long)y * (long)this.width) * 4L;
         MemoryUtil.memPutInt(this.pixels + offset, pixel);
      }
   }

   public void setPixel(final int x, final int y, final int pixel) {
      this.setPixelABGR(x, y, ARGB.toABGR(pixel));
   }

   public NativeImage mappedCopy(final IntUnaryOperator function) {
      if (this.format != NativeImage.Format.RGBA) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", this.format));
      } else {
         this.checkAllocated();
         NativeImage result = new NativeImage(this.width, this.height, false);
         int pixelCount = this.width * this.height;
         IntBuffer sourceBuffer = MemoryUtil.memIntBuffer(this.pixels, pixelCount);
         IntBuffer targetBuffer = MemoryUtil.memIntBuffer(result.pixels, pixelCount);

         for (int i = 0; i < pixelCount; i++) {
            int pixel = ARGB.fromABGR(sourceBuffer.get(i));
            int modified = function.applyAsInt(pixel);
            targetBuffer.put(i, ARGB.toABGR(modified));
         }

         return result;
      }
   }

   public int[] getPixelsABGR() {
      if (this.format != NativeImage.Format.RGBA) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixels only works on RGBA images; have %s", this.format));
      } else {
         this.checkAllocated();
         int[] result = new int[this.width * this.height];
         MemoryUtil.memIntBuffer(this.pixels, this.width * this.height).get(result);
         return result;
      }
   }

   public int[] getPixels() {
      int[] result = this.getPixelsABGR();

      for (int i = 0; i < result.length; i++) {
         result[i] = ARGB.fromABGR(result[i]);
      }

      return result;
   }

   public byte getLuminanceOrAlpha(final int x, final int y) {
      if (!this.format.hasLuminanceOrAlpha()) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "no luminance or alpha in %s", this.format));
      } else if (this.isOutsideBounds(x, y)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", x, y, this.width, this.height));
      } else {
         int offset = (x + y * this.width) * this.format.components() + this.format.luminanceOrAlphaOffset() / 8;
         return MemoryUtil.memGetByte(this.pixels + (long)offset);
      }
   }

   @Deprecated
   public int[] makePixelArray() {
      if (this.format != NativeImage.Format.RGBA) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.checkAllocated();
         int[] pixels = new int[this.getWidth() * this.getHeight()];

         for (int y = 0; y < this.getHeight(); y++) {
            for (int x = 0; x < this.getWidth(); x++) {
               pixels[x + y * this.getWidth()] = this.getPixel(x, y);
            }
         }

         return pixels;
      }
   }

   public void writeToFile(final File file) throws IOException {
      this.writeToFile(file.toPath());
   }

   public boolean copyFromFont(final FT_Face face, final int index) {
      if (this.format.components() != 1) {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      } else if (FreeTypeUtil.checkError(FreeType.FT_Load_Glyph(face, index, 4), "Loading glyph")) {
         return false;
      } else {
         FT_GlyphSlot glyph = Objects.requireNonNull(face.glyph(), "Glyph not initialized");
         FT_Bitmap bitmap = glyph.bitmap();
         if (bitmap.pixel_mode() != 2) {
            throw new IllegalStateException("Rendered glyph was not 8-bit grayscale");
         } else if (bitmap.width() == this.getWidth() && bitmap.rows() == this.getHeight()) {
            int bufferSize = bitmap.width() * bitmap.rows();
            ByteBuffer buffer = Objects.requireNonNull(bitmap.buffer(bufferSize), "Glyph has no bitmap");
            MemoryUtil.memCopy(MemoryUtil.memAddress(buffer), this.pixels, (long)bufferSize);
            return true;
         } else {
            throw new IllegalArgumentException(
               String.format(
                  Locale.ROOT,
                  "Glyph bitmap of size %sx%s does not match image of size: %sx%s",
                  bitmap.width(),
                  bitmap.rows(),
                  this.getWidth(),
                  this.getHeight()
               )
            );
         }
      }
   }

   public void writeToFile(final Path file) throws IOException {
      this.checkAllocated();
      long context = SPNG.spng_ctx_new(2);

      try (
         WritableByteChannel out = Files.newByteChannel(file, OPEN_OPTIONS);
         Arena arena = Arena.ofConfined();
      ) {
         MemoryStack stack = MemoryStack.stackPush();

         try {
            int width = this.getWidth();
            int height = Math.min(this.getHeight(), Integer.MAX_VALUE / width / this.format.components());
            if (height < this.getHeight()) {
               LOGGER.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.getHeight(), height);
            }

            NativeImage.WriteCallback writer = new NativeImage.WriteCallback(out);
            MemorySegment writerUpcall = writer.createUpcall(arena);
            checkSpngError("set output", SPNG.nspng_set_png_stream(context, writerUpcall.address(), 0L));
            spng_ihdr header = spng_ihdr.calloc(stack).width(width).height(height).color_type((byte)this.format.pngColorType).bit_depth((byte)8);
            checkSpngError("set header", SPNG.spng_set_ihdr(context, header));
            checkSpngError("write image", SPNG.nspng_encode_image(context, this.pixels, this.size, 256, 2));
            writer.throwIfException();
         } catch (Throwable var24) {
            if (stack != null) {
               try {
                  stack.close();
               } catch (Throwable var23) {
                  var24.addSuppressed(var23);
               }
            }

            throw var24;
         }

         if (stack != null) {
            stack.close();
         }
      } catch (IOException var27) {
         throw new IOException("Could not write image to the PNG file \"" + file.toAbsolutePath(), var27);
      } finally {
         SPNG.spng_ctx_free(context);
      }
   }

   public void copyFrom(final NativeImage from) {
      if (from.format() != this.format) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int components = this.format.components();
         this.checkAllocated();
         from.checkAllocated();
         if (this.width == from.width) {
            MemoryUtil.memCopy(from.pixels, this.pixels, Math.min(this.size, from.size));
         } else {
            int minWidth = Math.min(this.getWidth(), from.getWidth());
            int minHeight = Math.min(this.getHeight(), from.getHeight());

            for (int y = 0; y < minHeight; y++) {
               int fromOffset = y * from.getWidth() * components;
               int toOffset = y * this.getWidth() * components;
               MemoryUtil.memCopy(from.pixels + (long)fromOffset, this.pixels + (long)toOffset, (long)minWidth);
            }
         }
      }
   }

   public void fillRect(final int xs, final int ys, final int width, final int height, final int pixel) {
      for (int y = ys; y < ys + height; y++) {
         for (int x = xs; x < xs + width; x++) {
            this.setPixel(x, y, pixel);
         }
      }
   }

   public void copyRect(
      final int startX, final int startY, final int offsetX, final int offsetY, final int sizeX, final int sizeY, final boolean swapX, final boolean swapY
   ) {
      this.copyRect(this, startX, startY, startX + offsetX, startY + offsetY, sizeX, sizeY, swapX, swapY);
   }

   public void copyRect(
      final NativeImage target,
      final int sourceX,
      final int sourceY,
      final int targetX,
      final int targetY,
      final int sizeX,
      final int sizeY,
      final boolean swapX,
      final boolean swapY
   ) {
      for (int y = 0; y < sizeY; y++) {
         for (int x = 0; x < sizeX; x++) {
            int dx = swapX ? sizeX - 1 - x : x;
            int dy = swapY ? sizeY - 1 - y : y;
            int source = this.getPixelABGR(sourceX + x, sourceY + y);
            target.setPixelABGR(targetX + dx, targetY + dy, source);
         }
      }
   }

   public void resizeSubRectTo(final int sourceX, final int sourceY, final int sizeX, final int sizeY, final NativeImage to) {
      this.checkAllocated();
      if (to.format() != this.format) {
         throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
      } else {
         int components = this.format.components();
         STBImageResize.nstbir_resize_uint8_linear(
            this.pixels + (long)((sourceX + sourceY * this.getWidth()) * components),
            sizeX,
            sizeY,
            this.getWidth() * components,
            to.pixels,
            to.getWidth(),
            to.getHeight(),
            0,
            components
         );
      }
   }

   public void untrack() {
      DebugMemoryUntracker.untrack(this.pixels);
   }

   public long getPointer() {
      return this.pixels;
   }

   public ByteBuffer getPixelBytes() {
      return MemoryUtil.memByteBuffer(this.pixels, Math.toIntExact(this.size));
   }

   public Transparency computeTransparency(final int x0, final int y0, final int x1, final int y1) {
      this.checkAllocated();
      if (this.format != NativeImage.Format.RGBA) {
         return Transparency.NONE;
      } else if (x0 >= 0 && y0 >= 0 && x1 <= this.width && y1 <= this.height) {
         if ((long)this.width * (long)this.height * 4L > 2147483647L) {
            throw new IllegalArgumentException("Image of size " + this.width + "x" + this.height + " is too large to compute translucency");
         } else {
            boolean hasTransparentPixel = false;
            boolean hasTranslucentPixel = false;
            IntBuffer buffer = MemoryUtil.memIntBuffer(this.pixels, this.width * this.height);

            for (int y = y0; y < y1; y++) {
               for (int x = x0; x < x1; x++) {
                  int alpha = ARGB.alpha(buffer.get(x + y * this.width));
                  if (alpha == 0) {
                     hasTransparentPixel = true;
                  } else if (alpha != 255) {
                     hasTranslucentPixel = true;
                  }
               }
            }

            return Transparency.of(hasTransparentPixel, hasTranslucentPixel);
         }
      } else {
         throw new IllegalArgumentException(
            "Cannot compute translucency out of bounds: [" + x0 + ", " + y0 + ", " + x1 + ", " + y1 + "] in " + this.width + "x" + this.height + " image"
         );
      }
   }

   public Transparency computeTransparency() {
      return this.computeTransparency(0, 0, this.width, this.height);
   }

   public static enum Format {
      RGBA(4, true, true, true, false, true, 0, 8, 16, 255, 24, 6),
      RGB(3, true, true, true, false, false, 0, 8, 16, 255, 255, 2),
      LUMINANCE_ALPHA(2, false, false, false, true, true, 255, 255, 255, 0, 8, 4),
      LUMINANCE(1, false, false, false, true, false, 0, 0, 0, 0, 255, 0);

      private final int components;
      private final boolean hasRed;
      private final boolean hasGreen;
      private final boolean hasBlue;
      private final boolean hasLuminance;
      private final boolean hasAlpha;
      private final int redOffset;
      private final int greenOffset;
      private final int blueOffset;
      private final int luminanceOffset;
      private final int alphaOffset;
      private final int pngColorType;

      private Format(
         final int components,
         final boolean hasRed,
         final boolean hasGreen,
         final boolean hasBlue,
         final boolean hasLuminance,
         final boolean hasAlpha,
         final int redOffset,
         final int greenOffset,
         final int blueOffset,
         final int luminanceOffset,
         final int alphaOffset,
         final int pngColorType
      ) {
         this.components = components;
         this.hasRed = hasRed;
         this.hasGreen = hasGreen;
         this.hasBlue = hasBlue;
         this.hasLuminance = hasLuminance;
         this.hasAlpha = hasAlpha;
         this.redOffset = redOffset;
         this.greenOffset = greenOffset;
         this.blueOffset = blueOffset;
         this.luminanceOffset = luminanceOffset;
         this.alphaOffset = alphaOffset;
         this.pngColorType = pngColorType;
      }

      public int components() {
         return this.components;
      }

      public boolean hasRed() {
         return this.hasRed;
      }

      public boolean hasGreen() {
         return this.hasGreen;
      }

      public boolean hasBlue() {
         return this.hasBlue;
      }

      public boolean hasLuminance() {
         return this.hasLuminance;
      }

      public boolean hasAlpha() {
         return this.hasAlpha;
      }

      public int redOffset() {
         return this.redOffset;
      }

      public int greenOffset() {
         return this.greenOffset;
      }

      public int blueOffset() {
         return this.blueOffset;
      }

      public int luminanceOffset() {
         return this.luminanceOffset;
      }

      public int alphaOffset() {
         return this.alphaOffset;
      }

      public boolean hasLuminanceOrRed() {
         return this.hasLuminance || this.hasRed;
      }

      public boolean hasLuminanceOrGreen() {
         return this.hasLuminance || this.hasGreen;
      }

      public boolean hasLuminanceOrBlue() {
         return this.hasLuminance || this.hasBlue;
      }

      public boolean hasLuminanceOrAlpha() {
         return this.hasLuminance || this.hasAlpha;
      }

      public int luminanceOrRedOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.redOffset;
      }

      public int luminanceOrGreenOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.greenOffset;
      }

      public int luminanceOrBlueOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.blueOffset;
      }

      public int luminanceOrAlphaOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.alphaOffset;
      }
   }

   private static class WriteCallback {
      private static final Linker LINKER = Linker.nativeLinker();
      private static final FunctionDescriptor CALLBACK_DESC = FunctionDescriptor.of(
         ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE), ValueLayout.JAVA_LONG
      );
      private static final MethodHandle CALLBACK_FN = findCallbackFn();
      private final WritableByteChannel output;
      @Nullable
      private IOException exception;

      private static MethodHandle findCallbackFn() {
         try {
            return MethodHandles.lookup()
               .findVirtual(
                  NativeImage.WriteCallback.class,
                  "invoke",
                  MethodType.methodType(int.class, MemorySegment.class, MemorySegment.class, MemorySegment.class, long.class)
               );
         } catch (Exception var1) {
            throw new IllegalStateException(var1);
         }
      }

      private WriteCallback(final WritableByteChannel output) {
         this.output = output;
      }

      public MemorySegment createUpcall(final Arena arena) {
         return LINKER.upcallStub(CALLBACK_FN.bindTo(this), CALLBACK_DESC, arena);
      }

      public int invoke(final MemorySegment ctx, final MemorySegment user, final MemorySegment dest, final long length) {
         ByteBuffer dataBuf = dest.reinterpret(length).asByteBuffer();

         try {
            this.output.write(dataBuf);
            return 0;
         } catch (IOException var8) {
            this.exception = var8;
            return -2;
         }
      }

      public void throwIfException() throws IOException {
         if (this.exception != null) {
            throw this.exception;
         }
      }
   }
}
