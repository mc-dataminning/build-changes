import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fit implements AutoCloseable {
   private final fgk a;
   private final fgl b;
   @Nullable
   private fgl c = null;
   private int d;
   @Nullable
   private fiv e;
   @Nullable
   private RenderSystem.a f;
   private fiv.b g;
   private int h;
   private fiv.c i;

   public fit(fgk $$0) {
      this.a = $$0;
      RenderSystem.assertOnRenderThread();
      this.b = new fgl(fgj.a, $$0, 0);
      this.d = GlStateManager._glGenVertexArrays();
   }

   public static fit a(fiv.c $$0, fiv $$1, Consumer<fiu> $$2) {
      fil $$3 = fis.b().a($$0, $$1);
      $$2.accept($$3);
      fit $$4 = new fit(fgk.b);
      $$4.a();
      $$4.a($$3.b());
      b();
      return $$4;
   }

   public void a(fip $$0) {
      fip var2 = $$0;

      label40: {
         try {
            if (this.e()) {
               break label40;
            }

            RenderSystem.assertOnRenderThread();
            fip.a $$1 = $$0.c();
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

   public void a(fin.a $$0) {
      fin.a var2 = $$0;

      label46: {
         try {
            if (this.e()) {
               break label46;
            }

            RenderSystem.assertOnRenderThread();
            if (this.c != null) {
               this.c.close();
            }

            this.c = new fgl(fgj.b, this.a, $$0.a());
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

   private fiv a(fip.a $$0, @Nullable ByteBuffer $$1) {
      boolean $$2 = false;
      if (!$$0.a().equals(this.e)) {
         if (this.e != null) {
            this.e.h();
         }

         this.b.b();
         $$0.a().g();
         $$2 = true;
      }

      if ($$1 != null) {
         if (!$$2) {
            this.b.b();
         }

         this.b.a($$1.remaining());
         this.b.a($$1, 0);
      }

      return $$0.a();
   }

   @Nullable
   private RenderSystem.a b(fip.a $$0, @Nullable ByteBuffer $$1) {
      if ($$1 != null) {
         if (this.c != null) {
            this.c.close();
         }

         this.c = new fgl(fgj.b, this.a, $$1);
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
      fim.b();
      GlStateManager._glBindVertexArray(this.d);
   }

   public static void b() {
      fim.b();
      GlStateManager._glBindVertexArray(0);
   }

   public void c() {
      RenderSystem.drawElements(this.i.i, this.h, this.f().c);
   }

   private fiv.b f() {
      RenderSystem.a $$0 = this.f;
      return $$0 != null ? $$0.a() : this.g;
   }

   public void a(Matrix4f $$0, Matrix4f $$1, @Nullable gom $$2) {
      if ($$2 != null) {
         RenderSystem.assertOnRenderThread();
         $$2.a(this.i, $$0, $$1, fof.Q().aO());
         $$2.b();
         this.c();
         $$2.a();
      }
   }

   public void a(gpn $$0) {
      $$0.a();
      this.a();
      this.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      b();
      $$0.b();
   }

   @Override
   public void close() {
      this.b.close();
      if (this.c != null) {
         this.c.close();
         this.c = null;
      }

      if (this.d >= 0) {
         RenderSystem.glDeleteVertexArrays(this.d);
         this.d = -1;
      }
   }

   public fiv d() {
      return this.e;
   }

   public boolean e() {
      return this.d == -1;
   }
}
