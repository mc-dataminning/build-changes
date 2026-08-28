import com.mojang.serialization.Codec;

public class ebs extends ebe<edp> {
   public ebs(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edp> $$0) {
      int $$1 = 0;
      dcz $$2 = $$0.b();
      ja $$3 = $$0.e();
      aym $$4 = $$0.d();
      int $$5 = $$2.a(dxz.a.d, $$3.u(), $$3.w());
      ja $$6 = new ja($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dfh.G)) {
         dsh $$7 = dfh.mc.o();
         dsh $$8 = dfh.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dfh.G) && $$2.a_($$6.c()).a(dfh.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(djj.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ja $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dfh.mc)) {
                  $$2.a($$11, $$7.a(djj.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
