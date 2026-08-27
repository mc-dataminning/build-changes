public class dwk {
   public static class a extends dvd {
      public a(gu $$0) {
         super(dvq.aa, 0, new dur($$0));
      }

      public a(qr $$0) {
         super(dvq.aa, $$0);
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         int $$7 = $$0.a(dkj.a.c, this.f.g(), this.f.i());
         gu.a $$8 = new gu.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.C_()) {
            dfa $$9 = $$0.a_($$8);
            dfa $$10 = $$0.a_($$8.d());
            if ($$10 == csn.aV.n() || $$10 == csn.b.n() || $$10 == csn.g.n() || $$10 == csn.c.n() || $$10 == csn.e.n()) {
               dfa $$11 = !$$9.i() && !this.b($$9) ? $$9 : csn.I.n();

               for (ha $$12 : ha.values()) {
                  gu $$13 = $$8.a($$12);
                  dfa $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gu $$15 = $$13.d();
                     dfa $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ha.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dur($$8);
               this.a($$0, $$4, $$3, $$8, ecf.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dfa $$0) {
         return $$0 == csn.G.n() || $$0 == csn.H.n();
      }
   }
}
