public class cwu extends cxk implements cyj {
   public cwu(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dla.i($$3) && !dlb.h($$3) && !dlc.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (djy.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, djy.a($$1, $$2));
            $$1.a($$0.o(), ecq.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dyk.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), ecq.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bti.a;
      } else {
         return bti.d;
      }
   }

   private void a(dhh $$0, jh $$1) {
      bam $$2 = $$0.H_();
      $$0.a(null, $$1, axf.je, axg.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cqp a(dhh $$0, ka $$1, cxo $$2, jm $$3) {
      bam $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbx $$8 = new fbx($$5, $$6, $$7);
      cqt $$9 = new cqt($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cqp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyj.a b() {
      return cyj.a.a().a(($$0, $$1) -> dms.a($$0, 1.0, fbx.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
