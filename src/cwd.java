public class cwd extends cvg implements cvh {
   public cwd(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      if (!$$0.B) {
         cob $$4 = new cob($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bqv.a($$3, $$0.x_());
   }

   @Override
   public cnp a(dby $$0, js $$1, cup $$2, je $$3) {
      cob $$4 = new cob($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvh.a c() {
      return cvh.a.a().a(cvh.a.a.c() * 0.5F).b(cvh.a.a.d() * 1.25F).a();
   }
}
