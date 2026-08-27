import java.util.EnumSet;
import java.util.List;

public class bvm extends bvf {
   public final ccc a;
   private double b;
   private static final int c = 8;
   private int d;

   public bvm(ccc $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bvf.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fU() && !this.a.gU()) {
         List<bnq> $$0 = this.a.dM().a(this.a, this.a.cH().c(9.0, 4.0, 9.0), $$0x -> {
            bnw<?> $$1x = $$0x.ai();
            return $$1x == bnw.al || $$1x == bnw.bc;
         });
         ccc $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bnq $$3 : $$0) {
            ccc $$4 = (ccc)$$3;
            if ($$4.gU() && !$$4.gT()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bnq $$6 : $$0) {
               ccc $$7 = (ccc)$$6;
               if ($$7.fU() && !$$7.gT()) {
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
         } else if (!$$1.fU() && !this.a($$1, 1)) {
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
      if (this.a.gU() && this.a.gV().bx() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gV());
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
      this.a.gS();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gU()) {
         if (!(this.a.fV() instanceof cdq)) {
            ccc $$0 = this.a.gV();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            enz $$3 = new enz($$0.dr() - this.a.dr(), $$0.dt() - this.a.dt(), $$0.dx() - this.a.dx()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.N().a(this.a.dr() + $$3.c, this.a.dt() + $$3.d, this.a.dx() + $$3.e, this.b);
         }
      }
   }

   private boolean a(ccc $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gU()) {
         return $$0.gV().fU() ? true : this.a($$0.gV(), ++$$1);
      } else {
         return false;
      }
   }
}
