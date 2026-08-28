public class cyr extends czg implements dae {
   public cyr(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dnc.i($$3) && !dnd.h($$3) && !dne.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dlz.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dlz.a($$1, $$2));
            $$1.a($$0.o(), efo.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(ebe.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), efo.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bug.a;
      } else {
         return bug.d;
      }
   }

   private void a(djh $$0, iv $$1) {
      azv $$2 = $$0.C_();
      $$0.a(null, $$1, awn.jn, awo.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cse a(djh $$0, jp $$1, czk $$2, jb $$3) {
      azv $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fex $$8 = new fex($$5, $$6, $$7);
      csi $$9 = new csi($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cse $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public dae.a a() {
      return dae.a.a().a(($$0, $$1) -> dos.a($$0, 1.0, fex.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
