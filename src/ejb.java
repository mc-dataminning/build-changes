public class ejb {
   public static class a extends ehn {
      public a(io $$0) {
         super(eia.aa, 0, new ehb($$0));
      }

      public a(ud $$0) {
         super(eia.aa, $$0);
      }

      @Override
      protected void a(ehz $$0, ud $$1) {
      }

      @Override
      public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
         int $$7 = $$0.a(dwt.a.c, this.f.h(), this.f.j());
         io.a $$8 = new io.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            drb $$9 = $$0.a_($$8);
            drb $$10 = $$0.a_($$8.d());
            if ($$10 == dea.aV.n() || $$10 == dea.b.n() || $$10 == dea.g.n() || $$10 == dea.c.n() || $$10 == dea.e.n()) {
               drb $$11 = !$$9.i() && !this.b($$9) ? $$9 : dea.I.n();

               for (it $$12 : it.values()) {
                  io $$13 = $$8.a($$12);
                  drb $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     io $$15 = $$13.d();
                     drb $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != it.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ehb($$8);
               this.a($$0, $$4, $$3, $$8, epd.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(drb $$0) {
         return $$0 == dea.G.n() || $$0 == dea.H.n();
      }
   }
}
