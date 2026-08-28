import com.mojang.serialization.Codec;

public class elz extends ekm<eno> {
   public elz(Codec<eno> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<eno> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azz $$3 = $$0.d();
         eno $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         iw.a $$8 = new iw.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(azq.a($$3, -$$5, $$5), azq.a($$3, -$$6, $$6), azq.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (iw)$$8)) {
               int $$10 = azq.a($$3, 1, $$7);
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

   private static boolean a(dka $$0, iw.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.t($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dka $$0, azz $$1, iw.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.v($$2)) {
            if ($$6 == $$3 || !$$0.v($$2.d())) {
               $$0.a($$2, dng.ph.m().b(dqx.e, Integer.valueOf(azq.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dng.pi.m(), 2);
         }

         $$2.c(jc.b);
      }
   }

   private static boolean a(dka $$0, iw $$1) {
      if (!$$0.v($$1)) {
         return true;
      } else {
         ebg $$2 = $$0.a_($$1.e());
         return !$$2.a(dng.em) && !$$2.a(dng.oT) && !$$2.a(dng.oV);
      }
   }
}
