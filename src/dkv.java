import com.mojang.serialization.Codec;

public class dkv extends dko<dmz> {
   public dkv(Codec<dmz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      apf $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dcb $$4 = $$1.a_($$2.c());
         if (!$$4.a(cpo.dW) && !$$4.a(cpo.dZ) && !$$4.a(cpo.pr)) {
            return false;
         } else {
            $$1.a($$2, cpo.ed.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gu $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ha $$8 : ha.values()) {
                     if ($$1.a_($$6.a($$8)).a(cpo.ed)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cpo.ed.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
