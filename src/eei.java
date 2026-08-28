import com.mojang.serialization.Codec;

public class eei extends edc<efq> {
   public eei(Codec<efq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efq> $$0) {
      boolean $$1 = false;
      azk $$2 = $$0.d();
      dep $$3 = $$0.b();
      je $$4 = $$0.e();
      efq $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dzw.a.d, $$4.u() + $$6, $$4.w() + $$7);
      je $$9 = new je($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dgx.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dua $$11 = $$10 ? dgx.bx.o() : dgx.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dua $$12 = $$11.b(dpc.d, duw.a);
               je $$13 = $$9.d();
               if ($$3.a_($$13).a(dgx.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
