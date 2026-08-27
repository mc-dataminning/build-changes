import javax.annotation.Nullable;

public class csk extends crg {
   protected csk(dey.d $$0) {
      super($$0);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dck($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$0, $$2, dcn.C);
   }

   @Override
   protected void a(cpl $$0, gu $$1, cbm $$2) {
      dcl $$3 = $$0.c_($$1);
      if ($$3 instanceof dck) {
         $$2.a((bgt)$$3);
         $$2.a(apg.as);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aow.cg, aox.e, 1.0F, 1.0F, false);
         }

         ha $$7 = $$0.c(a);
         ha.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ha.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ha.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(iv.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
