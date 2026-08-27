public class edd {
   public static class a extends ebp {
      public a(hz $$0) {
         super(ecc.aa, 0, new ebd($$0));
      }

      public a(sw $$0) {
         super(ecc.aa, $$0);
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         int $$7 = $$0.a(dqv.a.c, this.f.h(), this.f.j());
         hz.a $$8 = new hz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            dlj $$9 = $$0.a_($$8);
            dlj $$10 = $$0.a_($$8.d());
            if ($$10 == cyu.aV.o() || $$10 == cyu.b.o() || $$10 == cyu.g.o() || $$10 == cyu.c.o() || $$10 == cyu.e.o()) {
               dlj $$11 = !$$9.i() && !this.b($$9) ? $$9 : cyu.I.o();

               for (ie $$12 : ie.values()) {
                  hz $$13 = $$8.a($$12);
                  dlj $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     hz $$15 = $$13.d();
                     dlj $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ie.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ebd($$8);
               this.a($$0, $$4, $$3, $$8, eja.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dlj $$0) {
         return $$0 == cyu.G.o() || $$0 == cyu.H.o();
      }
   }
}
