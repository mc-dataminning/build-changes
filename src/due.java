import com.mojang.serialization.Codec;

public class due extends duu<dxf> {
   public due(Codec<dxf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxf> $$0) {
      ib $$1 = $$0.e();
      cwz $$2 = $$0.b();
      awt $$3 = $$0.d();
      if ($$1.v() > $$2.A_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(czh.G) && !$$2.a_($$1.d()).a(czh.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ih $$5 : ih.values()) {
            if ($$5 != ih.a && $$2.a_($$1.a($$5)).a(czh.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, czh.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ib $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dme $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(czh.G) || $$10.a(czh.iC) || $$10.a(czh.dO)) {
                     for (ih $$11 : ih.values()) {
                        dme $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(czh.mW)) {
                           $$2.a($$9, czh.mW.o(), 2);
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
