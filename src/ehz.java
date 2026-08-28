import com.mojang.serialization.Codec;

public class ehz extends egu<eit> {
   public ehz(Codec<eit> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<eit> $$0) {
      int $$1 = 0;
      azh $$2 = $$0.d();
      dhy $$3 = $$0.b();
      ji $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(edo.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ji $$10 = new ji($$4.u() + $$7, $$9, $$4.w() + $$8);
         dxq $$11 = dkg.nx.m().b(drg.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dkg.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
