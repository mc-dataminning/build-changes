import com.mojang.serialization.Codec;

public class efd extends edq<egr> {
   public efd(Codec<egr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egr> $$0) {
      dfd $$1 = $$0.b();
      je $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azl $$3 = $$0.d();
         egr $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         je.a $$8 = new je.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(azd.a($$3, -$$5, $$5), azd.a($$3, -$$6, $$6), azd.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (je)$$8)) {
               int $$10 = azd.a($$3, 1, $$7);
               if ($$3.a(6) == 0) {
                  $$10 *= 2;
               }

               if ($$3.a(5) == 0) {
                  $$10 = 1;
               }

               int $$11 = 17;
               int $$12 = 25;
               a($$1, $$3, $$8, $$10, 17, 25);
            }
         }

         return true;
      }
   }

   private static boolean a(deh $$0, je.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(deh $$0, azl $$1, je.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dhl.oB.o().b(dky.e, Integer.valueOf(azd.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dhl.oC.o(), 2);
         }

         $$2.c(jj.b);
      }
   }

   private static boolean a(deh $$0, je $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         duo $$2 = $$0.a_($$1.e());
         return !$$2.a(dhl.dV) && !$$2.a(dhl.on) && !$$2.a(dhl.op);
      }
   }
}
