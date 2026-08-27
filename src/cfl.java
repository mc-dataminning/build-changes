import javax.annotation.Nullable;

public class cfl extends cgl {
   public cfl(bpd<? extends cfl> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public static bqv.a r() {
      return cgl.s().a(bqw.q, 12.0);
   }

   @Override
   public boolean C(box $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bpp) {
            int $$1 = 0;
            if (this.dM().aj() == bna.c) {
               $$1 = 7;
            } else if (this.dM().aj() == bna.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bpp)$$0).b(new bok(bom.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      return $$3;
   }

   @Override
   public ept l(box $$0) {
      return $$0.dg() <= this.dg() ? new ept(0.0, 0.21875 * (double)this.eb(), 0.0) : super.l($$0);
   }
}
