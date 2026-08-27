import java.util.EnumSet;
import java.util.List;

public class bsn extends bsg {
   public final byy a;
   private double b;
   private static final int c = 8;
   private int d;

   public bsn(byy $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bsg.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fT() && !this.a.gT()) {
         List<bkv> $$0 = this.a.dN().a(this.a, this.a.cH().c(9.0, 4.0, 9.0), $$0x -> {
            bkz<?> $$1x = $$0x.ai();
            return $$1x == bkz.aj || $$1x == bkz.ba;
         });
         byy $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bkv $$3 : $$0) {
            byy $$4 = (byy)$$3;
            if ($$4.gT() && !$$4.gS()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bkv $$6 : $$0) {
               byy $$7 = (byy)$$6;
               if ($$7.fT() && !$$7.gS()) {
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
         } else if (!$$1.fT() && !this.a($$1, 1)) {
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
      if (this.a.gT() && this.a.gU().bx() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gU());
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
      this.a.gR();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gT()) {
         if (!(this.a.fU() instanceof cam)) {
            byy $$0 = this.a.gU();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            ejz $$3 = new ejz($$0.ds() - this.a.ds(), $$0.du() - this.a.du(), $$0.dy() - this.a.dy()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.N().a(this.a.ds() + $$3.c, this.a.du() + $$3.d, this.a.dy() + $$3.e, this.b);
         }
      }
   }

   private boolean a(byy $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gT()) {
         return $$0.gU().fT() ? true : this.a($$0.gU(), ++$$1);
      } else {
         return false;
      }
   }
}
