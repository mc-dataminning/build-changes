import com.mojang.serialization.Codec;

public class dok extends dnw<dqh> {
   public dok(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      int $$1 = 0;
      cqp $$2 = $$0.b();
      gw $$3 = $$0.e();
      asc $$4 = $$0.d();
      int $$5 = $$2.a(dks.a.d, $$3.u(), $$3.w());
      gw $$6 = new gw($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(csw.G)) {
         dfj $$7 = csw.mc.n();
         dfj $$8 = csw.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(csw.G) && $$2.a_($$6.c()).a(csw.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(cww.d, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               gw $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(csw.mc)) {
                  $$2.a($$11, $$7.a(cww.d, Integer.valueOf($$4.a(4) + 20)), 2);
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
