public class fmh implements flu<dau> {
   private final fcy<?> a;

   public fmh(flv.a $$0) {
      this.a = new fcy($$0.a(fed.be));
   }

   public void a(dau $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      ha $$6 = ha.b;
      if ($$0.l()) {
         dcb $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof cwm) {
            $$6 = $$7.c(cwm.a);
         }
      }

      cen $$8 = $$0.j();
      fwu $$9;
      if ($$8 == null) {
         $$9 = fkj.i;
      } else {
         $$9 = fkj.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fee $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      ein $$13 = $$9.a($$3, fkf::d);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
