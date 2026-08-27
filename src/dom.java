import com.mojang.serialization.Codec;

public class dom extends dny<dqj> {
   public dom(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqj> $$0) {
      int $$1 = 0;
      cqr $$2 = $$0.b();
      gw $$3 = $$0.e();
      ase $$4 = $$0.d();
      int $$5 = $$2.a(dku.a.d, $$3.u(), $$3.w());
      gw $$6 = new gw($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(csy.G)) {
         dfl $$7 = csy.mc.n();
         dfl $$8 = csy.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(csy.G) && $$2.a_($$6.c()).a(csy.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(cwy.d, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               gw $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(csy.mc)) {
                  $$2.a($$11, $$7.a(cwy.d, Integer.valueOf($$4.a(4) + 20)), 2);
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
