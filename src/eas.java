import java.util.function.Consumer;

public class eas {
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

   protected static boolean a(dcr $$0, iz $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ayx.b($$5) * (float)$$2);
            int $$7 = (int)(ayx.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dbx $$0, iz $$1) {
      return $$0.a($$1, eas::c);
   }

   protected static boolean b(dbx $$0, iz $$1) {
      return $$0.a($$1, eas::e);
   }

   protected static void a(je $$0, int $$1, boolean $$2, Consumer<dsa> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dsx.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dsx.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dsx.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dsx.a : dsx.b));
      }
   }

   protected static void a(dbx $$0, iz $$1, je $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         iz.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dez.st)) {
               $$3x = $$3x.a(dkp.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dbx $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      if ($$2.a(awo.bs)) {
         $$0.a($$1, dez.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dsa a(je $$0, dsx $$1) {
      return dez.st.o().a(dkp.b, $$0).a(dkp.c, $$1);
   }

   public static boolean a(dsa $$0) {
      return b($$0) || $$0.a(dez.H);
   }

   public static boolean b(dsa $$0) {
      return $$0.a(dez.su) || $$0.a(awo.bs);
   }

   public static boolean c(dsa $$0) {
      return $$0.i() || $$0.a(dez.G);
   }

   public static boolean d(dsa $$0) {
      return !$$0.i() && !$$0.a(dez.G);
   }

   public static boolean e(dsa $$0) {
      return $$0.i() || $$0.a(dez.G) || $$0.a(dez.H);
   }
}
