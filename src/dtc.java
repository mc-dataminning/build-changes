import com.mojang.serialization.Codec;

public class dtc extends dts<dwd> {
   public dtc(Codec<dwd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwd> $$0) {
      hz $$1 = $$0.e();
      cwi $$2 = $$0.b();
      awo $$3 = $$0.d();
      if ($$1.v() > $$2.A_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cyq.G) && !$$2.a_($$1.d()).a(cyq.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ie $$5 : ie.values()) {
            if ($$5 != ie.a && $$2.a_($$1.a($$5)).a(cyq.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cyq.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  hz $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dlf $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(cyq.G) || $$10.a(cyq.iC) || $$10.a(cyq.dO)) {
                     for (ie $$11 : ie.values()) {
                        dlf $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cyq.mW)) {
                           $$2.a($$9, cyq.mW.o(), 2);
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
