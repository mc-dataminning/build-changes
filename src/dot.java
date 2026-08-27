import com.mojang.serialization.Codec;

public class dot extends dpj<dru> {
   public dot(Codec<dru> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dru> $$0) {
      ht $$1 = $$0.e();
      csm $$2 = $$0.b();
      ato $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cuv.G) && !$$2.a_($$1.d()).a(cuv.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (hx $$5 : hx.values()) {
            if ($$5 != hx.a && $$2.a_($$1.a($$5)).a(cuv.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cuv.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ht $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dgw $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(cuv.G) || $$10.a(cuv.iC) || $$10.a(cuv.dO)) {
                     for (hx $$11 : hx.values()) {
                        dgw $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cuv.mW)) {
                           $$2.a($$9, cuv.mW.o(), 2);
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
