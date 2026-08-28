import com.mojang.serialization.Codec;

public class efn extends edu<egf> {
   private static final jk[] a = jk.values();

   public efn(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      azn $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dus $$4 = $$1.a_($$2.d());
         if (!$$4.a(dho.dV) && !$$4.a(dho.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dek $$0, azn $$1, jf $$2) {
      $$0.a($$2, dho.kK.n(), 2);
      jf.a $$3 = new jf.a();
      jf.a $$4 = new jf.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jk $$7 : a) {
               dus $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dho.dV) || $$8.a(dho.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dho.kK.n(), 2);
            }
         }
      }
   }

   private void b(dek $$0, azn $$1, jf $$2) {
      jf.a $$3 = new jf.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dus $$5 = $$0.a_($$3.d());
            if ($$5.a(dho.dV) || $$5.a(dho.kK)) {
               int $$6 = azf.a($$1, 1, 8);
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

   public static void a(dek $$0, azn $$1, jf.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dho.oz.n().b(dlb.e, Integer.valueOf(azf.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dho.oA.n(), 2);
         }

         $$2.c(jk.a);
      }
   }
}
