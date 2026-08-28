public class eka {
   public static class a extends eim {
      public a(iz $$0) {
         super(eiz.aa, 0, new eia($$0));
      }

      public a(ur $$0) {
         super(eiz.aa, $$0);
      }

      @Override
      protected void a(eiy $$0, ur $$1) {
      }

      @Override
      public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
         int $$7 = $$0.a(dxs.a.c, this.f.h(), this.f.j());
         iz.a $$8 = new iz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dsa $$9 = $$0.a_($$8);
            dsa $$10 = $$0.a_($$8.d());
            if ($$10 == dez.aV.o() || $$10 == dez.b.o() || $$10 == dez.g.o() || $$10 == dez.c.o() || $$10 == dez.e.o()) {
               dsa $$11 = !$$9.i() && !this.b($$9) ? $$9 : dez.I.o();

               for (je $$12 : je.values()) {
                  iz $$13 = $$8.a($$12);
                  dsa $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     iz $$15 = $$13.d();
                     dsa $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != je.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eia($$8);
               this.a($$0, $$4, $$3, $$8, eqc.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dsa $$0) {
         return $$0 == dez.G.o() || $$0 == dez.H.o();
      }
   }
}
