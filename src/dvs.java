import com.mojang.serialization.Codec;

public class dvs extends dtz<dwk> {
   private static final ie[] a = ie.values();

   public dvs(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      awp $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dlj $$4 = $$1.a_($$2.c());
         if (!$$4.a(cyu.dV) && !$$4.a(cyu.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cvs $$0, awp $$1, hz $$2) {
      $$0.a($$2, cyu.kK.o(), 2);
      hz.a $$3 = new hz.a();
      hz.a $$4 = new hz.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ie $$7 : a) {
               dlj $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(cyu.dV) || $$8.a(cyu.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, cyu.kK.o(), 2);
            }
         }
      }
   }

   private void b(cvs $$0, awp $$1, hz $$2) {
      hz.a $$3 = new hz.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dlj $$5 = $$0.a_($$3.c());
            if ($$5.a(cyu.dV) || $$5.a(cyu.kK)) {
               int $$6 = awi.a($$1, 1, 8);
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

   public static void a(cvs $$0, awp $$1, hz.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, cyu.oz.o().a(dch.e, Integer.valueOf(awi.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cyu.oA.o(), 2);
         }

         $$2.c(ie.a);
      }
   }
}
