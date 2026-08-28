import java.util.UUID;
import javax.annotation.Nullable;

public class coy extends bue implements bvz {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private bva i;
   @Nullable
   private UUID j;

   public coy(bul<? extends coy> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public coy(dfb $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bva $$6) {
      this(bul.K, $$0);
      this.e = $$5;
      this.a($$6);
      this.v($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akp.a $$0) {
   }

   public void a(@Nullable bva $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cH();
   }

   @Nullable
   public bva m() {
      if (this.i == null && this.j != null && this.dX() instanceof arn) {
         bue $$0 = ((arn)this.dX()).a(this.j);
         if ($$0 instanceof bva) {
            this.i = (bva)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(uk $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dC() + (this.af.j() * 2.0 - 1.0) * (double)this.ds() * 0.5;
                  double $$2 = this.dE() + 0.05 + this.af.j();
                  double $$3 = this.dI() + (this.af.j() * 2.0 - 1.0) * (double)this.ds() * 0.5;
                  double $$4 = (this.af.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.af.j() * 0.3;
                  double $$6 = (this.af.j() * 2.0 - 1.0) * 0.3;
                  this.dX().a(lr.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (bva $$8 : this.dX().a(bva.class, this.cS().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dX().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.av();
         }
      }
   }

   private void c(bva $$0) {
      bva $$1 = this.m();
      if ($$0.bM() && !$$0.cD() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dY().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            bsu $$2 = this.dY().c(this, (bue)$$1);
            if ($$0.a($$2, 6.0F) && this.dX() instanceof arn $$3) {
               dbu.a($$3, (bue)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.bc()) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awl.iC, this.dn(), 1.0F, this.af.i() * 0.2F + 0.85F, false);
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
