import javax.annotation.Nullable;

public class clc extends cmc {
   public clc(bul<? extends clc> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public static bwh.a q() {
      return cmc.t().a(bwi.s, 12.0);
   }

   @Override
   public boolean E(bue $$0) {
      if (super.E($$0)) {
         if ($$0 instanceof bva) {
            int $$1 = 0;
            if (this.dX().ak() == bsa.c) {
               $$1 = 7;
            } else if (this.dX().ak() == bsa.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bva)$$0).b(new btj(btl.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      return $$3;
   }

   @Override
   public ezn l(bue $$0) {
      return $$0.ds() <= this.ds() ? new ezn(0.0, 0.21875 * (double)this.el(), 0.0) : super.l($$0);
   }
}
