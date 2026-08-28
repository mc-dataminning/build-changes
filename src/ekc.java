public class ekc {
   public static class a extends eio {
      public a(iz $$0) {
         super(ejb.aa, 0, new eic($$0));
      }

      public a(us $$0) {
         super(ejb.aa, $$0);
      }

      @Override
      protected void a(eja $$0, us $$1) {
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         int $$7 = $$0.a(dxu.a.c, this.f.h(), this.f.j());
         iz.a $$8 = new iz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dsc $$9 = $$0.a_($$8);
            dsc $$10 = $$0.a_($$8.d());
            if ($$10 == dfb.aV.o() || $$10 == dfb.b.o() || $$10 == dfb.g.o() || $$10 == dfb.c.o() || $$10 == dfb.e.o()) {
               dsc $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfb.I.o();

               for (je $$12 : je.values()) {
                  iz $$13 = $$8.a($$12);
                  dsc $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     iz $$15 = $$13.d();
                     dsc $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != je.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eic($$8);
               this.a($$0, $$4, $$3, $$8, eqe.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dsc $$0) {
         return $$0 == dfb.G.o() || $$0 == dfb.H.o();
      }
   }
}
