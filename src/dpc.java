import com.mojang.serialization.Codec;

public class dpc extends dnw<dqk> {
   public dpc(Codec<dqk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqk> $$0) {
      boolean $$1 = false;
      asc $$2 = $$0.d();
      cqp $$3 = $$0.b();
      gw $$4 = $$0.e();
      dqk $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dks.a.d, $$4.u() + $$6, $$4.w() + $$7);
      gw $$9 = new gw($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(csw.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dfj $$11 = $$10 ? csw.bx.n() : csw.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dfj $$12 = $$11.a(dbc.b, dgf.a);
               gw $$13 = $$9.c();
               if ($$3.a_($$13).a(csw.G)) {
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
