public class ebe {
   private static final int a = 1600;
   private static final int b = 10000;
   private static final int c = 3;
   private static final int d = 8;

   public static void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.a(axg.cH) && $$1.h($$2.d())) {
         if ($$3.a(1600) == 0 && a($$1, $$2)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awr.wC, aws.i, 1.0F, 1.0F, false);
         }

         if ($$3.a(10000) == 0 && a($$1.u($$2)) && a($$1, $$2)) {
            $$1.a(awr.wD, aws.i, 1.0F, 1.0F);
         }
      }
   }

   private static boolean a(jg<dlc> $$0) {
      return $$0.a(dlj.f) || $$0.a(axf.f);
   }

   private static boolean a(djz $$0, iw $$1) {
      int $$2 = 0;

      for (jc $$3 : jc.c.a) {
         iw $$4 = $$1.a($$3, 8);
         ebg $$5 = $$0.a_($$4.h($$0.b(ehf.a.b, $$4) - 1));
         if ($$5.a(axg.cH)) {
            if (++$$2 >= 3) {
               return true;
            }
         }
      }

      return false;
   }
}
