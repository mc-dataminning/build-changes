import java.util.EnumSet;
import java.util.List;

public class ccf extends cby {
   public final ciy a;
   private double b;
   private static final int c = 8;
   private int d;

   public ccf(ciy $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cby.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.M_() && !this.a.hh()) {
         List<bue> $$0 = this.a.dX().a(this.a, this.a.cS().c(9.0, 4.0, 9.0), $$0x -> {
            bul<?> $$1x = $$0x.ar();
            return $$1x == bul.an || $$1x == bul.be;
         });
         ciy $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bue $$3 : $$0) {
            ciy $$4 = (ciy)$$3;
            if ($$4.hh() && !$$4.gK()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bue $$6 : $$0) {
               ciy $$7 = (ciy)$$6;
               if ($$7.M_() && !$$7.gK()) {
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
         } else if (!$$1.M_() && !this.a($$1, 1)) {
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
      if (this.a.hh() && this.a.hi().bM() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hi());
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
      if (this.a.hh()) {
         if (!(this.a.C() instanceof ckp)) {
            ciy $$0 = this.a.hi();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            ezn $$3 = new ezn($$0.dC() - this.a.dC(), $$0.dE() - this.a.dE(), $$0.dI() - this.a.dI()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.P().a(this.a.dC() + $$3.d, this.a.dE() + $$3.e, this.a.dI() + $$3.f, this.b);
         }
      }
   }

   private boolean a(ciy $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hh()) {
         return $$0.hi().M_() ? true : this.a($$0.hi(), ++$$1);
      } else {
         return false;
      }
   }
}
