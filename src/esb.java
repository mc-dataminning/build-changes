public class esb {
   public static class a extends eqm {
      public a(iu $$0) {
         super(eqz.aa, 0, new eqa($$0));
      }

      public a(tx $$0) {
         super(eqz.aa, $$0);
      }

      @Override
      protected void a(eqy $$0, tx $$1) {
      }

      @Override
      public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
         int $$7 = $$0.a(efn.a.c, this.f.h(), this.f.j());
         iu.a $$8 = new iu.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            dzo $$9 = $$0.a_($$8);
            dzo $$10 = $$0.a_($$8.e());
            if ($$10 == dlw.bc.m() || $$10 == dlw.b.m() || $$10 == dlw.g.m() || $$10 == dlw.c.m() || $$10 == dlw.e.m()) {
               dzo $$11 = !$$9.l() && !this.b($$9) ? $$9 : dlw.L.m();

               for (ja $$12 : ja.values()) {
                  iu $$13 = $$8.a($$12);
                  dzo $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iu $$15 = $$13.e();
                     dzo $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != ja.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eqa($$8);
               this.a($$0, $$4, $$3, $$8, eyj.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dzo $$0) {
         return $$0 == dlw.J.m() || $$0 == dlw.K.m();
      }
   }
}
