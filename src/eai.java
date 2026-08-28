import com.mojang.serialization.Codec;

public class eai extends eay<edj> {
   public eai(Codec<edj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edj> $$0) {
      iz $$1 = $$0.e();
      dct $$2 = $$0.b();
      azh $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dfb.G) && !$$2.a_($$1.d()).a(dfb.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (je $$5 : je.values()) {
            if ($$5 != je.a && $$2.a_($$1.a($$5)).a(dfb.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dfb.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  iz $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dsc $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dfb.G) || $$10.a(dfb.iC) || $$10.a(dfb.dO)) {
                     for (je $$11 : je.values()) {
                        dsc $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dfb.mW)) {
                           $$2.a($$9, dfb.mW.o(), 2);
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
