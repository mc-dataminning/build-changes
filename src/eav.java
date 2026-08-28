import com.mojang.serialization.Codec;

public class eav extends ebl<edw> {
   public eav(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ja $$1 = $$0.e();
      ddc $$2 = $$0.b();
      ayo $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dfk.G) && !$$2.a_($$1.d()).a(dfk.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jf $$5 : jf.values()) {
            if ($$5 != jf.a && $$2.a_($$1.a($$5)).a(dfk.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dfk.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ja $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dsl $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dfk.G) || $$10.a(dfk.iC) || $$10.a(dfk.dO)) {
                     for (jf $$11 : jf.values()) {
                        dsl $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dfk.mW)) {
                           $$2.a($$9, dfk.mW.o(), 2);
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
