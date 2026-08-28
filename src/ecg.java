import com.mojang.serialization.Codec;

public class ecg extends eax<edi> {
   public ecg(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edi> $$0) {
      dcs $$1 = $$0.b();
      iz $$2 = $$0.e();
      iz.a $$3 = new iz.a();
      iz.a $$4 = new iz.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dxt.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(je.a, 1);
            dcw $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dfa.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dfa.dN.o(), 2);
               dsb $$11 = $$1.a_($$4);
               if ($$11.b(dmi.c)) {
                  $$1.a($$4, $$11.a(dmi.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
