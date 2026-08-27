import com.mojang.serialization.Codec;

public class dsb extends dru<duf> {
   public dsb(Codec<duf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<duf> $$0) {
      cuk $$1 = $$0.b();
      hx $$2 = $$0.e();
      auv $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         djh $$4 = $$1.a_($$2.c());
         if (!$$4.a(cws.dV) && !$$4.a(cws.dY) && !$$4.a(cws.pr)) {
            return false;
         } else {
            $$1.a($$2, cws.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hx $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ic $$8 : ic.values()) {
                     if ($$1.a_($$6.a($$8)).a(cws.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cws.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
