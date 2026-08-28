public class ctr extends cuj implements cvk {
   public ctr(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avo.iG, avp.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cny $$4 = new cny($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dI(), $$1.dG(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avy.c.b(this));
      $$3.a(1, $$1);
      return bqr.a($$3, $$0.x_());
   }

   @Override
   public cnn a(dcu $$0, jw $$1, cuo $$2, ji $$3) {
      cny $$4 = new cny($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvk.a c() {
      return cvk.a.a().a(cvk.a.a.c() * 0.5F).b(cvk.a.a.d() * 1.25F).a();
   }
}
