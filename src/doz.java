import com.mojang.serialization.Codec;

public class doz extends dnm<dqn> {
   public doz(Codec<dqn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dqn> $$0) {
      cqf $$1 = $$0.b();
      gu $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         aru $$3 = $$0.d();
         dqn $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         gu.a $$8 = new gu.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(arp.a($$3, -$$5, $$5), arp.a($$3, -$$6, $$6), arp.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (gu)$$8)) {
               int $$10 = arp.a($$3, 1, $$7);
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

   private static boolean a(cpm $$0, gu.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.r($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(cpm $$0, aru $$1, gu.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.c())) {
               $$0.a($$2, csm.oB.n().a(cvy.d, Integer.valueOf(arp.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, csm.oC.n(), 2);
         }

         $$2.c(ha.b);
      }
   }

   private static boolean a(cpm $$0, gu $$1) {
      if (!$$0.t($$1)) {
         return true;
      } else {
         dez $$2 = $$0.a_($$1.d());
         return !$$2.a(csm.dW) && !$$2.a(csm.on) && !$$2.a(csm.op);
      }
   }
}
