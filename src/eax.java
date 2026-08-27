public class eax {
   public static class a extends dzj {
      public a(hx $$0) {
         super(dzw.aa, 0, new dyx($$0));
      }

      public a(sn $$0) {
         super(dzw.aa, $$0);
      }

      @Override
      protected void a(dzv $$0, sn $$1) {
      }

      @Override
      public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, hx $$6) {
         int $$7 = $$0.a(dop.a.c, this.f.h(), this.f.j());
         hx.a $$8 = new hx.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            djg $$9 = $$0.a_($$8);
            djg $$10 = $$0.a_($$8.d());
            if ($$10 == cwr.aV.o() || $$10 == cwr.b.o() || $$10 == cwr.g.o() || $$10 == cwr.c.o() || $$10 == cwr.e.o()) {
               djg $$11 = !$$9.i() && !this.b($$9) ? $$9 : cwr.I.o();

               for (ic $$12 : ic.values()) {
                  hx $$13 = $$8.a($$12);
                  djg $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     hx $$15 = $$13.d();
                     djg $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ic.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dyx($$8);
               this.a($$0, $$4, $$3, $$8, egt.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(djg $$0) {
         return $$0 == cwr.G.o() || $$0 == cwr.H.o();
      }
   }
}
