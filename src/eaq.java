import com.mojang.serialization.Codec;

public class eaq extends dzd<ece> {
   public eaq(Codec<ece> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ece> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         ayg $$3 = $$0.d();
         ece $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         in.a $$8 = new in.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(axz.a($$3, -$$5, $$5), axz.a($$3, -$$6, $$6), axz.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (in)$$8)) {
               int $$10 = axz.a($$3, 1, $$7);
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

   private static boolean a(dae $$0, in.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dae $$0, ayg $$1, in.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.c())) {
               $$0.a($$2, ddg.oB.n().a(dgt.e, Integer.valueOf(axz.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, ddg.oC.n(), 2);
         }

         $$2.c(is.b);
      }
   }

   private static boolean a(dae $$0, in $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dqh $$2 = $$0.a_($$1.d());
         return !$$2.a(ddg.dV) && !$$2.a(ddg.on) && !$$2.a(ddg.op);
      }
   }
}
