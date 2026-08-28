import com.mojang.serialization.Codec;

public class ece extends eay<edm> {
   public ece(Codec<edm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edm> $$0) {
      boolean $$1 = false;
      azh $$2 = $$0.d();
      dct $$3 = $$0.b();
      iz $$4 = $$0.e();
      edm $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dxu.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iz $$9 = new iz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dfb.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dsc $$11 = $$10 ? dfb.bx.o() : dfb.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dsc $$12 = $$11.a(dnf.d, dsy.a);
               iz $$13 = $$9.c();
               if ($$3.a_($$13).a(dfb.G)) {
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
