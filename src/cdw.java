import java.util.UUID;
import javax.annotation.Nullable;

public class cdw extends bki implements blv {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private bky i;
   @Nullable
   private UUID j;

   public cdw(bkm<? extends cdw> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cdw(crs $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bky $$6) {
      this(bkm.H, $$0);
      this.e = $$5;
      this.a($$6);
      this.r($$4 * (180.0F / (float)Math.PI));
      this.e($$1, $$2, $$3);
   }

   @Override
   protected void b_() {
   }

   public void a(@Nullable bky $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cv();
   }

   @Nullable
   public bky q() {
      if (this.i == null && this.j != null && this.dL() instanceof ama) {
         bki $$0 = ((ama)this.dL()).a(this.j);
         if ($$0 instanceof bky) {
            this.i = (bky)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(rz $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dq() + (this.ag.j() * 2.0 - 1.0) * (double)this.df() * 0.5;
                  double $$2 = this.ds() + 0.05 + this.ag.j();
                  double $$3 = this.dw() + (this.ag.j() * 2.0 - 1.0) * (double)this.df() * 0.5;
                  double $$4 = (this.ag.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ag.j() * 0.3;
                  double $$6 = (this.ag.j() * 2.0 - 1.0) * 0.3;
                  this.dL().a(js.g, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (bky $$8 : this.dL().a(bky.class, this.cG().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dL().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.ak();
         }
      }
   }

   private void c(bky $$0) {
      bky $$1 = this.q();
      if ($$0.bv() && !$$0.cq() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dM().o(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            $$0.a(this.dM().c(this, $$1), 6.0F);
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.aS()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), aqn.hy, this.da(), 1.0F, this.ag.i() * 0.2F + 0.85F, false);
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
