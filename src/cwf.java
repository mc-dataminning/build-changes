public class cwf extends cvj implements cvk {
   public cwf(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      if (!$$0.B) {
         cnz $$4 = new cnz($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dI(), $$1.dG(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avy.c.b(this));
      $$3.a(1, $$1);
      return bqr.a($$3, $$0.x_());
   }

   @Override
   public cnn a(dcu $$0, jw $$1, cuo $$2, ji $$3) {
      cnz $$4 = new cnz($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvk.a c() {
      return cvk.a.a().a(cvk.a.a.c() * 0.5F).b(cvk.a.a.d() * 1.25F).a();
   }
}
