import java.util.EnumSet;
import java.util.List;

public class car extends cak {
   public final chj a;
   private double b;
   private static final int c = 8;
   private int d;

   public car(chj $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.fY() && !this.a.gY()) {
         List<bsq> $$0 = this.a.dQ().a(this.a, this.a.cL().c(9.0, 4.0, 9.0), $$0x -> {
            bsw<?> $$1x = $$0x.am();
            return $$1x == bsw.an || $$1x == bsw.be;
         });
         chj $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bsq $$3 : $$0) {
            chj $$4 = (chj)$$3;
            if ($$4.gY() && !$$4.gX()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bsq $$6 : $$0) {
               chj $$7 = (chj)$$6;
               if ($$7.fY() && !$$7.gX()) {
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
         } else if (!$$1.fY() && !this.a($$1, 1)) {
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
      if (this.a.gY() && this.a.gZ().bE() && this.a(this.a, 0)) {
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
      this.a.gW();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.gY()) {
         if (!(this.a.ga() instanceof ciz)) {
            chj $$0 = this.a.gZ();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            eww $$3 = new eww($$0.dv() - this.a.dv(), $$0.dx() - this.a.dx(), $$0.dB() - this.a.dB()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.J().a(this.a.dv() + $$3.c, this.a.dx() + $$3.d, this.a.dB() + $$3.e, this.b);
         }
      }
   }

   private boolean a(chj $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gY()) {
         return $$0.gZ().fY() ? true : this.a($$0.gZ(), ++$$1);
      } else {
         return false;
      }
   }
}
