import com.mojang.serialization.Codec;

public class dnz extends dnl<dpw> {
   public dnz(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      int $$1 = 0;
      cqe $$2 = $$0.b();
      gv $$3 = $$0.e();
      art $$4 = $$0.d();
      int $$5 = $$2.a(dkh.a.d, $$3.u(), $$3.w());
      gv $$6 = new gv($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(csl.G)) {
         dey $$7 = csl.mc.n();
         dey $$8 = csl.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(csl.G) && $$2.a_($$6.c()).a(csl.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(cwl.d, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               gv $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(csl.mc)) {
                  $$2.a($$11, $$7.a(cwl.d, Integer.valueOf($$4.a(4) + 20)), 2);
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
