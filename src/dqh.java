import com.mojang.serialization.Codec;

public class dqh extends doo<dqz> {
   private static final hx[] a = hx.values();

   public dqh(Codec<dqz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqz> $$0) {
      crt $$1 = $$0.b();
      ht $$2 = $$0.e();
      ate $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dgb $$4 = $$1.a_($$2.c());
         if (!$$4.a(cuc.dV) && !$$4.a(cuc.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cra $$0, ate $$1, ht $$2) {
      $$0.a($$2, cuc.kK.o(), 2);
      ht.a $$3 = new ht.a();
      ht.a $$4 = new ht.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.t($$3)) {
            int $$6 = 0;

            for (hx $$7 : a) {
               dgb $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(cuc.dV) || $$8.a(cuc.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, cuc.kK.o(), 2);
            }
         }
      }
   }

   private void b(cra $$0, ate $$1, ht $$2) {
      ht.a $$3 = new ht.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.t($$3)) {
            dgb $$5 = $$0.a_($$3.c());
            if ($$5.a(cuc.dV) || $$5.a(cuc.kK)) {
               int $$6 = asy.a($$1, 1, 8);
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

   public static void a(cra $$0, ate $$1, ht.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.d())) {
               $$0.a($$2, cuc.oz.o().a(cxo.e, Integer.valueOf(asy.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cuc.oA.o(), 2);
         }

         $$2.c(hx.a);
      }
   }
}
