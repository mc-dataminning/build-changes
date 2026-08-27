import com.mojang.serialization.Codec;

public class dqm extends drc<dtn> {
   public dqm(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      hv $$1 = $$0.e();
      ctt $$2 = $$0.b();
      auf $$3 = $$0.d();
      if ($$1.v() > $$2.A_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cwb.G) && !$$2.a_($$1.d()).a(cwb.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ia $$5 : ia.values()) {
            if ($$5 != ia.a && $$2.a_($$1.a($$5)).a(cwb.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cwb.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  hv $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dip $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(cwb.G) || $$10.a(cwb.iC) || $$10.a(cwb.dO)) {
                     for (ia $$11 : ia.values()) {
                        dip $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cwb.mW)) {
                           $$2.a($$9, cwb.mW.o(), 2);
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
