import com.mojang.serialization.Codec;

public class dvi extends dtz<dwk> {
   public dvi(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      hz.a $$3 = new hz.a();
      hz.a $$4 = new hz.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dqv.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ie.a, 1);
            cwq $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, cyu.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, cyu.dN.o(), 2);
               dlj $$11 = $$1.a_($$4);
               if ($$11.b(dgb.c)) {
                  $$1.a($$4, $$11.a(dgb.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
