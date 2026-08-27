public class dze {
   public static class a extends dxq {
      public a(hx $$0) {
         super(dyd.aa, 0, new dxe($$0));
      }

      public a(sd $$0) {
         super(dyd.aa, $$0);
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         int $$7 = $$0.a(dmw.a.c, this.f.h(), this.f.j());
         hx.a $$8 = new hx.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            dhn $$9 = $$0.a_($$8);
            dhn $$10 = $$0.a_($$8.d());
            if ($$10 == cvh.aV.o() || $$10 == cvh.b.o() || $$10 == cvh.g.o() || $$10 == cvh.c.o() || $$10 == cvh.e.o()) {
               dhn $$11 = !$$9.i() && !this.b($$9) ? $$9 : cvh.I.o();

               for (ib $$12 : ib.values()) {
                  hx $$13 = $$8.a($$12);
                  dhn $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     hx $$15 = $$13.d();
                     dhn $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ib.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dxe($$8);
               this.a($$0, $$4, $$3, $$8, efa.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dhn $$0) {
         return $$0 == cvh.G.o() || $$0 == cvh.H.o();
      }
   }
}
