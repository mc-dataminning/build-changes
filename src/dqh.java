import com.mojang.serialization.Codec;

public class dqh extends dqa<dsl> {
   public dqh(Codec<dsl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsl> $$0) {
      csz $$1 = $$0.b();
      hx $$2 = $$0.e();
      atw $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dhn $$4 = $$1.a_($$2.c());
         if (!$$4.a(cvh.dV) && !$$4.a(cvh.dY) && !$$4.a(cvh.pr)) {
            return false;
         } else {
            $$1.a($$2, cvh.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hx $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ib $$8 : ib.values()) {
                     if ($$1.a_($$6.a($$8)).a(cvh.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cvh.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
