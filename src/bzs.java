import java.util.EnumSet;
import java.util.List;

public class bzs extends bzl {
   public final cgl a;
   private double b;
   private static final int c = 8;
   private int d;

   public bzs(cgl $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gl() && !this.a.hk()) {
         List<brv> $$0 = this.a.dU().a(this.a, this.a.cP().c(9.0, 4.0, 9.0), $$0x -> {
            bsb<?> $$1x = $$0x.ak();
            return $$1x == bsb.ao || $$1x == bsb.bi;
         });
         cgl $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (brv $$3 : $$0) {
            cgl $$4 = (cgl)$$3;
            if ($$4.hk() && !$$4.hj()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (brv $$6 : $$0) {
               cgl $$7 = (cgl)$$6;
               if ($$7.gl() && !$$7.hj()) {
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
         } else if (!$$1.gl() && !this.a($$1, 1)) {
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
      if (this.a.hk() && this.a.hl().bI() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hl());
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
      this.a.hi();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.hk()) {
         if (!(this.a.gn() instanceof cia)) {
            cgl $$0 = this.a.hl();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            ewu $$3 = new ewu($$0.dz() - this.a.dz(), $$0.dB() - this.a.dB(), $$0.dF() - this.a.dF()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.J().a(this.a.dz() + $$3.c, this.a.dB() + $$3.d, this.a.dF() + $$3.e, this.b);
         }
      }
   }

   private boolean a(cgl $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hk()) {
         return $$0.hl().gl() ? true : this.a($$0.hl(), ++$$1);
      } else {
         return false;
      }
   }
}
