import com.mojang.serialization.Codec;

public class dva extends dvq<dyb> {
   public dva(Codec<dyb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyb> $$0) {
      ib $$1 = $$0.e();
      cxu $$2 = $$0.b();
      axd $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dac.G) && !$$2.a_($$1.d()).a(dac.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ih $$5 : ih.values()) {
            if ($$5 != ih.a && $$2.a_($$1.a($$5)).a(dac.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dac.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ib $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dmz $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dac.G) || $$10.a(dac.iC) || $$10.a(dac.dO)) {
                     for (ih $$11 : ih.values()) {
                        dmz $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dac.mW)) {
                           $$2.a($$9, dac.mW.o(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
