import java.util.function.Consumer;

public class dpw {
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

   protected static boolean a(csz $$0, hx $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(atq.b($$5) * (float)$$2);
            int $$7 = (int)(atq.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(csg $$0, hx $$1) {
      return $$0.a($$1, dpw::c);
   }

   protected static boolean b(csg $$0, hx $$1) {
      return $$0.a($$1, dpw::e);
   }

   protected static void a(ib $$0, int $$1, boolean $$2, Consumer<dhn> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dik.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dik.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dik.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dik.a : dik.b));
      }
   }

   protected static void a(csg $$0, hx $$1, ib $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         hx.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cvh.st)) {
               $$3x = $$3x.a(daw.d, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(csg $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      if ($$2.a(ark.br)) {
         $$0.a($$1, cvh.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dhn a(ib $$0, dik $$1) {
      return cvh.st.o().a(daw.b, $$0).a(daw.c, $$1);
   }

   public static boolean a(dhn $$0) {
      return b($$0) || $$0.a(cvh.H);
   }

   public static boolean b(dhn $$0) {
      return $$0.a(cvh.su) || $$0.a(ark.br);
   }

   public static boolean c(dhn $$0) {
      return $$0.i() || $$0.a(cvh.G);
   }

   public static boolean d(dhn $$0) {
      return !$$0.i() && !$$0.a(cvh.G);
   }

   public static boolean e(dhn $$0) {
      return $$0.i() || $$0.a(cvh.G) || $$0.a(cvh.H);
   }
}
