import javax.annotation.Nullable;

public class clg extends cmg {
   public clg(bup<? extends clg> $$0, dff $$1) {
      super($$0, $$1);
   }

   public static bwl.a q() {
      return cmg.t().a(bwm.s, 12.0);
   }

   @Override
   public boolean E(bui $$0) {
      if (super.E($$0)) {
         if ($$0 instanceof bve) {
            int $$1 = 0;
            if (this.dY().ak() == bse.c) {
               $$1 = 7;
            } else if (this.dY().ak() == bse.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bve)$$0).b(new btn(btp.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      return $$3;
   }

   @Override
   public ezr l(bui $$0) {
      return $$0.dt() <= this.dt() ? new ezr(0.0, 0.21875 * (double)this.em(), 0.0) : super.l($$0);
   }
}
