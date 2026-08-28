public class eki {
   public static class a extends eiu {
      public a(ja $$0) {
         super(ejh.aa, 0, new eii($$0));
      }

      public a(tx $$0) {
         super(ejh.aa, $$0);
      }

      @Override
      protected void a(ejg $$0, tx $$1) {
      }

      @Override
      public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
         int $$7 = $$0.a(dxz.a.c, this.f.h(), this.f.j());
         ja.a $$8 = new ja.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dsh $$9 = $$0.a_($$8);
            dsh $$10 = $$0.a_($$8.d());
            if ($$10 == dfh.aV.o() || $$10 == dfh.b.o() || $$10 == dfh.g.o() || $$10 == dfh.c.o() || $$10 == dfh.e.o()) {
               dsh $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfh.I.o();

               for (jf $$12 : jf.values()) {
                  ja $$13 = $$8.a($$12);
                  dsh $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ja $$15 = $$13.d();
                     dsh $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != jf.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eii($$8);
               this.a($$0, $$4, $$3, $$8, eqk.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dsh $$0) {
         return $$0 == dfh.G.o() || $$0 == dfh.H.o();
      }
   }
}
