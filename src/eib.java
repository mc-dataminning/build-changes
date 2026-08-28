import com.mojang.serialization.Codec;

public class eib extends egv<ejj> {
   public eib(Codec<ejj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejj> $$0) {
      boolean $$1 = false;
      bam $$2 = $$0.d();
      dif $$3 = $$0.b();
      jh $$4 = $$0.e();
      ejj $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(edp.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jh $$9 = new jh($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dkn.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dxu $$11 = $$10 ? dkn.bE.m() : dkn.bD.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dxu $$12 = $$11.b(dsu.d, dyp.a);
               jh $$13 = $$9.d();
               if ($$3.a_($$13).a(dkn.J)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
