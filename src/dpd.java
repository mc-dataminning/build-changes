import com.mojang.serialization.Codec;

public class dpd extends dnq<dqr> {
   public dpd(Codec<dqr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqr> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         ash $$3 = $$0.d();
         dqr $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         gw.a $$8 = new gw.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(asb.a($$3, -$$5, $$5), asb.a($$3, -$$6, $$6), asb.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (gw)$$8)) {
               int $$10 = asb.a($$3, 1, $$7);
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

   private static boolean a(cqc $$0, gw.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.r($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(cqc $$0, ash $$1, gw.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.c())) {
               $$0.a($$2, cte.oB.o().a(cwq.e, Integer.valueOf(asb.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cte.oC.o(), 2);
         }

         $$2.c(ha.b);
      }
   }

   private static boolean a(cqc $$0, gw $$1) {
      if (!$$0.t($$1)) {
         return true;
      } else {
         dfd $$2 = $$0.a_($$1.d());
         return !$$2.a(cte.dV) && !$$2.a(cte.on) && !$$2.a(cte.op);
      }
   }
}
