import javax.annotation.Nullable;

public class cmd extends cnd {
   public cmd(bvm<? extends cmd> $$0, dha $$1) {
      super($$0, $$1);
   }

   public static bxi.a m() {
      return cnd.p().a(bxj.s, 12.0);
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bwb) {
            int $$2 = 0;
            if (this.dV().al() == btb.c) {
               $$2 = 7;
            } else if (this.dV().al() == btb.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bwb)$$1).b(new buk(bum.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      return $$3;
   }

   @Override
   public fbs l(bvf $$0) {
      return $$0.dq() <= this.dq() ? new fbs(0.0, 0.21875 * (double)this.ej(), 0.0) : super.l($$0);
   }
}
