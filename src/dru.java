import com.mojang.serialization.Codec;

public class dru extends drn<dty> {
   public dru(Codec<dty> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dty> $$0) {
      cud $$1 = $$0.b();
      hx $$2 = $$0.e();
      aup $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dja $$4 = $$1.a_($$2.c());
         if (!$$4.a(cwl.dV) && !$$4.a(cwl.dY) && !$$4.a(cwl.pr)) {
            return false;
         } else {
            $$1.a($$2, cwl.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hx $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ic $$8 : ic.values()) {
                     if ($$1.a_($$6.a($$8)).a(cwl.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cwl.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
