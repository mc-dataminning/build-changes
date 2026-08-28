public class cwn extends cxd implements cyb {
   public cwn(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dkt.i($$3) && !dku.h($$3) && !dkv.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (djr.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, djr.a($$1, $$2));
            $$1.a($$0.o(), ecp.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dyg.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), ecp.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bsy.a;
      } else {
         return bsy.d;
      }
   }

   private void a(dgz $$0, ji $$1) {
      azh $$2 = $$0.C_();
      $$0.a(null, $$1, awa.jk, awb.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cqk a(dgz $$0, kb $$1, cxh $$2, jn $$3) {
      azh $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbx $$8 = new fbx($$5, $$6, $$7);
      cqo $$9 = new cqo($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cqk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(($$0, $$1) -> dmk.a($$0, 1.0, fbx.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
