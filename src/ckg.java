import javax.annotation.Nullable;

public class ckg extends clg {
   public ckg(btq<? extends ckg> $$0, dds $$1) {
      super($$0, $$1);
   }

   public static bvl.a q() {
      return clg.t().a(bvm.s, 12.0);
   }

   @Override
   public boolean E(btj $$0) {
      if (super.E($$0)) {
         if ($$0 instanceof buf) {
            int $$1 = 0;
            if (this.dS().am() == brh.c) {
               $$1 = 7;
            } else if (this.dS().am() == brh.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((buf)$$0).b(new bsq(bss.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      return $$3;
   }

   @Override
   public eye l(btj $$0) {
      return $$0.dn() <= this.dn() ? new eye(0.0, 0.21875 * (double)this.ef(), 0.0) : super.l($$0);
   }
}
