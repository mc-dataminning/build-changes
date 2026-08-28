public class czf extends czu implements das {
   public czf(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dns.i($$3) && !dnt.h($$3) && !dnu.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dmp.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dmp.a($$1, $$2));
            $$1.a($$0.o(), ege.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(ebu.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), ege.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bur.a;
      } else {
         return bur.d;
      }
   }

   private void a(djx $$0, iv $$1) {
      azx $$2 = $$0.G_();
      $$0.a(null, $$1, awp.jn, awq.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public css a(djx $$0, jp $$1, czy $$2, jb $$3) {
      azx $$4 = $$0.G_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ffq $$8 = new ffq($$5, $$6, $$7);
      csw $$9 = new csw($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(css $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public das.a a() {
      return das.a.a().a(($$0, $$1) -> dpi.a($$0, 1.0, ffq.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
