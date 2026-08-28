import com.mojang.serialization.Codec;

public class ecz extends edq<egb> {
   public ecz(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      je $$1 = $$0.e();
      dfd $$2 = $$0.b();
      azl $$3 = $$0.d();
      if ($$1.v() > $$2.N() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dhl.G) && !$$2.a_($$1.e()).a(dhl.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jj $$5 : jj.values()) {
            if ($$5 != jj.a && $$2.a_($$1.a($$5)).a(dhl.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dhl.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  je $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  duo $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dhl.G) || $$10.a(dhl.iC) || $$10.a(dhl.dO)) {
                     for (jj $$11 : jj.values()) {
                        duo $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dhl.mW)) {
                           $$2.a($$9, dhl.mW.o(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
