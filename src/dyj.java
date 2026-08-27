import com.mojang.serialization.Codec;

public class dyj extends dxv<eag> {
   public dyj(Codec<eag> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      int $$1 = 0;
      czs $$2 = $$0.b();
      ib $$3 = $$0.e();
      axr $$4 = $$0.d();
      int $$5 = $$2.a(dur.a.d, $$3.u(), $$3.w());
      ib $$6 = new ib($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dca.G)) {
         doz $$7 = dca.mc.n();
         doz $$8 = dca.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dca.G) && $$2.a_($$6.c()).a(dca.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(dgb.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ib $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dca.mc)) {
                  $$2.a($$11, $$7.a(dgb.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.c();
         }
      }

      return $$1 > 0;
   }
}
