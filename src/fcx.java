import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fcx implements AutoCloseable {
   private final fcx.a a;
   private int b;
   private int c;
   private int d;
   @Nullable
   private fcz e;
   @Nullable
   private RenderSystem.a f;
   private fcz.b g;
   private int h;
   private fcz.c i;

   public fcx(fcx.a $$0) {
      this.a = $$0;
      RenderSystem.assertOnRenderThread();
      this.b = GlStateManager._glGenBuffers();
      this.c = GlStateManager._glGenBuffers();
      this.d = GlStateManager._glGenVertexArrays();
   }

   public void a(fct $$0) {
      fct var2 = $$0;

      label40: {
         try {
            if (this.e()) {
               break label40;
            }

            RenderSystem.assertOnRenderThread();
            fct.a $$1 = $$0.c();
            this.e = this.a($$1, $$0.a());
            this.f = this.b($$1, $$0.b());
            this.h = $$1.c();
            this.g = $$1.e();
            this.i = $$1.d();
         } catch (Throwable var6) {
            if ($$0 != null) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if ($$0 != null) {
            $$0.close();
         }

         return;
      }

      if ($$0 != null) {
         $$0.close();
      }
   }

   public void a(fcr.a $$0) {
      fcr.a var2 = $$0;

      label40: {
         try {
            if (this.e()) {
               break label40;
            }

            RenderSystem.assertOnRenderThread();
            GlStateManager._glBindBuffer(34963, this.c);
            RenderSystem.glBufferData(34963, $$0.a(), this.a.c);
            this.f = null;
         } catch (Throwable var6) {
            if ($$0 != null) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if ($$0 != null) {
            $$0.close();
         }

         return;
      }

      if ($$0 != null) {
         $$0.close();
      }
   }

   private fcz a(fct.a $$0, @Nullable ByteBuffer $$1) {
      boolean $$2 = false;
      if (!$$0.a().equals(this.e)) {
         if (this.e != null) {
            this.e.h();
         }

         GlStateManager._glBindBuffer(34962, this.b);
         $$0.a().g();
         $$2 = true;
      }

      if ($$1 != null) {
         if (!$$2) {
            GlStateManager._glBindBuffer(34962, this.b);
         }

         RenderSystem.glBufferData(34962, $$1, this.a.c);
      }

      return $$0.a();
   }

   @Nullable
   private RenderSystem.a b(fct.a $$0, @Nullable ByteBuffer $$1) {
      if ($$1 != null) {
         GlStateManager._glBindBuffer(34963, this.c);
         RenderSystem.glBufferData(34963, $$1, this.a.c);
         return null;
      } else {
         RenderSystem.a $$2 = RenderSystem.getSequentialBuffer($$0.d());
         if ($$2 != this.f || !$$2.a($$0.c())) {
            $$2.b($$0.c());
         }

         return $$2;
      }
   }

   public void a() {
      fcq.b();
      GlStateManager._glBindVertexArray(this.d);
   }

   public static void b() {
      fcq.b();
      GlStateManager._glBindVertexArray(0);
   }

   public void c() {
      RenderSystem.drawElements(this.i.i, this.h, this.f().c);
   }

   private fcz.b f() {
      RenderSystem.a $$0 = this.f;
      return $$0 != null ? $$0.a() : this.g;
   }

   public void a(Matrix4f $$0, Matrix4f $$1, ghk $$2) {
      RenderSystem.assertOnRenderThread();
      $$2.a(this.i, $$0, $$1, fib.Q().aO());
      $$2.g();
      this.c();
      $$2.f();
   }

   @Override
   public void close() {
      if (this.b >= 0) {
         RenderSystem.glDeleteBuffers(this.b);
         this.b = -1;
      }

      if (this.c >= 0) {
         RenderSystem.glDeleteBuffers(this.c);
         this.c = -1;
      }

      if (this.d >= 0) {
         RenderSystem.glDeleteVertexArrays(this.d);
         this.d = -1;
      }
   }

   public fcz d() {
      return this.e;
   }

   public boolean e() {
      return this.d == -1;
   }

   public static enum a {
      a(35044),
      b(35048);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }
}
