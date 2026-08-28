public class cwe extends cvh implements cvi {
   public cwe(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      if (!$$0.B) {
         coc $$4 = new coc($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bqw.a($$3, $$0.x_());
   }

   @Override
   public cnq a(dbz $$0, js $$1, cuq $$2, je $$3) {
      coc $$4 = new coc($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvi.a c() {
      return cvi.a.a().a(cvi.a.a.c() * 0.5F).b(cvi.a.a.d() * 1.25F).a();
   }
}
