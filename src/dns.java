import com.mojang.serialization.Codec;

public class dns extends dnl<dpw> {
   public dns(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      art $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dey $$4 = $$1.a_($$2.c());
         if (!$$4.a(csl.dW) && !$$4.a(csl.dZ) && !$$4.a(csl.pr)) {
            return false;
         } else {
            $$1.a($$2, csl.ed.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gv $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (hb $$8 : hb.values()) {
                     if ($$1.a_($$6.a($$8)).a(csl.ed)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, csl.ed.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
