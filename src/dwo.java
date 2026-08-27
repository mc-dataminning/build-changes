public class dwo {
   public static class a extends dvh {
      public a(gw $$0) {
         super(dvu.aa, 0, new duv($$0));
      }

      public a(qu $$0) {
         super(dvu.aa, $$0);
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         int $$7 = $$0.a(dkn.a.c, this.f.g(), this.f.i());
         gw.a $$8 = new gw.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.C_()) {
            dfe $$9 = $$0.a_($$8);
            dfe $$10 = $$0.a_($$8.d());
            if ($$10 == csr.aV.n() || $$10 == csr.b.n() || $$10 == csr.g.n() || $$10 == csr.c.n() || $$10 == csr.e.n()) {
               dfe $$11 = !$$9.i() && !this.b($$9) ? $$9 : csr.I.n();

               for (hc $$12 : hc.values()) {
                  gw $$13 = $$8.a($$12);
                  dfe $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gw $$15 = $$13.d();
                     dfe $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != hc.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new duv($$8);
               this.a($$0, $$4, $$3, $$8, ecj.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dfe $$0) {
         return $$0 == csr.G.n() || $$0 == csr.H.n();
      }
   }
}
