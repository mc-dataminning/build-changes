public class dyz {
   public static class a extends dxl {
      public a(ht $$0) {
         super(dxy.aa, 0, new dwz($$0));
      }

      public a(rz $$0) {
         super(dxy.aa, $$0);
      }

      @Override
      protected void a(dxx $$0, rz $$1) {
      }

      @Override
      public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, ht $$6) {
         int $$7 = $$0.a(dmr.a.c, this.f.g(), this.f.i());
         ht.a $$8 = new ht.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.I_()) {
            dhi $$9 = $$0.a_($$8);
            dhi $$10 = $$0.a_($$8.d());
            if ($$10 == cvc.aV.o() || $$10 == cvc.b.o() || $$10 == cvc.g.o() || $$10 == cvc.c.o() || $$10 == cvc.e.o()) {
               dhi $$11 = !$$9.i() && !this.b($$9) ? $$9 : cvc.I.o();

               for (hx $$12 : hx.values()) {
                  ht $$13 = $$8.a($$12);
                  dhi $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ht $$15 = $$13.d();
                     dhi $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != hx.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dwz($$8);
               this.a($$0, $$4, $$3, $$8, eev.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dhi $$0) {
         return $$0 == cvc.G.o() || $$0 == cvc.H.o();
      }
   }
}
