import javax.annotation.Nullable;

public class cne extends coe {
   public cne(bwj<? extends cne> $$0, dip $$1) {
      super($$0, $$1);
   }

   public static bye.a j() {
      return coe.m().a(byf.s, 12.0);
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bwz) {
            int $$2 = 0;
            if (this.dV().an() == btv.c) {
               $$2 = 7;
            } else if (this.dV().an() == btv.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bwz)$$1).b(new bve(bvg.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      return $$3;
   }

   @Override
   public fdw l(bwa $$0) {
      return $$0.dq() <= this.dq() ? new fdw(0.0, 0.21875 * (double)this.ek(), 0.0) : super.l($$0);
   }
}
