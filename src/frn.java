public class frn implements fra<dfe> {
   private final fhq<?> a;

   public frn(frb.a $$0) {
      this.a = new fhq($$0.a(fiv.be));
   }

   public void a(dfe $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      hx $$6 = hx.b;
      if ($$0.l()) {
         dgb $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof dax) {
            $$6 = $$7.c(dax.b);
         }
      }

      cix $$8 = $$0.j();
      gce $$9;
      if ($$8 == null) {
         $$9 = fpp.i;
      } else {
         $$9 = fpp.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fiw $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eml $$13 = $$9.a($$3, fpj::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
