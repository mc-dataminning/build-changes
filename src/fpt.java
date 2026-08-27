public class fpt implements fpg<ddr> {
   private final fgd<?> a;

   public fpt(fph.a $$0) {
      this.a = new fgd($$0.a(fhi.be));
   }

   public void a(ddr $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      hb $$6 = hb.b;
      if ($$0.l()) {
         dey $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof czj) {
            $$6 = $$7.c(czj.a);
         }
      }

      chk $$8 = $$0.j();
      gak $$9;
      if ($$8 == null) {
         $$9 = fnu.i;
      } else {
         $$9 = fnu.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fhj $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      ell $$13 = $$9.a($$3, fno::d);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
