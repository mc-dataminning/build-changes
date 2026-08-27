import java.util.EnumSet;
import java.util.List;

public class bnc extends bmv {
   public final btn a;
   private double b;
   private static final int c = 8;
   private int d;

   public bnc(btn $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bmv.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fO() && !this.a.gM()) {
         List<bfj> $$0 = this.a.dI().a(this.a, this.a.cE().c(9.0, 4.0, 9.0), $$0x -> {
            bfn<?> $$1x = $$0x.ae();
            return $$1x == bfn.aj || $$1x == bfn.ba;
         });
         btn $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bfj $$3 : $$0) {
            btn $$4 = (btn)$$3;
            if ($$4.gM() && !$$4.gL()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bfj $$6 : $$0) {
               btn $$7 = (btn)$$6;
               if ($$7.fO() && !$$7.gL()) {
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
      if (this.a.gM() && this.a.gN().bs() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gN());
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
      this.a.gK();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gM()) {
         if (!(this.a.fP() instanceof bvb)) {
            btn $$0 = this.a.gN();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            eei $$3 = new eei($$0.dn() - this.a.dn(), $$0.dp() - this.a.dp(), $$0.dt() - this.a.dt()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.J().a(this.a.dn() + $$3.c, this.a.dp() + $$3.d, this.a.dt() + $$3.e, this.b);
         }
      }
   }

   private boolean a(btn $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gM()) {
         return $$0.gN().fO() ? true : this.a($$0.gN(), ++$$1);
      } else {
         return false;
      }
   }
}
