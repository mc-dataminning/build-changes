import com.mojang.serialization.Codec;

public class ebl extends eax<edi> {
   public ebl(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edi> $$0) {
      int $$1 = 0;
      dcs $$2 = $$0.b();
      iz $$3 = $$0.e();
      azg $$4 = $$0.d();
      int $$5 = $$2.a(dxt.a.d, $$3.u(), $$3.w());
      iz $$6 = new iz($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dfa.G)) {
         dsb $$7 = dfa.mc.o();
         dsb $$8 = dfa.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dfa.G) && $$2.a_($$6.c()).a(dfa.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(djc.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               iz $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dfa.mc)) {
                  $$2.a($$11, $$7.a(djc.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
