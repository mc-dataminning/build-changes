import java.util.UUID;
import javax.annotation.Nullable;

public class cqd extends bvf implements bxa {
   public static final int a = 20;
   public static final int b = 2;
   public static final int c = 14;
   private int d;
   private boolean e;
   private int f = 22;
   private boolean g;
   @Nullable
   private bwb h;
   @Nullable
   private UUID i;

   public cqd(bvm<? extends cqd> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqd(dha $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bwb $$6) {
      this(bvm.U, $$0);
      this.d = $$5;
      this.a($$6);
      this.v($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(alg.a $$0) {
   }

   public void a(@Nullable bwb $$0) {
      this.h = $$0;
      this.i = $$0 == null ? null : $$0.cG();
   }

   @Nullable
   public bwb l() {
      if (this.h == null && this.i != null && this.dV() instanceof ash) {
         bvf $$0 = ((ash)this.dV()).a(this.i);
         if ($$0 instanceof bwb) {
            this.h = (bwb)$$0;
         }
      }

      return this.h;
   }

   @Override
   protected void a(ux $$0) {
      this.d = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.i = $$0.a("Owner");
      }
   }

   @Override
   protected void b(ux $$0) {
      $$0.a("Warmup", this.d);
      if (this.i != null) {
         $$0.a("Owner", this.i);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.g) {
            this.f--;
            if (this.f == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dA() + (this.ae.j() * 2.0 - 1.0) * (double)this.dq() * 0.5;
                  double $$2 = this.dC() + 0.05 + this.ae.j();
                  double $$3 = this.dG() + (this.ae.j() * 2.0 - 1.0) * (double)this.dq() * 0.5;
                  double $$4 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ae.j() * 0.3;
                  double $$6 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  this.dV().a(ls.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.d < 0) {
         if (this.d == -8) {
            for (bwb $$8 : this.dV().a(bwb.class, this.cR().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.e) {
            this.dV().a(this, (byte)4);
            this.e = true;
         }

         if (--this.f < 0) {
            this.at();
         }
      }
   }

   private void c(bwb $$0) {
      bwb $$1 = this.l();
      if ($$0.bL() && !$$0.cC() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dW().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            btv $$2 = this.dW().c(this, (bvf)$$1);
            if (this.dV() instanceof ash $$3 && $$0.a($$3, $$2, 6.0F)) {
               ddt.a($$3, (bvf)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.g = true;
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), axf.iU, this.dm(), 1.0F, this.ae.i() * 0.2F + 0.85F, false);
         }
      }
   }

   public float a(float $$0) {
      if (!this.g) {
         return 0.0F;
      } else {
         int $$1 = this.f - 2;
         return $$1 <= 0 ? 1.0F : 1.0F - ((float)$$1 - $$0) / 20.0F;
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      return false;
   }
}
