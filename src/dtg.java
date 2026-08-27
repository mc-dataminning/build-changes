import com.mojang.serialization.Codec;

public class dtg extends drn<dty> {
   private static final ic[] a = ic.values();

   public dtg(Codec<dty> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dty> $$0) {
      cud $$1 = $$0.b();
      hx $$2 = $$0.e();
      aup $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dja $$4 = $$1.a_($$2.c());
         if (!$$4.a(cwl.dV) && !$$4.a(cwl.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(ctj $$0, aup $$1, hx $$2) {
      $$0.a($$2, cwl.kK.o(), 2);
      hx.a $$3 = new hx.a();
      hx.a $$4 = new hx.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ic $$7 : a) {
               dja $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(cwl.dV) || $$8.a(cwl.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, cwl.kK.o(), 2);
            }
         }
      }
   }

   private void b(ctj $$0, aup $$1, hx $$2) {
      hx.a $$3 = new hx.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dja $$5 = $$0.a_($$3.c());
            if ($$5.a(cwl.dV) || $$5.a(cwl.kK)) {
               int $$6 = aui.a($$1, 1, 8);
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

   public static void a(ctj $$0, aup $$1, hx.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, cwl.oz.o().a(czy.e, Integer.valueOf(aui.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cwl.oA.o(), 2);
         }

         $$2.c(ic.a);
      }
   }
}
