import com.mojang.serialization.Codec;

public class ebi extends eca<eer> {
   public ebi(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();
      ayt $$3 = $$0.d();
      if ($$1.v() > $$2.A_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dfe.al) && !$$2.a_($$1.d()).a(dfe.al)) {
         return false;
      } else {
         boolean $$4 = false;

         for (iw $$5 : iw.values()) {
            if ($$5 != iw.a && $$2.a_($$1.a($$5)).a(dfe.jw)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dfe.nU.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ir $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dtc $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dfe.al) || $$10.a(dfe.jw) || $$10.a(dfe.eC)) {
                     for (iw $$11 : iw.values()) {
                        dtc $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dfe.nU)) {
                           $$2.a($$9, dfe.nU.n(), 2);
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
