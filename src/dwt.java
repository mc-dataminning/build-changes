public class dwt {
   public static class a extends dvm {
      public a(gw $$0) {
         super(dvz.aa, 0, new dva($$0));
      }

      public a(qw $$0) {
         super(dvz.aa, $$0);
      }

      @Override
      protected void a(dvy $$0, qw $$1) {
      }

      @Override
      public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, gw $$6) {
         int $$7 = $$0.a(dks.a.c, this.f.g(), this.f.i());
         gw.a $$8 = new gw.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.H_()) {
            dfj $$9 = $$0.a_($$8);
            dfj $$10 = $$0.a_($$8.d());
            if ($$10 == csw.aV.n() || $$10 == csw.b.n() || $$10 == csw.g.n() || $$10 == csw.c.n() || $$10 == csw.e.n()) {
               dfj $$11 = !$$9.i() && !this.b($$9) ? $$9 : csw.I.n();

               for (ha $$12 : ha.values()) {
                  gw $$13 = $$8.a($$12);
                  dfj $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gw $$15 = $$13.d();
                     dfj $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ha.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dva($$8);
               this.a($$0, $$4, $$3, $$8, eco.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dfj $$0) {
         return $$0 == csw.G.n() || $$0 == csw.H.n();
      }
   }
}
