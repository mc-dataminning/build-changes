import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fbf implements AutoCloseable {
   private final fbf.a a;
   private int b;
   private int c;
   private int d;
   @Nullable
   private fbh e;
   @Nullable
   private RenderSystem.a f;
   private fbh.a g;
   private int h;
   private fbh.b i;

   public fbf(fbf.a $$0) {
      this.a = $$0;
      RenderSystem.assertOnRenderThread();
      this.b = GlStateManager._glGenBuffers();
      this.c = GlStateManager._glGenBuffers();
      this.d = GlStateManager._glGenVertexArrays();
   }

   public void a(fax.b $$0) {
      try {
         if (!this.e()) {
            RenderSystem.assertOnRenderThread();
            fax.a $$1 = $$0.c();
            this.e = this.a($$1, $$0.a());
            this.f = this.b($$1, $$0.b());
            this.h = $$1.i();
            this.g = $$1.k();
            this.i = $$1.j();
            return;
         }
      } finally {
         $$0.e();
      }
   }

   private fbh a(fax.a $$0, @Nullable ByteBuffer $$1) {
      boolean $$2 = false;
      if (!$$0.g().equals(this.e)) {
         if (this.e != null) {
            this.e.f();
         }

         GlStateManager._glBindBuffer(34962, this.b);
         $$0.g().e();
         $$2 = true;
      }

      if ($$1 != null) {
         if (!$$2) {
            GlStateManager._glBindBuffer(34962, this.b);
         }

         RenderSystem.glBufferData(34962, $$1, this.a.c);
      }

      return $$0.g();
   }

   @Nullable
   private RenderSystem.a b(fax.a $$0, @Nullable ByteBuffer $$1) {
      if ($$1 != null) {
         GlStateManager._glBindBuffer(34963, this.c);
         RenderSystem.glBufferData(34963, $$1, this.a.c);
         return null;
      } else {
         RenderSystem.a $$2 = RenderSystem.getSequentialBuffer($$0.j());
         if ($$2 != this.f || !$$2.a($$0.i())) {
            $$2.b($$0.i());
         }

         return $$2;
      }
   }

   public void a() {
      fay.b();
      GlStateManager._glBindVertexArray(this.d);
   }

   public static void b() {
      fay.b();
      GlStateManager._glBindVertexArray(0);
   }

   public void c() {
      RenderSystem.drawElements(this.i.i, this.h, this.f().c);
   }

   private fbh.a f() {
      RenderSystem.a $$0 = this.f;
      return $$0 != null ? $$0.a() : this.g;
   }

   public void a(Matrix4f $$0, Matrix4f $$1, gfu $$2) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.b(new Matrix4f($$0), new Matrix4f($$1), $$2));
      } else {
         this.b($$0, $$1, $$2);
      }
   }

   private void b(Matrix4f $$0, Matrix4f $$1, gfu $$2) {
      $$2.a(this.i, $$0, $$1, fgj.Q().aP());
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

   public fbh d() {
      return this.e;
   }

   public boolean e() {
      return this.d == -1;
   }

   public static enum a {
      a(35044),
      b(35048);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }
}
