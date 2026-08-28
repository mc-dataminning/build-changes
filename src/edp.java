import java.util.function.Consumer;

public class edp {
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

   protected static boolean a(dfg $$0, jf $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(azf.b($$5) * (float)$$2);
            int $$7 = (int)(azf.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dek $$0, jf $$1) {
      return $$0.a($$1, edp::c);
   }

   protected static boolean b(dek $$0, jf $$1) {
      return $$0.a($$1, edp::e);
   }

   protected static void a(jk $$0, int $$1, boolean $$2, Consumer<dus> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dvp.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dvp.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dvp.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dvp.a : dvp.b));
      }
   }

   protected static void a(dek $$0, jf $$1, jk $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jf.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dho.st)) {
               $$3x = $$3x.b(dne.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dek $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      if ($$2.a(awv.bt)) {
         $$0.a($$1, dho.su.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dus a(jk $$0, dvp $$1) {
      return dho.st.n().b(dne.b, $$0).b(dne.c, $$1);
   }

   public static boolean a(dus $$0) {
      return b($$0) || $$0.a(dho.H);
   }

   public static boolean b(dus $$0) {
      return $$0.a(dho.su) || $$0.a(awv.bt);
   }

   public static boolean c(dus $$0) {
      return $$0.l() || $$0.a(dho.G);
   }

   public static boolean d(dus $$0) {
      return !$$0.l() && !$$0.a(dho.G);
   }

   public static boolean e(dus $$0) {
      return $$0.l() || $$0.a(dho.G) || $$0.a(dho.H);
   }
}
