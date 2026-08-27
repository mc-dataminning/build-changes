public class eew {
   public static class a extends edi {
      public a(ib $$0) {
         super(edv.aa, 0, new ecw($$0));
      }

      public a(ta $$0) {
         super(edv.aa, $$0);
      }

      @Override
      protected void a(edu $$0, ta $$1) {
      }

      @Override
      public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, ib $$6) {
         int $$7 = $$0.a(dso.a.c, this.f.h(), this.f.j());
         ib.a $$8 = new ib.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dnb $$9 = $$0.a_($$8);
            dnb $$10 = $$0.a_($$8.d());
            if ($$10 == dae.aV.o() || $$10 == dae.b.o() || $$10 == dae.g.o() || $$10 == dae.c.o() || $$10 == dae.e.o()) {
               dnb $$11 = !$$9.i() && !this.b($$9) ? $$9 : dae.I.o();

               for (ih $$12 : ih.values()) {
                  ib $$13 = $$8.a($$12);
                  dnb $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ib $$15 = $$13.d();
                     dnb $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ih.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ecw($$8);
               this.a($$0, $$4, $$3, $$8, eku.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dnb $$0) {
         return $$0 == dae.G.o() || $$0 == dae.H.o();
      }
   }
}
