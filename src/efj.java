import com.mojang.serialization.Codec;

public class efj extends edq<egb> {
   private static final jj[] a = jj.values();

   public efj(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      dfd $$1 = $$0.b();
      je $$2 = $$0.e();
      azl $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         duo $$4 = $$1.a_($$2.d());
         if (!$$4.a(dhl.dV) && !$$4.a(dhl.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(deh $$0, azl $$1, je $$2) {
      $$0.a($$2, dhl.kK.o(), 2);
      je.a $$3 = new je.a();
      je.a $$4 = new je.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jj $$7 : a) {
               duo $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dhl.dV) || $$8.a(dhl.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dhl.kK.o(), 2);
            }
         }
      }
   }

   private void b(deh $$0, azl $$1, je $$2) {
      je.a $$3 = new je.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            duo $$5 = $$0.a_($$3.d());
            if ($$5.a(dhl.dV) || $$5.a(dhl.kK)) {
               int $$6 = azd.a($$1, 1, 8);
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

   public static void a(deh $$0, azl $$1, je.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dhl.oz.o().b(dky.e, Integer.valueOf(azd.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dhl.oA.o(), 2);
         }

         $$2.c(jj.a);
      }
   }
}
