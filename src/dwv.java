public class dwv {
   public static class a extends dvo {
      public a(gw $$0) {
         super(dwb.aa, 0, new dvc($$0));
      }

      public a(qy $$0) {
         super(dwb.aa, $$0);
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         int $$7 = $$0.a(dku.a.c, this.f.g(), this.f.i());
         gw.a $$8 = new gw.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.H_()) {
            dfl $$9 = $$0.a_($$8);
            dfl $$10 = $$0.a_($$8.d());
            if ($$10 == csy.aV.n() || $$10 == csy.b.n() || $$10 == csy.g.n() || $$10 == csy.c.n() || $$10 == csy.e.n()) {
               dfl $$11 = !$$9.i() && !this.b($$9) ? $$9 : csy.I.n();

               for (hc $$12 : hc.values()) {
                  gw $$13 = $$8.a($$12);
                  dfl $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gw $$15 = $$13.d();
                     dfl $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != hc.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dvc($$8);
               this.a($$0, $$4, $$3, $$8, ecq.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dfl $$0) {
         return $$0 == csy.G.n() || $$0 == csy.H.n();
      }
   }
}
