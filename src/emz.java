public class emz {
   public static class a extends elk {
      public a(jf $$0) {
         super(elx.aa, 0, new eky($$0));
      }

      public a(ug $$0) {
         super(elx.aa, $$0);
      }

      @Override
      protected void a(elw $$0, ug $$1) {
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         int $$7 = $$0.a(eao.a.c, this.f.h(), this.f.j());
         jf.a $$8 = new jf.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.H_()) {
            dus $$9 = $$0.a_($$8);
            dus $$10 = $$0.a_($$8.e());
            if ($$10 == dho.aV.n() || $$10 == dho.b.n() || $$10 == dho.g.n() || $$10 == dho.c.n() || $$10 == dho.e.n()) {
               dus $$11 = !$$9.l() && !this.b($$9) ? $$9 : dho.I.n();

               for (jk $$12 : jk.values()) {
                  jf $$13 = $$8.a($$12);
                  dus $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jf $$15 = $$13.e();
                     dus $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jk.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eky($$8);
               this.a($$0, $$4, $$3, $$8, eth.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dus $$0) {
         return $$0 == dho.G.n() || $$0 == dho.H.n();
      }
   }
}
