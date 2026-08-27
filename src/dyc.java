import com.mojang.serialization.Codec;

public class dyc extends dxv<eag> {
   public dyc(Codec<eag> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      axr $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         doz $$4 = $$1.a_($$2.c());
         if (!$$4.a(dca.dV) && !$$4.a(dca.dY) && !$$4.a(dca.pr)) {
            return false;
         } else {
            $$1.a($$2, dca.ec.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ib $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ih $$8 : ih.values()) {
                     if ($$1.a_($$6.a($$8)).a(dca.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dca.ec.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
