import javax.annotation.Nullable;

public class cjc extends ckc {
   public cjc(bsn<? extends cjc> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public static buj.a s() {
      return ckc.t().a(buk.s, 12.0);
   }

   @Override
   public boolean D(bsh $$0) {
      if (super.D($$0)) {
         if ($$0 instanceof btc) {
            int $$1 = 0;
            if (this.dR().al() == bqe.c) {
               $$1 = 7;
            } else if (this.dR().al() == bqe.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btc)$$0).b(new brp(brr.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      return $$3;
   }

   @Override
   public ewh l(bsh $$0) {
      return $$0.dl() <= this.dl() ? new ewh(0.0, 0.21875 * (double)this.ed(), 0.0) : super.l($$0);
   }
}
