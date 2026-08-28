import javax.annotation.Nullable;

public class cjj extends ckj {
   public cjj(bsv<? extends cjj> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public static bur.a s() {
      return ckj.u().a(bus.q, 12.0);
   }

   @Override
   public boolean C(bsp $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof btk) {
            int $$1 = 0;
            if (this.dP().al() == bqm.c) {
               $$1 = 7;
            } else if (this.dP().al() == bqm.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btk)$$0).b(new brx(brz.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      return $$3;
   }

   @Override
   public evm l(bsp $$0) {
      return $$0.dj() <= this.dj() ? new evm(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
