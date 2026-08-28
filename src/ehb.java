import com.mojang.serialization.Codec;

public class ehb extends egu<ejf> {
   public ehb(Codec<ejf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<ejf> $$0) {
      dhy $$1 = $$0.b();
      ji $$2 = $$0.e();
      azh $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dxq $$4 = $$1.a_($$2.d());
         if (!$$4.a(dkg.ei) && !$$4.a(dkg.el) && !$$4.a(dkg.pT)) {
            return false;
         } else {
            $$1.a($$2, dkg.ep.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ji $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jn $$8 : jn.values()) {
                     if ($$1.a_($$6.a($$8)).a(dkg.ep)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dkg.ep.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
