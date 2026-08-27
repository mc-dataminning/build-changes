import java.util.function.Consumer;

public class drj {
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

   protected static boolean a(cud $$0, hx $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(aui.b($$5) * (float)$$2);
            int $$7 = (int)(aui.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(ctj $$0, hx $$1) {
      return $$0.a($$1, drj::c);
   }

   protected static boolean b(ctj $$0, hx $$1) {
      return $$0.a($$1, drj::e);
   }

   protected static void a(ic $$0, int $$1, boolean $$2, Consumer<dja> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, djx.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, djx.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, djx.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? djx.a : djx.b));
      }
   }

   protected static void a(ctj $$0, hx $$1, ic $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         hx.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cwl.st)) {
               $$3x = $$3x.a(dca.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(ctj $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      if ($$2.a(asb.br)) {
         $$0.a($$1, cwl.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dja a(ic $$0, djx $$1) {
      return cwl.st.o().a(dca.b, $$0).a(dca.c, $$1);
   }

   public static boolean a(dja $$0) {
      return b($$0) || $$0.a(cwl.H);
   }

   public static boolean b(dja $$0) {
      return $$0.a(cwl.su) || $$0.a(asb.br);
   }

   public static boolean c(dja $$0) {
      return $$0.i() || $$0.a(cwl.G);
   }

   public static boolean d(dja $$0) {
      return !$$0.i() && !$$0.a(cwl.G);
   }

   public static boolean e(dja $$0) {
      return $$0.i() || $$0.a(cwl.G) || $$0.a(cwl.H);
   }
}
