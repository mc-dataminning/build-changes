public class enu {
   public static class a extends emf {
      public a(jh $$0) {
         super(ems.aa, 0, new elt($$0));
      }

      public a(un $$0) {
         super(ems.aa, $$0);
      }

      @Override
      protected void a(emr $$0, un $$1) {
      }

      @Override
      public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
         int $$7 = $$0.a(ebj.a.c, this.f.h(), this.f.j());
         jh.a $$8 = new jh.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dvo $$9 = $$0.a_($$8);
            dvo $$10 = $$0.a_($$8.e());
            if ($$10 == dil.aV.m() || $$10 == dil.b.m() || $$10 == dil.g.m() || $$10 == dil.c.m() || $$10 == dil.e.m()) {
               dvo $$11 = !$$9.l() && !this.b($$9) ? $$9 : dil.I.m();

               for (jm $$12 : jm.values()) {
                  jh $$13 = $$8.a($$12);
                  dvo $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jh $$15 = $$13.e();
                     dvo $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jm.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new elt($$8);
               this.a($$0, $$4, $$3, $$8, euc.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dvo $$0) {
         return $$0 == dil.G.m() || $$0 == dil.H.m();
      }
   }
}
