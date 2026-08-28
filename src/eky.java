import com.mojang.serialization.Codec;

public class eky extends ekk<emw> {
   public eky(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      int $$1 = 0;
      dkw $$2 = $$0.b();
      iv $$3 = $$0.e();
      azx $$4 = $$0.d();
      int $$5 = $$2.a(ehd.a.d, $$3.u(), $$3.w());
      iv $$6 = new iv($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dne.J)) {
         ebe $$7 = dne.mI.m();
         ebe $$8 = dne.mJ.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dne.J) && $$2.a_($$6.d()).a(dne.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(drl.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               iv $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dne.mI)) {
                  $$2.a($$11, $$7.b(drl.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.d();
         }
      }

      return $$1 > 0;
   }
}
