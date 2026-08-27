import com.mojang.serialization.Codec;

public class dsq extends dsc<dun> {
   public dsq(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      int $$1 = 0;
      cus $$2 = $$0.b();
      hx $$3 = $$0.e();
      auw $$4 = $$0.d();
      int $$5 = $$2.a(doy.a.d, $$3.u(), $$3.w());
      hx $$6 = new hx($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(cxa.G)) {
         djp $$7 = cxa.mc.o();
         djp $$8 = cxa.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(cxa.G) && $$2.a_($$6.c()).a(cxa.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(dbb.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               hx $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(cxa.mc)) {
                  $$2.a($$11, $$7.a(dbb.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
