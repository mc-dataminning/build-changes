import com.mojang.serialization.Codec;

public class egc extends eep<ehq> {
   public egc(Codec<ehq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehq> $$0) {
      dgd $$1 = $$0.b();
      jh $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azv $$3 = $$0.d();
         ehq $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         jh.a $$8 = new jh.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(azn.a($$3, -$$5, $$5), azn.a($$3, -$$6, $$6), azn.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (jh)$$8)) {
               int $$10 = azn.a($$3, 1, $$7);
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

   private static boolean a(dfg $$0, jh.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dfg $$0, azv $$1, jh.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dil.oB.m().b(dlx.e, Integer.valueOf(azn.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dil.oC.m(), 2);
         }

         $$2.c(jm.b);
      }
   }

   private static boolean a(dfg $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dvo $$2 = $$0.a_($$1.e());
         return !$$2.a(dil.dV) && !$$2.a(dil.on) && !$$2.a(dil.op);
      }
   }
}
