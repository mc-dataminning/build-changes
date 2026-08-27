import javax.annotation.Nullable;

public class cec extends cfc {
   public cec(bnw<? extends cec> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public static bpo.a u() {
      return cfc.w().a(bpp.n, 12.0);
   }

   @Override
   public boolean B(bnq $$0) {
      if (super.B($$0)) {
         if ($$0 instanceof boi) {
            int $$1 = 0;
            if (this.dM().aj() == blt.c) {
               $$1 = 7;
            } else if (this.dM().aj() == blt.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((boi)$$0).b(new bnd(bnf.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      return $$3;
   }

   @Override
   public enz k(bnq $$0) {
      return $$0.dg() <= this.dg() ? new enz(0.0, 0.21875 * (double)this.ea(), 0.0) : super.k($$0);
   }
}
