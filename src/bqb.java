import java.util.EnumSet;
import java.util.List;

public class bqb extends bpu {
   public final bwm a;
   private double b;
   private static final int c = 8;
   private int d;

   public bqb(bwm $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bpu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fO() && !this.a.gN()) {
         List<bii> $$0 = this.a.dK().a(this.a, this.a.cG().c(9.0, 4.0, 9.0), $$0x -> {
            bim<?> $$1x = $$0x.ag();
            return $$1x == bim.aj || $$1x == bim.ba;
         });
         bwm $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bii $$3 : $$0) {
            bwm $$4 = (bwm)$$3;
            if ($$4.gN() && !$$4.gM()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bii $$6 : $$0) {
               bwm $$7 = (bwm)$$6;
               if ($$7.fO() && !$$7.gM()) {
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
         } else if (!$$1.fO() && !this.a($$1, 1)) {
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
      if (this.a.gN() && this.a.gO().bv() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gO());
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
      this.a.gL();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gN()) {
         if (!(this.a.fP() instanceof bya)) {
            bwm $$0 = this.a.gO();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            ehe $$3 = new ehe($$0.dp() - this.a.dp(), $$0.dr() - this.a.dr(), $$0.dv() - this.a.dv()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.H().a(this.a.dp() + $$3.c, this.a.dr() + $$3.d, this.a.dv() + $$3.e, this.b);
         }
      }
   }

   private boolean a(bwm $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gN()) {
         return $$0.gO().fO() ? true : this.a($$0.gO(), ++$$1);
      } else {
         return false;
      }
   }
}
