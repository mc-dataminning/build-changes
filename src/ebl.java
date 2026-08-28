import com.mojang.serialization.Codec;

public class ebl extends ebe<edp> {
   public ebl(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edp> $$0) {
      dcz $$1 = $$0.b();
      ja $$2 = $$0.e();
      aym $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dsh $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfh.dV) && !$$4.a(dfh.dY) && !$$4.a(dfh.pr)) {
            return false;
         } else {
            $$1.a($$2, dfh.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ja $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (jf $$8 : jf.values()) {
                     if ($$1.a_($$6.a($$8)).a(dfh.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dfh.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
