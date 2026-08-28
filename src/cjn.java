import javax.annotation.Nullable;

public class cjn extends ckn {
   public cjn(bsz<? extends cjn> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public static buv.a s() {
      return ckn.u().a(buw.q, 12.0);
   }

   @Override
   public boolean C(bst $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bto) {
            int $$1 = 0;
            if (this.dP().al() == bqq.c) {
               $$1 = 7;
            } else if (this.dP().al() == bqq.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bto)$$0).b(new bsb(bsd.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      return $$3;
   }

   @Override
   public evq l(bst $$0) {
      return $$0.dj() <= this.dj() ? new evq(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
