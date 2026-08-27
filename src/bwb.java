import java.util.EnumSet;
import java.util.List;

public class bwb extends bvu {
   public final ccr a;
   private double b;
   private static final int c = 8;
   private int d;

   public bwb(ccr $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bvu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fZ() && !this.a.gY()) {
         List<bof> $$0 = this.a.dJ().a(this.a, this.a.cE().c(9.0, 4.0, 9.0), $$0x -> {
            bol<?> $$1x = $$0x.ai();
            return $$1x == bol.al || $$1x == bol.bc;
         });
         ccr $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bof $$3 : $$0) {
            ccr $$4 = (ccr)$$3;
            if ($$4.gY() && !$$4.gX()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bof $$6 : $$0) {
               ccr $$7 = (ccr)$$6;
               if ($$7.fZ() && !$$7.gX()) {
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
         } else if (!$$1.fZ() && !this.a($$1, 1)) {
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
      if (this.a.gY() && this.a.gZ().bx() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gZ());
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
      this.a.gW();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gY()) {
         if (!(this.a.ga() instanceof cef)) {
            ccr $$0 = this.a.gZ();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            eov $$3 = new eov($$0.do() - this.a.do(), $$0.dq() - this.a.dq(), $$0.du() - this.a.du()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.N().a(this.a.do() + $$3.c, this.a.dq() + $$3.d, this.a.du() + $$3.e, this.b);
         }
      }
   }

   private boolean a(ccr $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gY()) {
         return $$0.gZ().fZ() ? true : this.a($$0.gZ(), ++$$1);
      } else {
         return false;
      }
   }
}
