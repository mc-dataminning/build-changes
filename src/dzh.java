import com.mojang.serialization.Codec;

public class dzh extends dzx<eci> {
   public dzh(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      io $$1 = $$0.e();
      dbs $$2 = $$0.b();
      ayk $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dea.G) && !$$2.a_($$1.d()).a(dea.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (it $$5 : it.values()) {
            if ($$5 != it.a && $$2.a_($$1.a($$5)).a(dea.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dea.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  io $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  drb $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dea.G) || $$10.a(dea.iC) || $$10.a(dea.dO)) {
                     for (it $$11 : it.values()) {
                        drb $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dea.mW)) {
                           $$2.a($$9, dea.mW.n(), 2);
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
