public class egz {
   public static class a extends efl {
      public a(ib $$0) {
         super(efy.aa, 0, new eez($$0));
      }

      public a(tm $$0) {
         super(efy.aa, $$0);
      }

      @Override
      protected void a(efx $$0, tm $$1) {
      }

      @Override
      public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
         int $$7 = $$0.a(dur.a.c, this.f.h(), this.f.j());
         ib.a $$8 = new ib.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            doz $$9 = $$0.a_($$8);
            doz $$10 = $$0.a_($$8.d());
            if ($$10 == dca.aV.n() || $$10 == dca.b.n() || $$10 == dca.g.n() || $$10 == dca.c.n() || $$10 == dca.e.n()) {
               doz $$11 = !$$9.i() && !this.b($$9) ? $$9 : dca.I.n();

               for (ih $$12 : ih.values()) {
                  ib $$13 = $$8.a($$12);
                  doz $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ib $$15 = $$13.d();
                     doz $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ih.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eez($$8);
               this.a($$0, $$4, $$3, $$8, emz.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(doz $$0) {
         return $$0 == dca.G.n() || $$0 == dca.H.n();
      }
   }
}
