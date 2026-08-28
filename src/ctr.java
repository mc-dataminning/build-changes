public class ctr extends cuj implements cvg {
   public ctr(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.iG, awa.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cnz $$4 = new cnz($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bqu.a($$3, $$0.x_());
   }

   @Override
   public cno a(dbx $$0, js $$1, cuo $$2, je $$3) {
      cnz $$4 = new cnz($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvg.a c() {
      return cvg.a.a().a(cvg.a.a.c() * 0.5F).b(cvg.a.a.d() * 1.25F).a();
   }
}
