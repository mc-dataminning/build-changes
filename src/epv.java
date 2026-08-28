public class epv {
   public static class a extends eog {
      public a(jh $$0) {
         super(eot.aa, 0, new enu($$0));
      }

      public a(ux $$0) {
         super(eot.aa, $$0);
      }

      @Override
      protected void a(eos $$0, ux $$1) {
      }

      @Override
      public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5, jh $$6) {
         int $$7 = $$0.a(edi.a.c, this.f.h(), this.f.j());
         jh.a $$8 = new jh.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dxn $$9 = $$0.a_($$8);
            dxn $$10 = $$0.a_($$8.e());
            if ($$10 == dkg.bc.m() || $$10 == dkg.b.m() || $$10 == dkg.g.m() || $$10 == dkg.c.m() || $$10 == dkg.e.m()) {
               dxn $$11 = !$$9.l() && !this.b($$9) ? $$9 : dkg.L.m();

               for (jm $$12 : jm.values()) {
                  jh $$13 = $$8.a($$12);
                  dxn $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jh $$15 = $$13.e();
                     dxn $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jm.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new enu($$8);
               this.a($$0, $$4, $$3, $$8, ewd.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dxn $$0) {
         return $$0 == dkg.J.m() || $$0 == dkg.K.m();
      }
   }
}
