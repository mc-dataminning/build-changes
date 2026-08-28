import com.mojang.serialization.Codec;

public class ebg extends eaz<edk> {
   public ebg(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edk> $$0) {
      dcu $$1 = $$0.b();
      iz $$2 = $$0.e();
      azh $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dsd $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfc.dV) && !$$4.a(dfc.dY) && !$$4.a(dfc.pr)) {
            return false;
         } else {
            $$1.a($$2, dfc.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               iz $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (je $$8 : je.values()) {
                     if ($$1.a_($$6.a($$8)).a(dfc.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dfc.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
