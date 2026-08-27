import java.util.function.Consumer;

public class duq {
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

   protected static boolean a(cwz $$0, ib $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(awm.b($$5) * (float)$$2);
            int $$7 = (int)(awm.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cwf $$0, ib $$1) {
      return $$0.a($$1, duq::c);
   }

   protected static boolean b(cwf $$0, ib $$1) {
      return $$0.a($$1, duq::e);
   }

   protected static void a(ih $$0, int $$1, boolean $$2, Consumer<dme> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dnb.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dnb.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dnb.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dnb.a : dnb.b));
      }
   }

   protected static void a(cwf $$0, ib $$1, ih $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ib.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(czh.st)) {
               $$3x = $$3x.a(dew.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cwf $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      if ($$2.a(aue.br)) {
         $$0.a($$1, czh.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dme a(ih $$0, dnb $$1) {
      return czh.st.o().a(dew.b, $$0).a(dew.c, $$1);
   }

   public static boolean a(dme $$0) {
      return b($$0) || $$0.a(czh.H);
   }

   public static boolean b(dme $$0) {
      return $$0.a(czh.su) || $$0.a(aue.br);
   }

   public static boolean c(dme $$0) {
      return $$0.i() || $$0.a(czh.G);
   }

   public static boolean d(dme $$0) {
      return !$$0.i() && !$$0.a(czh.G);
   }

   public static boolean e(dme $$0) {
      return $$0.i() || $$0.a(czh.G) || $$0.a(czh.H);
   }
}
