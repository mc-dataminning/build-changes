import java.util.function.Consumer;

public class dtv {
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

   protected static boolean a(cwm $$0, hz $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(awi.b($$5) * (float)$$2);
            int $$7 = (int)(awi.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cvs $$0, hz $$1) {
      return $$0.a($$1, dtv::c);
   }

   protected static boolean b(cvs $$0, hz $$1) {
      return $$0.a($$1, dtv::e);
   }

   protected static void a(ie $$0, int $$1, boolean $$2, Consumer<dlj> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dmg.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dmg.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dmg.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dmg.a : dmg.b));
      }
   }

   protected static void a(cvs $$0, hz $$1, ie $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         hz.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cyu.st)) {
               $$3x = $$3x.a(dej.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cvs $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      if ($$2.a(aua.br)) {
         $$0.a($$1, cyu.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dlj a(ie $$0, dmg $$1) {
      return cyu.st.o().a(dej.b, $$0).a(dej.c, $$1);
   }

   public static boolean a(dlj $$0) {
      return b($$0) || $$0.a(cyu.H);
   }

   public static boolean b(dlj $$0) {
      return $$0.a(cyu.su) || $$0.a(aua.br);
   }

   public static boolean c(dlj $$0) {
      return $$0.i() || $$0.a(cyu.G);
   }

   public static boolean d(dlj $$0) {
      return !$$0.i() && !$$0.a(cyu.G);
   }

   public static boolean e(dlj $$0) {
      return $$0.i() || $$0.a(cyu.G) || $$0.a(cyu.H);
   }
}
