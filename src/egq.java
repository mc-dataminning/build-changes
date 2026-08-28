import java.util.function.Consumer;

public class egq {
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

   protected static boolean a(dif $$0, jh $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(bae.b($$5) * (float)$$2);
            int $$7 = (int)(bae.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dhi $$0, jh $$1) {
      return $$0.a($$1, egq::c);
   }

   protected static boolean b(dhi $$0, jh $$1) {
      return $$0.a($$1, egq::e);
   }

   protected static void a(jm $$0, int $$1, boolean $$2, Consumer<dxu> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dyq.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dyq.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dyq.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dyq.a : dyq.b));
      }
   }

   protected static void a(dhi $$0, jh $$1, jm $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jh.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dkn.sO)) {
               $$3x = $$3x.b(dqf.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dhi $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      if ($$2.a(axu.bu)) {
         $$0.a($$1, dkn.sP.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dxu a(jm $$0, dyq $$1) {
      return dkn.sO.m().b(dqf.b, $$0).b(dqf.c, $$1);
   }

   public static boolean a(dxu $$0) {
      return b($$0) || $$0.a(dkn.K);
   }

   public static boolean b(dxu $$0) {
      return $$0.a(dkn.sP) || $$0.a(axu.bu);
   }

   public static boolean c(dxu $$0) {
      return $$0.l() || $$0.a(dkn.J);
   }

   public static boolean d(dxu $$0) {
      return !$$0.l() && !$$0.a(dkn.J);
   }

   public static boolean e(dxu $$0) {
      return $$0.l() || $$0.a(dkn.J) || $$0.a(dkn.K);
   }
}
