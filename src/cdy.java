import javax.annotation.Nullable;

public class cdy extends cey {
   public cdy(bnu<? extends cdy> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public static bpk.a u() {
      return cey.w().a(bpl.n, 12.0);
   }

   @Override
   public boolean B(bno $$0) {
      if (super.B($$0)) {
         if ($$0 instanceof bog) {
            int $$1 = 0;
            if (this.dM().ak() == blr.c) {
               $$1 = 7;
            } else if (this.dM().ak() == blr.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bog)$$0).b(new bnb(bnd.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      return $$3;
   }

   @Override
   public ens k(bno $$0) {
      return $$0.dg() <= this.dg() ? new ens(0.0, 0.21875 * (double)this.ea(), 0.0) : super.k($$0);
   }
}
