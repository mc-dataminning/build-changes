import com.mojang.serialization.Codec;

public class ehc extends ego<eiz> {
   public ehc(Codec<eiz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<eiz> $$0) {
      int $$1 = 0;
      dhy $$2 = $$0.b();
      jh $$3 = $$0.e();
      bam $$4 = $$0.d();
      int $$5 = $$2.a(edi.a.d, $$3.u(), $$3.w());
      jh $$6 = new jh($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dkg.J)) {
         dxn $$7 = dkg.mx.m();
         dxn $$8 = dkg.my.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dkg.J) && $$2.a_($$6.d()).a(dkg.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dok.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               jh $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dkg.mx)) {
                  $$2.a($$11, $$7.b(dok.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
