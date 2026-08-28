import java.util.EnumSet;
import java.util.List;

public class caw extends cap {
   public final cho a;
   private double b;
   private static final int c = 8;
   private int d;

   public caw(cho $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cap.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gd() && !this.a.hc()) {
         List<bsw> $$0 = this.a.dP().a(this.a, this.a.cK().c(9.0, 4.0, 9.0), $$0x -> {
            btc<?> $$1x = $$0x.ak();
            return $$1x == btc.an || $$1x == btc.be;
         });
         cho $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bsw $$3 : $$0) {
            cho $$4 = (cho)$$3;
            if ($$4.hc() && !$$4.hb()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bsw $$6 : $$0) {
               cho $$7 = (cho)$$6;
               if ($$7.gd() && !$$7.hb()) {
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
         } else if (!$$1.gd() && !this.a($$1, 1)) {
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
      if (this.a.hc() && this.a.hd().bD() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hd());
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
      this.a.ha();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.hc()) {
         if (!(this.a.gf() instanceof cjd)) {
            cho $$0 = this.a.hd();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            evt $$3 = new evt($$0.du() - this.a.du(), $$0.dw() - this.a.dw(), $$0.dA() - this.a.dA()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.K().a(this.a.du() + $$3.c, this.a.dw() + $$3.d, this.a.dA() + $$3.e, this.b);
         }
      }
   }

   private boolean a(cho $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hc()) {
         return $$0.hd().gd() ? true : this.a($$0.hd(), ++$$1);
      } else {
         return false;
      }
   }
}
