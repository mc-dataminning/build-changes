import javax.annotation.Nullable;

public class cov extends cpv {
   public cov(bxn<? extends cov> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static bzk.a m() {
      return cpv.p().a(bzl.s, 12.0);
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof byf) {
            int $$2 = 0;
            if (this.dV().an() == buz.c) {
               $$2 = 7;
            } else if (this.dV().an() == buz.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((byf)$$1).b(new bwi(bwk.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      return $$3;
   }

   @Override
   public fgc l(bxe $$0) {
      return $$0.dq() <= this.dq() ? new fgc(0.0, 0.21875 * (double)this.el(), 0.0) : super.l($$0);
   }
}
