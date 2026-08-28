import java.util.EnumSet;
import java.util.List;

public class cdd extends ccw {
   public final cjz a;
   private double b;
   private static final int c = 8;
   private int d;

   public cdd(cjz $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccw.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.O_() && !this.a.he()) {
         List<bva> $$0 = this.a.dU().a(this.a, this.a.cQ().c(9.0, 4.0, 9.0), $$0x -> {
            bvi<?> $$1x = $$0x.aq();
            return $$1x == bvi.ax || $$1x == bvi.bx;
         });
         cjz $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bva $$3 : $$0) {
            cjz $$4 = (cjz)$$3;
            if ($$4.he() && !$$4.gI()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bva $$6 : $$0) {
               cjz $$7 = (cjz)$$6;
               if ($$7.O_() && !$$7.gI()) {
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
      if (this.a.he() && this.a.hf().bJ() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hf());
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
      this.a.gH();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.he()) {
         if (!(this.a.C() instanceof clq)) {
            cjz $$0 = this.a.hf();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            fbx $$3 = new fbx($$0.dz() - this.a.dz(), $$0.dB() - this.a.dB(), $$0.dF() - this.a.dF()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.O().a(this.a.dz() + $$3.d, this.a.dB() + $$3.e, this.a.dF() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cjz $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.he()) {
         return $$0.hf().O_() ? true : this.a($$0.hf(), ++$$1);
      } else {
         return false;
      }
   }
}
