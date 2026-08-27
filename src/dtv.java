import com.mojang.serialization.Codec;

public class dtv extends dsc<dun> {
   private static final ic[] a = ic.values();

   public dtv(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      cus $$1 = $$0.b();
      hx $$2 = $$0.e();
      auw $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         djp $$4 = $$1.a_($$2.c());
         if (!$$4.a(cxa.dV) && !$$4.a(cxa.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cty $$0, auw $$1, hx $$2) {
      $$0.a($$2, cxa.kK.o(), 2);
      hx.a $$3 = new hx.a();
      hx.a $$4 = new hx.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ic $$7 : a) {
               djp $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(cxa.dV) || $$8.a(cxa.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, cxa.kK.o(), 2);
            }
         }
      }
   }

   private void b(cty $$0, auw $$1, hx $$2) {
      hx.a $$3 = new hx.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            djp $$5 = $$0.a_($$3.c());
            if ($$5.a(cxa.dV) || $$5.a(cxa.kK)) {
               int $$6 = aup.a($$1, 1, 8);
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

   public static void a(cty $$0, auw $$1, hx.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, cxa.oz.o().a(dan.e, Integer.valueOf(aup.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cxa.oA.o(), 2);
         }

         $$2.c(ic.a);
      }
   }
}
