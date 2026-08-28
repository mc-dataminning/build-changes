public class ctq extends cui implements cvf {
   public ctq(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.iG, awa.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cny $$4 = new cny($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bqt.a($$3, $$0.x_());
   }

   @Override
   public cnn a(dbw $$0, js $$1, cun $$2, je $$3) {
      cny $$4 = new cny($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvf.a c() {
      return cvf.a.a().a(cvf.a.a.c() * 0.5F).b(cvf.a.a.d() * 1.25F).a();
   }
}
