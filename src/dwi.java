public class dwi {
   public static class a extends dvb {
      public a(gv $$0) {
         super(dvo.aa, 0, new dup($$0));
      }

      public a(qs $$0) {
         super(dvo.aa, $$0);
      }

      @Override
      protected void a(dvn $$0, qs $$1) {
      }

      @Override
      public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
         int $$7 = $$0.a(dkh.a.c, this.f.g(), this.f.i());
         gv.a $$8 = new gv.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.C_()) {
            dey $$9 = $$0.a_($$8);
            dey $$10 = $$0.a_($$8.d());
            if ($$10 == csl.aV.n() || $$10 == csl.b.n() || $$10 == csl.g.n() || $$10 == csl.c.n() || $$10 == csl.e.n()) {
               dey $$11 = !$$9.i() && !this.b($$9) ? $$9 : csl.I.n();

               for (hb $$12 : hb.values()) {
                  gv $$13 = $$8.a($$12);
                  dey $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     gv $$15 = $$13.d();
                     dey $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != hb.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dup($$8);
               this.a($$0, $$4, $$3, $$8, ecd.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dey $$0) {
         return $$0 == csl.G.n() || $$0 == csl.H.n();
      }
   }
}
