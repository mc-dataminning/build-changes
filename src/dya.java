import java.util.function.Consumer;

public class dya {
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

   protected static boolean a(dab $$0, id $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(axm.b($$5) * (float)$$2);
            int $$7 = (int)(axm.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(czh $$0, id $$1) {
      return $$0.a($$1, dya::c);
   }

   protected static boolean b(czh $$0, id $$1) {
      return $$0.a($$1, dya::e);
   }

   protected static void a(ij $$0, int $$1, boolean $$2, Consumer<dpi> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dqf.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dqf.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dqf.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dqf.a : dqf.b));
      }
   }

   protected static void a(czh $$0, id $$1, ij $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         id.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dcj.st)) {
               $$3x = $$3x.a(dhy.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(czh $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      if ($$2.a(ave.bs)) {
         $$0.a($$1, dcj.su.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dpi a(ij $$0, dqf $$1) {
      return dcj.st.n().a(dhy.b, $$0).a(dhy.c, $$1);
   }

   public static boolean a(dpi $$0) {
      return b($$0) || $$0.a(dcj.H);
   }

   public static boolean b(dpi $$0) {
      return $$0.a(dcj.su) || $$0.a(ave.bs);
   }

   public static boolean c(dpi $$0) {
      return $$0.i() || $$0.a(dcj.G);
   }

   public static boolean d(dpi $$0) {
      return !$$0.i() && !$$0.a(dcj.G);
   }

   public static boolean e(dpi $$0) {
      return $$0.i() || $$0.a(dcj.G) || $$0.a(dcj.H);
   }
}
