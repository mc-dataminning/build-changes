import com.mojang.serialization.Codec;

public class dtz extends dts<dwd> {
   public dtz(Codec<dwd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwd> $$0) {
      cwi $$1 = $$0.b();
      hz $$2 = $$0.e();
      awo $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dlf $$4 = $$1.a_($$2.c());
         if (!$$4.a(cyq.dV) && !$$4.a(cyq.dY) && !$$4.a(cyq.pr)) {
            return false;
         } else {
            $$1.a($$2, cyq.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hz $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ie $$8 : ie.values()) {
                     if ($$1.a_($$6.a($$8)).a(cyq.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cyq.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
