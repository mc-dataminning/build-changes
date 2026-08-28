import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import java.util.OptionalInt;

public class fhy implements AutoCloseable {
   private static final int a = 320;
   private static final int b = 180;
   private static final int c = 4;
   private int d;
   private int e;
   private int f;
   private int g;
   private flj h;
   private fii i;
   private int j;
   private boolean k;
   private fhy.a l = fhy.a.a;

   public fhy() {
      this.h = RenderSystem.getDevice().a("Tracy Frame Capture", flk.a, 320, 180, 1);
      this.i = RenderSystem.getDevice().a(() -> "Tracy Frame Capture buffer", fig.c, fih.f, 0);
   }

   private void a(int $$0, int $$1) {
      float $$2 = (float)$$0 / (float)$$1;
      if ($$0 > 320) {
         $$0 = 320;
         $$1 = (int)(320.0F / $$2);
      }

      if ($$1 > 180) {
         $$0 = (int)(180.0F * $$2);
         $$1 = 180;
      }

      $$0 = $$0 / 4 * 4;
      $$1 = $$1 / 4 * 4;
      if (this.f != $$0 || this.g != $$1) {
         this.f = $$0;
         this.g = $$1;
         this.h.close();
         this.h = RenderSystem.getDevice().a("Tracy Frame Capture", flk.a, $$0, $$1, 1);
         this.i.close();
         this.i = RenderSystem.getDevice().a(() -> "Tracy Frame Capture buffer", fig.c, fih.f, $$0 * $$1 * 4);
      }
   }

   public void a(fjs $$0) {
      if (this.l == fhy.a.a && !this.k && $$0.d() != null) {
         this.k = true;
         if ($$0.c != this.d || $$0.d != this.e) {
            this.d = $$0.c;
            this.e = $$0.d;
            this.a(this.d, this.e);
         }

         this.l = fhy.a.b;
         flb $$1 = RenderSystem.getDevice().b();

         try (fld $$2 = RenderSystem.getDevice().b().a(this.h, OptionalInt.empty())) {
            RenderSystem.a $$3 = RenderSystem.getSequentialBuffer(flu.c.h);
            $$2.a(gsl.aD);
            $$2.a(0, RenderSystem.getQuadVertexBuffer());
            $$2.a($$3.b(6), $$3.a());
            $$2.a("InSampler", $$0.d());
            $$2.a(0, 6);
         }

         $$1.a(this.h, this.i, 0, () -> this.l = fhy.a.c, 0);
         this.j = 0;
      }
   }

   public void a() {
      if (this.l == fhy.a.c) {
         this.l = fhy.a.a;

         try (fii.a $$0 = RenderSystem.getDevice().b().a(this.i)) {
            TracyClient.frameImage($$0.a(), this.f, this.g, this.j, true);
         }
      }
   }

   public void b() {
      this.j++;
      this.k = false;
      TracyClient.markFrame();
   }

   @Override
   public void close() {
      this.h.close();
      this.i.close();
   }

   static enum a {
      a,
      b,
      c;
   }
}
