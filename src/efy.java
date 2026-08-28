import com.mojang.serialization.Codec;

public class efy extends eel<ehm> {
   public efy(Codec<ehm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<ehm> $$0) {
      dfy $$1 = $$0.b();
      jh $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azs $$3 = $$0.d();
         ehm $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         jh.a $$8 = new jh.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(azk.a($$3, -$$5, $$5), azk.a($$3, -$$6, $$6), azk.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (jh)$$8)) {
               int $$10 = azk.a($$3, 1, $$7);
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

   private static boolean a(dfc $$0, jh.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dfc $$0, azs $$1, jh.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dig.oB.m().b(dls.e, Integer.valueOf(azk.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dig.oC.m(), 2);
         }

         $$2.c(jm.b);
      }
   }

   private static boolean a(dfc $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dvj $$2 = $$0.a_($$1.e());
         return !$$2.a(dig.dV) && !$$2.a(dig.on) && !$$2.a(dig.op);
      }
   }
}
