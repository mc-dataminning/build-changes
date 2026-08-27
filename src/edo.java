import com.mojang.serialization.Codec;

public class edo extends eca<eer> {
   public edo(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      ir.a $$3 = new ir.a();
      ir.a $$4 = new ir.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dyu.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(iw.a, 1);
            dcz $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dfe.eC.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dfe.eB.n(), 2);
               dtc $$11 = $$1.a_($$4);
               if ($$11.b(dna.c)) {
                  $$1.a($$4, $$11.a(dna.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
