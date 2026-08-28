import java.util.function.Consumer;

public class ecx {
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

   protected static boolean a(dep $$0, je $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(azc.b($$5) * (float)$$2);
            int $$7 = (int)(azc.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(ddt $$0, je $$1) {
      return $$0.a($$1, ecx::c);
   }

   protected static boolean b(ddt $$0, je $$1) {
      return $$0.a($$1, ecx::e);
   }

   protected static void a(jj $$0, int $$1, boolean $$2, Consumer<dua> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dux.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dux.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dux.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dux.a : dux.b));
      }
   }

   protected static void a(ddt $$0, je $$1, jj $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         je.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dgx.st)) {
               $$3x = $$3x.b(dmn.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(ddt $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      if ($$2.a(aws.bt)) {
         $$0.a($$1, dgx.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dua a(jj $$0, dux $$1) {
      return dgx.st.o().b(dmn.b, $$0).b(dmn.c, $$1);
   }

   public static boolean a(dua $$0) {
      return b($$0) || $$0.a(dgx.H);
   }

   public static boolean b(dua $$0) {
      return $$0.a(dgx.su) || $$0.a(aws.bt);
   }

   public static boolean c(dua $$0) {
      return $$0.l() || $$0.a(dgx.G);
   }

   public static boolean d(dua $$0) {
      return !$$0.l() && !$$0.a(dgx.G);
   }

   public static boolean e(dua $$0) {
      return $$0.l() || $$0.a(dgx.G) || $$0.a(dgx.H);
   }
}
