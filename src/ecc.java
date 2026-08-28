import com.mojang.serialization.Codec;

public class ecc extends eaw<edk> {
   public ecc(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edk> $$0) {
      boolean $$1 = false;
      azf $$2 = $$0.d();
      dcr $$3 = $$0.b();
      iz $$4 = $$0.e();
      edk $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dxs.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iz $$9 = new iz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dez.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dsa $$11 = $$10 ? dez.bx.o() : dez.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dsa $$12 = $$11.a(dnd.d, dsw.a);
               iz $$13 = $$9.c();
               if ($$3.a_($$13).a(dez.G)) {
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
