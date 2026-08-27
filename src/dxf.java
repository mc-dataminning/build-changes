import com.mojang.serialization.Codec;

public class dxf extends dxv<eag> {
   public dxf(Codec<eag> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      ib $$1 = $$0.e();
      czs $$2 = $$0.b();
      axr $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dca.G) && !$$2.a_($$1.d()).a(dca.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ih $$5 : ih.values()) {
            if ($$5 != ih.a && $$2.a_($$1.a($$5)).a(dca.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dca.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ib $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  doz $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dca.G) || $$10.a(dca.iC) || $$10.a(dca.dO)) {
                     for (ih $$11 : ih.values()) {
                        doz $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dca.mW)) {
                           $$2.a($$9, dca.mW.n(), 2);
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
