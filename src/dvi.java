import com.mojang.serialization.Codec;

public class dvi extends duu<dxf> {
   public dvi(Codec<dxf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxf> $$0) {
      int $$1 = 0;
      cwz $$2 = $$0.b();
      ib $$3 = $$0.e();
      awt $$4 = $$0.d();
      int $$5 = $$2.a(drq.a.d, $$3.u(), $$3.w());
      ib $$6 = new ib($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(czh.G)) {
         dme $$7 = czh.mc.o();
         dme $$8 = czh.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(czh.G) && $$2.a_($$6.c()).a(czh.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(ddi.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ib $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(czh.mc)) {
                  $$2.a($$11, $$7.a(ddi.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
