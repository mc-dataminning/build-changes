import com.mojang.serialization.Codec;

public class ela extends ekm<emy> {
   public ela(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      int $$1 = 0;
      dky $$2 = $$0.b();
      iw $$3 = $$0.e();
      azz $$4 = $$0.d();
      int $$5 = $$2.a(ehf.a.d, $$3.u(), $$3.w());
      iw $$6 = new iw($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dng.J)) {
         ebg $$7 = dng.mI.m();
         ebg $$8 = dng.mJ.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dng.J) && $$2.a_($$6.d()).a(dng.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(drn.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               iw $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dng.mI)) {
                  $$2.a($$11, $$7.b(drn.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
