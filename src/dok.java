import java.util.function.Consumer;

public class dok {
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

   protected static boolean a(crt $$0, ht $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(asy.b($$5) * (float)$$2);
            int $$7 = (int)(asy.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cra $$0, ht $$1) {
      return $$0.a($$1, dok::c);
   }

   protected static boolean b(cra $$0, ht $$1) {
      return $$0.a($$1, dok::e);
   }

   protected static void a(hx $$0, int $$1, boolean $$2, Consumer<dgb> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dgy.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dgy.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dgy.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dgy.a : dgy.b));
      }
   }

   protected static void a(cra $$0, ht $$1, hx $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ht.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cuc.rs)) {
               $$3x = $$3x.a(czq.d, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cra $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      if ($$2.a(aqs.br)) {
         $$0.a($$1, cuc.rt.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dgb a(hx $$0, dgy $$1) {
      return cuc.rs.o().a(czq.b, $$0).a(czq.c, $$1);
   }

   public static boolean a(dgb $$0) {
      return b($$0) || $$0.a(cuc.H);
   }

   public static boolean b(dgb $$0) {
      return $$0.a(cuc.rt) || $$0.a(aqs.br);
   }

   public static boolean c(dgb $$0) {
      return $$0.i() || $$0.a(cuc.G);
   }

   public static boolean d(dgb $$0) {
      return !$$0.i() && !$$0.a(cuc.G);
   }

   public static boolean e(dgb $$0) {
      return $$0.i() || $$0.a(cuc.G) || $$0.a(cuc.H);
   }
}
