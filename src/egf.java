import com.mojang.serialization.Codec;

public class egf extends egw<ejh> {
   public egf(Codec<ejh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejh> $$0) {
      jh $$1 = $$0.e();
      dig $$2 = $$0.b();
      bam $$3 = $$0.d();
      if ($$1.v() > $$2.O() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dko.J) && !$$2.a_($$1.e()).a(dko.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jm $$5 : jm.values()) {
            if ($$5 != jm.a && $$2.a_($$1.a($$5)).a(dko.iT)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dko.nr.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jh $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dxv $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dko.J) || $$10.a(dko.iT) || $$10.a(dko.eb)) {
                     for (jm $$11 : jm.values()) {
                        dxv $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dko.nr)) {
                           $$2.a($$9, dko.nr.m(), 2);
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
