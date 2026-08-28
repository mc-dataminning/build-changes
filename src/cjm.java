import javax.annotation.Nullable;

public class cjm extends ckm {
   public cjm(bsy<? extends cjm> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public static buu.a s() {
      return ckm.u().a(buv.q, 12.0);
   }

   @Override
   public boolean C(bss $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof btn) {
            int $$1 = 0;
            if (this.dP().al() == bqp.c) {
               $$1 = 7;
            } else if (this.dP().al() == bqp.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btn)$$0).b(new bsa(bsc.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      return $$3;
   }

   @Override
   public evp l(bss $$0) {
      return $$0.dj() <= this.dj() ? new evp(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
