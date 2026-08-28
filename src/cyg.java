public class cyg extends cyu implements czs {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cyg(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      if ($$1 instanceof arq $$2) {
         cyy $$3 = $$0.n();
         fei $$4 = $$0.l();
         ja $$5 = $$0.k();
         crs.a(new crn($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bub.a;
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      if ($$1.fI()) {
         cyy $$3 = $$1.b($$2);
         if ($$0 instanceof arq $$4) {
            crs.a(new crn($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bub.a;
      } else {
         return bub.e;
      }
   }

   @Override
   public crs a(div $$0, jo $$1, cyy $$2, ja $$3) {
      return new crn($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public czs.a a() {
      return czs.a.a().a(cyg::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fei a(ld $$0, ja $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
