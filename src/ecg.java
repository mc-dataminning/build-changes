import com.mojang.serialization.Codec;

public class ecg extends eat<edu> {
   public ecg(Codec<edu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<edu> $$0) {
      dco $$1 = $$0.b();
      iz $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azc $$3 = $$0.d();
         edu $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         iz.a $$8 = new iz.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(ayu.a($$3, -$$5, $$5), ayu.a($$3, -$$6, $$6), ayu.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (iz)$$8)) {
               int $$10 = ayu.a($$3, 1, $$7);
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

   private static boolean a(dbu $$0, iz.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dbu $$0, azc $$1, iz.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.c())) {
               $$0.a($$2, dew.oB.n().a(dij.e, Integer.valueOf(ayu.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dew.oC.n(), 2);
         }

         $$2.c(je.b);
      }
   }

   private static boolean a(dbu $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         drx $$2 = $$0.a_($$1.d());
         return !$$2.a(dew.dV) && !$$2.a(dew.on) && !$$2.a(dew.op);
      }
   }
}
