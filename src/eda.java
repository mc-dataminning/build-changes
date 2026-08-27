import com.mojang.serialization.Codec;

public class eda extends eca<efh> {
   public eda(Codec<efh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<efh> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         ayt $$3 = $$0.d();
         efh $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         ir.a $$8 = new ir.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(aym.a($$3, -$$5, $$5), aym.a($$3, -$$6, $$6), aym.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (ir)$$8)) {
               int $$10 = aym.a($$3, 1, $$7);
               if ($$3.a(6) == 0) {
                  $$10 *= 2;
               }

               if ($$3.a(5) == 0) {
                  $$10 = 1;
               }

               a($$1, $$3, $$8, $$10);
            }
         }

         return true;
      }
   }

   private static boolean a(dcb $$0, ir.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dcb $$0, ayt $$1, ir.a $$2, int $$3) {
      $$0.a($$2, dfe.tF.n(), 3);
      ebw.a(dfe.tF, $$0, $$2, iw.b, $$3, false);
   }

   private static boolean a(dcb $$0, ir $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dtc $$2 = $$0.a_($$1.d());
         return !$$2.a(dfe.l);
      }
   }
}
