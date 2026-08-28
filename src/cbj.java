import java.util.EnumSet;
import java.util.List;

public class cbj extends cbc {
   public final cic a;
   private double b;
   private static final int c = 8;
   private int d;

   public cbj(cic $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbc.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.K_() && !this.a.hc()) {
         List<btj> $$0 = this.a.dS().a(this.a, this.a.cO().c(9.0, 4.0, 9.0), $$0x -> {
            btq<?> $$1x = $$0x.ao();
            return $$1x == btq.an || $$1x == btq.be;
         });
         cic $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (btj $$3 : $$0) {
            cic $$4 = (cic)$$3;
            if ($$4.hc() && !$$4.hb()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (btj $$6 : $$0) {
               cic $$7 = (cic)$$6;
               if ($$7.K_() && !$$7.hb()) {
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
         } else if (!$$1.K_() && !this.a($$1, 1)) {
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
      if (this.a.hc() && this.a.hd().bI() && this.a(this.a, 0)) {
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
   public void e() {
      this.a.gE();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.hc()) {
         if (!(this.a.C() instanceof cjt)) {
            cic $$0 = this.a.hd();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            eye $$3 = new eye($$0.dx() - this.a.dx(), $$0.dz() - this.a.dz(), $$0.dD() - this.a.dD()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.P().a(this.a.dx() + $$3.d, this.a.dz() + $$3.e, this.a.dD() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cic $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hc()) {
         return $$0.hd().K_() ? true : this.a($$0.hd(), ++$$1);
      } else {
         return false;
      }
   }
}
