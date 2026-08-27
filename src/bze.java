import java.util.EnumSet;
import java.util.List;

public class bze extends byx {
   public final cfw a;
   private double b;
   private static final int c = 8;
   private int d;

   public bze(cfw $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(byx.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gc() && !this.a.hb()) {
         List<brh> $$0 = this.a.dN().a(this.a, this.a.cI().c(9.0, 4.0, 9.0), $$0x -> {
            brn<?> $$1x = $$0x.ai();
            return $$1x == brn.am || $$1x == brn.bd;
         });
         cfw $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (brh $$3 : $$0) {
            cfw $$4 = (cfw)$$3;
            if ($$4.hb() && !$$4.ha()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (brh $$6 : $$0) {
               cfw $$7 = (cfw)$$6;
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
      if (this.a.hb() && this.a.hc().bB() && this.a(this.a, 0)) {
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
         if (!(this.a.ge() instanceof chl)) {
            cfw $$0 = this.a.hc();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            etp $$3 = new etp($$0.ds() - this.a.ds(), $$0.du() - this.a.du(), $$0.dy() - this.a.dy()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.K().a(this.a.ds() + $$3.c, this.a.du() + $$3.d, this.a.dy() + $$3.e, this.b);
         }
      }
   }

   private boolean a(cfw $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hb()) {
         return $$0.hc().gc() ? true : this.a($$0.hc(), ++$$1);
      } else {
         return false;
      }
   }
}
