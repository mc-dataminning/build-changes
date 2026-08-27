import javax.annotation.Nullable;

public class crw extends cpa {
   protected crw(dca.d $$0) {
      super($$0);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dbb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$2, czp.v, $$0.B ? dbb::a : dbb::b);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      czn $$4 = $$1.c_($$2);
      if ($$4 instanceof dbb) {
         int $$5 = ((dbb)$$4).g();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(iv.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return cfz.b;
   }

   @Override
   public boolean a(dcb $$0, dxd $$1) {
      return false;
   }
}
