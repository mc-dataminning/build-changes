public class dyn {
   public static class a extends dwz {
      public a(ht $$0) {
         super(dxm.aa, 0, new dwn($$0));
      }

      public a(rz $$0) {
         super(dxm.aa, $$0);
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         int $$7 = $$0.a(dmf.a.c, this.f.g(), this.f.i());
         ht.a $$8 = new ht.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.I_()) {
            dgw $$9 = $$0.a_($$8);
            dgw $$10 = $$0.a_($$8.d());
            if ($$10 == cuv.aV.o() || $$10 == cuv.b.o() || $$10 == cuv.g.o() || $$10 == cuv.c.o() || $$10 == cuv.e.o()) {
               dgw $$11 = !$$9.i() && !this.b($$9) ? $$9 : cuv.I.o();

               for (hx $$12 : hx.values()) {
                  ht $$13 = $$8.a($$12);
                  dgw $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ht $$15 = $$13.d();
                     dgw $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != hx.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dwn($$8);
               this.a($$0, $$4, $$3, $$8, eej.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dgw $$0) {
         return $$0 == cuv.G.o() || $$0 == cuv.H.o();
      }
   }
}
