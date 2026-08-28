import com.mojang.serialization.Codec;

public class ede extends ebl<edw> {
   private static final jf[] a = jf.values();

   public ede(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      ayo $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dsl $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfk.dV) && !$$4.a(dfk.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dch $$0, ayo $$1, ja $$2) {
      $$0.a($$2, dfk.kK.o(), 2);
      ja.a $$3 = new ja.a();
      ja.a $$4 = new ja.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jf $$7 : a) {
               dsl $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dfk.dV) || $$8.a(dfk.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dfk.kK.o(), 2);
            }
         }
      }
   }

   private void b(dch $$0, ayo $$1, ja $$2) {
      ja.a $$3 = new ja.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dsl $$5 = $$0.a_($$3.c());
            if ($$5.a(dfk.dV) || $$5.a(dfk.kK)) {
               int $$6 = ayg.a($$1, 1, 8);
               if ($$1.a(6) == 0) {
                  $$6 *= 2;
               }

               if ($$1.a(5) == 0) {
                  $$6 = 1;
               }

               int $$7 = 17;
               int $$8 = 25;
               a($$0, $$1, $$3, $$6, 17, 25);
            }
         }
      }
   }

   public static void a(dch $$0, ayo $$1, ja.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dfk.oz.o().a(dix.e, Integer.valueOf(ayg.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dfk.oA.o(), 2);
         }

         $$2.c(jf.a);
      }
   }
}
