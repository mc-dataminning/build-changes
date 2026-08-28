import com.mojang.serialization.Codec;

public class ekr extends ekk<emw> {
   public ekr(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      azx $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         ebe $$4 = $$1.a_($$2.d());
         if (!$$4.a(dne.em) && !$$4.a(dne.ep) && !$$4.a(dne.pZ)) {
            return false;
         } else {
            $$1.a($$2, dne.et.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               iv $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jb $$8 : jb.values()) {
                     if ($$1.a_($$6.a($$8)).a(dne.et)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dne.et.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
