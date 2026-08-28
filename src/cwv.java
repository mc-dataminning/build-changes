public class cwv extends cxl implements cyk {
   public cwv(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dlb.i($$3) && !dlc.h($$3) && !dld.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (djz.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, djz.a($$1, $$2));
            $$1.a($$0.o(), ecr.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dyl.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), ecr.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return btj.a;
      } else {
         return btj.d;
      }
   }

   private void a(dhi $$0, jh $$1) {
      bam $$2 = $$0.H_();
      $$0.a(null, $$1, axf.je, axg.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cqq a(dhi $$0, ka $$1, cxp $$2, jm $$3) {
      bam $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fby $$8 = new fby($$5, $$6, $$7);
      cqu $$9 = new cqu($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cqq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyk.a b() {
      return cyk.a.a().a(($$0, $$1) -> dmt.a($$0, 1.0, fby.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
