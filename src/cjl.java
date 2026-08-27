import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjl extends cjd {
   @Nullable
   private cjl.b b;

   public cjl(bsb<? extends cjl> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      this.b = new cjl.b(this);
      this.cb.a(1, new bzf(this));
      this.cb.a(1, new bza(this, this.dU()));
      this.cb.a(3, this.b);
      this.cb.a(4, new bzv(this, 1.0, false));
      this.cb.a(5, new cjl.a(this));
      this.cc.a(1, new cbd(this).a());
      this.cc.a(2, new cbe<>(this, cly.class, true));
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 8.0).a(btv.r, 0.25).a(btv.c, 1.0);
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }

   @Override
   protected avn u() {
      return avo.xs;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.xu;
   }

   @Override
   protected avn n_() {
      return avo.xt;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.xv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awg.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.bj = this.dK();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return djf.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsb<cjl> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cly $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cai {
      @Nullable
      private iw i;
      private boolean j;

      public a(cjl $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.J().l()) {
            return false;
         } else {
            ayt $$0 = this.b.et();
            if (this.b.dU().ab().b(dbw.c) && $$0.a(b(10)) == 0) {
               this.i = iw.b($$0);
               ir $$1 = ir.a(this.b.dz(), this.b.dB() + 0.5, this.b.dF()).a(this.i);
               dtc $$2 = this.b.dU().a_($$1);
               if (djf.m($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.a();
         }
      }

      @Override
      public boolean b() {
         return this.j ? false : super.b();
      }

      @Override
      public void c() {
         if (!this.j) {
            super.c();
         } else {
            dcb $$0 = this.b.dU();
            ir $$1 = ir.a(this.b.dz(), this.b.dB() + 0.5, this.b.dF()).a(this.i);
            dtc $$2 = $$0.a_($$1);
            if (djf.m($$2)) {
               $$0.a($$1, djf.n($$2), 3);
               this.b.Q();
               this.b.ao();
            }
         }
      }
   }

   static class b extends bzl {
      private final cjl a;
      private int b;

      public b(cjl $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean a() {
         return this.b > 0;
      }

      @Override
      public void e() {
         this.b--;
         if (this.b <= 0) {
            dca $$0 = this.a.dU();
            ayt $$1 = this.a.et();
            ir $$2 = this.a.du();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ir $$6 = $$2.b($$4, $$3, $$5);
                     dtc $$7 = $$0.a_($$6);
                     dfc $$8 = $$7.b();
                     if ($$8 instanceof djf) {
                        if ($$0.ab().b(dbw.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((djf)$$8).o($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
