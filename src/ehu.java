import com.mojang.serialization.Codec;

public class ehu extends egp<eio> {
   public ehu(Codec<eio> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eio> $$0) {
      int $$1 = 0;
      bac $$2 = $$0.d();
      dhx $$3 = $$0.b();
      jh $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(edj.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jh $$10 = new jh($$4.u() + $$7, $$9, $$4.w() + $$8);
         dxo $$11 = dkf.nx.m().b(drf.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dkf.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
