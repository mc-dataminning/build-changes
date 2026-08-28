import java.util.UUID;
import javax.annotation.Nullable;

public class cnf extends bsq implements bul {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private btl i;
   @Nullable
   private UUID j;

   public cnf(bsw<? extends cnf> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnf(dcu $$0, double $$1, double $$2, double $$3, float $$4, int $$5, btl $$6) {
      this(bsw.K, $$0);
      this.e = $$5;
      this.a($$6);
      this.s($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajz.a $$0) {
   }

   public void a(@Nullable btl $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cA();
   }

   @Nullable
   public btl p() {
      if (this.i == null && this.j != null && this.dQ() instanceof aqt) {
         bsq $$0 = ((aqt)this.dQ()).a(this.j);
         if ($$0 instanceof btl) {
            this.i = (btl)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(ua $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dv() + (this.ah.j() * 2.0 - 1.0) * (double)this.dk() * 0.5;
                  double $$2 = this.dx() + 0.05 + this.ah.j();
                  double $$3 = this.dB() + (this.ah.j() * 2.0 - 1.0) * (double)this.dk() * 0.5;
                  double $$4 = (this.ah.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ah.j() * 0.3;
                  double $$6 = (this.ah.j() * 2.0 - 1.0) * 0.3;
                  this.dQ().a(lm.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (btl $$8 : this.dQ().a(btl.class, this.cL().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dQ().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.aq();
         }
      }
   }

   private void c(btl $$0) {
      btl $$1 = this.p();
      if ($$0.bE() && !$$0.cv() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dR().p(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            brj $$2 = this.dR().c(this, (bsq)$$1);
            if ($$0.a($$2, 6.0F) && this.dQ() instanceof aqt $$3) {
               dac.a($$3, (bsq)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.aX()) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avo.iB, this.df(), 1.0F, this.ah.i() * 0.2F + 0.85F, false);
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
