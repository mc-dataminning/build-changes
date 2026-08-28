import java.util.EnumSet;
import java.util.List;

public class cez extends ces {
   public final cly a;
   private double b;
   private static final int c = 8;
   private int d;

   public cez(cly $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ces.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.S_() && !this.a.he()) {
         List<bwv> $$0 = this.a.dV().a(this.a, this.a.cR().c(9.0, 4.0, 9.0), $$0x -> {
            bxe<?> $$1x = $$0x.an();
            return $$1x == bxe.ay || $$1x == bxe.bz;
         });
         cly $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bwv $$3 : $$0) {
            cly $$4 = (cly)$$3;
            if ($$4.he() && !$$4.gK()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bwv $$6 : $$0) {
               cly $$7 = (cly)$$6;
               if ($$7.S_() && !$$7.gK()) {
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
         } else if (!$$1.S_() && !this.a($$1, 1)) {
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
      if (this.a.he() && this.a.hf().bJ() && this.a(this.a, 0)) {
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
      this.a.gJ();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.he()) {
         if (!(this.a.C() instanceof cny)) {
            cly $$0 = this.a.hf();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            ffs $$3 = new ffs($$0.dA() - this.a.dA(), $$0.dC() - this.a.dC(), $$0.dG() - this.a.dG()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.O().a(this.a.dA() + $$3.d, this.a.dC() + $$3.e, this.a.dG() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cly $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.he()) {
         return $$0.hf().S_() ? true : this.a($$0.hf(), ++$$1);
      } else {
         return false;
      }
   }
}
