import java.util.EnumSet;
import java.util.List;

public class bqi extends bqb {
   public final bwt a;
   private double b;
   private static final int c = 8;
   private int d;

   public bqi(bwt $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bqb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fR() && !this.a.gR()) {
         List<biq> $$0 = this.a.dL().a(this.a, this.a.cH().c(9.0, 4.0, 9.0), $$0x -> {
            biu<?> $$1x = $$0x.ah();
            return $$1x == biu.aj || $$1x == biu.ba;
         });
         bwt $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (biq $$3 : $$0) {
            bwt $$4 = (bwt)$$3;
            if ($$4.gR() && !$$4.gQ()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (biq $$6 : $$0) {
               bwt $$7 = (bwt)$$6;
               if ($$7.fR() && !$$7.gQ()) {
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
         } else if (!$$1.fR() && !this.a($$1, 1)) {
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
      if (this.a.gR() && this.a.gS().bw() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gS());
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
      this.a.gP();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gR()) {
         if (!(this.a.fS() instanceof byh)) {
            bwt $$0 = this.a.gS();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            ehn $$3 = new ehn($$0.dq() - this.a.dq(), $$0.ds() - this.a.ds(), $$0.dw() - this.a.dw()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.L().a(this.a.dq() + $$3.c, this.a.ds() + $$3.d, this.a.dw() + $$3.e, this.b);
         }
      }
   }

   private boolean a(bwt $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gR()) {
         return $$0.gS().fR() ? true : this.a($$0.gS(), ++$$1);
      } else {
         return false;
      }
   }
}
