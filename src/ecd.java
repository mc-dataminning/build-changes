import com.mojang.serialization.Codec;

public class ecd extends eax<edl> {
   public ecd(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edl> $$0) {
      boolean $$1 = false;
      azg $$2 = $$0.d();
      dcs $$3 = $$0.b();
      iz $$4 = $$0.e();
      edl $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dxt.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iz $$9 = new iz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dfa.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dsb $$11 = $$10 ? dfa.bx.o() : dfa.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dsb $$12 = $$11.a(dne.d, dsx.a);
               iz $$13 = $$9.c();
               if ($$3.a_($$13).a(dfa.G)) {
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
