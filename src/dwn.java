import com.mojang.serialization.Codec;

public class dwn extends duu<dxf> {
   private static final ih[] a = ih.values();

   public dwn(Codec<dxf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxf> $$0) {
      cwz $$1 = $$0.b();
      ib $$2 = $$0.e();
      awt $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dme $$4 = $$1.a_($$2.c());
         if (!$$4.a(czh.dV) && !$$4.a(czh.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cwf $$0, awt $$1, ib $$2) {
      $$0.a($$2, czh.kK.o(), 2);
      ib.a $$3 = new ib.a();
      ib.a $$4 = new ib.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ih $$7 : a) {
               dme $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(czh.dV) || $$8.a(czh.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, czh.kK.o(), 2);
            }
         }
      }
   }

   private void b(cwf $$0, awt $$1, ib $$2) {
      ib.a $$3 = new ib.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dme $$5 = $$0.a_($$3.c());
            if ($$5.a(czh.dV) || $$5.a(czh.kK)) {
               int $$6 = awm.a($$1, 1, 8);
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

   public static void a(cwf $$0, awt $$1, ib.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, czh.oz.o().a(dcu.e, Integer.valueOf(awm.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, czh.oA.o(), 2);
         }

         $$2.c(ih.a);
      }
   }
}
