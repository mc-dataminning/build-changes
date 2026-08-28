public class eqd {
   public static class a extends eoo {
      public a(jh $$0) {
         super(epb.aa, 0, new eoc($$0));
      }

      public a(ux $$0) {
         super(epb.aa, $$0);
      }

      @Override
      protected void a(epa $$0, ux $$1) {
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         int $$7 = $$0.a(edq.a.c, this.f.h(), this.f.j());
         jh.a $$8 = new jh.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dxv $$9 = $$0.a_($$8);
            dxv $$10 = $$0.a_($$8.e());
            if ($$10 == dko.bc.m() || $$10 == dko.b.m() || $$10 == dko.g.m() || $$10 == dko.c.m() || $$10 == dko.e.m()) {
               dxv $$11 = !$$9.l() && !this.b($$9) ? $$9 : dko.L.m();

               for (jm $$12 : jm.values()) {
                  jh $$13 = $$8.a($$12);
                  dxv $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jh $$15 = $$13.e();
                     dxv $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jm.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eoc($$8);
               this.a($$0, $$4, $$3, $$8, ewl.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dxv $$0) {
         return $$0 == dko.J.m() || $$0 == dko.K.m();
      }
   }
}
