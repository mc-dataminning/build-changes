import javax.annotation.Nullable;

public class cjm extends ckm {
   public cjm(bsw<? extends cjm> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public static but.a s() {
      return ckm.t().a(buu.s, 12.0);
   }

   @Override
   public boolean D(bsq $$0) {
      if (super.D($$0)) {
         if ($$0 instanceof btl) {
            int $$1 = 0;
            if (this.dQ().al() == bqn.c) {
               $$1 = 7;
            } else if (this.dQ().al() == bqn.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btl)$$0).b(new bry(bsa.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      return $$3;
   }

   @Override
   public eww l(bsq $$0) {
      return $$0.dk() <= this.dk() ? new eww(0.0, 0.21875 * (double)this.ec(), 0.0) : super.l($$0);
   }
}
