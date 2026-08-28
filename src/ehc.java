import com.mojang.serialization.Codec;

public class ehc extends egv<ejg> {
   public ehc(Codec<ejg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejg> $$0) {
      dif $$1 = $$0.b();
      jh $$2 = $$0.e();
      bam $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dxu $$4 = $$1.a_($$2.d());
         if (!$$4.a(dkn.ei) && !$$4.a(dkn.el) && !$$4.a(dkn.pM)) {
            return false;
         } else {
            $$1.a($$2, dkn.ep.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jh $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jm $$8 : jm.values()) {
                     if ($$1.a_($$6.a($$8)).a(dkn.ep)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dkn.ep.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
