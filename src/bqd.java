import java.util.EnumSet;
import java.util.List;

public class bqd extends bpw {
   public final bwo a;
   private double b;
   private static final int c = 8;
   private int d;

   public bqd(bwo $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bpw.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fO() && !this.a.gO()) {
         List<bil> $$0 = this.a.dK().a(this.a, this.a.cG().c(9.0, 4.0, 9.0), $$0x -> {
            bip<?> $$1x = $$0x.ag();
            return $$1x == bip.aj || $$1x == bip.ba;
         });
         bwo $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bil $$3 : $$0) {
            bwo $$4 = (bwo)$$3;
            if ($$4.gO() && !$$4.gN()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bil $$6 : $$0) {
               bwo $$7 = (bwo)$$6;
               if ($$7.fO() && !$$7.gN()) {
                  double $$8 = this.a.f($$7);
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
         } else if (!$$1.fO() && !this.a($$1, 1)) {
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
   public boolean b() {
      if (this.a.gO() && this.a.gP().bv() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gP());
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
   public void d() {
      this.a.gM();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gO()) {
         if (!(this.a.fP() instanceof byc)) {
            bwo $$0 = this.a.gP();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            ehi $$3 = new ehi($$0.dp() - this.a.dp(), $$0.dr() - this.a.dr(), $$0.dv() - this.a.dv()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.H().a(this.a.dp() + $$3.c, this.a.dr() + $$3.d, this.a.dv() + $$3.e, this.b);
         }
      }
   }

   private boolean a(bwo $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gO()) {
         return $$0.gP().fO() ? true : this.a($$0.gP(), ++$$1);
      } else {
         return false;
      }
   }
}
