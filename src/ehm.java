import java.util.function.Consumer;

public class ehm {
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

   protected static boolean a(dio $$0, jj $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(azk.b($$5) * (float)$$2);
            int $$7 = (int)(azk.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dhq $$0, jj $$1) {
      return $$0.a($$1, ehm::c);
   }

   protected static boolean b(dhq $$0, jj $$1) {
      return $$0.a($$1, ehm::e);
   }

   protected static void a(jo $$0, int $$1, boolean $$2, Consumer<dym> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dzj.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dzj.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dzj.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dzj.a : dzj.b));
      }
   }

   protected static void a(dhq $$0, jj $$1, jo $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jj.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dkw.sX)) {
               $$3x = $$3x.b(dqq.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dhq $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      if ($$2.a(awz.bu)) {
         $$0.a($$1, dkw.sY.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dym a(jo $$0, dzj $$1) {
      return dkw.sX.m().b(dqq.b, $$0).b(dqq.c, $$1);
   }

   public static boolean a(dym $$0) {
      return b($$0) || $$0.a(dkw.K);
   }

   public static boolean b(dym $$0) {
      return $$0.a(dkw.sY) || $$0.a(awz.bu);
   }

   public static boolean c(dym $$0) {
      return $$0.l() || $$0.a(dkw.J);
   }

   public static boolean d(dym $$0) {
      return !$$0.l() && !$$0.a(dkw.J);
   }

   public static boolean e(dym $$0) {
      return $$0.l() || $$0.a(dkw.J) || $$0.a(dkw.K);
   }
}
