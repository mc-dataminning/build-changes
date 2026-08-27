import com.mojang.serialization.Codec;

public class drj extends drc<dtn> {
   public drj(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      auf $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dip $$4 = $$1.a_($$2.c());
         if (!$$4.a(cwb.dV) && !$$4.a(cwb.dY) && !$$4.a(cwb.pr)) {
            return false;
         } else {
            $$1.a($$2, cwb.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hv $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ia $$8 : ia.values()) {
                     if ($$1.a_($$6.a($$8)).a(cwb.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cwb.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
