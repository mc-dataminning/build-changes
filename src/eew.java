import com.mojang.serialization.Codec;

public class eew extends eep<eha> {
   public eew(Codec<eha> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<eha> $$0) {
      dgd $$1 = $$0.b();
      jh $$2 = $$0.e();
      azv $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dvo $$4 = $$1.a_($$2.d());
         if (!$$4.a(dil.dV) && !$$4.a(dil.dY) && !$$4.a(dil.pr)) {
            return false;
         } else {
            $$1.a($$2, dil.ec.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jh $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jm $$8 : jm.values()) {
                     if ($$1.a_($$6.a($$8)).a(dil.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dil.ec.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
