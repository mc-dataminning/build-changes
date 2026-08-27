import com.mojang.serialization.Codec;

public class dmh extends dko<dmz> {
   private static final ha[] a = ha.values();

   public dmh(Codec<dmz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      apf $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dcb $$4 = $$1.a_($$2.c());
         if (!$$4.a(cpo.dW) && !$$4.a(cpo.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cmn $$0, apf $$1, gu $$2) {
      $$0.a($$2, cpo.kK.n(), 2);
      gu.a $$3 = new gu.a();
      gu.a $$4 = new gu.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.t($$3)) {
            int $$6 = 0;

            for (ha $$7 : a) {
               dcb $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(cpo.dW) || $$8.a(cpo.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, cpo.kK.n(), 2);
            }
         }
      }
   }

   private void b(cmn $$0, apf $$1, gu $$2) {
      gu.a $$3 = new gu.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.t($$3)) {
            dcb $$5 = $$0.a_($$3.c());
            if ($$5.a(cpo.dW) || $$5.a(cpo.kK)) {
               int $$6 = apa.a($$1, 1, 8);
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

   public static void a(cmn $$0, apf $$1, gu.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.d())) {
               $$0.a($$2, cpo.oz.n().a(cta.d, Integer.valueOf(apa.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cpo.oA.n(), 2);
         }

         $$2.c(ha.a);
      }
   }
}
