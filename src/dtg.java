import com.mojang.serialization.Codec;

public class dtg extends drt<duu> {
   public dtg(Codec<duu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<duu> $$0) {
      cuj $$1 = $$0.b();
      hx $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         auu $$3 = $$0.d();
         duu $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         hx.a $$8 = new hx.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(aun.a($$3, -$$5, $$5), aun.a($$3, -$$6, $$6), aun.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (hx)$$8)) {
               int $$10 = aun.a($$3, 1, $$7);
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

   private static boolean a(ctp $$0, hx.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(ctp $$0, auu $$1, hx.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.c())) {
               $$0.a($$2, cwr.oB.o().a(dae.e, Integer.valueOf(aun.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cwr.oC.o(), 2);
         }

         $$2.c(ic.b);
      }
   }

   private static boolean a(ctp $$0, hx $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         djg $$2 = $$0.a_($$1.d());
         return !$$2.a(cwr.dV) && !$$2.a(cwr.on) && !$$2.a(cwr.op);
      }
   }
}
