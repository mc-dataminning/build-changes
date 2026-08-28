public class cwm extends cxc implements cyb {
   public cwm(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dks.i($$3) && !dkt.h($$3) && !dku.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (djq.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, djq.a($$1, $$2));
            $$1.a($$0.o(), eck.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dye.v, Boolean.valueOf(true)));
         $$1.a($$0.o(), eck.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bta.a;
      } else {
         return bta.d;
      }
   }

   private void a(dgz $$0, jh $$1) {
      bac $$2 = $$0.H_();
      $$0.a(null, $$1, awv.jk, aww.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cqh a(dgz $$0, ka $$1, cxg $$2, jm $$3) {
      bac $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbr $$8 = new fbr($$5, $$6, $$7);
      cql $$9 = new cql($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cqh $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(($$0, $$1) -> dmj.a($$0, 1.0, fbr.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
