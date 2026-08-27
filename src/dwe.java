import com.mojang.serialization.Codec;

public class dwe extends dvq<dyb> {
   public dwe(Codec<dyb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyb> $$0) {
      int $$1 = 0;
      cxu $$2 = $$0.b();
      ib $$3 = $$0.e();
      axd $$4 = $$0.d();
      int $$5 = $$2.a(dsm.a.d, $$3.u(), $$3.w());
      ib $$6 = new ib($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dac.G)) {
         dmz $$7 = dac.mc.o();
         dmz $$8 = dac.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dac.G) && $$2.a_($$6.c()).a(dac.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(ded.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ib $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dac.mc)) {
                  $$2.a($$11, $$7.a(ded.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.c();
         }
      }

      return $$1 > 0;
   }
}
