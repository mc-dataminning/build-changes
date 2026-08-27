import com.mojang.serialization.Codec;

public class eal extends dzx<eci> {
   public eal(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      int $$1 = 0;
      dbs $$2 = $$0.b();
      io $$3 = $$0.e();
      ayk $$4 = $$0.d();
      int $$5 = $$2.a(dwt.a.d, $$3.u(), $$3.w());
      io $$6 = new io($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dea.G)) {
         drb $$7 = dea.mc.n();
         drb $$8 = dea.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dea.G) && $$2.a_($$6.c()).a(dea.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(dic.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               io $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dea.mc)) {
                  $$2.a($$11, $$7.a(dic.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
