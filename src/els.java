import com.mojang.serialization.Codec;

public class els extends ekm<enb> {
   public els(Codec<enb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<enb> $$0) {
      boolean $$1 = false;
      azz $$2 = $$0.d();
      dky $$3 = $$0.b();
      iw $$4 = $$0.e();
      enb $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(ehf.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iw $$9 = new iw($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dng.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         ebg $$11 = $$10 ? dng.bH.m() : dng.bG.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               ebg $$12 = $$11.b(dvv.d, ecc.a);
               iw $$13 = $$9.d();
               if ($$3.a_($$13).a(dng.J)) {
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
