import com.mojang.serialization.Codec;

public class dnx extends dnq<dqb> {
   public dnx(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqb> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      ash $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dfd $$4 = $$1.a_($$2.c());
         if (!$$4.a(cte.dV) && !$$4.a(cte.dY) && !$$4.a(cte.pr)) {
            return false;
         } else {
            $$1.a($$2, cte.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gw $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ha $$8 : ha.values()) {
                     if ($$1.a_($$6.a($$8)).a(cte.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cte.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
