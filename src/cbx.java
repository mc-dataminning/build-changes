import java.util.UUID;
import javax.annotation.Nullable;

public class cbx extends bii implements bjw {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private biy i;
   @Nullable
   private UUID j;

   public cbx(bim<? extends cbx> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public cbx(cpm $$0, double $$1, double $$2, double $$3, float $$4, int $$5, biy $$6) {
      this(bim.H, $$0);
      this.e = $$5;
      this.a($$6);
      this.r($$4 * (180.0F / (float)Math.PI));
      this.e($$1, $$2, $$3);
   }

   @Override
   protected void a_() {
   }

   public void a(@Nullable biy $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cv();
   }

   @Nullable
   public biy j() {
      if (this.i == null && this.j != null && this.dK() instanceof akk) {
         bii $$0 = ((akk)this.dK()).a(this.j);
         if ($$0 instanceof biy) {
            this.i = (biy)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(qr $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dp() + (this.ag.j() * 2.0 - 1.0) * (double)this.df() * 0.5;
                  double $$2 = this.dr() + 0.05 + this.ag.j();
                  double $$3 = this.dv() + (this.ag.j() * 2.0 - 1.0) * (double)this.df() * 0.5;
                  double $$4 = (this.ag.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ag.j() * 0.3;
                  double $$6 = (this.ag.j() * 2.0 - 1.0) * 0.3;
                  this.dK().a(iv.g, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (biy $$8 : this.dK().a(biy.class, this.cG().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dK().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.ak();
         }
      }
   }

   private void c(biy $$0) {
      biy $$1 = this.j();
      if ($$0.bv() && !$$0.cq() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dL().o(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            $$0.a(this.dL().c(this, $$1), 6.0F);
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.hu, this.da(), 1.0F, this.ag.i() * 0.2F + 0.85F, false);
         }
      }
   }

   public float a(float $$0) {
      if (!this.h) {
         return 0.0F;
      } else {
         int $$1 = this.g - 2;
         return $$1 <= 0 ? 1.0F : 1.0F - ((float)$$1 - $$0) / 20.0F;
      }
   }
}
