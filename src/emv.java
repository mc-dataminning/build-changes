public class emv {
   public static class a extends elg {
      public a(je $$0) {
         super(elt.aa, 0, new eku($$0));
      }

      public a(uf $$0) {
         super(elt.aa, $$0);
      }

      @Override
      protected void a(els $$0, uf $$1) {
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         int $$7 = $$0.a(eak.a.c, this.f.h(), this.f.j());
         je.a $$8 = new je.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            duo $$9 = $$0.a_($$8);
            duo $$10 = $$0.a_($$8.e());
            if ($$10 == dhl.aV.o() || $$10 == dhl.b.o() || $$10 == dhl.g.o() || $$10 == dhl.c.o() || $$10 == dhl.e.o()) {
               duo $$11 = !$$9.l() && !this.b($$9) ? $$9 : dhl.I.o();

               for (jj $$12 : jj.values()) {
                  je $$13 = $$8.a($$12);
                  duo $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     je $$15 = $$13.e();
                     duo $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jj.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eku($$8);
               this.a($$0, $$4, $$3, $$8, etd.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(duo $$0) {
         return $$0 == dhl.G.o() || $$0 == dhl.H.o();
      }
   }
}
