import com.mojang.serialization.Codec;

public class dqx extends drn<dty> {
   public dqx(Codec<dty> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dty> $$0) {
      hx $$1 = $$0.e();
      cud $$2 = $$0.b();
      aup $$3 = $$0.d();
      if ($$1.v() > $$2.A_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cwl.G) && !$$2.a_($$1.d()).a(cwl.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ic $$5 : ic.values()) {
            if ($$5 != ic.a && $$2.a_($$1.a($$5)).a(cwl.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cwl.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  hx $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dja $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(cwl.G) || $$10.a(cwl.iC) || $$10.a(cwl.dO)) {
                     for (ic $$11 : ic.values()) {
                        dja $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cwl.mW)) {
                           $$2.a($$9, cwl.mW.o(), 2);
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
