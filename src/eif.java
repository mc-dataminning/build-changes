import com.mojang.serialization.Codec;

public class eif extends ehr<ekc> {
   public eif(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      int $$1 = 0;
      dio $$2 = $$0.b();
      jj $$3 = $$0.e();
      azs $$4 = $$0.d();
      int $$5 = $$2.a(eel.a.d, $$3.u(), $$3.w());
      jj $$6 = new jj($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dkw.J)) {
         dym $$7 = dkw.mE.m();
         dym $$8 = dkw.mF.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dkw.J) && $$2.a_($$6.d()).a(dkw.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dpb.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               jj $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dkw.mE)) {
                  $$2.a($$11, $$7.b(dpb.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
