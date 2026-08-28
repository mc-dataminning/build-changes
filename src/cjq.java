import javax.annotation.Nullable;

public class cjq extends ckq {
   public cjq(btc<? extends cjq> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static buy.a s() {
      return ckq.u().a(buz.q, 12.0);
   }

   @Override
   public boolean C(bsw $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof btr) {
            int $$1 = 0;
            if (this.dP().al() == bqt.c) {
               $$1 = 7;
            } else if (this.dP().al() == bqt.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btr)$$0).b(new bse(bsg.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      return $$3;
   }

   @Override
   public evt l(bsw $$0) {
      return $$0.dj() <= this.dj() ? new evt(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
