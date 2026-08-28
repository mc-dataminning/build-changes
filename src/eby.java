import com.mojang.serialization.Codec;

public class eby extends ebk<edv> {
   public eby(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edv> $$0) {
      int $$1 = 0;
      ddb $$2 = $$0.b();
      ja $$3 = $$0.e();
      ayo $$4 = $$0.d();
      int $$5 = $$2.a(dyf.a.d, $$3.u(), $$3.w());
      ja $$6 = new ja($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dfj.G)) {
         dsk $$7 = dfj.mc.o();
         dsk $$8 = dfj.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dfj.G) && $$2.a_($$6.c()).a(dfj.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(djl.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ja $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dfj.mc)) {
                  $$2.a($$11, $$7.a(djl.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
