import java.util.function.Consumer;

public class ejh {
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

   protected static boolean a(djz $$0, iu $$1, int $$2) {
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

   protected static boolean a(djb $$0, iu $$1) {
      return $$0.a($$1, ejh::c);
   }

   protected static boolean b(djb $$0, iu $$1) {
      return $$0.a($$1, ejh::e);
   }

   protected static void a(ja $$0, int $$1, boolean $$2, Consumer<eah> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, ebe.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, ebe.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, ebe.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? ebe.a : ebe.b));
      }
   }

   protected static void a(djb $$0, iu $$1, ja $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         iu.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dmh.tb)) {
               $$3x = $$3x.b(dsd.d, Boolean.valueOf($$0.A($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(djb $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      if ($$2.a(axc.bv)) {
         $$0.a($$1, dmh.tc.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static eah a(ja $$0, ebe $$1) {
      return dmh.tb.m().b(dsd.b, $$0).b(dsd.c, $$1);
   }

   public static boolean a(eah $$0) {
      return b($$0) || $$0.a(dmh.K);
   }

   public static boolean b(eah $$0) {
      return $$0.a(dmh.tc) || $$0.a(axc.bv);
   }

   public static boolean c(eah $$0) {
      return $$0.l() || $$0.a(dmh.J);
   }

   public static boolean d(eah $$0) {
      return !$$0.l() && !$$0.a(dmh.J);
   }

   public static boolean e(eah $$0) {
      return $$0.l() || $$0.a(dmh.J) || $$0.a(dmh.K);
   }
}
