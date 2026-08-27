import javax.annotation.Nullable;

public class cgr extends chr {
   public cgr(bqg<? extends cgr> $$0, czg $$1) {
      super($$0, $$1);
   }

   public static brz.a r() {
      return chr.u().a(bsa.q, 12.0);
   }

   @Override
   public boolean C(bqa $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bqt) {
            int $$1 = 0;
            if (this.dM().ak() == boc.c) {
               $$1 = 7;
            } else if (this.dM().ak() == boc.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bqt)$$0).b(new bpm(bpo.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      return $$3;
   }

   @Override
   public esj l(bqa $$0) {
      return $$0.dg() <= this.dg() ? new esj(0.0, 0.21875 * (double)this.eb(), 0.0) : super.l($$0);
   }
}
