import javax.annotation.Nullable;

public class cgk extends chk {
   public cgk(bqb<? extends cgk> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public static bru.a r() {
      return chk.u().a(brv.q, 12.0);
   }

   @Override
   public boolean C(bpv $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bqo) {
            int $$1 = 0;
            if (this.dM().ak() == bnx.c) {
               $$1 = 7;
            } else if (this.dM().ak() == bnx.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bqo)$$0).b(new bph(bpj.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      return $$3;
   }

   @Override
   public esa l(bpv $$0) {
      return $$0.dg() <= this.dg() ? new esa(0.0, 0.21875 * (double)this.eb(), 0.0) : super.l($$0);
   }
}
