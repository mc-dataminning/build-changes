import com.mojang.serialization.Codec;

public class egn extends efz<eik> {
   public egn(Codec<eik> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eik> $$0) {
      int $$1 = 0;
      dhh $$2 = $$0.b();
      ji $$3 = $$0.e();
      azh $$4 = $$0.d();
      int $$5 = $$2.a(ect.a.d, $$3.u(), $$3.w());
      ji $$6 = new ji($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(djp.J)) {
         dwy $$7 = djp.mE.m();
         dwy $$8 = djp.mF.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(djp.J) && $$2.a_($$6.d()).a(djp.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dnt.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ji $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(djp.mE)) {
                  $$2.a($$11, $$7.b(dnt.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
