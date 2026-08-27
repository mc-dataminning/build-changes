public class fsu implements fsh<dfz> {
   private final fiv<?> a;

   public fsu(fsi.a $$0) {
      this.a = new fiv($$0.a(fka.be));
   }

   public void a(dfz $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      hx $$6 = hx.b;
      if ($$0.l()) {
         dgw $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof dbr) {
            $$6 = $$7.c(dbr.b);
         }
      }

      cjp $$8 = $$0.j();
      gdl $$9;
      if ($$8 == null) {
         $$9 = fqw.i;
      } else {
         $$9 = fqw.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fkb $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eno $$13 = $$9.a($$3, fqp::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
