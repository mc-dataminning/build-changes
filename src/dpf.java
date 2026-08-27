import java.util.function.Consumer;

public class dpf {
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

   protected static boolean a(csm $$0, ht $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ati.b($$5) * (float)$$2);
            int $$7 = (int)(ati.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(crt $$0, ht $$1) {
      return $$0.a($$1, dpf::c);
   }

   protected static boolean b(crt $$0, ht $$1) {
      return $$0.a($$1, dpf::e);
   }

   protected static void a(hx $$0, int $$1, boolean $$2, Consumer<dgw> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dht.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dht.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dht.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dht.a : dht.b));
      }
   }

   protected static void a(crt $$0, ht $$1, hx $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ht.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cuv.rs)) {
               $$3x = $$3x.a(dak.d, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(crt $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      if ($$2.a(arc.br)) {
         $$0.a($$1, cuv.rt.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dgw a(hx $$0, dht $$1) {
      return cuv.rs.o().a(dak.b, $$0).a(dak.c, $$1);
   }

   public static boolean a(dgw $$0) {
      return b($$0) || $$0.a(cuv.H);
   }

   public static boolean b(dgw $$0) {
      return $$0.a(cuv.rt) || $$0.a(arc.br);
   }

   public static boolean c(dgw $$0) {
      return $$0.i() || $$0.a(cuv.G);
   }

   public static boolean d(dgw $$0) {
      return !$$0.i() && !$$0.a(cuv.G);
   }

   public static boolean e(dgw $$0) {
      return $$0.i() || $$0.a(cuv.G) || $$0.a(cuv.H);
   }
}
