import javax.annotation.Nullable;

public class cjo extends cko {
   public cjo(bta<? extends cjo> $$0, dby $$1) {
      super($$0, $$1);
   }

   public static buw.a s() {
      return cko.u().a(bux.q, 12.0);
   }

   @Override
   public boolean C(bsu $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof btp) {
            int $$1 = 0;
            if (this.dP().al() == bqr.c) {
               $$1 = 7;
            } else if (this.dP().al() == bqr.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btp)$$0).b(new bsc(bse.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      return $$3;
   }

   @Override
   public evr l(bsu $$0) {
      return $$0.dj() <= this.dj() ? new evr(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
