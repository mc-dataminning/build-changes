public class fqm implements fpz<ddx> {
   private final fgr<?> a;

   public fqm(fqa.a $$0) {
      this.a = new fgr($$0.a(fhw.be));
   }

   public void a(ddx $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      hc $$6 = hc.b;
      if ($$0.l()) {
         dfe $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof czp) {
            $$6 = $$7.c(czp.a);
         }
      }

      cho $$8 = $$0.j();
      gbd $$9;
      if ($$8 == null) {
         $$9 = fon.i;
      } else {
         $$9 = fon.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fhx $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      elo $$13 = $$9.a($$3, foh::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
