public class edy {
   public static class a extends eck {
      public a(ib $$0) {
         super(ecx.aa, 0, new eby($$0));
      }

      public a(sy $$0) {
         super(ecx.aa, $$0);
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         int $$7 = $$0.a(drq.a.c, this.f.h(), this.f.j());
         ib.a $$8 = new ib.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            dme $$9 = $$0.a_($$8);
            dme $$10 = $$0.a_($$8.d());
            if ($$10 == czh.aV.o() || $$10 == czh.b.o() || $$10 == czh.g.o() || $$10 == czh.c.o() || $$10 == czh.e.o()) {
               dme $$11 = !$$9.i() && !this.b($$9) ? $$9 : czh.I.o();

               for (ih $$12 : ih.values()) {
                  ib $$13 = $$8.a($$12);
                  dme $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ib $$15 = $$13.d();
                     dme $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ih.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eby($$8);
               this.a($$0, $$4, $$3, $$8, ejw.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dme $$0) {
         return $$0 == czh.G.o() || $$0 == czh.H.o();
      }
   }
}
