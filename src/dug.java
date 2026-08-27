import com.mojang.serialization.Codec;

public class dug extends dtz<dwk> {
   public dug(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      awp $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dlj $$4 = $$1.a_($$2.c());
         if (!$$4.a(cyu.dV) && !$$4.a(cyu.dY) && !$$4.a(cyu.pr)) {
            return false;
         } else {
            $$1.a($$2, cyu.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hz $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ie $$8 : ie.values()) {
                     if ($$1.a_($$6.a($$8)).a(cyu.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cyu.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
