import java.util.function.Consumer;

public class dni {
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

   protected static boolean a(cqf $$0, gu $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(arp.b($$5) * (float)$$2);
            int $$7 = (int)(arp.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cpm $$0, gu $$1) {
      return $$0.a($$1, dni::c);
   }

   protected static boolean b(cpm $$0, gu $$1) {
      return $$0.a($$1, dni::e);
   }

   protected static void a(ha $$0, int $$1, boolean $$2, Consumer<dez> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dfw.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dfw.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dfw.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dfw.a : dfw.b));
      }
   }

   protected static void a(cpm $$0, gu $$1, ha $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         gu.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(csm.rs)) {
               $$3x = $$3x.a(cyb.c, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cpm $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      if ($$2.a(apl.br)) {
         $$0.a($$1, csm.rt.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dez a(ha $$0, dfw $$1) {
      return csm.rs.n().a(cyb.a, $$0).a(cyb.b, $$1);
   }

   public static boolean a(dez $$0) {
      return b($$0) || $$0.a(csm.H);
   }

   public static boolean b(dez $$0) {
      return $$0.a(csm.rt) || $$0.a(apl.br);
   }

   public static boolean c(dez $$0) {
      return $$0.i() || $$0.a(csm.G);
   }

   public static boolean d(dez $$0) {
      return !$$0.i() && !$$0.a(csm.G);
   }

   public static boolean e(dez $$0) {
      return $$0.i() || $$0.a(csm.G) || $$0.a(csm.H);
   }
}
