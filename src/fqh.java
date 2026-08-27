public class fqh implements fpu<dds> {
   private final fgm<?> a;

   public fqh(fpv.a $$0) {
      this.a = new fgm($$0.a(fhr.be));
   }

   public void a(dds $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      ha $$6 = ha.b;
      if ($$0.l()) {
         dez $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof czk) {
            $$6 = $$7.c(czk.a);
         }
      }

      chl $$8 = $$0.j();
      gay $$9;
      if ($$8 == null) {
         $$9 = foi.i;
      } else {
         $$9 = foi.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fhs $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      elj $$13 = $$9.a($$3, foc::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
