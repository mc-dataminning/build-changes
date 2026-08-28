import com.mojang.serialization.Codec;

public class ebs extends ebl<edw> {
   public ebs(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      ayo $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dsl $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfk.dV) && !$$4.a(dfk.dY) && !$$4.a(dfk.pr)) {
            return false;
         } else {
            $$1.a($$2, dfk.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ja $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (jf $$8 : jf.values()) {
                     if ($$1.a_($$6.a($$8)).a(dfk.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dfk.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
