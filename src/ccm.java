import java.util.EnumSet;
import java.util.List;

public class ccm extends ccf {
   public final cjf a;
   private double b;
   private static final int c = 8;
   private int d;

   public ccm(cjf $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccf.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.N_() && !this.a.gY()) {
         List<bul> $$0 = this.a.dV().a(this.a, this.a.cR().c(9.0, 4.0, 9.0), $$0x -> {
            bus<?> $$1x = $$0x.aq();
            return $$1x == bus.aw || $$1x == bus.bu;
         });
         cjf $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bul $$3 : $$0) {
            cjf $$4 = (cjf)$$3;
            if ($$4.gY() && !$$4.gC()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bul $$6 : $$0) {
               cjf $$7 = (cjf)$$6;
               if ($$7.N_() && !$$7.gC()) {
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
         } else if (!$$1.N_() && !this.a($$1, 1)) {
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
      if (this.a.gY() && this.a.gZ().bL() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.gZ());
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
      this.a.gB();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.gY()) {
         if (!(this.a.A() instanceof ckw)) {
            cjf $$0 = this.a.gZ();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            ezy $$3 = new ezy($$0.dA() - this.a.dA(), $$0.dC() - this.a.dC(), $$0.dG() - this.a.dG()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.L().a(this.a.dA() + $$3.d, this.a.dC() + $$3.e, this.a.dG() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cjf $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gY()) {
         return $$0.gZ().N_() ? true : this.a($$0.gZ(), ++$$1);
      } else {
         return false;
      }
   }
}
