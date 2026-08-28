import com.mojang.serialization.Codec;

public class edd extends edu<egf> {
   public edd(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      jf $$1 = $$0.e();
      dfg $$2 = $$0.b();
      azn $$3 = $$0.d();
      if ($$1.v() > $$2.N() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dho.G) && !$$2.a_($$1.e()).a(dho.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jk $$5 : jk.values()) {
            if ($$5 != jk.a && $$2.a_($$1.a($$5)).a(dho.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dho.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jf $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dus $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dho.G) || $$10.a(dho.iC) || $$10.a(dho.dO)) {
                     for (jk $$11 : jk.values()) {
                        dus $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dho.mW)) {
                           $$2.a($$9, dho.mW.n(), 2);
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
