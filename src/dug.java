import com.mojang.serialization.Codec;

public class dug extends dts<dwd> {
   public dug(Codec<dwd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwd> $$0) {
      int $$1 = 0;
      cwi $$2 = $$0.b();
      hz $$3 = $$0.e();
      awo $$4 = $$0.d();
      int $$5 = $$2.a(dqo.a.d, $$3.u(), $$3.w());
      hz $$6 = new hz($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(cyq.G)) {
         dlf $$7 = cyq.mc.o();
         dlf $$8 = cyq.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(cyq.G) && $$2.a_($$6.c()).a(cyq.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(dcr.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               hz $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(cyq.mc)) {
                  $$2.a($$11, $$7.a(dcr.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.c();
         }
      }

      return $$1 > 0;
   }
}
