public class cyl extends cyz implements czx {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cyl(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      if ($$1 instanceof arq $$2) {
         czd $$3 = $$0.n();
         feq $$4 = $$0.l();
         ja $$5 = $$0.k();
         crx.a(new crs($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bud.a;
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      if ($$1.fJ()) {
         czd $$3 = $$1.b($$2);
         if ($$0 instanceof arq $$4) {
            crx.a(new crs($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bud.a;
      } else {
         return bud.e;
      }
   }

   @Override
   public crx a(dja $$0, jo $$1, czd $$2, ja $$3) {
      return new crs($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public czx.a a() {
      return czx.a.a().a(cyl::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static feq a(ld $$0, ja $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
