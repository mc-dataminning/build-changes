import javax.annotation.Nullable;

public class cuv extends crz {
   protected cuv(dez.d $$0) {
      super($$0);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dea($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.v, $$0.B ? dea::a : dea::b);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      dcm $$4 = $$1.c_($$2);
      if ($$4 instanceof dea) {
         int $$5 = ((dea)$$4).g();

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
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return ciy.b;
   }

   @Override
   public boolean a(dfa $$0, eac $$1) {
      return false;
   }
}
