public class dwj {
   public static class a extends dvc {
      public a(gu $$0) {
         super(dvp.aa, 0, new duq($$0));
      }

      public a(qr $$0) {
         super(dvp.aa, $$0);
      }

      @Override
      protected void a(dvo $$0, qr $$1) {
      }

      @Override
      public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
         int $$7 = $$0.a(dki.a.c, this.f.g(), this.f.i());
         gu.a $$8 = new gu.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.C_()) {
            dez $$9 = $$0.a_($$8);
            dez $$10 = $$0.a_($$8.d());
            if ($$10 == csm.aV.n() || $$10 == csm.b.n() || $$10 == csm.g.n() || $$10 == csm.c.n() || $$10 == csm.e.n()) {
               dez $$11 = !$$9.i() && !this.b($$9) ? $$9 : csm.I.n();

               for (ha $$12 : ha.values()) {
                  gu $$13 = $$8.a($$12);
                  dez $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gu $$15 = $$13.d();
                     dez $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ha.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new duq($$8);
               this.a($$0, $$4, $$3, $$8, ece.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dez $$0) {
         return $$0 == csm.G.n() || $$0 == csm.H.n();
      }
   }
}
