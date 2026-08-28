import com.mojang.serialization.Codec;

public class ebz extends eat<edh> {
   public ebz(Codec<edh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<edh> $$0) {
      boolean $$1 = false;
      azc $$2 = $$0.d();
      dco $$3 = $$0.b();
      iz $$4 = $$0.e();
      edh $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dxp.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iz $$9 = new iz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dew.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         drx $$11 = $$10 ? dew.bx.n() : dew.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               drx $$12 = $$11.a(dna.d, dst.a);
               iz $$13 = $$9.c();
               if ($$3.a_($$13).a(dew.G)) {
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
