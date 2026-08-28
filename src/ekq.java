public class ekq {
   public static class a extends ejb {
      public a(ja $$0) {
         super(ejo.aa, 0, new eip($$0));
      }

      public a(tx $$0) {
         super(ejo.aa, $$0);
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         int $$7 = $$0.a(dyg.a.c, this.f.h(), this.f.j());
         ja.a $$8 = new ja.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dsl $$9 = $$0.a_($$8);
            dsl $$10 = $$0.a_($$8.d());
            if ($$10 == dfk.aV.o() || $$10 == dfk.b.o() || $$10 == dfk.g.o() || $$10 == dfk.c.o() || $$10 == dfk.e.o()) {
               dsl $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfk.I.o();

               for (jf $$12 : jf.values()) {
                  ja $$13 = $$8.a($$12);
                  dsl $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ja $$15 = $$13.d();
                     dsl $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != jf.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eip($$8);
               this.a($$0, $$4, $$3, $$8, eqs.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dsl $$0) {
         return $$0 == dfk.G.o() || $$0 == dfk.H.o();
      }
   }
}
