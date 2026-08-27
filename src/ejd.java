public class ejd {
   public static class a extends ehp {
      public a(io $$0) {
         super(eic.aa, 0, new ehd($$0));
      }

      public a(ud $$0) {
         super(eic.aa, $$0);
      }

      @Override
      protected void a(eib $$0, ud $$1) {
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         int $$7 = $$0.a(dwv.a.c, this.f.h(), this.f.j());
         io.a $$8 = new io.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            drd $$9 = $$0.a_($$8);
            drd $$10 = $$0.a_($$8.d());
            if ($$10 == dec.aV.n() || $$10 == dec.b.n() || $$10 == dec.g.n() || $$10 == dec.c.n() || $$10 == dec.e.n()) {
               drd $$11 = !$$9.i() && !this.b($$9) ? $$9 : dec.I.n();

               for (it $$12 : it.values()) {
                  io $$13 = $$8.a($$12);
                  drd $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     io $$15 = $$13.d();
                     drd $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != it.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ehd($$8);
               this.a($$0, $$4, $$3, $$8, epf.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(drd $$0) {
         return $$0 == dec.G.n() || $$0 == dec.H.n();
      }
   }
}
