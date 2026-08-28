import com.mojang.serialization.Codec;

public class eel extends edc<efn> {
   public eel(Codec<efn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efn> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      je.a $$3 = new je.a();
      je.a $$4 = new je.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dzw.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jj.a, 1);
            det $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dgx.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dgx.dN.o(), 2);
               dua $$11 = $$1.a_($$4);
               if ($$11.b(dog.c)) {
                  $$1.a($$4, $$11.b(dog.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
