public class dwn {
   public static class a extends dvg {
      public a(gw $$0) {
         super(dvt.aa, 0, new duu($$0));
      }

      public a(qw $$0) {
         super(dvt.aa, $$0);
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         int $$7 = $$0.a(dkm.a.c, this.f.g(), this.f.i());
         gw.a $$8 = new gw.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.H_()) {
            dfd $$9 = $$0.a_($$8);
            dfd $$10 = $$0.a_($$8.d());
            if ($$10 == cte.aV.o() || $$10 == cte.b.o() || $$10 == cte.g.o() || $$10 == cte.c.o() || $$10 == cte.e.o()) {
               dfd $$11 = !$$9.i() && !this.b($$9) ? $$9 : cte.I.o();

               for (ha $$12 : ha.values()) {
                  gw $$13 = $$8.a($$12);
                  dfd $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gw $$15 = $$13.d();
                     dfd $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ha.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new duu($$8);
               this.a($$0, $$4, $$3, $$8, eci.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dfd $$0) {
         return $$0 == cte.G.o() || $$0 == cte.H.o();
      }
   }
}
