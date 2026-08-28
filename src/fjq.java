import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public abstract class fjq {
   private static int a = 0;
   public int c;
   public int d;
   public int e;
   public int f;
   protected final String g;
   public final boolean h;
   @Nullable
   protected flh i;
   @Nullable
   protected flh j;
   public flg k;

   public fjq(@Nullable String $$0, boolean $$1) {
      this.g = $$0 == null ? "FBO " + a++ : $$0;
      this.h = $$1;
   }

   public void a(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      this.a();
      this.b($$0, $$1);
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      this.b();
      if (this.j != null) {
         this.j.close();
         this.j = null;
      }

      if (this.i != null) {
         this.i.close();
         this.i = null;
      }
   }

   public void a(fjq $$0) {
      RenderSystem.assertOnRenderThread();
      if (this.j == null) {
         throw new IllegalStateException("Trying to copy depth texture to a RenderTarget without a depth texture");
      } else if ($$0.j == null) {
         throw new IllegalStateException("Trying to copy depth texture from a RenderTarget without a depth texture");
      } else {
         RenderSystem.getDevice().b().a($$0.j, this.j, 0, 0, 0, 0, 0, this.c, this.d);
      }
   }

   public void b(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      int $$2 = RenderSystem.getDevice().j();
      if ($$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2) {
         this.e = $$0;
         this.f = $$1;
         this.c = $$0;
         this.d = $$1;
         if (this.h) {
            this.j = RenderSystem.getDevice().a(() -> this.g + " / Depth", fli.c, $$0, $$1, 1);
            this.j.a(flg.a, false);
            this.j.a(flf.b);
         }

         this.i = RenderSystem.getDevice().a(() -> this.g + " / Color", fli.a, $$0, $$1, 1);
         this.i.a(flf.b);
         this.a(flg.a, true);
      } else {
         throw new IllegalArgumentException("Window " + $$0 + "x" + $$1 + " size out of bounds (max. size: " + $$2 + ")");
      }
   }

   public void a(flg $$0) {
      this.a($$0, false);
   }

   private void a(flg $$0, boolean $$1) {
      if (this.i == null) {
         throw new IllegalStateException("Can't change filter mode, color texture doesn't exist yet");
      } else {
         if ($$1 || $$0 != this.k) {
            this.k = $$0;
            this.i.a($$0, false);
         }
      }
   }

   public void b() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._bindTexture(0);
   }

   public void c() {
      if (this.i == null) {
         throw new IllegalStateException("Can't blit to screen, color texture doesn't exist yet");
      } else {
         RenderSystem.getDevice().b().a(this.i);
      }
   }

   public void a(flh $$0) {
      RenderSystem.assertOnRenderThread();

      try (flb $$1 = RenderSystem.getDevice().b().a($$0, OptionalInt.empty())) {
         RenderSystem.a $$2 = RenderSystem.getSequentialBuffer(fls.c.h);
         fig $$3 = RenderSystem.getQuadVertexBuffer(() -> "Entity outline blit vertex buffer");
         $$1.a(gsj.aC);
         $$1.a(0, $$3);
         $$1.a($$2.b(6), $$2.a());
         $$1.a("InSampler", this.i);
         $$1.a(0, 6);
      }
   }

   @Nullable
   public flh d() {
      return this.i;
   }

   @Nullable
   public flh e() {
      return this.j;
   }
}
