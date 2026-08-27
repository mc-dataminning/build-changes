import java.util.function.Consumer;

public class dvm {
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

   protected static boolean a(cxu $$0, ib $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(aww.b($$5) * (float)$$2);
            int $$7 = (int)(aww.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cxa $$0, ib $$1) {
      return $$0.a($$1, dvm::c);
   }

   protected static boolean b(cxa $$0, ib $$1) {
      return $$0.a($$1, dvm::e);
   }

   protected static void a(ih $$0, int $$1, boolean $$2, Consumer<dmz> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dnw.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dnw.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dnw.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dnw.a : dnw.b));
      }
   }

   protected static void a(cxa $$0, ib $$1, ih $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ib.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dac.st)) {
               $$3x = $$3x.a(dfr.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cxa $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      if ($$2.a(aun.bs)) {
         $$0.a($$1, dac.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dmz a(ih $$0, dnw $$1) {
      return dac.st.o().a(dfr.b, $$0).a(dfr.c, $$1);
   }

   public static boolean a(dmz $$0) {
      return b($$0) || $$0.a(dac.H);
   }

   public static boolean b(dmz $$0) {
      return $$0.a(dac.su) || $$0.a(aun.bs);
   }

   public static boolean c(dmz $$0) {
      return $$0.i() || $$0.a(dac.G);
   }

   public static boolean d(dmz $$0) {
      return !$$0.i() && !$$0.a(dac.G);
   }

   public static boolean e(dmz $$0) {
      return $$0.i() || $$0.a(dac.G) || $$0.a(dac.H);
   }
}
