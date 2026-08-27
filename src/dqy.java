import java.util.function.Consumer;

public class dqy {
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

   protected static boolean a(ctt $$0, hv $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(aty.b($$5) * (float)$$2);
            int $$7 = (int)(aty.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(csz $$0, hv $$1) {
      return $$0.a($$1, dqy::c);
   }

   protected static boolean b(csz $$0, hv $$1) {
      return $$0.a($$1, dqy::e);
   }

   protected static void a(ia $$0, int $$1, boolean $$2, Consumer<dip> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, djm.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, djm.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, djm.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? djm.a : djm.b));
      }
   }

   protected static void a(csz $$0, hv $$1, ia $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         hv.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cwb.st)) {
               $$3x = $$3x.a(dbq.d, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(csz $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      if ($$2.a(arr.br)) {
         $$0.a($$1, cwb.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dip a(ia $$0, djm $$1) {
      return cwb.st.o().a(dbq.b, $$0).a(dbq.c, $$1);
   }

   public static boolean a(dip $$0) {
      return b($$0) || $$0.a(cwb.H);
   }

   public static boolean b(dip $$0) {
      return $$0.a(cwb.su) || $$0.a(arr.br);
   }

   public static boolean c(dip $$0) {
      return $$0.i() || $$0.a(cwb.G);
   }

   public static boolean d(dip $$0) {
      return !$$0.i() && !$$0.a(cwb.G);
   }

   public static boolean e(dip $$0) {
      return $$0.i() || $$0.a(cwb.G) || $$0.a(cwb.H);
   }
}
