import java.util.function.Consumer;

public class ebz {
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

   protected static boolean a(dds $$0, jd $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ayo.b($$5) * (float)$$2);
            int $$7 = (int)(ayo.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dcx $$0, jd $$1) {
      return $$0.a($$1, ebz::c);
   }

   protected static boolean b(dcx $$0, jd $$1) {
      return $$0.a($$1, ebz::e);
   }

   protected static void a(ji $$0, int $$1, boolean $$2, Consumer<dtc> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dtz.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dtz.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dtz.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dtz.a : dtz.b));
      }
   }

   protected static void a(dcx $$0, jd $$1, ji $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jd.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dga.st)) {
               $$3x = $$3x.a(dlq.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dcx $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      if ($$2.a(awe.bs)) {
         $$0.a($$1, dga.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dtc a(ji $$0, dtz $$1) {
      return dga.st.o().a(dlq.b, $$0).a(dlq.c, $$1);
   }

   public static boolean a(dtc $$0) {
      return b($$0) || $$0.a(dga.H);
   }

   public static boolean b(dtc $$0) {
      return $$0.a(dga.su) || $$0.a(awe.bs);
   }

   public static boolean c(dtc $$0) {
      return $$0.i() || $$0.a(dga.G);
   }

   public static boolean d(dtc $$0) {
      return !$$0.i() && !$$0.a(dga.G);
   }

   public static boolean e(dtc $$0) {
      return $$0.i() || $$0.a(dga.G) || $$0.a(dga.H);
   }
}
