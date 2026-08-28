import java.util.function.Consumer;

public class ejo {
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

   protected static boolean a(dkg $$0, iv $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(azm.b($$5) * (float)$$2);
            int $$7 = (int)(azm.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dji $$0, iv $$1) {
      return $$0.a($$1, ejo::c);
   }

   protected static boolean b(dji $$0, iv $$1) {
      return $$0.a($$1, ejo::e);
   }

   protected static void a(jb $$0, int $$1, boolean $$2, Consumer<eao> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, ebl.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, ebl.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, ebl.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? ebl.a : ebl.b));
      }
   }

   protected static void a(dji $$0, iv $$1, jb $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         iv.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dmo.tb)) {
               $$3x = $$3x.b(dsk.d, Boolean.valueOf($$0.A($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dji $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      if ($$2.a(axc.bv)) {
         $$0.a($$1, dmo.tc.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static eao a(jb $$0, ebl $$1) {
      return dmo.tb.m().b(dsk.b, $$0).b(dsk.c, $$1);
   }

   public static boolean a(eao $$0) {
      return b($$0) || $$0.a(dmo.K);
   }

   public static boolean b(eao $$0) {
      return $$0.a(dmo.tc) || $$0.a(axc.bv);
   }

   public static boolean c(eao $$0) {
      return $$0.l() || $$0.a(dmo.J);
   }

   public static boolean d(eao $$0) {
      return !$$0.l() && !$$0.a(dmo.J);
   }

   public static boolean e(eao $$0) {
      return $$0.l() || $$0.a(dmo.J) || $$0.a(dmo.K);
   }
}
