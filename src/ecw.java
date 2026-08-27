public class ecw {
   public static class a extends ebi {
      public a(hz $$0) {
         super(ebv.aa, 0, new eaw($$0));
      }

      public a(sw $$0) {
         super(ebv.aa, $$0);
      }

      @Override
      protected void a(ebu $$0, sw $$1) {
      }

      @Override
      public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
         int $$7 = $$0.a(dqo.a.c, this.f.h(), this.f.j());
         hz.a $$8 = new hz.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            dlf $$9 = $$0.a_($$8);
            dlf $$10 = $$0.a_($$8.d());
            if ($$10 == cyq.aV.o() || $$10 == cyq.b.o() || $$10 == cyq.g.o() || $$10 == cyq.c.o() || $$10 == cyq.e.o()) {
               dlf $$11 = !$$9.i() && !this.b($$9) ? $$9 : cyq.I.o();

               for (ie $$12 : ie.values()) {
                  hz $$13 = $$8.a($$12);
                  dlf $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     hz $$15 = $$13.d();
                     dlf $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ie.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eaw($$8);
               this.a($$0, $$4, $$3, $$8, eit.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dlf $$0) {
         return $$0 == cyq.G.o() || $$0 == cyq.H.o();
      }
   }
}
