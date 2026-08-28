import javax.annotation.Nullable;

public class clh extends cmh {
   public clh(buq<? extends clh> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public static bwm.a m() {
      return cmh.p().a(bwn.s, 12.0);
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bvf) {
            int $$2 = 0;
            if (this.dW().am() == bsf.c) {
               $$2 = 7;
            } else if (this.dW().am() == bsf.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bvf)$$1).b(new bto(btq.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      return $$3;
   }

   @Override
   public fay l(buj $$0) {
      return $$0.dr() <= this.dr() ? new fay(0.0, 0.21875 * (double)this.ek(), 0.0) : super.l($$0);
   }
}
