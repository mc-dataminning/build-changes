import com.mojang.serialization.Codec;

public class dpk extends dqa<dsl> {
   public dpk(Codec<dsl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsl> $$0) {
      hx $$1 = $$0.e();
      csz $$2 = $$0.b();
      atw $$3 = $$0.d();
      if ($$1.v() > $$2.A_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cvh.G) && !$$2.a_($$1.d()).a(cvh.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ib $$5 : ib.values()) {
            if ($$5 != ib.a && $$2.a_($$1.a($$5)).a(cvh.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cvh.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  hx $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dhn $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(cvh.G) || $$10.a(cvh.iC) || $$10.a(cvh.dO)) {
                     for (ib $$11 : ib.values()) {
                        dhn $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cvh.mW)) {
                           $$2.a($$9, cvh.mW.o(), 2);
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
