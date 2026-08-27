import com.mojang.serialization.Codec;

public class dnu extends dnn<dpy> {
   public dnu(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpy> $$0) {
      cqg $$1 = $$0.b();
      gu $$2 = $$0.e();
      aru $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dfa $$4 = $$1.a_($$2.c());
         if (!$$4.a(csn.dW) && !$$4.a(csn.dZ) && !$$4.a(csn.pr)) {
            return false;
         } else {
            $$1.a($$2, csn.ed.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gu $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ha $$8 : ha.values()) {
                     if ($$1.a_($$6.a($$8)).a(csn.ed)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, csn.ed.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
