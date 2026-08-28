public class czg extends czu implements das {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public czg(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      if ($$1 instanceof ars $$2) {
         czy $$3 = $$0.n();
         ffq $$4 = $$0.l();
         jb $$5 = $$0.k();
         css.a(new csn($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bur.a;
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      if ($$1.fJ()) {
         czy $$3 = $$1.b($$2);
         if ($$0 instanceof ars $$4) {
            css.a(new csn($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awz.c.b(this));
         }

         return bur.a;
      } else {
         return bur.e;
      }
   }

   @Override
   public css a(djx $$0, jp $$1, czy $$2, jb $$3) {
      return new csn($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public das.a a() {
      return das.a.a().a(czg::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ffq a(le $$0, jb $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
