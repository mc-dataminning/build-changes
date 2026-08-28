import javax.annotation.Nullable;

public class clj extends cmj {
   public clj(bus<? extends clj> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static bwo.a m() {
      return cmj.p().a(bwp.s, 12.0);
   }

   @Override
   public boolean c(ard $$0, bul $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bvh) {
            int $$2 = 0;
            if (this.dV().am() == bsh.c) {
               $$2 = 7;
            } else if (this.dV().am() == bsh.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bvh)$$1).b(new btq(bts.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      return $$3;
   }

   @Override
   public fba l(bul $$0) {
      return $$0.dq() <= this.dq() ? new fba(0.0, 0.21875 * (double)this.ej(), 0.0) : super.l($$0);
   }
}
