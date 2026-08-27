import com.mojang.serialization.Codec;

public class dzk extends dzd<ebo> {
   public dzk(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      ayg $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dqh $$4 = $$1.a_($$2.c());
         if (!$$4.a(ddg.dV) && !$$4.a(ddg.dY) && !$$4.a(ddg.pr)) {
            return false;
         } else {
            $$1.a($$2, ddg.ec.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               in $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (is $$8 : is.values()) {
                     if ($$1.a_($$6.a($$8)).a(ddg.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, ddg.ec.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
