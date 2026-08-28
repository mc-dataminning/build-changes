import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.IntBuffer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjw implements AutoCloseable {
   private final int a;
   private final fjx b;
   private final int c;
   private final int d;
   private final int e;
   private final String f;
   private boolean g;
   private fju h = fju.a;
   private fju i = fju.a;
   private fjv j = fjv.a;
   private fjv k = fjv.b;
   private boolean l = true;
   private boolean m = true;

   public fjw(@Nullable Supplier<String> $$0, fjx $$1, int $$2, int $$3, int $$4) {
      this(null, $$1, $$2, $$3, $$4);
   }

   public fjw(@Nullable String $$0, fjx $$1, int $$2, int $$3, int $$4) {
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.a = GlStateManager._genTexture();
      this.e = $$4;
      this.f = $$0 == null ? String.valueOf(this.a) : $$0;
      if ($$4 < 1) {
         throw new IllegalArgumentException("mipLevels must be at least 1");
      } else {
         this.c();
         GlStateManager._texParameter(3553, 33085, $$4 - 1);
         GlStateManager._texParameter(3553, 33082, 0);
         GlStateManager._texParameter(3553, 33083, $$4 - 1);
         if ($$1 == fjx.c) {
            GlStateManager._texParameter(3553, 34892, 0);
         }

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            GlStateManager._texImage2D(3553, $$5, $$1.a(), $$2 >> $$5, $$3 >> $$5, 0, $$1.b(), $$1.c(), null);
         }

         int $$6 = GlStateManager._getError();
         if ($$6 == 1285) {
            throw new fhe("Could not allocate texture of " + $$2 + "x" + $$3 + " for " + this.f);
         } else if ($$6 != 0) {
            throw new IllegalStateException("OpenGL error " + $$6);
         }
      }
   }

   public int a(int $$0) {
      return this.c >> $$0;
   }

   public int b(int $$0) {
      return this.d >> $$0;
   }

   public int a() {
      return this.e;
   }

   public fjx b() {
      return this.b;
   }

   public void a(fju $$0) {
      this.a($$0, $$0);
   }

   public void a(fju $$0, fju $$1) {
      this.h = $$0;
      this.i = $$1;
      this.m = true;
   }

   public void a(fjv $$0, boolean $$1) {
      this.a($$0, $$0, $$1);
   }

   public void a(fjv $$0, fjv $$1, boolean $$2) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = true;
   }

   public void a(fiz $$0) {
      if ($$0.a() == this.c && $$0.b() == this.d) {
         this.a($$0, 0, 0, 0, this.c, this.d, 0, 0);
      } else {
         throw new IllegalArgumentException("Cannot replace texture of size " + this.c + "x" + this.d + " with image of size " + $$0.a() + "x" + $$0.b());
      }
   }

   public void a(fiz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      if ($$1 >= 0 && $$1 < this.e) {
         if ($$6 + $$4 > $$0.a() || $$7 + $$5 > $$0.b()) {
            throw new IllegalArgumentException(
               "Copy source (" + $$0.a() + "x" + $$0.b() + ") is not large enough to read a rectangle of " + $$4 + "x" + $$5 + " from " + $$6 + "x" + $$7
            );
         } else if ($$2 + $$4 <= this.a($$1) && $$3 + $$5 <= this.b($$1)) {
            this.c();
            GlStateManager._pixelStore(3314, $$0.a());
            GlStateManager._pixelStore(3316, $$6);
            GlStateManager._pixelStore(3315, $$7);
            GlStateManager._pixelStore(3317, $$0.c().a());
            GlStateManager._texSubImage2D(3553, $$1, $$2, $$3, $$4, $$5, $$0.c().b(), 5121, $$0.h());
         } else {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$4
                  + "x"
                  + $$5
                  + ") is not large enough to write a rectangle of "
                  + $$4
                  + "x"
                  + $$5
                  + " at "
                  + $$2
                  + "x"
                  + $$3
                  + " (at mip level "
                  + $$1
                  + ")"
            );
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$1 + ", must be >= 0 and < " + this.e);
      }
   }

   public void a(fhs $$0, int $$1, Runnable $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, 0, 0, this.a($$3), this.b($$3));
   }

   public void a(fhs $$0, int $$1, Runnable $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      if ($$3 >= 0 && $$3 < this.e) {
         if (this.a($$3) * this.b($$3) * this.b.d() + $$1 > $$0.d()) {
            throw new IllegalArgumentException(
               "Buffer of size "
                  + $$0.d()
                  + " is not large enough to hold "
                  + $$6
                  + "x"
                  + $$7
                  + " pixels ("
                  + this.b.d()
                  + " bytes each) starting from offset "
                  + $$1
            );
         } else if ($$0.e() != fhq.c) {
            throw new IllegalArgumentException("Buffer of type " + $$0.e() + " cannot be used to retrieve a texture");
         } else if ($$4 + $$6 <= this.a($$3) && $$5 + $$7 <= this.b($$3)) {
            int $$8 = GlStateManager.glGenFramebuffers();
            GlStateManager._glBindFramebuffer(36008, $$8);
            $$0.b();
            GlStateManager._glFramebufferTexture2D(36008, 36064, 3553, this.a, $$3);
            GlStateManager._pixelStore(3330, $$6);
            GlStateManager._readPixels($$4, $$5, $$6, $$7, this.b.b(), this.b.c(), (long)$$1);
            RenderSystem.queueFencedTask($$2);
            GlStateManager._glBindFramebuffer(36008, 0);
            GlStateManager._glDeleteFramebuffers($$8);
            $$0.c();
            int $$9 = GlStateManager._getError();
            if ($$9 != 0) {
               throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + this.f + ": GL error " + $$9);
            }
         } else {
            throw new IllegalArgumentException(
               "Copy source texture ("
                  + this.a($$3)
                  + "x"
                  + this.b($$3)
                  + ") is not large enough to read a rectangle of "
                  + $$6
                  + "x"
                  + $$7
                  + " from "
                  + $$4
                  + ","
                  + $$5
            );
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$3 + ", must be >= 0 and < " + this.e);
      }
   }

   public void a(IntBuffer $$0, fiz.a $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if ($$2 >= 0 && $$2 < this.e) {
         if ($$5 * $$6 > $$0.remaining()) {
            throw new IllegalArgumentException(
               "Copy would overrun the source buffer (remaining length of " + $$0.remaining() + ", but copy is " + $$5 + "x" + $$6 + ")"
            );
         } else if ($$3 + $$5 <= this.a($$2) && $$4 + $$6 <= this.b($$2)) {
            this.c();
            GlStateManager._pixelStore(3314, $$5);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, $$1.a());
            GlStateManager._texSubImage2D(3553, $$2, $$3, $$4, $$5, $$6, $$1.b(), 5121, $$0);
         } else {
            throw new IllegalArgumentException(
               "Dest texture (" + $$5 + "x" + $$6 + ") is not large enough to write a rectangle of " + $$5 + "x" + $$6 + " at " + $$3 + "x" + $$4
            );
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel, must be >= 0 and < " + this.e);
      }
   }

   public void c() {
      GlStateManager._bindTexture(this.a);
      if (this.m) {
         GlStateManager._texParameter(3553, 10242, this.h.c);
         GlStateManager._texParameter(3553, 10243, this.i.c);
         switch (this.j) {
            case a:
               GlStateManager._texParameter(3553, 10241, this.l ? 9986 : 9728);
               break;
            case b:
               GlStateManager._texParameter(3553, 10241, this.l ? 9987 : 9729);
         }

         switch (this.k) {
            case a:
               GlStateManager._texParameter(3553, 10240, 9728);
               break;
            case b:
               GlStateManager._texParameter(3553, 10240, 9729);
         }

         this.m = false;
      }
   }

   @Override
   public void close() {
      if (!this.g) {
         this.g = true;
         GlStateManager._deleteTexture(this.a);
      }
   }

   public int d() {
      return this.a;
   }

   public String e() {
      return this.f;
   }
}
