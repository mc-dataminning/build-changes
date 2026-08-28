public class ekb {
   public static class a extends ein {
      public a(iz $$0) {
         super(eja.aa, 0, new eib($$0));
      }

      public a(ur $$0) {
         super(eja.aa, $$0);
      }

      @Override
      protected void a(eiz $$0, ur $$1) {
      }

      @Override
      public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, iz $$6) {
         int $$7 = $$0.a(dxt.a.c, this.f.h(), this.f.j());
         iz.a $$8 = new iz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dsb $$9 = $$0.a_($$8);
            dsb $$10 = $$0.a_($$8.d());
            if ($$10 == dfa.aV.o() || $$10 == dfa.b.o() || $$10 == dfa.g.o() || $$10 == dfa.c.o() || $$10 == dfa.e.o()) {
               dsb $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfa.I.o();

               for (je $$12 : je.values()) {
                  iz $$13 = $$8.a($$12);
                  dsb $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     iz $$15 = $$13.d();
                     dsb $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != je.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eib($$8);
               this.a($$0, $$4, $$3, $$8, eqd.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dsb $$0) {
         return $$0 == dfa.G.o() || $$0 == dfa.H.o();
      }
   }
}
