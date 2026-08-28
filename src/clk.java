import javax.annotation.Nullable;

public class clk extends cmk {
   public clk(but<? extends clk> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public static bwp.a m() {
      return cmk.p().a(bwq.s, 12.0);
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bvi) {
            int $$2 = 0;
            if (this.dV().am() == bsi.c) {
               $$2 = 7;
            } else if (this.dV().am() == bsi.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bvi)$$1).b(new btr(btt.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      return $$3;
   }

   @Override
   public fbb l(bum $$0) {
      return $$0.dq() <= this.dq() ? new fbb(0.0, 0.21875 * (double)this.ej(), 0.0) : super.l($$0);
   }
}
