public class epw {
   public static class a extends eoh {
      public a(jh $$0) {
         super(eou.aa, 0, new env($$0));
      }

      public a(um $$0) {
         super(eou.aa, $$0);
      }

      @Override
      protected void a(eot $$0, um $$1) {
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         int $$7 = $$0.a(edj.a.c, this.f.h(), this.f.j());
         jh.a $$8 = new jh.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dxo $$9 = $$0.a_($$8);
            dxo $$10 = $$0.a_($$8.e());
            if ($$10 == dkf.bc.m() || $$10 == dkf.b.m() || $$10 == dkf.g.m() || $$10 == dkf.c.m() || $$10 == dkf.e.m()) {
               dxo $$11 = !$$9.l() && !this.b($$9) ? $$9 : dkf.L.m();

               for (jm $$12 : jm.values()) {
                  jh $$13 = $$8.a($$12);
                  dxo $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jh $$15 = $$13.e();
                     dxo $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jm.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new env($$8);
               this.a($$0, $$4, $$3, $$8, ewe.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dxo $$0) {
         return $$0 == dkf.J.m() || $$0 == dkf.K.m();
      }
   }
}
