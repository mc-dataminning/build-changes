import java.util.EnumSet;
import java.util.List;

public class cbo extends cbh {
   public final cih a;
   private double b;
   private static final int c = 8;
   private int d;

   public cbo(cih $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbh.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.K_() && !this.a.hd()) {
         List<bto> $$0 = this.a.dS().a(this.a, this.a.cO().c(9.0, 4.0, 9.0), $$0x -> {
            btv<?> $$1x = $$0x.ao();
            return $$1x == btv.an || $$1x == btv.be;
         });
         cih $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bto $$3 : $$0) {
            cih $$4 = (cih)$$3;
            if ($$4.hd() && !$$4.hc()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bto $$6 : $$0) {
               cih $$7 = (cih)$$6;
               if ($$7.K_() && !$$7.hc()) {
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
      if (this.a.hd() && this.a.he().bI() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.he());
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
      this.a.gF();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.hd()) {
         if (!(this.a.C() instanceof cjy)) {
            cih $$0 = this.a.he();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            eys $$3 = new eys($$0.dx() - this.a.dx(), $$0.dz() - this.a.dz(), $$0.dD() - this.a.dD()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.P().a(this.a.dx() + $$3.d, this.a.dz() + $$3.e, this.a.dD() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cih $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hd()) {
         return $$0.he().K_() ? true : this.a($$0.he(), ++$$1);
      } else {
         return false;
      }
   }
}
