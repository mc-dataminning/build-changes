import com.mojang.serialization.Codec;

public class eco extends eca<eel> {
   public eco(Codec<eel> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eel> $$0) {
      int $$1 = 0;
      ddq $$2 = $$0.b();
      jd $$3 = $$0.e();
      ayv $$4 = $$0.d();
      int $$5 = $$2.a(dyv.a.d, $$3.u(), $$3.w());
      jd $$6 = new jd($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dfy.G)) {
         dta $$7 = dfy.mc.o();
         dta $$8 = dfy.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dfy.G) && $$2.a_($$6.c()).a(dfy.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(dka.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               jd $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dfy.mc)) {
                  $$2.a($$11, $$7.a(dka.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
