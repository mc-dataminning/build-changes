import com.mojang.serialization.Codec;

public class ebo extends eba<edl> {
   public ebo(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edl> $$0) {
      int $$1 = 0;
      dcv $$2 = $$0.b();
      iz $$3 = $$0.e();
      azh $$4 = $$0.d();
      int $$5 = $$2.a(dxw.a.d, $$3.u(), $$3.w());
      iz $$6 = new iz($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dfd.G)) {
         dse $$7 = dfd.mc.o();
         dse $$8 = dfd.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dfd.G) && $$2.a_($$6.c()).a(dfd.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(djf.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               iz $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dfd.mc)) {
                  $$2.a($$11, $$7.a(djf.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
