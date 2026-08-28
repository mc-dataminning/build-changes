import java.util.UUID;
import javax.annotation.Nullable;

public class cpc extends bui implements bwd {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private bve i;
   @Nullable
   private UUID j;

   public cpc(bup<? extends cpc> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpc(dff $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bve $$6) {
      this(bup.K, $$0);
      this.e = $$5;
      this.a($$6);
      this.v($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(aks.a $$0) {
   }

   public void a(@Nullable bve $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cI();
   }

   @Nullable
   public bve m() {
      if (this.i == null && this.j != null && this.dY() instanceof arq) {
         bui $$0 = ((arq)this.dY()).a(this.j);
         if ($$0 instanceof bve) {
            this.i = (bve)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(un $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(un $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dD() + (this.af.j() * 2.0 - 1.0) * (double)this.dt() * 0.5;
                  double $$2 = this.dF() + 0.05 + this.af.j();
                  double $$3 = this.dJ() + (this.af.j() * 2.0 - 1.0) * (double)this.dt() * 0.5;
                  double $$4 = (this.af.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.af.j() * 0.3;
                  double $$6 = (this.af.j() * 2.0 - 1.0) * 0.3;
                  this.dY().a(ls.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (bve $$8 : this.dY().a(bve.class, this.cT().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dY().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.av();
         }
      }
   }

   private void c(bve $$0) {
      bve $$1 = this.m();
      if ($$0.bN() && !$$0.cE() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dZ().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            bsy $$2 = this.dZ().c(this, (bui)$$1);
            if ($$0.a($$2, 6.0F) && this.dY() instanceof arq $$3) {
               dby.a($$3, (bui)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.bd()) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.iC, this.do(), 1.0F, this.af.i() * 0.2F + 0.85F, false);
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
