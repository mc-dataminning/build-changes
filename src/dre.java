import com.mojang.serialization.Codec;

public class dre extends dpv<dsg> {
   public dre(Codec<dsg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsg> $$0) {
      csu $$1 = $$0.b();
      ht $$2 = $$0.e();
      ht.a $$3 = new ht.a();
      ht.a $$4 = new ht.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dmr.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(hx.a, 1);
            csy $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, cvc.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, cvc.dN.o(), 2);
               dhi $$11 = $$1.a_($$4);
               if ($$11.b(dcj.c)) {
                  $$1.a($$4, $$11.a(dcj.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
