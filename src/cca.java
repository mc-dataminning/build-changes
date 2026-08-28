import java.util.EnumSet;
import java.util.List;

public class cca extends cbt {
   public final cit a;
   private double b;
   private static final int c = 8;
   private int d;

   public cca(cit $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbt.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.M_() && !this.a.hi()) {
         List<btz> $$0 = this.a.dX().a(this.a, this.a.cS().c(9.0, 4.0, 9.0), $$0x -> {
            bug<?> $$1x = $$0x.aq();
            return $$1x == bug.an || $$1x == bug.be;
         });
         cit $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (btz $$3 : $$0) {
            cit $$4 = (cit)$$3;
            if ($$4.hi() && !$$4.gL()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (btz $$6 : $$0) {
               cit $$7 = (cit)$$6;
               if ($$7.M_() && !$$7.gL()) {
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
      if (this.a.hi() && this.a.hj().bM() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hj());
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
      this.a.gK();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.hi()) {
         if (!(this.a.C() instanceof ckk)) {
            cit $$0 = this.a.hj();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            ezh $$3 = new ezh($$0.dC() - this.a.dC(), $$0.dE() - this.a.dE(), $$0.dI() - this.a.dI()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.P().a(this.a.dC() + $$3.d, this.a.dE() + $$3.e, this.a.dI() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cit $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hi()) {
         return $$0.hj().M_() ? true : this.a($$0.hj(), ++$$1);
      } else {
         return false;
      }
   }
}
