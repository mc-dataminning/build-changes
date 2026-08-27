import java.util.function.Consumer;

public class dyz {
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

   protected static boolean a(day $$0, in $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(axz.b($$5) * (float)$$2);
            int $$7 = (int)(axz.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dae $$0, in $$1) {
      return $$0.a($$1, dyz::c);
   }

   protected static boolean b(dae $$0, in $$1) {
      return $$0.a($$1, dyz::e);
   }

   protected static void a(is $$0, int $$1, boolean $$2, Consumer<dqh> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dre.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dre.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dre.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dre.a : dre.b));
      }
   }

   protected static void a(dae $$0, in $$1, is $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         in.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(ddg.st)) {
               $$3x = $$3x.a(diw.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dae $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      if ($$2.a(avr.bs)) {
         $$0.a($$1, ddg.su.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dqh a(is $$0, dre $$1) {
      return ddg.st.n().a(diw.b, $$0).a(diw.c, $$1);
   }

   public static boolean a(dqh $$0) {
      return b($$0) || $$0.a(ddg.H);
   }

   public static boolean b(dqh $$0) {
      return $$0.a(ddg.su) || $$0.a(avr.bs);
   }

   public static boolean c(dqh $$0) {
      return $$0.i() || $$0.a(ddg.G);
   }

   public static boolean d(dqh $$0) {
      return !$$0.i() && !$$0.a(ddg.G);
   }

   public static boolean e(dqh $$0) {
      return $$0.i() || $$0.a(ddg.G) || $$0.a(ddg.H);
   }
}
