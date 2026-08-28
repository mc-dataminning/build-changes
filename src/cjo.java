import javax.annotation.Nullable;

public class cjo extends cko {
   public cjo(bsx<? extends cjo> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public static buv.a s() {
      return cko.t().a(buw.s, 12.0);
   }

   @Override
   public boolean D(bsr $$0) {
      if (super.D($$0)) {
         if ($$0 instanceof btn) {
            int $$1 = 0;
            if (this.dO().al() == bqo.c) {
               $$1 = 7;
            } else if (this.dO().al() == bqo.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btn)$$0).b(new brz(bsb.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      return $$3;
   }

   @Override
   public exc l(bsr $$0) {
      return $$0.dj() <= this.dj() ? new exc(0.0, 0.21875 * (double)this.eb(), 0.0) : super.l($$0);
   }
}
