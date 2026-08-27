import com.mojang.serialization.Codec;

public class dou extends dnl<dpw> {
   public dou(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      gv.a $$3 = new gv.a();
      gv.a $$4 = new gv.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dkh.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(hb.a, 1);
            cqi $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, csl.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, csl.dN.n(), 2);
               dey $$11 = $$1.a_($$4);
               if ($$11.b(czu.a)) {
                  $$1.a($$4, $$11.a(czu.a, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
