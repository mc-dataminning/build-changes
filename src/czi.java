public class czi extends czw implements dau {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public czi(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      if ($$1 instanceof aru $$2) {
         daa $$3 = $$0.n();
         ffs $$4 = $$0.l();
         jc $$5 = $$0.k();
         csu.a(new csp($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return but.a;
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      if ($$1.fJ()) {
         daa $$3 = $$1.b($$2);
         if ($$0 instanceof aru $$4) {
            csu.a(new csp($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(axb.c.b(this));
         }

         return but.a;
      } else {
         return but.e;
      }
   }

   @Override
   public csu a(djz $$0, jq $$1, daa $$2, jc $$3) {
      return new csp($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public dau.a a() {
      return dau.a.a().a(czi::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ffs a(lf $$0, jc $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
