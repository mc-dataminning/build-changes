public class ejx {
   public static class a extends eij {
      public a(iz $$0) {
         super(eiw.aa, 0, new ehx($$0));
      }

      public a(ur $$0) {
         super(eiw.aa, $$0);
      }

      @Override
      protected void a(eiv $$0, ur $$1) {
      }

      @Override
      public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
         int $$7 = $$0.a(dxp.a.c, this.f.h(), this.f.j());
         iz.a $$8 = new iz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            drx $$9 = $$0.a_($$8);
            drx $$10 = $$0.a_($$8.d());
            if ($$10 == dew.aV.n() || $$10 == dew.b.n() || $$10 == dew.g.n() || $$10 == dew.c.n() || $$10 == dew.e.n()) {
               drx $$11 = !$$9.i() && !this.b($$9) ? $$9 : dew.I.n();

               for (je $$12 : je.values()) {
                  iz $$13 = $$8.a($$12);
                  drx $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     iz $$15 = $$13.d();
                     drx $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != je.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ehx($$8);
               this.a($$0, $$4, $$3, $$8, epz.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(drx $$0) {
         return $$0 == dew.G.n() || $$0 == dew.H.n();
      }
   }
}
