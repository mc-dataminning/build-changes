public class ear {
   private static final int a = 1600;
   private static final int b = 10000;
   private static final int c = 3;
   private static final int d = 8;

   public static void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.a(axc.cH) && $$1.h($$2.d())) {
         if ($$3.a(1600) == 0 && a($$1, $$2)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.wC, awo.i, 1.0F, 1.0F, false);
         }

         if ($$3.a(10000) == 0 && a($$1.u($$2)) && a($$1, $$2)) {
            $$1.a(awn.wD, awo.i, 1.0F, 1.0F);
         }
      }
   }

   private static boolean a(jf<dkp> $$0) {
      return $$0.a(dkw.f) || $$0.a(axb.f);
   }

   private static boolean a(djm $$0, iv $$1) {
      int $$2 = 0;

      for (jb $$3 : jb.c.a) {
         iv $$4 = $$1.a($$3, 8);
         eat $$5 = $$0.a_($$4.h($$0.b(egs.a.b, $$4) - 1));
         if ($$5.a(axc.cH)) {
            if (++$$2 >= 3) {
               return true;
            }
         }
      }

      return false;
   }
}
