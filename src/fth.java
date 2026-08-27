public class fth implements fsu<dgl> {
   private final fji<?> a;

   public fth(fsv.a $$0) {
      this.a = new fji($$0.a(fkn.be));
   }

   public void a(dgl $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      hx $$6 = hx.b;
      if ($$0.l()) {
         dhi $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof dby) {
            $$6 = $$7.c(dby.b);
         }
      }

      cjx $$8 = $$0.j();
      gdy $$9;
      if ($$8 == null) {
         $$9 = frj.i;
      } else {
         $$9 = frj.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fko $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eoa $$13 = $$9.a($$3, frc::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
