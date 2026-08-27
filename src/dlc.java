import com.mojang.serialization.Codec;

public class dlc extends dko<dmz> {
   public dlc(Codec<dmz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      int $$1 = 0;
      cng $$2 = $$0.b();
      gu $$3 = $$0.e();
      apf $$4 = $$0.d();
      int $$5 = $$2.a(dhk.a.d, $$3.u(), $$3.w());
      gu $$6 = new gu($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(cpo.G)) {
         dcb $$7 = cpo.mc.n();
         dcb $$8 = cpo.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(cpo.G) && $$2.a_($$6.c()).a(cpo.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(cto.d, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               gu $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(cpo.mc)) {
                  $$2.a($$11, $$7.a(cto.d, Integer.valueOf($$4.a(4) + 20)), 2);
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
