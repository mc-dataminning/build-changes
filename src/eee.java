import com.mojang.serialization.Codec;

public class eee extends edq<egb> {
   public eee(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      int $$1 = 0;
      dfd $$2 = $$0.b();
      je $$3 = $$0.e();
      azl $$4 = $$0.d();
      int $$5 = $$2.a(eak.a.d, $$3.u(), $$3.w());
      je $$6 = new je($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dhl.G)) {
         duo $$7 = dhl.mc.o();
         duo $$8 = dhl.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dhl.G) && $$2.a_($$6.d()).a(dhl.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dln.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               je $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dhl.mc)) {
                  $$2.a($$11, $$7.b(dln.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.d();
         }
      }

      return $$1 > 0;
   }
}
