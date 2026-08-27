public class dtl {
   public static class a extends dse {
      public a(gu $$0) {
         super(dsr.aa, 0, new drs($$0));
      }

      public a(qr $$0) {
         super(dsr.aa, $$0);
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         int $$7 = $$0.a(dhk.a.c, this.f.g(), this.f.i());
         gu.a $$8 = new gu.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.C_()) {
            dcb $$9 = $$0.a_($$8);
            dcb $$10 = $$0.a_($$8.d());
            if ($$10 == cpo.aV.n() || $$10 == cpo.b.n() || $$10 == cpo.g.n() || $$10 == cpo.c.n() || $$10 == cpo.e.n()) {
               dcb $$11 = !$$9.i() && !this.b($$9) ? $$9 : cpo.I.n();

               for (ha $$12 : ha.values()) {
                  gu $$13 = $$8.a($$12);
                  dcb $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gu $$15 = $$13.d();
                     dcb $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ha.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new drs($$8);
               this.a($$0, $$4, $$3, $$8, dzg.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dcb $$0) {
         return $$0 == cpo.G.n() || $$0 == cpo.H.n();
      }
   }
}
