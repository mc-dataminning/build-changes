public class fqr implements fqe<dec> {
   private final fgw<?> a;

   public fqr(fqf.a $$0) {
      this.a = new fgw($$0.a(fib.be));
   }

   public void a(dec $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      hc $$6 = hc.b;
      if ($$0.l()) {
         dfj $$7 = $$0.k().a_($$0.p());
         if ($$7.b() instanceof czu) {
            $$6 = $$7.c(czu.a);
         }
      }

      cht $$8 = $$0.j();
      gbi $$9;
      if ($$8 == null) {
         $$9 = fot.i;
      } else {
         $$9 = fot.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fic $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      elt $$13 = $$9.a($$3, fom::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
