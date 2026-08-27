import com.mojang.serialization.Codec;

public class ech extends eca<eer> {
   public ech(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      ayt $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dtc $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfe.eJ) && !$$4.a(dfe.eM) && !$$4.a(dfe.qC)) {
            return false;
         } else {
            $$1.a($$2, dfe.eQ.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ir $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (iw $$8 : iw.values()) {
                     if ($$1.a_($$6.a($$8)).a(dfe.eQ)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dfe.eQ.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
