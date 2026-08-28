public class ctg extends cty implements cuv {
   public ctg(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), avh.iG, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cno $$4 = new cno($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dJ(), $$1.dH(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avr.c.b(this));
      $$3.a(1, $$1);
      return bqi.a($$3, $$0.x_());
   }

   @Override
   public cnd a(dcg $$0, jt $$1, cud $$2, jf $$3) {
      cno $$4 = new cno($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cuv.a c() {
      return cuv.a.a().a(cuv.a.a.c() * 0.5F).b(cuv.a.a.d() * 1.25F).a();
   }
}
