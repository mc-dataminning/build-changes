import javax.annotation.Nullable;

public class cvt extends crl {
   protected cvt(dfd.d $$0) {
      super($$0);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$0, $$2, dcs.a);
   }

   @Override
   protected void a(cpq $$0, gw $$1, cbp $$2) {
      dcq $$3 = $$0.c_($$1);
      if ($$3 instanceof ddl) {
         $$2.a((bgw)$$3);
         $$2.a(apj.am);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aoz.iR, apa.e, 1.0F, 1.0F, false);
         }

         hc $$7 = $$0.c(a);
         hc.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == hc.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == hc.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ix.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ix.C, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
