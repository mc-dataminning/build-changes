public class dzx {
   private static final int a = 1600;
   private static final int b = 10000;
   private static final int c = 3;
   private static final int d = 8;

   public static void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.a(axc.cF) && $$1.h($$2.d())) {
         if ($$3.a(1600) == 0 && a($$1, $$2)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.wz, awo.e, 1.0F, 1.0F, false);
         }

         if ($$3.a(10000) == 0 && a($$1.u($$2)) && a($$1, $$2)) {
            $$1.a(awn.wA, awo.e, 1.0F, 1.0F);
         }
      }
   }

   private static boolean a(je<djy> $$0) {
      return $$0.a(dkf.f) || $$0.a(axb.f);
   }

   private static boolean a(div $$0, iu $$1) {
      int $$2 = 0;

      for (ja $$3 : ja.c.a) {
         iu $$4 = $$1.a($$3, 8);
         dzz $$5 = $$0.a_($$4.h($$0.b(efy.a.b, $$4) - 1));
         if ($$5.a(axc.cF)) {
            if (++$$2 >= 3) {
               return true;
            }
         }
      }

      return false;
   }
}
