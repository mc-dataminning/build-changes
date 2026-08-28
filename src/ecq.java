import com.mojang.serialization.Codec;

public class ecq extends eax<edi> {
   private static final je[] a = je.values();

   public ecq(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edi> $$0) {
      dcs $$1 = $$0.b();
      iz $$2 = $$0.e();
      azg $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dsb $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfa.dV) && !$$4.a(dfa.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dby $$0, azg $$1, iz $$2) {
      $$0.a($$2, dfa.kK.o(), 2);
      iz.a $$3 = new iz.a();
      iz.a $$4 = new iz.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (je $$7 : a) {
               dsb $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dfa.dV) || $$8.a(dfa.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dfa.kK.o(), 2);
            }
         }
      }
   }

   private void b(dby $$0, azg $$1, iz $$2) {
      iz.a $$3 = new iz.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dsb $$5 = $$0.a_($$3.c());
            if ($$5.a(dfa.dV) || $$5.a(dfa.kK)) {
               int $$6 = ayy.a($$1, 1, 8);
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

   public static void a(dby $$0, azg $$1, iz.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dfa.oz.o().a(din.e, Integer.valueOf(ayy.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dfa.oA.o(), 2);
         }

         $$2.c(je.a);
      }
   }
}
