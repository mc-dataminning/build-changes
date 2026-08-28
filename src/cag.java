import java.util.EnumSet;
import java.util.List;

public class cag extends bzz {
   public final cgy a;
   private double b;
   private static final int c = 8;
   private int d;

   public cag(cgy $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzz.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.ga() && !this.a.ha()) {
         List<bsg> $$0 = this.a.dQ().a(this.a, this.a.cL().c(9.0, 4.0, 9.0), $$0x -> {
            bsm<?> $$1x = $$0x.al();
            return $$1x == bsm.an || $$1x == bsm.be;
         });
         cgy $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bsg $$3 : $$0) {
            cgy $$4 = (cgy)$$3;
            if ($$4.ha() && !$$4.gZ()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bsg $$6 : $$0) {
               cgy $$7 = (cgy)$$6;
               if ($$7.ga() && !$$7.gZ()) {
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
         } else if (!$$1.ga() && !this.a($$1, 1)) {
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
      if (this.a.ha() && this.a.hb().bE() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hb());
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
      this.a.gY();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.ha()) {
         if (!(this.a.gc() instanceof cio)) {
            cgy $$0 = this.a.hb();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            ewf $$3 = new ewf($$0.dv() - this.a.dv(), $$0.dx() - this.a.dx(), $$0.dB() - this.a.dB()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.K().a(this.a.dv() + $$3.c, this.a.dx() + $$3.d, this.a.dB() + $$3.e, this.b);
         }
      }
   }

   private boolean a(cgy $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.ha()) {
         return $$0.hb().ga() ? true : this.a($$0.hb(), ++$$1);
      } else {
         return false;
      }
   }
}
