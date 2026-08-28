import javax.annotation.Nullable;

public class clz extends cmz {
   public clz(bvi<? extends clz> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxe.a m() {
      return cmz.p().a(bxf.s, 12.0);
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bvx) {
            int $$2 = 0;
            if (this.dW().am() == bsx.c) {
               $$2 = 7;
            } else if (this.dW().am() == bsx.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bvx)$$1).b(new bug(bui.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      return $$3;
   }

   @Override
   public fbr l(bvb $$0) {
      return $$0.dr() <= this.dr() ? new fbr(0.0, 0.21875 * (double)this.ek(), 0.0) : super.l($$0);
   }
}
