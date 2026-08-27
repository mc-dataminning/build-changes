import com.mojang.serialization.Codec;

public class drm extends dsc<dun> {
   public drm(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      hx $$1 = $$0.e();
      cus $$2 = $$0.b();
      auw $$3 = $$0.d();
      if ($$1.v() > $$2.A_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cxa.G) && !$$2.a_($$1.d()).a(cxa.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ic $$5 : ic.values()) {
            if ($$5 != ic.a && $$2.a_($$1.a($$5)).a(cxa.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cxa.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  hx $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  djp $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(cxa.G) || $$10.a(cxa.iC) || $$10.a(cxa.dO)) {
                     for (ic $$11 : ic.values()) {
                        djp $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cxa.mW)) {
                           $$2.a($$9, cxa.mW.o(), 2);
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
