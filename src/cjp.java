import javax.annotation.Nullable;

public class cjp extends ckp {
   public cjp(btb<? extends cjp> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public static bux.a s() {
      return ckp.u().a(buy.q, 12.0);
   }

   @Override
   public boolean C(bsv $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof btq) {
            int $$1 = 0;
            if (this.dP().al() == bqs.c) {
               $$1 = 7;
            } else if (this.dP().al() == bqs.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btq)$$0).b(new bsd(bsf.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      return $$3;
   }

   @Override
   public evs l(bsv $$0) {
      return $$0.dj() <= this.dj() ? new evs(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
