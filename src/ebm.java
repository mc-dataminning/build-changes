import com.mojang.serialization.Codec;

public class ebm extends eay<edj> {
   public ebm(Codec<edj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edj> $$0) {
      int $$1 = 0;
      dct $$2 = $$0.b();
      iz $$3 = $$0.e();
      azh $$4 = $$0.d();
      int $$5 = $$2.a(dxu.a.d, $$3.u(), $$3.w());
      iz $$6 = new iz($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dfb.G)) {
         dsc $$7 = dfb.mc.o();
         dsc $$8 = dfb.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dfb.G) && $$2.a_($$6.c()).a(dfb.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(djd.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               iz $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dfb.mc)) {
                  $$2.a($$11, $$7.a(djd.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
