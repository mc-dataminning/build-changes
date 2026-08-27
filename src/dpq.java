import com.mojang.serialization.Codec;

public class dpq extends dpj<dru> {
   public dpq(Codec<dru> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dru> $$0) {
      csm $$1 = $$0.b();
      ht $$2 = $$0.e();
      ato $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dgw $$4 = $$1.a_($$2.c());
         if (!$$4.a(cuv.dV) && !$$4.a(cuv.dY) && !$$4.a(cuv.pr)) {
            return false;
         } else {
            $$1.a($$2, cuv.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ht $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (hx $$8 : hx.values()) {
                     if ($$1.a_($$6.a($$8)).a(cuv.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cuv.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
