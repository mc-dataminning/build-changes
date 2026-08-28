import com.mojang.serialization.Codec;

public class eka extends ejt<eme> {
   public eka(Codec<eme> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<eme> $$0) {
      dkg $$1 = $$0.b();
      iv $$2 = $$0.e();
      azv $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         eao $$4 = $$1.a_($$2.d());
         if (!$$4.a(dmo.em) && !$$4.a(dmo.ep) && !$$4.a(dmo.pZ)) {
            return false;
         } else {
            $$1.a($$2, dmo.et.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               iv $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jb $$8 : jb.values()) {
                     if ($$1.a_($$6.a($$8)).a(dmo.et)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dmo.et.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
