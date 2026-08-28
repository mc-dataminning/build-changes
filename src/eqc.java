public class eqc {
   public static class a extends eon {
      public a(jh $$0) {
         super(epa.aa, 0, new eob($$0));
      }

      public a(ux $$0) {
         super(epa.aa, $$0);
      }

      @Override
      protected void a(eoz $$0, ux $$1) {
      }

      @Override
      public void a(dif $$0, did $$1, dzq $$2, bam $$3, eob $$4, dgn $$5, jh $$6) {
         int $$7 = $$0.a(edp.a.c, this.f.h(), this.f.j());
         jh.a $$8 = new jh.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dxu $$9 = $$0.a_($$8);
            dxu $$10 = $$0.a_($$8.e());
            if ($$10 == dkn.bc.m() || $$10 == dkn.b.m() || $$10 == dkn.g.m() || $$10 == dkn.c.m() || $$10 == dkn.e.m()) {
               dxu $$11 = !$$9.l() && !this.b($$9) ? $$9 : dkn.L.m();

               for (jm $$12 : jm.values()) {
                  jh $$13 = $$8.a($$12);
                  dxu $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jh $$15 = $$13.e();
                     dxu $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jm.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eob($$8);
               this.a($$0, $$4, $$3, $$8, ewk.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dxu $$0) {
         return $$0 == dkn.J.m() || $$0 == dkn.K.m();
      }
   }
}
