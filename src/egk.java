import java.util.function.Consumer;

public class egk {
   protected static double a(double $$0, double $$1, double $$2, double $$3) {
      if ($$0 < $$3) {
         $$0 = $$3;
      }

      double $$4 = 0.384;
      double $$5 = $$0 / $$1 * 0.384;
      double $$6 = 0.75 * Math.pow($$5, 1.3333333333333333);
      double $$7 = Math.pow($$5, 0.6666666666666666);
      double $$8 = 0.3333333333333333 * Math.log($$5);
      double $$9 = $$2 * ($$6 - $$7 - $$8);
      $$9 = Math.max($$9, 0.0);
      return $$9 / 0.384 * $$1;
   }

   protected static boolean a(dhx $$0, jh $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(azu.b($$5) * (float)$$2);
            int $$7 = (int)(azu.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dha $$0, jh $$1) {
      return $$0.a($$1, egk::c);
   }

   protected static boolean b(dha $$0, jh $$1) {
      return $$0.a($$1, egk::e);
   }

   protected static void a(jm $$0, int $$1, boolean $$2, Consumer<dxo> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dyk.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dyk.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dyk.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dyk.a : dyk.b));
      }
   }

   protected static void a(dha $$0, jh $$1, jm $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jh.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dkf.sV)) {
               $$3x = $$3x.b(dpz.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dha $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      if ($$2.a(axk.bu)) {
         $$0.a($$1, dkf.sW.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dxo a(jm $$0, dyk $$1) {
      return dkf.sV.m().b(dpz.b, $$0).b(dpz.c, $$1);
   }

   public static boolean a(dxo $$0) {
      return b($$0) || $$0.a(dkf.K);
   }

   public static boolean b(dxo $$0) {
      return $$0.a(dkf.sW) || $$0.a(axk.bu);
   }

   public static boolean c(dxo $$0) {
      return $$0.l() || $$0.a(dkf.J);
   }

   public static boolean d(dxo $$0) {
      return !$$0.l() && !$$0.a(dkf.J);
   }

   public static boolean e(dxo $$0) {
      return $$0.l() || $$0.a(dkf.J) || $$0.a(dkf.K);
   }
}
