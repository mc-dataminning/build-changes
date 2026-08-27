import com.mojang.serialization.Codec;

public class dpp extends dnw<dqh> {
   private static final hc[] a = hc.values();

   public dpp(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      cqp $$1 = $$0.b();
      gw $$2 = $$0.e();
      asc $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dfj $$4 = $$1.a_($$2.c());
         if (!$$4.a(csw.dW) && !$$4.a(csw.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cpw $$0, asc $$1, gw $$2) {
      $$0.a($$2, csw.kK.n(), 2);
      gw.a $$3 = new gw.a();
      gw.a $$4 = new gw.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.t($$3)) {
            int $$6 = 0;

            for (hc $$7 : a) {
               dfj $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(csw.dW) || $$8.a(csw.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, csw.kK.n(), 2);
            }
         }
      }
   }

   private void b(cpw $$0, asc $$1, gw $$2) {
      gw.a $$3 = new gw.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.t($$3)) {
            dfj $$5 = $$0.a_($$3.c());
            if ($$5.a(csw.dW) || $$5.a(csw.kK)) {
               int $$6 = arx.a($$1, 1, 8);
               if ($$1.a(6) == 0) {
                  $$6 *= 2;
               }

               if ($$1.a(5) == 0) {
                  $$6 = 1;
               }

               int $$7 = 17;
               int $$8 = 25;
               a($$0, $$1, $$3, $$6, 17, 25);
            }
         }
      }
   }

   public static void a(cpw $$0, asc $$1, gw.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.d())) {
               $$0.a($$2, csw.oz.n().a(cwi.d, Integer.valueOf(arx.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, csw.oA.n(), 2);
         }

         $$2.c(hc.a);
      }
   }
}
