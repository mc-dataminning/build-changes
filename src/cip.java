import javax.annotation.Nullable;

public class cip extends cjp {
   public cip(bsc<? extends cip> $$0, daz $$1) {
      super($$0, $$1);
   }

   public static btx.a s() {
      return cjp.u().a(bty.q, 12.0);
   }

   @Override
   public boolean C(brw $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bsq) {
            int $$1 = 0;
            if (this.dP().ak() == bpt.c) {
               $$1 = 7;
            } else if (this.dP().ak() == bpt.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bsq)$$0).b(new bre(brg.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      return $$3;
   }

   @Override
   public eum l(brw $$0) {
      return $$0.dj() <= this.dj() ? new eum(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
