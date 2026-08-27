import com.mojang.serialization.Codec;

public class dta extends drn<duo> {
   public dta(Codec<duo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<duo> $$0) {
      cud $$1 = $$0.b();
      hx $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         aup $$3 = $$0.d();
         duo $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         hx.a $$8 = new hx.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(aui.a($$3, -$$5, $$5), aui.a($$3, -$$6, $$6), aui.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (hx)$$8)) {
               int $$10 = aui.a($$3, 1, $$7);
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

   private static boolean a(ctj $$0, hx.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(ctj $$0, aup $$1, hx.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.c())) {
               $$0.a($$2, cwl.oB.o().a(czy.e, Integer.valueOf(aui.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cwl.oC.o(), 2);
         }

         $$2.c(ic.b);
      }
   }

   private static boolean a(ctj $$0, hx $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dja $$2 = $$0.a_($$1.d());
         return !$$2.a(cwl.dV) && !$$2.a(cwl.on) && !$$2.a(cwl.op);
      }
   }
}
