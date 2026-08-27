import com.mojang.serialization.Codec;

public class dsv extends drc<dtn> {
   private static final ia[] a = ia.values();

   public dsv(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      auf $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dip $$4 = $$1.a_($$2.c());
         if (!$$4.a(cwb.dV) && !$$4.a(cwb.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(csz $$0, auf $$1, hv $$2) {
      $$0.a($$2, cwb.kK.o(), 2);
      hv.a $$3 = new hv.a();
      hv.a $$4 = new hv.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.t($$3)) {
            int $$6 = 0;

            for (ia $$7 : a) {
               dip $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(cwb.dV) || $$8.a(cwb.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, cwb.kK.o(), 2);
            }
         }
      }
   }

   private void b(csz $$0, auf $$1, hv $$2) {
      hv.a $$3 = new hv.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.t($$3)) {
            dip $$5 = $$0.a_($$3.c());
            if ($$5.a(cwb.dV) || $$5.a(cwb.kK)) {
               int $$6 = aty.a($$1, 1, 8);
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

   public static void a(csz $$0, auf $$1, hv.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.d())) {
               $$0.a($$2, cwb.oz.o().a(czo.e, Integer.valueOf(aty.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cwb.oA.o(), 2);
         }

         $$2.c(ia.a);
      }
   }
}
