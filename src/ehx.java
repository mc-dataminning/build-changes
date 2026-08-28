import com.mojang.serialization.Codec;

public class ehx extends ego<eiz> {
   public ehx(Codec<eiz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<eiz> $$0) {
      dhy $$1 = $$0.b();
      jh $$2 = $$0.e();
      jh.a $$3 = new jh.a();
      jh.a $$4 = new jh.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(edi.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jm.a, 1);
            dic $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dkg.eb.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dkg.ea.m(), 2);
               dxn $$11 = $$1.a_($$4);
               if ($$11.b(drr.c)) {
                  $$1.a($$4, $$11.b(drr.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
