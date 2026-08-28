import com.mojang.serialization.Codec;

public class efh extends efy<eij> {
   public efh(Codec<eij> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eij> $$0) {
      ji $$1 = $$0.e();
      dhg $$2 = $$0.b();
      azh $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(djo.J) && !$$2.a_($$1.e()).a(djo.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jn $$5 : jn.values()) {
            if ($$5 != jn.a && $$2.a_($$1.a($$5)).a(djo.ja)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, djo.ny.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  ji $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dwx $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(djo.J) || $$10.a(djo.ja) || $$10.a(djo.eb)) {
                     for (jn $$11 : jn.values()) {
                        dwx $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(djo.ny)) {
                           $$2.a($$9, djo.ny.m(), 2);
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
