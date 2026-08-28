import java.util.EnumSet;
import java.util.List;

public class cdk extends cdd {
   public final ckd a;
   private double b;
   private static final int c = 8;
   private int d;

   public cdk(ckd $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cdd.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.P_() && !this.a.ha()) {
         List<bvj> $$0 = this.a.dW().a(this.a, this.a.cR().c(9.0, 4.0, 9.0), $$0x -> {
            bvq<?> $$1x = $$0x.aq();
            return $$1x == bvq.ay || $$1x == bvq.by;
         });
         ckd $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bvj $$3 : $$0) {
            ckd $$4 = (ckd)$$3;
            if ($$4.ha() && !$$4.gE()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bvj $$6 : $$0) {
               ckd $$7 = (ckd)$$6;
               if ($$7.P_() && !$$7.gE()) {
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
         } else if (!$$1.P_() && !this.a($$1, 1)) {
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
      if (this.a.ha() && this.a.hb().bL() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hb());
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
      this.a.gD();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.ha()) {
         if (!(this.a.A() instanceof clu)) {
            ckd $$0 = this.a.hb();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            fbx $$3 = new fbx($$0.dB() - this.a.dB(), $$0.dD() - this.a.dD(), $$0.dH() - this.a.dH()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.L().a(this.a.dB() + $$3.d, this.a.dD() + $$3.e, this.a.dH() + $$3.f, this.b);
         }
      }
   }

   private boolean a(ckd $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.ha()) {
         return $$0.hb().P_() ? true : this.a($$0.hb(), ++$$1);
      } else {
         return false;
      }
   }
}
