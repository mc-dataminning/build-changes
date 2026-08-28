import javax.annotation.Nullable;

public class ckx extends clx {
   public ckx(bug<? extends ckx> $$0, dev $$1) {
      super($$0, $$1);
   }

   public static bwc.a q() {
      return clx.t().a(bwd.s, 12.0);
   }

   @Override
   public boolean E(btz $$0) {
      if (super.E($$0)) {
         if ($$0 instanceof buv) {
            int $$1 = 0;
            if (this.dX().am() == brv.c) {
               $$1 = 7;
            } else if (this.dX().am() == brv.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((buv)$$0).b(new bte(btg.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      return $$3;
   }

   @Override
   public ezh l(btz $$0) {
      return $$0.ds() <= this.ds() ? new ezh(0.0, 0.21875 * (double)this.el(), 0.0) : super.l($$0);
   }
}
