import javax.annotation.Nullable;

public class csw extends crs {
   protected csw(dfk.d $$0) {
      super($$0);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dcw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$0, $$2, dcz.C);
   }

   @Override
   protected void a(cpx $$0, gw $$1, cbw $$2) {
      dcx $$3 = $$0.c_($$1);
      if ($$3 instanceof dcw) {
         $$2.a((bhd)$$3);
         $$2.a(app.as);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, apf.cg, apg.e, 1.0F, 1.0F, false);
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
