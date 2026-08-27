import com.mojang.serialization.Codec;

public class dna extends dnq<dqb> {
   public dna(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqb> $$0) {
      gw $$1 = $$0.e();
      cqv $$2 = $$0.b();
      ash $$3 = $$0.d();
      if ($$1.v() > $$2.y_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cte.G) && !$$2.a_($$1.d()).a(cte.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ha $$5 : ha.values()) {
            if ($$5 != ha.a && $$2.a_($$1.a($$5)).a(cte.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cte.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  gw $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dfd $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(cte.G) || $$10.a(cte.iC) || $$10.a(cte.dO)) {
                     for (ha $$11 : ha.values()) {
                        dfd $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cte.mW)) {
                           $$2.a($$9, cte.mW.o(), 2);
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
