public class cwc extends cvf implements cvg {
   public cwc(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      if (!$$0.B) {
         coa $$4 = new coa($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bqu.a($$3, $$0.x_());
   }

   @Override
   public cno a(dbx $$0, js $$1, cuo $$2, je $$3) {
      coa $$4 = new coa($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvg.a c() {
      return cvg.a.a().a(cvg.a.a.c() * 0.5F).b(cvg.a.a.d() * 1.25F).a();
   }
}
