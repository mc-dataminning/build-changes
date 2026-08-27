import com.mojang.serialization.Codec;

public class ebi extends dzz<eck> {
   public ebi(Codec<eck> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eck> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      io.a $$3 = new io.a();
      io.a $$4 = new io.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dwv.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(it.a, 1);
            dby $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dec.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dec.dN.n(), 2);
               drd $$11 = $$1.a_($$4);
               if ($$11.b(dlk.c)) {
                  $$1.a($$4, $$11.a(dlk.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
