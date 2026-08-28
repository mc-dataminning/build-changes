public class ebo {
   private static final int a = 1600;
   private static final int b = 10000;
   private static final int c = 3;
   private static final int d = 8;

   public static void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.a(axn.cH) && $$1.h($$2.d())) {
         if ($$3.a(1600) == 0 && a($$1, $$2)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awy.wC, awz.i, 1.0F, 1.0F, false);
         }

         if ($$3.a(10000) == 0 && a($$1.u($$2)) && a($$1, $$2)) {
            $$1.a(awy.wD, awz.i, 1.0F, 1.0F);
         }
      }
   }

   private static boolean a(jg<dlm> $$0) {
      return $$0.a(dlt.f) || $$0.a(axm.f);
   }

   private static boolean a(dkj $$0, iw $$1) {
      int $$2 = 0;

      for (jc $$3 : jc.c.a) {
         iw $$4 = $$1.a($$3, 8);
         ebq $$5 = $$0.a_($$4.h($$0.b(ehp.a.b, $$4) - 1));
         if ($$5.a(axn.cH)) {
            if (++$$2 >= 3) {
               return true;
            }
         }
      }

      return false;
   }
}
