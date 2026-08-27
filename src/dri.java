import com.mojang.serialization.Codec;

public class dri extends dpv<dsw> {
   public dri(Codec<dsw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsw> $$0) {
      csu $$1 = $$0.b();
      ht $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         ats $$3 = $$0.d();
         dsw $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         ht.a $$8 = new ht.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(atm.a($$3, -$$5, $$5), atm.a($$3, -$$6, $$6), atm.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (ht)$$8)) {
               int $$10 = atm.a($$3, 1, $$7);
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

   private static boolean a(csb $$0, ht.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.r($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(csb $$0, ats $$1, ht.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.c())) {
               $$0.a($$2, cvc.oB.o().a(cyp.e, Integer.valueOf(atm.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cvc.oC.o(), 2);
         }

         $$2.c(hx.b);
      }
   }

   private static boolean a(csb $$0, ht $$1) {
      if (!$$0.t($$1)) {
         return true;
      } else {
         dhi $$2 = $$0.a_($$1.d());
         return !$$2.a(cvc.dV) && !$$2.a(cvc.on) && !$$2.a(cvc.op);
      }
   }
}
