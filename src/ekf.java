import com.mojang.serialization.Codec;

public class ekf extends ejy<emj> {
   public ekf(Codec<emj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emj> $$0) {
      dkl $$1 = $$0.b();
      iv $$2 = $$0.e();
      azv $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         eat $$4 = $$1.a_($$2.d());
         if (!$$4.a(dmt.em) && !$$4.a(dmt.ep) && !$$4.a(dmt.pZ)) {
            return false;
         } else {
            $$1.a($$2, dmt.et.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               iv $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jb $$8 : jb.values()) {
                     if ($$1.a_($$6.a($$8)).a(dmt.et)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dmt.et.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
