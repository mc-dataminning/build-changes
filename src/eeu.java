public class eeu {
   public static class a extends edg {
      public a(ib $$0) {
         super(edt.aa, 0, new ecu($$0));
      }

      public a(ta $$0) {
         super(edt.aa, $$0);
      }

      @Override
      protected void a(eds $$0, ta $$1) {
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         int $$7 = $$0.a(dsm.a.c, this.f.h(), this.f.j());
         ib.a $$8 = new ib.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dmz $$9 = $$0.a_($$8);
            dmz $$10 = $$0.a_($$8.d());
            if ($$10 == dac.aV.o() || $$10 == dac.b.o() || $$10 == dac.g.o() || $$10 == dac.c.o() || $$10 == dac.e.o()) {
               dmz $$11 = !$$9.i() && !this.b($$9) ? $$9 : dac.I.o();

               for (ih $$12 : ih.values()) {
                  ib $$13 = $$8.a($$12);
                  dmz $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ib $$15 = $$13.d();
                     dmz $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ih.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ecu($$8);
               this.a($$0, $$4, $$3, $$8, eks.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dmz $$0) {
         return $$0 == dac.G.o() || $$0 == dac.H.o();
      }
   }
}
