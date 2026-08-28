import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.lwjgl.stb.STBIWriteCallback;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public final class fce implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<StandardOpenOption> b = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   private final fce.a c;
   private final int d;
   private final int e;
   private final boolean f;
   private long g;
   private final long h;

   public fce(int $$0, int $$1, boolean $$2) {
      this(fce.a.a, $$0, $$1, $$2);
   }

   public fce(fce.a $$0, int $$1, int $$2, boolean $$3) {
      if ($$1 > 0 && $$2 > 0) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.h = (long)$$1 * (long)$$2 * (long)$$0.a();
         this.f = false;
         if ($$3) {
            this.g = MemoryUtil.nmemCalloc(1L, this.h);
         } else {
            this.g = MemoryUtil.nmemAlloc(this.h);
         }

         if (this.g == 0L) {
            throw new IllegalStateException("Unable to allocate texture of size " + $$1 + "x" + $$2 + " (" + $$0.a() + " channels)");
         }
      } else {
         throw new IllegalArgumentException("Invalid texture size: " + $$1 + "x" + $$2);
      }
   }

   private fce(fce.a $$0, int $$1, int $$2, boolean $$3, long $$4) {
      if ($$1 > 0 && $$2 > 0) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = (long)$$1 * (long)$$2 * (long)$$0.a();
      } else {
         throw new IllegalArgumentException("Invalid texture size: " + $$1 + "x" + $$2);
      }
   }

   @Override
   public String toString() {
      return "NativeImage[" + this.c + " " + this.d + "x" + this.e + "@" + this.g + (this.f ? "S" : "N") + "]";
   }

   private boolean c(int $$0, int $$1) {
      return $$0 < 0 || $$0 >= this.d || $$1 < 0 || $$1 >= this.e;
   }

   public static fce a(InputStream $$0) throws IOException {
      return a(fce.a.a, $$0);
   }

   public static fce a(@Nullable fce.a $$0, InputStream $$1) throws IOException {
      ByteBuffer $$2 = null;

      fce var3;
      try {
         $$2 = TextureUtil.readResource($$1);
         $$2.rewind();
         var3 = a($$0, $$2);
      } finally {
         MemoryUtil.memFree($$2);
         IOUtils.closeQuietly($$1);
      }

      return var3;
   }

   public static fce a(ByteBuffer $$0) throws IOException {
      return a(fce.a.a, $$0);
   }

   public static fce a(byte[] $$0) throws IOException {
      MemoryStack $$1 = MemoryStack.stackPush();

      fce var3;
      try {
         ByteBuffer $$2 = $$1.malloc($$0.length);
         $$2.put($$0);
         $$2.rewind();
         var3 = a($$2);
      } catch (Throwable var5) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if ($$1 != null) {
         $$1.close();
      }

      return var3;
   }

   public static fce a(@Nullable fce.a $$0, ByteBuffer $$1) throws IOException {
      if ($$0 != null && !$$0.w()) {
         throw new UnsupportedOperationException("Don't know how to read format " + $$0);
      } else if (MemoryUtil.memAddress($$1) == 0L) {
         throw new IllegalArgumentException("Invalid buffer");
      } else {
         azi.a($$1);
         MemoryStack $$2 = MemoryStack.stackPush();

         fce var7;
         try {
            IntBuffer $$3 = $$2.mallocInt(1);
            IntBuffer $$4 = $$2.mallocInt(1);
            IntBuffer $$5 = $$2.mallocInt(1);
            ByteBuffer $$6 = STBImage.stbi_load_from_memory($$1, $$3, $$4, $$5, $$0 == null ? 0 : $$0.e);
            if ($$6 == null) {
               throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }

            var7 = new fce($$0 == null ? fce.a.a($$5.get(0)) : $$0, $$3.get(0), $$4.get(0), true, MemoryUtil.memAddress($$6));
         } catch (Throwable var9) {
            if ($$2 != null) {
               try {
                  $$2.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if ($$2 != null) {
            $$2.close();
         }

         return var7;
      }
   }

   private static void a(boolean $$0, boolean $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      if ($$0) {
         GlStateManager._texParameter(3553, 10241, $$1 ? 9987 : 9729);
         GlStateManager._texParameter(3553, 10240, 9729);
      } else {
         GlStateManager._texParameter(3553, 10241, $$1 ? 9986 : 9728);
         GlStateManager._texParameter(3553, 10240, 9728);
      }
   }

   private void j() {
      if (this.g == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   @Override
   public void close() {
      if (this.g != 0L) {
         if (this.f) {
            STBImage.nstbi_image_free(this.g);
         } else {
            MemoryUtil.nmemFree(this.g);
         }
      }

      this.g = 0L;
   }

   public int a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public fce.a c() {
      return this.c;
   }

   private int d(int $$0, int $$1) {
      if (this.c != fce.a.a) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixelRGBA only works on RGBA images; have %s", this.c));
      } else if (this.c($$0, $$1)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
      } else {
         this.j();
         long $$2 = ((long)$$0 + (long)$$1 * (long)this.d) * 4L;
         return MemoryUtil.memGetInt(this.g + $$2);
      }
   }

   public int a(int $$0, int $$1) {
      return axo.j(this.d($$0, $$1));
   }

   private void b(int $$0, int $$1, int $$2) {
      if (this.c != fce.a.a) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "setPixelRGBA only works on RGBA images; have %s", this.c));
      } else if (this.c($$0, $$1)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
      } else {
         this.j();
         long $$3 = ((long)$$0 + (long)$$1 * (long)this.d) * 4L;
         MemoryUtil.memPutInt(this.g + $$3, $$2);
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b($$0, $$1, axo.i($$2));
   }

   public fce a(IntUnaryOperator $$0) {
      if (this.c != fce.a.a) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", this.c));
      } else {
         this.j();
         fce $$1 = new fce(this.d, this.e, false);
         int $$2 = this.d * this.e;
         IntBuffer $$3 = MemoryUtil.memIntBuffer(this.g, $$2);
         IntBuffer $$4 = MemoryUtil.memIntBuffer($$1.g, $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            int $$6 = axo.j($$3.get($$5));
            int $$7 = $$0.applyAsInt($$6);
            $$4.put($$5, axo.i($$7));
         }

         return $$1;
      }
   }

   public void b(IntUnaryOperator $$0) {
      if (this.c != fce.a.a) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", this.c));
      } else {
         this.j();
         int $$1 = this.d * this.e;
         IntBuffer $$2 = MemoryUtil.memIntBuffer(this.g, $$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            int $$4 = axo.j($$2.get($$3));
            int $$5 = $$0.applyAsInt($$4);
            $$2.put($$3, axo.i($$5));
         }
      }
   }

   public int[] d() {
      if (this.c != fce.a.a) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixels only works on RGBA images; have %s", this.c));
      } else {
         this.j();
         int[] $$0 = new int[this.d * this.e];
         MemoryUtil.memIntBuffer(this.g, this.d * this.e).get($$0);
         return $$0;
      }
   }

   public int[] e() {
      int[] $$0 = this.d();

      for (int $$1 = 0; $$1 < $$0.length; $$1++) {
         $$0[$$1] = axo.j($$0[$$1]);
      }

      return $$0;
   }

   public byte b(int $$0, int $$1) {
      if (!this.c.r()) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "no luminance or alpha in %s", this.c));
      } else if (this.c($$0, $$1)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
      } else {
         int $$2 = ($$0 + $$1 * this.d) * this.c.a() + this.c.v() / 8;
         return MemoryUtil.memGetByte(this.g + (long)$$2);
      }
   }

   @Deprecated
   public int[] f() {
      if (this.c != fce.a.a) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.j();
         int[] $$0 = new int[this.a() * this.b()];

         for (int $$1 = 0; $$1 < this.b(); $$1++) {
            for (int $$2 = 0; $$2 < this.a(); $$2++) {
               $$0[$$2 + $$1 * this.a()] = this.a($$2, $$1);
            }
         }

         return $$0;
      }
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.a($$0, $$1, $$2, 0, 0, this.d, this.e, false, $$3);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, false, false, $$7, $$8);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8, boolean $$9, boolean $$10) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10));
      } else {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   private void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8, boolean $$9, boolean $$10) {
      try {
         RenderSystem.assertOnRenderThreadOrInit();
         this.j();
         a($$7, $$9);
         if ($$5 == this.a()) {
            GlStateManager._pixelStore(3314, 0);
         } else {
            GlStateManager._pixelStore(3314, this.a());
         }

         GlStateManager._pixelStore(3316, $$3);
         GlStateManager._pixelStore(3315, $$4);
         this.c.c();
         GlStateManager._texSubImage2D(3553, $$0, $$1, $$2, $$5, $$6, this.c.d(), 5121, this.g);
         if ($$8) {
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
         }
      } finally {
         if ($$10) {
            this.close();
         }
      }
   }

   public void a(int $$0, boolean $$1) {
      RenderSystem.assertOnRenderThread();
      this.j();
      this.c.b();
      GlStateManager._getTexImage(3553, $$0, this.c.d(), 5121, this.g);
      if ($$1 && this.c.i()) {
         for (int $$2 = 0; $$2 < this.b(); $$2++) {
            for (int $$3 = 0; $$3 < this.a(); $$3++) {
               this.b($$3, $$2, this.d($$3, $$2) | 255 << this.c.n());
            }
         }
      }
   }

   public void a(float $$0) {
      RenderSystem.assertOnRenderThread();
      if (this.c.a() != 1) {
         throw new IllegalStateException("Depth buffer must be stored in NativeImage with 1 component.");
      } else {
         this.j();
         this.c.b();
         GlStateManager._readPixels(0, 0, this.d, this.e, 6402, 5121, this.g);
      }
   }

   public void g() {
      RenderSystem.assertOnRenderThread();
      this.c.c();
      GlStateManager._glDrawPixels(this.d, this.e, this.c.d(), 5121, this.g);
   }

   public void a(File $$0) throws IOException {
      this.a($$0.toPath());
   }

   public boolean a(FT_Face $$0, int $$1) {
      if (this.c.a() != 1) {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      } else if (fnm.b(FreeType.FT_Load_Glyph($$0, $$1, 4), "Loading glyph")) {
         return false;
      } else {
         FT_GlyphSlot $$2 = Objects.requireNonNull($$0.glyph(), "Glyph not initialized");
         FT_Bitmap $$3 = $$2.bitmap();
         if ($$3.pixel_mode() != 2) {
            throw new IllegalStateException("Rendered glyph was not 8-bit grayscale");
         } else if ($$3.width() == this.a() && $$3.rows() == this.b()) {
            int $$4 = $$3.width() * $$3.rows();
            ByteBuffer $$5 = Objects.requireNonNull($$3.buffer($$4), "Glyph has no bitmap");
            MemoryUtil.memCopy(MemoryUtil.memAddress($$5), this.g, (long)$$4);
            return true;
         } else {
            throw new IllegalArgumentException(
               String.format(Locale.ROOT, "Glyph bitmap of size %sx%s does not match image of size: %sx%s", $$3.width(), $$3.rows(), this.a(), this.b())
            );
         }
      }
   }

   public void a(Path $$0) throws IOException {
      if (!this.c.w()) {
         throw new UnsupportedOperationException("Don't know how to write format " + this.c);
      } else {
         this.j();

         try (WritableByteChannel $$1 = Files.newByteChannel($$0, b)) {
            if (!this.a($$1)) {
               throw new IOException("Could not write image to the PNG file \"" + $$0.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
         }
      }
   }

   private boolean a(WritableByteChannel $$0) throws IOException {
      fce.c $$1 = new fce.c($$0);

      boolean var4;
      try {
         int $$2 = Math.min(this.b(), Integer.MAX_VALUE / this.a() / this.c.a());
         if ($$2 < this.b()) {
            a.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.b(), $$2);
         }

         if (STBImageWrite.nstbi_write_png_to_func($$1.address(), 0L, this.a(), $$2, this.c.a(), this.g, 0) != 0) {
            $$1.a();
            return true;
         }

         var4 = false;
      } finally {
         $$1.free();
      }

      return var4;
   }

   public void a(fce $$0) {
      if ($$0.c() != this.c) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int $$1 = this.c.a();
         this.j();
         $$0.j();
         if (this.d == $$0.d) {
            MemoryUtil.memCopy($$0.g, this.g, Math.min(this.h, $$0.h));
         } else {
            int $$2 = Math.min(this.a(), $$0.a());
            int $$3 = Math.min(this.b(), $$0.b());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               int $$5 = $$4 * $$0.a() * $$1;
               int $$6 = $$4 * this.a() * $$1;
               MemoryUtil.memCopy($$0.g + (long)$$5, this.g + (long)$$6, (long)$$2);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      for (int $$5 = $$1; $$5 < $$1 + $$3; $$5++) {
         for (int $$6 = $$0; $$6 < $$0 + $$2; $$6++) {
            this.a($$6, $$5, $$4);
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, boolean $$6, boolean $$7) {
      this.a(this, $$0, $$1, $$0 + $$2, $$1 + $$3, $$4, $$5, $$6, $$7);
   }

   public void a(fce $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8) {
      for (int $$9 = 0; $$9 < $$6; $$9++) {
         for (int $$10 = 0; $$10 < $$5; $$10++) {
            int $$11 = $$7 ? $$5 - 1 - $$10 : $$10;
            int $$12 = $$8 ? $$6 - 1 - $$9 : $$9;
            int $$13 = this.d($$1 + $$10, $$2 + $$9);
            $$0.b($$3 + $$11, $$4 + $$12, $$13);
         }
      }
   }

   public void h() {
      this.j();
      int $$0 = this.c.a();
      int $$1 = this.a() * $$0;
      long $$2 = MemoryUtil.nmemAlloc((long)$$1);

      try {
         for (int $$3 = 0; $$3 < this.b() / 2; $$3++) {
            int $$4 = $$3 * this.a() * $$0;
            int $$5 = (this.b() - 1 - $$3) * this.a() * $$0;
            MemoryUtil.memCopy(this.g + (long)$$4, $$2, (long)$$1);
            MemoryUtil.memCopy(this.g + (long)$$5, this.g + (long)$$4, (long)$$1);
            MemoryUtil.memCopy($$2, this.g + (long)$$5, (long)$$1);
         }
      } finally {
         MemoryUtil.nmemFree($$2);
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, fce $$4) {
      this.j();
      if ($$4.c() != this.c) {
         throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
      } else {
         int $$5 = this.c.a();
         STBImageResize.nstbir_resize_uint8(this.g + (long)(($$0 + $$1 * this.a()) * $$5), $$2, $$3, this.a() * $$5, $$4.g, $$4.a(), $$4.b(), 0, $$5);
      }
   }

   public void i() {
      fbt.a(this.g);
   }

   public static enum a {
      a(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true),
      b(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true),
      c(2, 33319, false, false, false, true, true, 255, 255, 255, 0, 8, true),
      d(1, 6403, false, false, false, true, false, 0, 0, 0, 0, 255, true);

      final int e;
      private final int f;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      private final int l;
      private final int m;
      private final int n;
      private final int o;
      private final int p;
      private final boolean q;

      private a(
         final int $$0,
         final int $$1,
         final boolean $$2,
         final boolean $$3,
         final boolean $$4,
         final boolean $$5,
         final boolean $$6,
         final int $$7,
         final int $$8,
         final int $$9,
         final int $$10,
         final int $$11,
         final boolean $$12
      ) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
         this.j = $$5;
         this.k = $$6;
         this.l = $$7;
         this.m = $$8;
         this.n = $$9;
         this.o = $$10;
         this.p = $$11;
         this.q = $$12;
      }

      public int a() {
         return this.e;
      }

      public void b() {
         RenderSystem.assertOnRenderThread();
         GlStateManager._pixelStore(3333, this.a());
      }

      public void c() {
         RenderSystem.assertOnRenderThreadOrInit();
         GlStateManager._pixelStore(3317, this.a());
      }

      public int d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public boolean f() {
         return this.h;
      }

      public boolean g() {
         return this.i;
      }

      public boolean h() {
         return this.j;
      }

      public boolean i() {
         return this.k;
      }

      public int j() {
         return this.l;
      }

      public int k() {
         return this.m;
      }

      public int l() {
         return this.n;
      }

      public int m() {
         return this.o;
      }

      public int n() {
         return this.p;
      }

      public boolean o() {
         return this.j || this.g;
      }

      public boolean p() {
         return this.j || this.h;
      }

      public boolean q() {
         return this.j || this.i;
      }

      public boolean r() {
         return this.j || this.k;
      }

      public int s() {
         return this.j ? this.o : this.l;
      }

      public int t() {
         return this.j ? this.o : this.m;
      }

      public int u() {
         return this.j ? this.o : this.n;
      }

      public int v() {
         return this.j ? this.o : this.p;
      }

      public boolean w() {
         return this.q;
      }

      static fce.a a(int $$0) {
         switch ($$0) {
            case 1:
               return d;
            case 2:
               return c;
            case 3:
               return b;
            case 4:
            default:
               return a;
         }
      }
   }

   public static enum b {
      a(6408),
      b(6407),
      c(33319),
      d(6403);

      private final int e;

      private b(final int $$0) {
         this.e = $$0;
      }

      public int a() {
         return this.e;
      }
   }

   static class c extends STBIWriteCallback {
      private final WritableByteChannel a;
      @Nullable
      private IOException b;

      c(WritableByteChannel $$0) {
         this.a = $$0;
      }

      public void invoke(long $$0, long $$1, int $$2) {
         ByteBuffer $$3 = getData($$1, $$2);

         try {
            this.a.write($$3);
         } catch (IOException var8) {
            this.b = var8;
         }
      }

      public void a() throws IOException {
         if (this.b != null) {
            throw this.b;
         }
      }
   }
}
