import java.util.function.Consumer;

public class egr {
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

   protected static boolean a(dig $$0, jh $$1, int $$2) {
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

   protected static boolean a(dhj $$0, jh $$1) {
      return $$0.a($$1, egr::c);
   }

   protected static boolean b(dhj $$0, jh $$1) {
      return $$0.a($$1, egr::e);
   }

   protected static void a(jm $$0, int $$1, boolean $$2, Consumer<dxv> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dyr.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dyr.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dyr.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dyr.a : dyr.b));
      }
   }

   protected static void a(dhj $$0, jh $$1, jm $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jh.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dko.sO)) {
               $$3x = $$3x.b(dqg.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dhj $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      if ($$2.a(axu.bu)) {
         $$0.a($$1, dko.sP.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dxv a(jm $$0, dyr $$1) {
      return dko.sO.m().b(dqg.b, $$0).b(dqg.c, $$1);
   }

   public static boolean a(dxv $$0) {
      return b($$0) || $$0.a(dko.K);
   }

   public static boolean b(dxv $$0) {
      return $$0.a(dko.sP) || $$0.a(axu.bu);
   }

   public static boolean c(dxv $$0) {
      return $$0.l() || $$0.a(dko.J);
   }

   public static boolean d(dxv $$0) {
      return !$$0.l() && !$$0.a(dko.J);
   }

   public static boolean e(dxv $$0) {
      return $$0.l() || $$0.a(dko.J) || $$0.a(dko.K);
   }
}
