import com.mojang.serialization.Codec;

public class eev extends edc<efn> {
   private static final jj[] a = jj.values();

   public eev(Codec<efn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efn> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      azk $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dua $$4 = $$1.a_($$2.d());
         if (!$$4.a(dgx.dV) && !$$4.a(dgx.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(ddt $$0, azk $$1, je $$2) {
      $$0.a($$2, dgx.kK.o(), 2);
      je.a $$3 = new je.a();
      je.a $$4 = new je.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jj $$7 : a) {
               dua $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dgx.dV) || $$8.a(dgx.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dgx.kK.o(), 2);
            }
         }
      }
   }

   private void b(ddt $$0, azk $$1, je $$2) {
      je.a $$3 = new je.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dua $$5 = $$0.a_($$3.d());
            if ($$5.a(dgx.dV) || $$5.a(dgx.kK)) {
               int $$6 = azc.a($$1, 1, 8);
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

   public static void a(ddt $$0, azk $$1, je.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dgx.oz.o().b(dkk.e, Integer.valueOf(azc.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dgx.oA.o(), 2);
         }

         $$2.c(jj.a);
      }
   }
}
