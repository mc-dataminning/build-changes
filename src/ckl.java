import javax.annotation.Nullable;

public class ckl extends cll {
   public ckl(btv<? extends ckl> $$0, deg $$1) {
      super($$0, $$1);
   }

   public static bvq.a q() {
      return cll.t().a(bvr.s, 12.0);
   }

   @Override
   public boolean E(bto $$0) {
      if (super.E($$0)) {
         if ($$0 instanceof buk) {
            int $$1 = 0;
            if (this.dS().am() == brm.c) {
               $$1 = 7;
            } else if (this.dS().am() == brm.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((buk)$$0).b(new bsv(bsx.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      return $$3;
   }

   @Override
   public eys l(bto $$0) {
      return $$0.dn() <= this.dn() ? new eys(0.0, 0.21875 * (double)this.ef(), 0.0) : super.l($$0);
   }
}
