import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fjt implements fta {
   private static final akk a = new akk("hud/hotbar");
   private static final akk b = new akk("hud/hotbar_selection");
   private static final long c = 5000L;
   private static final long d = 2000L;
   private final ffw e;
   private long f;
   @Nullable
   private fsx g;

   public fjt(ffw $$0) {
      this.e = $$0;
   }

   public void a(int $$0) {
      this.f = ac.c();
      if (this.g != null) {
         this.g.b($$0);
      } else {
         this.g = new fsx(this);
      }
   }

   private float c() {
      long $$0 = this.f - ac.c() + 5000L;
      return ayg.a((float)$$0 / 2000.0F, 0.0F, 1.0F);
   }

   public void a(fhh $$0) {
      if (this.g != null) {
         float $$1 = this.c();
         if ($$1 <= 0.0F) {
            this.g.d();
         } else {
            int $$2 = $$0.a() / 2;
            $$0.c().a();
            $$0.c().a(0.0F, 0.0F, -90.0F);
            int $$3 = ayg.d((float)$$0.b() - 22.0F * $$1);
            ftb $$4 = this.g.f();
            this.a($$0, $$1, $$2, $$3, $$4);
            $$0.c().b();
         }
      }
   }

   protected void a(fhh $$0, float $$1, int $$2, int $$3, ftb $$4) {
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$1);
      $$0.a(a, $$2 - 91, $$3, 182, 22);
      if ($$4.a() >= 0) {
         $$0.a(b, $$2 - 91 - 1 + $$4.a() * 20, $$3 - 1, 24, 23);
      }

      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a($$0, $$5, $$0.a() / 2 - 90 + $$5 * 20 + 2, (float)($$3 + 3), $$1, $$4.a($$5));
      }

      RenderSystem.disableBlend();
   }

   private void a(fhh $$0, int $$1, int $$2, float $$3, float $$4, fsz $$5) {
      if ($$5 != fsx.a) {
         int $$6 = (int)($$4 * 255.0F);
         $$0.c().a();
         $$0.c().a((float)$$2, $$3, 0.0F);
         float $$7 = $$5.aS_() ? 1.0F : 0.25F;
         $$0.a($$7, $$7, $$7, $$4);
         $$5.a($$0, $$7, $$6);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
         if ($$6 > 3 && $$5.aS_()) {
            wu $$8 = this.e.m.T[$$1].k();
            $$0.b(this.e.h, $$8, $$2 + 19 - 2 - this.e.h.a($$8), (int)$$3 + 6 + 3, 16777215 + ($$6 << 24));
         }
      }
   }

   public void b(fhh $$0) {
      int $$1 = (int)(this.c() * 255.0F);
      if ($$1 > 3 && this.g != null) {
         fsz $$2 = this.g.b();
         wu $$3 = $$2 == fsx.a ? this.g.c().b() : $$2.aR_();
         if ($$3 != null) {
            int $$4 = this.e.h.a($$3);
            int $$5 = ($$0.a() - $$4) / 2;
            int $$6 = $$0.b() - 35;
            $$0.a(this.e.h, $$3, $$5, $$6, $$4, axq.b.b($$1, -1));
         }
      }
   }

   @Override
   public void a(fsx $$0) {
      this.g = null;
      this.f = 0L;
   }

   public boolean a() {
      return this.g != null;
   }

   public void b(int $$0) {
      int $$1 = this.g.e() + $$0;

      while ($$1 >= 0 && $$1 <= 8 && (this.g.a($$1) == fsx.a || !this.g.a($$1).aS_())) {
         $$1 += $$0;
      }

      if ($$1 >= 0 && $$1 <= 8) {
         this.g.b($$1);
         this.f = ac.c();
      }
   }

   public void b() {
      this.f = ac.c();
      if (this.a()) {
         int $$0 = this.g.e();
         if ($$0 != -1) {
            this.g.b($$0);
         }
      } else {
         this.g = new fsx(this);
      }
   }
}
