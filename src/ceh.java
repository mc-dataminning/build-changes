import java.util.EnumSet;
import java.util.List;

public class ceh extends cea {
   public final clk a;
   private double b;
   private static final int c = 8;
   private int d;

   public ceh(clk $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cea.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.O_() && !this.a.hb()) {
         List<bwf> $$0 = this.a.dV().a(this.a, this.a.cR().c(9.0, 4.0, 9.0), $$0x -> {
            bwo<?> $$1x = $$0x.aq();
            return $$1x == bwo.ax || $$1x == bwo.by;
         });
         clk $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bwf $$3 : $$0) {
            clk $$4 = (clk)$$3;
            if ($$4.hb() && !$$4.gH()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bwf $$6 : $$0) {
               clk $$7 = (clk)$$6;
               if ($$7.O_() && !$$7.gH()) {
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
         } else if (!$$1.O_() && !this.a($$1, 1)) {
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
      if (this.a.hb() && this.a.hc().bK() && this.a(this.a, 0)) {
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
      this.a.gG();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.hb()) {
         if (!(this.a.C() instanceof cnb)) {
            clk $$0 = this.a.hc();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            feq $$3 = new feq($$0.dA() - this.a.dA(), $$0.dC() - this.a.dC(), $$0.dG() - this.a.dG()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.O().a(this.a.dA() + $$3.d, this.a.dC() + $$3.e, this.a.dG() + $$3.f, this.b);
         }
      }
   }

   private boolean a(clk $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hb()) {
         return $$0.hc().O_() ? true : this.a($$0.hc(), ++$$1);
      } else {
         return false;
      }
   }
}
