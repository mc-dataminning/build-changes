public class czr extends dag implements dbe {
   public czr(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!doe.i($$3) && !dof.h($$3) && !dog.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dnb.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dnb.a($$1, $$2));
            $$1.a($$0.o(), egq.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(ecg.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), egq.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bvc.a;
      } else {
         return bvc.d;
      }
   }

   private void a(dkj $$0, iw $$1) {
      bai $$2 = $$0.G_();
      $$0.a(null, $$1, awy.jn, awz.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public ctd a(dkj $$0, jq $$1, dak $$2, jc $$3) {
      bai $$4 = $$0.G_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fgc $$8 = new fgc($$5, $$6, $$7);
      cth $$9 = new cth($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(ctd $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public dbe.a a() {
      return dbe.a.a().a(($$0, $$1) -> dpu.a($$0, 1.0, fgc.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
