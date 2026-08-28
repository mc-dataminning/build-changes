import com.mojang.serialization.Codec;

public class efd extends eew<ehh> {
   public efd(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehh> $$0) {
      dgk $$1 = $$0.b();
      jh $$2 = $$0.e();
      azu $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dvv $$4 = $$1.a_($$2.d());
         if (!$$4.a(dis.dV) && !$$4.a(dis.dY) && !$$4.a(dis.pr)) {
            return false;
         } else {
            $$1.a($$2, dis.ec.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jh $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jm $$8 : jm.values()) {
                     if ($$1.a_($$6.a($$8)).a(dis.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dis.ec.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
