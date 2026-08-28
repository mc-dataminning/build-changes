public class ekd {
   public static class a extends eip {
      public a(iz $$0) {
         super(ejc.aa, 0, new eid($$0));
      }

      public a(us $$0) {
         super(ejc.aa, $$0);
      }

      @Override
      protected void a(ejb $$0, us $$1) {
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         int $$7 = $$0.a(dxv.a.c, this.f.h(), this.f.j());
         iz.a $$8 = new iz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dsd $$9 = $$0.a_($$8);
            dsd $$10 = $$0.a_($$8.d());
            if ($$10 == dfc.aV.o() || $$10 == dfc.b.o() || $$10 == dfc.g.o() || $$10 == dfc.c.o() || $$10 == dfc.e.o()) {
               dsd $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfc.I.o();

               for (je $$12 : je.values()) {
                  iz $$13 = $$8.a($$12);
                  dsd $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     iz $$15 = $$13.d();
                     dsd $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != je.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eid($$8);
               this.a($$0, $$4, $$3, $$8, eqf.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dsd $$0) {
         return $$0 == dfc.G.o() || $$0 == dfc.H.o();
      }
   }
}
