import javax.annotation.Nullable;

public class cnk extends cok {
   public cnk(bwm<? extends cnk> $$0, div $$1) {
      super($$0, $$1);
   }

   public static byh.a j() {
      return cok.m().a(byi.s, 12.0);
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bxc) {
            int $$2 = 0;
            if (this.dV().an() == bty.c) {
               $$2 = 7;
            } else if (this.dV().an() == bty.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bxc)$$1).b(new bvh(bvj.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      return $$3;
   }

   @Override
   public fei l(bwd $$0) {
      return $$0.dq() <= this.dq() ? new fei(0.0, 0.21875 * (double)this.ek(), 0.0) : super.l($$0);
   }
}
