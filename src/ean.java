import com.mojang.serialization.Codec;

public class ean extends dzz<eck> {
   public ean(Codec<eck> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eck> $$0) {
      int $$1 = 0;
      dbu $$2 = $$0.b();
      io $$3 = $$0.e();
      aym $$4 = $$0.d();
      int $$5 = $$2.a(dwv.a.d, $$3.u(), $$3.w());
      io $$6 = new io($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dec.G)) {
         drd $$7 = dec.mc.n();
         drd $$8 = dec.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dec.G) && $$2.a_($$6.c()).a(dec.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(die.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               io $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dec.mc)) {
                  $$2.a($$11, $$7.a(die.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
