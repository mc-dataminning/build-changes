import com.mojang.serialization.Codec;

public class efx extends ego<eiz> {
   public efx(Codec<eiz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<eiz> $$0) {
      jh $$1 = $$0.e();
      dhy $$2 = $$0.b();
      bam $$3 = $$0.d();
      if ($$1.v() > $$2.O() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dkg.J) && !$$2.a_($$1.e()).a(dkg.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jm $$5 : jm.values()) {
            if ($$5 != jm.a && $$2.a_($$1.a($$5)).a(dkg.iT)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dkg.nr.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jh $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dxn $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dkg.J) || $$10.a(dkg.iT) || $$10.a(dkg.eb)) {
                     for (jm $$11 : jm.values()) {
                        dxn $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dkg.nr)) {
                           $$2.a($$9, dkg.nr.m(), 2);
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
