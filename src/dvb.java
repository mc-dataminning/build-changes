import com.mojang.serialization.Codec;

public class dvb extends duu<dxf> {
   public dvb(Codec<dxf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxf> $$0) {
      cwz $$1 = $$0.b();
      ib $$2 = $$0.e();
      awt $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dme $$4 = $$1.a_($$2.c());
         if (!$$4.a(czh.dV) && !$$4.a(czh.dY) && !$$4.a(czh.pr)) {
            return false;
         } else {
            $$1.a($$2, czh.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ib $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ih $$8 : ih.values()) {
                     if ($$1.a_($$6.a($$8)).a(czh.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, czh.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
