import java.util.EnumSet;
import java.util.List;

public class bxx extends bxq {
   public final cep a;
   private double b;
   private static final int c = 8;
   private int d;

   public bxx(cep $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bxq.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gb() && !this.a.gZ()) {
         List<bqa> $$0 = this.a.dM().a(this.a, this.a.cH().c(9.0, 4.0, 9.0), $$0x -> {
            bqg<?> $$1x = $$0x.ai();
            return $$1x == bqg.am || $$1x == bqg.bd;
         });
         cep $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bqa $$3 : $$0) {
            cep $$4 = (cep)$$3;
            if ($$4.gZ() && !$$4.gY()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bqa $$6 : $$0) {
               cep $$7 = (cep)$$6;
               if ($$7.gb() && !$$7.gY()) {
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
         } else if (!$$1.gb() && !this.a($$1, 1)) {
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
      if (this.a.gZ() && this.a.ha().bA() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.ha());
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
      this.a.gX();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gZ()) {
         if (!(this.a.gc() instanceof cge)) {
            cep $$0 = this.a.ha();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            esj $$3 = new esj($$0.dr() - this.a.dr(), $$0.dt() - this.a.dt(), $$0.dx() - this.a.dx()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.K().a(this.a.dr() + $$3.c, this.a.dt() + $$3.d, this.a.dx() + $$3.e, this.b);
         }
      }
   }

   private boolean a(cep $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gZ()) {
         return $$0.ha().gb() ? true : this.a($$0.ha(), ++$$1);
      } else {
         return false;
      }
   }
}
