import com.mojang.serialization.Codec;

public class eld extends ekw<eni> {
   public eld(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      bai $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         ebq $$4 = $$1.a_($$2.d());
         if (!$$4.a(dnq.em) && !$$4.a(dnq.ep) && !$$4.a(dnq.pZ)) {
            return false;
         } else {
            $$1.a($$2, dnq.et.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               iw $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jc $$8 : jc.values()) {
                     if ($$1.a_($$6.a($$8)).a(dnq.et)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dnq.et.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
