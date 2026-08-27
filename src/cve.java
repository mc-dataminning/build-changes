import javax.annotation.Nullable;

public class cve extends csi {
   protected cve(dfi.d $$0) {
      super($$0);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dej($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.v, $$0.B ? dej::a : dej::b);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      dcv $$4 = $$1.c_($$2);
      if ($$4 instanceof dej) {
         int $$5 = ((dej)$$4).g();

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

            $$1.a(ix.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return cjf.b;
   }

   @Override
   public boolean a(dfj $$0, eal $$1) {
      return false;
   }
}
