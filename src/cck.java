import java.util.EnumSet;
import java.util.List;

public class cck extends ccd {
   public final cjd a;
   private double b;
   private static final int c = 8;
   private int d;

   public cck(cjd $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccd.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.P_() && !this.a.hb()) {
         List<buj> $$0 = this.a.dW().a(this.a, this.a.cR().c(9.0, 4.0, 9.0), $$0x -> {
            buq<?> $$1x = $$0x.aq();
            return $$1x == buq.ax || $$1x == buq.bx;
         });
         cjd $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (buj $$3 : $$0) {
            cjd $$4 = (cjd)$$3;
            if ($$4.hb() && !$$4.gF()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (buj $$6 : $$0) {
               cjd $$7 = (cjd)$$6;
               if ($$7.P_() && !$$7.gF()) {
                  double $$8 = this.a.g($$7);
                  if (!($$8 > $$2)) {
                     $$2 = $$8;
                     $$1 = $$7;
                  }
               }
            }
         }

         if ($$1 == null) {
            return false;
         } else if ($$2 < 4.0) {
            return false;
         } else if (!$$1.P_() && !this.a($$1, 1)) {
            return false;
         } else {
            this.a.a($$1);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean c() {
      if (this.a.hb() && this.a.hc().bL() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hc());
         if ($$0 > 676.0) {
            if (this.b <= 3.0) {
               this.b *= 1.2;
               this.d = b(40);
               return true;
            }

            if (this.d == 0) {
               return false;
            }
         }

         if (this.d > 0) {
            this.d--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void e() {
      this.a.gE();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.hb()) {
         if (!(this.a.A() instanceof cku)) {
            cjd $$0 = this.a.hc();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            fay $$3 = new fay($$0.dB() - this.a.dB(), $$0.dD() - this.a.dD(), $$0.dH() - this.a.dH()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.L().a(this.a.dB() + $$3.d, this.a.dD() + $$3.e, this.a.dH() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cjd $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hb()) {
         return $$0.hc().P_() ? true : this.a($$0.hc(), ++$$1);
      } else {
         return false;
      }
   }
}
