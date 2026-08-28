import java.util.EnumSet;
import java.util.List;

public class ccn extends ccg {
   public final cjg a;
   private double b;
   private static final int c = 8;
   private int d;

   public ccn(cjg $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccg.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.P_() && !this.a.he()) {
         List<bum> $$0 = this.a.dV().a(this.a, this.a.cR().c(9.0, 4.0, 9.0), $$0x -> {
            but<?> $$1x = $$0x.aq();
            return $$1x == but.ax || $$1x == but.bx;
         });
         cjg $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bum $$3 : $$0) {
            cjg $$4 = (cjg)$$3;
            if ($$4.he() && !$$4.gI()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bum $$6 : $$0) {
               cjg $$7 = (cjg)$$6;
               if ($$7.P_() && !$$7.gI()) {
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
      if (this.a.he() && this.a.hf().bL() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hf());
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
      this.a.gH();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.he()) {
         if (!(this.a.D() instanceof ckx)) {
            cjg $$0 = this.a.hf();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            fbb $$3 = new fbb($$0.dA() - this.a.dA(), $$0.dC() - this.a.dC(), $$0.dG() - this.a.dG()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.P().a(this.a.dA() + $$3.d, this.a.dC() + $$3.e, this.a.dG() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cjg $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.he()) {
         return $$0.hf().P_() ? true : this.a($$0.hf(), ++$$1);
      } else {
         return false;
      }
   }
}
