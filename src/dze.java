import com.mojang.serialization.Codec;

public class dze extends dxv<eag> {
   public dze(Codec<eag> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      ib.a $$3 = new ib.a();
      ib.a $$4 = new ib.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dur.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ih.a, 1);
            czw $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dca.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dca.dN.n(), 2);
               doz $$11 = $$1.a_($$4);
               if ($$11.b(djh.c)) {
                  $$1.a($$4, $$11.a(djh.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
