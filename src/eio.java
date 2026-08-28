import java.util.function.Consumer;

public class eio {
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

   protected static boolean a(djo $$0, iu $$1, int $$2) {
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

   protected static boolean a(diq $$0, iu $$1) {
      return $$0.a($$1, eio::c);
   }

   protected static boolean b(diq $$0, iu $$1) {
      return $$0.a($$1, eio::e);
   }

   protected static void a(ja $$0, int $$1, boolean $$2, Consumer<dzo> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, eal.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, eal.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, eal.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? eal.a : eal.b));
      }
   }

   protected static void a(diq $$0, iu $$1, ja $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         iu.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dlw.sX)) {
               $$3x = $$3x.b(drq.d, Boolean.valueOf($$0.A($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(diq $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      if ($$2.a(axa.bu)) {
         $$0.a($$1, dlw.sY.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dzo a(ja $$0, eal $$1) {
      return dlw.sX.m().b(drq.b, $$0).b(drq.c, $$1);
   }

   public static boolean a(dzo $$0) {
      return b($$0) || $$0.a(dlw.K);
   }

   public static boolean b(dzo $$0) {
      return $$0.a(dlw.sY) || $$0.a(axa.bu);
   }

   public static boolean c(dzo $$0) {
      return $$0.l() || $$0.a(dlw.J);
   }

   public static boolean d(dzo $$0) {
      return !$$0.l() && !$$0.a(dlw.J);
   }

   public static boolean e(dzo $$0) {
      return $$0.l() || $$0.a(dlw.J) || $$0.a(dlw.K);
   }
}
