import java.util.UUID;
import javax.annotation.Nullable;

public class cmv extends bsh implements bub {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private btc i;
   @Nullable
   private UUID j;

   public cmv(bsn<? extends cmv> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cmv(dcg $$0, double $$1, double $$2, double $$3, float $$4, int $$5, btc $$6) {
      this(bsn.K, $$0);
      this.e = $$5;
      this.a($$6);
      this.s($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   public void a(@Nullable btc $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cB();
   }

   @Nullable
   public btc p() {
      if (this.i == null && this.j != null && this.dR() instanceof aqm) {
         bsh $$0 = ((aqm)this.dR()).a(this.j);
         if ($$0 instanceof btc) {
            this.i = (btc)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(tx $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().B) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dw() + (this.ah.j() * 2.0 - 1.0) * (double)this.dl() * 0.5;
                  double $$2 = this.dy() + 0.05 + this.ah.j();
                  double $$3 = this.dC() + (this.ah.j() * 2.0 - 1.0) * (double)this.dl() * 0.5;
                  double $$4 = (this.ah.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ah.j() * 0.3;
                  double $$6 = (this.ah.j() * 2.0 - 1.0) * 0.3;
                  this.dR().a(lj.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (btc $$8 : this.dR().a(btc.class, this.cM().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dR().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.aq();
         }
      }
   }

   private void c(btc $$0) {
      btc $$1 = this.p();
      if ($$0.bF() && !$$0.cw() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dS().p(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            bra $$2 = this.dS().c(this, (bsh)$$1);
            if ($$0.a($$2, 6.0F) && this.dR() instanceof aqm $$3) {
               czo.a($$3, (bsh)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.aY()) {
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.iB, this.dg(), 1.0F, this.ah.i() * 0.2F + 0.85F, false);
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
