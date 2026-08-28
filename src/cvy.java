public class cvy extends cvb implements cvc {
   public cvy(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      if (!$$0.B) {
         cnw $$4 = new cnw($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awg.c.b(this));
      $$3.a(1, $$1);
      return bqq.a($$3, $$0.x_());
   }

   @Override
   public cnk a(dbt $$0, js $$1, cuk $$2, je $$3) {
      cnw $$4 = new cnw($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvc.a c() {
      return cvc.a.a().a(cvc.a.a.c() * 0.5F).b(cvc.a.a.d() * 1.25F).a();
   }
}
