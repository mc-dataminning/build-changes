import com.mojang.serialization.Codec;

public class eij extends egw<ejx> {
   public eij(Codec<ejx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejx> $$0) {
      dig $$1 = $$0.b();
      jh $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         bam $$3 = $$0.d();
         ejx $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         jh.a $$8 = new jh.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(bae.a($$3, -$$5, $$5), bae.a($$3, -$$6, $$6), bae.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (jh)$$8)) {
               int $$10 = bae.a($$3, 1, $$7);
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

   private static boolean a(dhj $$0, jh.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dhj $$0, bam $$1, jh.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dko.oW.m().b(doc.e, Integer.valueOf(bae.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dko.oX.m(), 2);
         }

         $$2.c(jm.b);
      }
   }

   private static boolean a(dhj $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dxv $$2 = $$0.a_($$1.e());
         return !$$2.a(dko.ei) && !$$2.a(dko.oI) && !$$2.a(dko.oK);
      }
   }
}
