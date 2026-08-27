import com.mojang.serialization.Codec;

public class dpe extends dny<dqm> {
   public dpe(Codec<dqm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqm> $$0) {
      boolean $$1 = false;
      ase $$2 = $$0.d();
      cqr $$3 = $$0.b();
      gw $$4 = $$0.e();
      dqm $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dku.a.d, $$4.u() + $$6, $$4.w() + $$7);
      gw $$9 = new gw($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(csy.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dfl $$11 = $$10 ? csy.bx.n() : csy.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dfl $$12 = $$11.a(dbe.b, dgh.a);
               gw $$13 = $$9.c();
               if ($$3.a_($$13).a(csy.G)) {
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
