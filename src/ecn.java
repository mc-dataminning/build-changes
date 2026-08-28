import com.mojang.serialization.Codec;

public class ecn extends eba<eeb> {
   public ecn(Codec<eeb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<eeb> $$0) {
      dcv $$1 = $$0.b();
      iz $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azh $$3 = $$0.d();
         eeb $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         iz.a $$8 = new iz.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(ayz.a($$3, -$$5, $$5), ayz.a($$3, -$$6, $$6), ayz.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (iz)$$8)) {
               int $$10 = ayz.a($$3, 1, $$7);
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

   private static boolean a(dcb $$0, iz.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dcb $$0, azh $$1, iz.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.c())) {
               $$0.a($$2, dfd.oB.o().a(diq.e, Integer.valueOf(ayz.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dfd.oC.o(), 2);
         }

         $$2.c(je.b);
      }
   }

   private static boolean a(dcb $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dse $$2 = $$0.a_($$1.d());
         return !$$2.a(dfd.dV) && !$$2.a(dfd.on) && !$$2.a(dfd.op);
      }
   }
}
