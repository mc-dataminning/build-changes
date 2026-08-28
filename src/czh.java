public class czh extends czw implements dau {
   public czh(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dnu.i($$3) && !dnv.h($$3) && !dnw.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dmr.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dmr.a($$1, $$2));
            $$1.a($$0.o(), egg.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(ebw.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), egg.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return but.a;
      } else {
         return but.d;
      }
   }

   private void a(djz $$0, iw $$1) {
      azz $$2 = $$0.G_();
      $$0.a(null, $$1, awr.jn, aws.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public csu a(djz $$0, jq $$1, daa $$2, jc $$3) {
      azz $$4 = $$0.G_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ffs $$8 = new ffs($$5, $$6, $$7);
      csy $$9 = new csy($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(csu $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public dau.a a() {
      return dau.a.a().a(($$0, $$1) -> dpk.a($$0, 1.0, ffs.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
