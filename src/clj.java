import javax.annotation.Nullable;

public class clj extends cmj {
   public clj(bus<? extends clj> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public static bwo.a n() {
      return cmj.q().a(bwp.s, 12.0);
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bvh) {
            int $$2 = 0;
            if (this.dV().ak() == bsh.c) {
               $$2 = 7;
            } else if (this.dV().ak() == bsh.d) {
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
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      return $$3;
   }

   @Override
   public ezy l(bul $$0) {
      return $$0.dq() <= this.dq() ? new ezy(0.0, 0.21875 * (double)this.ej(), 0.0) : super.l($$0);
   }
}
