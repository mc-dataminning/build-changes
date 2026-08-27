import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class epg implements AutoCloseable {
   private final epg.a a;
   private int b;
   private int c;
   private int d;
   @Nullable
   private epi e;
   @Nullable
   private RenderSystem.a f;
   private epi.a g;
   private int h;
   private epi.b i;

   public epg(epg.a $$0) {
      this.a = $$0;
      RenderSystem.assertOnRenderThread();
      this.b = GlStateManager._glGenBuffers();
      this.c = GlStateManager._glGenBuffers();
      this.d = GlStateManager._glGenVertexArrays();
   }

   public void a(eoy.b $$0) {
      try {
         if (!this.e()) {
            RenderSystem.assertOnRenderThread();
            eoy.a $$1 = $$0.c();
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

   private epi a(eoy.a $$0, @Nullable ByteBuffer $$1) {
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
   private RenderSystem.a b(eoy.a $$0, @Nullable ByteBuffer $$1) {
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
      eoz.b();
      GlStateManager._glBindVertexArray(this.d);
   }

   public static void b() {
      eoz.b();
      GlStateManager._glBindVertexArray(0);
   }

   public void c() {
      RenderSystem.drawElements(this.i.i, this.h, this.f().c);
   }

   private epi.a f() {
      RenderSystem.a $$0 = this.f;
      return $$0 != null ? $$0.a() : this.g;
   }

   public void a(Matrix4f $$0, Matrix4f $$1, fsw $$2) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.b(new Matrix4f($$0), new Matrix4f($$1), $$2));
      } else {
         this.b($$0, $$1, $$2);
      }
   }

   private void b(Matrix4f $$0, Matrix4f $$1, fsw $$2) {
      for (int $$3 = 0; $$3 < 12; $$3++) {
         int $$4 = RenderSystem.getShaderTexture($$3);
         $$2.a("Sampler" + $$3, $$4);
      }

      if ($$2.b != null) {
         $$2.b.a($$0);
      }

      if ($$2.c != null) {
         $$2.c.a($$1);
      }

      if ($$2.d != null) {
         $$2.d.a(RenderSystem.getInverseViewRotationMatrix());
      }

      if ($$2.g != null) {
         $$2.g.a(RenderSystem.getShaderColor());
      }

      if ($$2.j != null) {
         $$2.j.a(RenderSystem.getShaderGlintAlpha());
      }

      if ($$2.k != null) {
         $$2.k.a(RenderSystem.getShaderFogStart());
      }

      if ($$2.l != null) {
         $$2.l.a(RenderSystem.getShaderFogEnd());
      }

      if ($$2.m != null) {
         $$2.m.a(RenderSystem.getShaderFogColor());
      }

      if ($$2.n != null) {
         $$2.n.a(RenderSystem.getShaderFogShape().a());
      }

      if ($$2.e != null) {
         $$2.e.a(RenderSystem.getTextureMatrix());
      }

      if ($$2.p != null) {
         $$2.p.a(RenderSystem.getShaderGameTime());
      }

      if ($$2.f != null) {
         eoh $$5 = euk.N().aL();
         $$2.f.a((float)$$5.k(), (float)$$5.l());
      }

      if ($$2.o != null && (this.i == epi.b.a || this.i == epi.b.b)) {
         $$2.o.a(RenderSystem.getShaderLineWidth());
      }

      RenderSystem.setupShaderLights($$2);
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

   public epi d() {
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
