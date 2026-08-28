import java.util.EnumSet;
import java.util.List;

public class cem extends cef {
   public final clo a;
   private double b;
   private static final int c = 8;
   private int d;

   public cem(clo $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cef.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.O_() && !this.a.hd()) {
         List<bwi> $$0 = this.a.dU().a(this.a, this.a.cQ().c(9.0, 4.0, 9.0), $$0x -> {
            bwr<?> $$1x = $$0x.an();
            return $$1x == bwr.ax || $$1x == bwr.by;
         });
         clo $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bwi $$3 : $$0) {
            clo $$4 = (clo)$$3;
            if ($$4.hd() && !$$4.gJ()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bwi $$6 : $$0) {
               clo $$7 = (clo)$$6;
               if ($$7.O_() && !$$7.gJ()) {
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
      if (this.a.hd() && this.a.he().bI() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.he());
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
      this.a.gI();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.hd()) {
         if (!(this.a.C() instanceof cni)) {
            clo $$0 = this.a.he();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            fex $$3 = new fex($$0.dz() - this.a.dz(), $$0.dB() - this.a.dB(), $$0.dF() - this.a.dF()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.O().a(this.a.dz() + $$3.d, this.a.dB() + $$3.e, this.a.dF() + $$3.f, this.b);
         }
      }
   }

   private boolean a(clo $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hd()) {
         return $$0.he().O_() ? true : this.a($$0.he(), ++$$1);
      } else {
         return false;
      }
   }
}
