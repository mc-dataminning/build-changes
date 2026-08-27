import javax.annotation.Nullable;

public class cuu extends cry {
   protected cuu(dey.d $$0) {
      super($$0);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.v, $$0.B ? ddz::a : ddz::b);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      dcl $$4 = $$1.c_($$2);
      if ($$4 instanceof ddz) {
         int $$5 = ((ddz)$$4).g();

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
   public cix a(cor $$0, gu $$1, dez $$2) {
      return cix.b;
   }

   @Override
   public boolean a(dez $$0, eab $$1) {
      return false;
   }
}
