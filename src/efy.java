import com.mojang.serialization.Codec;

public class efy extends egp<eja> {
   public efy(Codec<eja> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eja> $$0) {
      jh $$1 = $$0.e();
      dhx $$2 = $$0.b();
      bac $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dkf.J) && !$$2.a_($$1.e()).a(dkf.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jm $$5 : jm.values()) {
            if ($$5 != jm.a && $$2.a_($$1.a($$5)).a(dkf.ja)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dkf.ny.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jh $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dxo $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dkf.J) || $$10.a(dkf.ja) || $$10.a(dkf.eb)) {
                     for (jm $$11 : jm.values()) {
                        dxo $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dkf.ny)) {
                           $$2.a($$9, dkf.ny.m(), 2);
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
