import com.mojang.serialization.Codec;

public class efh extends edu<egv> {
   public efh(Codec<egv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egv> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azn $$3 = $$0.d();
         egv $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         jf.a $$8 = new jf.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(azf.a($$3, -$$5, $$5), azf.a($$3, -$$6, $$6), azf.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (jf)$$8)) {
               int $$10 = azf.a($$3, 1, $$7);
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

   private static boolean a(dek $$0, jf.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dek $$0, azn $$1, jf.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dho.oB.n().b(dlb.e, Integer.valueOf(azf.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dho.oC.n(), 2);
         }

         $$2.c(jk.b);
      }
   }

   private static boolean a(dek $$0, jf $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dus $$2 = $$0.a_($$1.e());
         return !$$2.a(dho.dV) && !$$2.a(dho.on) && !$$2.a(dho.op);
      }
   }
}
