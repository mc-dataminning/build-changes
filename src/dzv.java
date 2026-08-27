import java.util.function.Consumer;

public class dzv {
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

   protected static boolean a(dbu $$0, io $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ayf.b($$5) * (float)$$2);
            int $$7 = (int)(ayf.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dba $$0, io $$1) {
      return $$0.a($$1, dzv::c);
   }

   protected static boolean b(dba $$0, io $$1) {
      return $$0.a($$1, dzv::e);
   }

   protected static void a(it $$0, int $$1, boolean $$2, Consumer<drd> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dsa.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dsa.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dsa.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dsa.a : dsa.b));
      }
   }

   protected static void a(dba $$0, io $$1, it $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         io.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dec.st)) {
               $$3x = $$3x.a(djs.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dba $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      if ($$2.a(avx.bs)) {
         $$0.a($$1, dec.su.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static drd a(it $$0, dsa $$1) {
      return dec.st.n().a(djs.b, $$0).a(djs.c, $$1);
   }

   public static boolean a(drd $$0) {
      return b($$0) || $$0.a(dec.H);
   }

   public static boolean b(drd $$0) {
      return $$0.a(dec.su) || $$0.a(avx.bs);
   }

   public static boolean c(drd $$0) {
      return $$0.i() || $$0.a(dec.G);
   }

   public static boolean d(drd $$0) {
      return !$$0.i() && !$$0.a(dec.G);
   }

   public static boolean e(drd $$0) {
      return $$0.i() || $$0.a(dec.G) || $$0.a(dec.H);
   }
}
