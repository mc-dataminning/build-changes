public class cvu extends cwk implements cxj {
   public cvu(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dka.i($$3) && !dkb.h($$3) && !dkc.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (diy.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, diy.a($$1, $$2));
            $$1.a($$0.o(), ebs.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dxm.v, Boolean.valueOf(true)));
         $$1.a($$0.o(), ebs.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bsj.a;
      } else {
         return bsj.d;
      }
   }

   private void a(dgh $$0, ji $$1) {
      azh $$2 = $$0.H_();
      $$0.a(null, $$1, awa.jk, awb.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cpp a(dgh $$0, kb $$1, cwo $$2, jn $$3) {
      azh $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      faz $$8 = new faz($$5, $$6, $$7);
      cpt $$9 = new cpt($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cpp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxj.a b() {
      return cxj.a.a().a(($$0, $$1) -> dlr.a($$0, 1.0, faz.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
