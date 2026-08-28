import com.mojang.serialization.Codec;

public class ecy extends ebl<eem> {
   public ecy(Codec<eem> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<eem> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         ayo $$3 = $$0.d();
         eem $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         ja.a $$8 = new ja.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(ayg.a($$3, -$$5, $$5), ayg.a($$3, -$$6, $$6), ayg.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (ja)$$8)) {
               int $$10 = ayg.a($$3, 1, $$7);
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

   private static boolean a(dch $$0, ja.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dch $$0, ayo $$1, ja.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.c())) {
               $$0.a($$2, dfk.oB.o().a(dix.e, Integer.valueOf(ayg.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dfk.oC.o(), 2);
         }

         $$2.c(jf.b);
      }
   }

   private static boolean a(dch $$0, ja $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dsl $$2 = $$0.a_($$1.d());
         return !$$2.a(dfk.dV) && !$$2.a(dfk.on) && !$$2.a(dfk.op);
      }
   }
}
