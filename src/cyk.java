public class cyk extends cyz implements czx {
   public cyk(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dmv.i($$3) && !dmw.h($$3) && !dmx.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dls.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dls.a($$1, $$2));
            $$1.a($$0.o(), efh.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(eax.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), efh.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bud.a;
      } else {
         return bud.d;
      }
   }

   private void a(dja $$0, iu $$1) {
      azv $$2 = $$0.C_();
      $$0.a(null, $$1, awn.jn, awo.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public crx a(dja $$0, jo $$1, czd $$2, ja $$3) {
      azv $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      feq $$8 = new feq($$5, $$6, $$7);
      csb $$9 = new csb($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(crx $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public czx.a a() {
      return czx.a.a().a(($$0, $$1) -> dol.a($$0, 1.0, feq.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
