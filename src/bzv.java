import java.util.EnumSet;
import java.util.List;

public class bzv extends bzo {
   public final cgn a;
   private double b;
   private static final int c = 8;
   private int d;

   public bzv(cgn $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzo.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gc() && !this.a.hb()) {
         List<brw> $$0 = this.a.dP().a(this.a, this.a.cK().c(9.0, 4.0, 9.0), $$0x -> {
            bsc<?> $$1x = $$0x.ak();
            return $$1x == bsc.an || $$1x == bsc.be;
         });
         cgn $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (brw $$3 : $$0) {
            cgn $$4 = (cgn)$$3;
            if ($$4.hb() && !$$4.ha()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (brw $$6 : $$0) {
               cgn $$7 = (cgn)$$6;
               if ($$7.gc() && !$$7.ha()) {
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
         } else if (!$$1.gc() && !this.a($$1, 1)) {
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
      if (this.a.hb() && this.a.hc().bD() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hc());
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
      this.a.gZ();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.hb()) {
         if (!(this.a.ge() instanceof cic)) {
            cgn $$0 = this.a.hc();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            eum $$3 = new eum($$0.du() - this.a.du(), $$0.dw() - this.a.dw(), $$0.dA() - this.a.dA()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.K().a(this.a.du() + $$3.c, this.a.dw() + $$3.d, this.a.dA() + $$3.e, this.b);
         }
      }
   }

   private boolean a(cgn $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hb()) {
         return $$0.hc().gc() ? true : this.a($$0.hc(), ++$$1);
      } else {
         return false;
      }
   }
}
