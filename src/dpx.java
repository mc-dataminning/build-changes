import com.mojang.serialization.Codec;

public class dpx extends dpj<dru> {
   public dpx(Codec<dru> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dru> $$0) {
      int $$1 = 0;
      csm $$2 = $$0.b();
      ht $$3 = $$0.e();
      ato $$4 = $$0.d();
      int $$5 = $$2.a(dmf.a.d, $$3.u(), $$3.w());
      ht $$6 = new ht($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(cuv.G)) {
         dgw $$7 = cuv.mc.o();
         dgw $$8 = cuv.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(cuv.G) && $$2.a_($$6.c()).a(cuv.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(cyw.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ht $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(cuv.mc)) {
                  $$2.a($$11, $$7.a(cyw.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
