import com.mojang.serialization.Codec;

public class ekz extends ejm<emn> {
   public ekz(Codec<emn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<emn> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azv $$3 = $$0.d();
         emn $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         iu.a $$8 = new iu.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(azm.a($$3, -$$5, $$5), azm.a($$3, -$$6, $$6), azm.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (iu)$$8)) {
               int $$10 = azm.a($$3, 1, $$7);
               if ($$3.a(6) == 0) {
                  $$10 *= 2;
               }

               if ($$3.a(5) == 0) {
                  $$10 = 1;
               }

               int $$11 = 17;
               int $$12 = 25;
               a($$1, $$3, $$8, $$10, 17, 25);
            }
         }

         return true;
      }
   }

   private static boolean a(djb $$0, iu.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.t($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(djb $$0, azv $$1, iu.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.v($$2)) {
            if ($$6 == $$3 || !$$0.v($$2.d())) {
               $$0.a($$2, dmh.ph.m().b(dpy.e, Integer.valueOf(azm.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dmh.pi.m(), 2);
         }

         $$2.c(ja.b);
      }
   }

   private static boolean a(djb $$0, iu $$1) {
      if (!$$0.v($$1)) {
         return true;
      } else {
         eah $$2 = $$0.a_($$1.e());
         return !$$2.a(dmh.em) && !$$2.a(dmh.oT) && !$$2.a(dmh.oV);
      }
   }
}
