import com.mojang.serialization.Codec;

public class egl extends efx<eii> {
   public egl(Codec<eii> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eii> $$0) {
      int $$1 = 0;
      dhf $$2 = $$0.b();
      ji $$3 = $$0.e();
      azh $$4 = $$0.d();
      int $$5 = $$2.a(ecr.a.d, $$3.u(), $$3.w());
      ji $$6 = new ji($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(djn.J)) {
         dww $$7 = djn.mE.m();
         dww $$8 = djn.mF.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(djn.J) && $$2.a_($$6.d()).a(djn.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dnr.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ji $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(djn.mE)) {
                  $$2.a($$11, $$7.b(dnr.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
