import com.mojang.serialization.Codec;

public class dzb extends dxv<eaj> {
   public dzb(Codec<eaj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eaj> $$0) {
      boolean $$1 = false;
      axr $$2 = $$0.d();
      czs $$3 = $$0.b();
      ib $$4 = $$0.e();
      eaj $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dur.a.d, $$4.u() + $$6, $$4.w() + $$7);
      ib $$9 = new ib($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dca.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         doz $$11 = $$10 ? dca.bx.n() : dca.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               doz $$12 = $$11.a(dkd.d, dpv.a);
               ib $$13 = $$9.c();
               if ($$3.a_($$13).a(dca.G)) {
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
