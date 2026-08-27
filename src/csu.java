import javax.annotation.Nullable;

public class csu extends crq {
   protected csu(dfi.d $$0) {
      super($$0);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dcu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$0, $$2, dcx.C);
   }

   @Override
   protected void a(cpv $$0, gw $$1, cbu $$2) {
      dcv $$3 = $$0.c_($$1);
      if ($$3 instanceof dcu) {
         $$2.a((bhb)$$3);
         $$2.a(apo.as);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, ape.cg, apf.e, 1.0F, 1.0F, false);
         }

         hc $$7 = $$0.c(a);
         hc.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == hc.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == hc.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ix.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
