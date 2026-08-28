import com.mojang.serialization.Codec;

public class ead extends eat<ede> {
   public ead(Codec<ede> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ede> $$0) {
      iz $$1 = $$0.e();
      dco $$2 = $$0.b();
      azc $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dew.G) && !$$2.a_($$1.d()).a(dew.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (je $$5 : je.values()) {
            if ($$5 != je.a && $$2.a_($$1.a($$5)).a(dew.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dew.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  iz $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  drx $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dew.G) || $$10.a(dew.iC) || $$10.a(dew.dO)) {
                     for (je $$11 : je.values()) {
                        drx $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dew.mW)) {
                           $$2.a($$9, dew.mW.n(), 2);
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
