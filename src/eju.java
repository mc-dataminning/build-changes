import com.mojang.serialization.Codec;

public class eju extends ekm<emy> {
   public eju(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      iw $$1 = $$0.e();
      dky $$2 = $$0.b();
      azz $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dng.J) && !$$2.a_($$1.e()).a(dng.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jc $$5 : jc.values()) {
            if ($$5 != jc.a && $$2.a_($$1.a($$5)).a(dng.je)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dng.nC.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  iw $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  ebg $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dng.J) || $$10.a(dng.je) || $$10.a(dng.ee)) {
                     for (jc $$11 : jc.values()) {
                        ebg $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dng.nC)) {
                           $$2.a($$9, dng.nC.m(), 2);
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
