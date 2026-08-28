import com.mojang.serialization.Codec;

public class ebh extends eat<ede> {
   public ebh(Codec<ede> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ede> $$0) {
      int $$1 = 0;
      dco $$2 = $$0.b();
      iz $$3 = $$0.e();
      azc $$4 = $$0.d();
      int $$5 = $$2.a(dxp.a.d, $$3.u(), $$3.w());
      iz $$6 = new iz($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dew.G)) {
         drx $$7 = dew.mc.n();
         drx $$8 = dew.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dew.G) && $$2.a_($$6.c()).a(dew.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(diy.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               iz $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dew.mc)) {
                  $$2.a($$11, $$7.a(diy.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
