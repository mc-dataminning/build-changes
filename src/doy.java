import com.mojang.serialization.Codec;

public class doy extends dnl<dqm> {
   public doy(Codec<dqm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dqm> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         art $$3 = $$0.d();
         dqm $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         gv.a $$8 = new gv.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(aro.a($$3, -$$5, $$5), aro.a($$3, -$$6, $$6), aro.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (gv)$$8)) {
               int $$10 = aro.a($$3, 1, $$7);
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

   private static boolean a(cpl $$0, gv.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.r($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(cpl $$0, art $$1, gv.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.c())) {
               $$0.a($$2, csl.oB.n().a(cvx.d, Integer.valueOf(aro.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, csl.oC.n(), 2);
         }

         $$2.c(hb.b);
      }
   }

   private static boolean a(cpl $$0, gv $$1) {
      if (!$$0.t($$1)) {
         return true;
      } else {
         dey $$2 = $$0.a_($$1.d());
         return !$$2.a(csl.dW) && !$$2.a(csl.on) && !$$2.a(csl.op);
      }
   }
}
