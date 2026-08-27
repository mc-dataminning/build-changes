import com.mojang.serialization.Codec;

public class dni extends dny<dqj> {
   public dni(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqj> $$0) {
      gw $$1 = $$0.e();
      cqr $$2 = $$0.b();
      ase $$3 = $$0.d();
      if ($$1.v() > $$2.y_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(csy.G) && !$$2.a_($$1.d()).a(csy.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (hc $$5 : hc.values()) {
            if ($$5 != hc.a && $$2.a_($$1.a($$5)).a(csy.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, csy.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  gw $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dfl $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(csy.G) || $$10.a(csy.iC) || $$10.a(csy.dO)) {
                     for (hc $$11 : hc.values()) {
                        dfl $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(csy.mW)) {
                           $$2.a($$9, csy.mW.n(), 2);
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
