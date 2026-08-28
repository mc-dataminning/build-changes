public class eke {
   public static class a extends eiq {
      public a(iz $$0) {
         super(ejd.aa, 0, new eie($$0));
      }

      public a(us $$0) {
         super(ejd.aa, $$0);
      }

      @Override
      protected void a(ejc $$0, us $$1) {
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         int $$7 = $$0.a(dxw.a.c, this.f.h(), this.f.j());
         iz.a $$8 = new iz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dse $$9 = $$0.a_($$8);
            dse $$10 = $$0.a_($$8.d());
            if ($$10 == dfd.aV.o() || $$10 == dfd.b.o() || $$10 == dfd.g.o() || $$10 == dfd.c.o() || $$10 == dfd.e.o()) {
               dse $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfd.I.o();

               for (je $$12 : je.values()) {
                  iz $$13 = $$8.a($$12);
                  dse $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     iz $$15 = $$13.d();
                     dse $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != je.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eie($$8);
               this.a($$0, $$4, $$3, $$8, eqg.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dse $$0) {
         return $$0 == dfd.G.o() || $$0 == dfd.H.o();
      }
   }
}
