import java.util.function.Consumer;

public class eba {
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

   protected static boolean a(dcz $$0, ja $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(aye.b($$5) * (float)$$2);
            int $$7 = (int)(aye.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dce $$0, ja $$1) {
      return $$0.a($$1, eba::c);
   }

   protected static boolean b(dce $$0, ja $$1) {
      return $$0.a($$1, eba::e);
   }

   protected static void a(jf $$0, int $$1, boolean $$2, Consumer<dsh> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dte.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dte.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dte.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dte.a : dte.b));
      }
   }

   protected static void a(dce $$0, ja $$1, jf $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ja.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dfh.st)) {
               $$3x = $$3x.a(dkx.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dce $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      if ($$2.a(avu.bs)) {
         $$0.a($$1, dfh.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dsh a(jf $$0, dte $$1) {
      return dfh.st.o().a(dkx.b, $$0).a(dkx.c, $$1);
   }

   public static boolean a(dsh $$0) {
      return b($$0) || $$0.a(dfh.H);
   }

   public static boolean b(dsh $$0) {
      return $$0.a(dfh.su) || $$0.a(avu.bs);
   }

   public static boolean c(dsh $$0) {
      return $$0.i() || $$0.a(dfh.G);
   }

   public static boolean d(dsh $$0) {
      return !$$0.i() && !$$0.a(dfh.G);
   }

   public static boolean e(dsh $$0) {
      return $$0.i() || $$0.a(dfh.G) || $$0.a(dfh.H);
   }
}
