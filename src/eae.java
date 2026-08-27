import com.mojang.serialization.Codec;

public class eae extends dzx<eci> {
   public eae(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      ayk $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         drb $$4 = $$1.a_($$2.c());
         if (!$$4.a(dea.dV) && !$$4.a(dea.dY) && !$$4.a(dea.pr)) {
            return false;
         } else {
            $$1.a($$2, dea.ec.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               io $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (it $$8 : it.values()) {
                     if ($$1.a_($$6.a($$8)).a(dea.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dea.ec.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
