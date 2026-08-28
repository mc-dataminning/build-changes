import javax.annotation.Nullable;

public class cmi extends cni {
   public cmi(bvr<? extends cmi> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public static bxn.a m() {
      return cni.p().a(bxo.s, 12.0);
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bwg) {
            int $$2 = 0;
            if (this.dW().al() == btg.c) {
               $$2 = 7;
            } else if (this.dW().al() == btg.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bwg)$$1).b(new bup(bur.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      return $$3;
   }

   @Override
   public fby l(bvk $$0) {
      return $$0.dr() <= this.dr() ? new fby(0.0, 0.21875 * (double)this.ek(), 0.0) : super.l($$0);
   }
}
