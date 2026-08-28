import com.mojang.serialization.Codec;

public class emf extends ekm<emy> {
   private static final jc[] a = jc.values();

   public emf(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      azz $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         ebg $$4 = $$1.a_($$2.d());
         if (!$$4.a(dng.em) && !$$4.a(dng.lq)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dka $$0, azz $$1, iw $$2) {
      $$0.a($$2, dng.lq.m(), 2);
      iw.a $$3 = new iw.a();
      iw.a $$4 = new iw.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.v($$3)) {
            int $$6 = 0;

            for (jc $$7 : a) {
               ebg $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dng.em) || $$8.a(dng.lq)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dng.lq.m(), 2);
            }
         }
      }
   }

   private void b(dka $$0, azz $$1, iw $$2) {
      iw.a $$3 = new iw.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.v($$3)) {
            ebg $$5 = $$0.a_($$3.d());
            if ($$5.a(dng.em) || $$5.a(dng.lq)) {
               int $$6 = azq.a($$1, 1, 8);
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

   public static void a(dka $$0, azz $$1, iw.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.v($$2)) {
            if ($$6 == $$3 || !$$0.v($$2.e())) {
               $$0.a($$2, dng.pf.m().b(dqx.e, Integer.valueOf(azq.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dng.pg.m(), 2);
         }

         $$2.c(jc.a);
      }
   }
}
