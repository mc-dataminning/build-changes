import com.mojang.serialization.Codec;

public class eao extends ebe<edp> {
   public eao(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edp> $$0) {
      ja $$1 = $$0.e();
      dcz $$2 = $$0.b();
      aym $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dfh.G) && !$$2.a_($$1.d()).a(dfh.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jf $$5 : jf.values()) {
            if ($$5 != jf.a && $$2.a_($$1.a($$5)).a(dfh.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dfh.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ja $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dsh $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dfh.G) || $$10.a(dfh.iC) || $$10.a(dfh.dO)) {
                     for (jf $$11 : jf.values()) {
                        dsh $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dfh.mW)) {
                           $$2.a($$9, dfh.mW.o(), 2);
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
