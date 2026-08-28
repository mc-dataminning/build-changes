public class cxh extends cwm implements cwn {
   public cxh(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      if ($$0 instanceof arj $$4) {
         cor.a(cpd::new, $$4, $$3, $$1, -20.0F, 0.5F, 1.0F);
      }

      $$1.b(awq.c.b(this));
      $$3.a(1, $$1);
      return brs.a;
   }

   @Override
   public cor a(dej $$0, jy $$1, cvs $$2, jk $$3) {
      return new cpd($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cwn.a c() {
      return cwn.a.a().a(cwn.a.a.c() * 0.5F).b(cwn.a.a.d() * 1.25F).a();
   }
}
