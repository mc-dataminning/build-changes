import com.mojang.serialization.Codec;

public class ejs extends eje<elp> {
   public ejs(Codec<elp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      int $$1 = 0;
      dju $$2 = $$0.b();
      iu $$3 = $$0.e();
      azv $$4 = $$0.d();
      int $$5 = $$2.a(efy.a.d, $$3.u(), $$3.w());
      iu $$6 = new iu($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dmc.J)) {
         dzz $$7 = dmc.mF.m();
         dzz $$8 = dmc.mG.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dmc.J) && $$2.a_($$6.d()).a(dmc.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dqi.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               iu $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dmc.mF)) {
                  $$2.a($$11, $$7.b(dqi.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
