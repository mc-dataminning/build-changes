import com.mojang.serialization.Codec;

public class egw extends egp<eja> {
   public egw(Codec<eja> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eja> $$0) {
      dhx $$1 = $$0.b();
      jh $$2 = $$0.e();
      bac $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dxo $$4 = $$1.a_($$2.d());
         if (!$$4.a(dkf.ei) && !$$4.a(dkf.el) && !$$4.a(dkf.pT)) {
            return false;
         } else {
            $$1.a($$2, dkf.ep.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jh $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jm $$8 : jm.values()) {
                     if ($$1.a_($$6.a($$8)).a(dkf.ep)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dkf.ep.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
