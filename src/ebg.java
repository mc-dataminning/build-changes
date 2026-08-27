import com.mojang.serialization.Codec;

public class ebg extends dzx<eci> {
   public ebg(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      io.a $$3 = new io.a();
      io.a $$4 = new io.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dwt.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(it.a, 1);
            dbw $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dea.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dea.dN.n(), 2);
               drb $$11 = $$1.a_($$4);
               if ($$11.b(dli.c)) {
                  $$1.a($$4, $$11.a(dli.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
