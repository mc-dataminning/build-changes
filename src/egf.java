import com.mojang.serialization.Codec;

public class egf extends efy<eij> {
   public egf(Codec<eij> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eij> $$0) {
      dhg $$1 = $$0.b();
      ji $$2 = $$0.e();
      azh $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dwx $$4 = $$1.a_($$2.d());
         if (!$$4.a(djo.ei) && !$$4.a(djo.el) && !$$4.a(djo.pT)) {
            return false;
         } else {
            $$1.a($$2, djo.ep.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ji $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jn $$8 : jn.values()) {
                     if ($$1.a_($$6.a($$8)).a(djo.ep)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, djo.ep.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
