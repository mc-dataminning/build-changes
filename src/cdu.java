import java.util.EnumSet;
import java.util.List;

public class cdu extends cdn {
   public final ckq a;
   private double b;
   private static final int c = 8;
   private int d;

   public cdu(ckq $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cdn.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.O_() && !this.a.ha()) {
         List<bvs> $$0 = this.a.dV().a(this.a, this.a.cR().c(9.0, 4.0, 9.0), $$0x -> {
            bwb<?> $$1x = $$0x.aq();
            return $$1x == bwb.ax || $$1x == bwb.bx;
         });
         ckq $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bvs $$3 : $$0) {
            ckq $$4 = (ckq)$$3;
            if ($$4.ha() && !$$4.gG()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bvs $$6 : $$0) {
               ckq $$7 = (ckq)$$6;
               if ($$7.O_() && !$$7.gG()) {
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
      if (this.a.ha() && this.a.hb().bK() && this.a(this.a, 0)) {
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
   public void e() {
      this.a.gF();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.ha()) {
         if (!(this.a.C() instanceof cmh)) {
            ckq $$0 = this.a.hb();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            fcu $$3 = new fcu($$0.dA() - this.a.dA(), $$0.dC() - this.a.dC(), $$0.dG() - this.a.dG()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.O().a(this.a.dA() + $$3.d, this.a.dC() + $$3.e, this.a.dG() + $$3.f, this.b);
         }
      }
   }

   private boolean a(ckq $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.ha()) {
         return $$0.hb().O_() ? true : this.a($$0.hb(), ++$$1);
      } else {
         return false;
      }
   }
}
