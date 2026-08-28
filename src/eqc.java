public class eqc {
   public static class a extends eon {
      public a(ji $$0) {
         super(epa.aa, 0, new eob($$0));
      }

      public a(tq $$0) {
         super(epa.aa, $$0);
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         int $$7 = $$0.a(edo.a.c, this.f.h(), this.f.j());
         ji.a $$8 = new ji.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            dxq $$9 = $$0.a_($$8);
            dxq $$10 = $$0.a_($$8.e());
            if ($$10 == dkg.bc.m() || $$10 == dkg.b.m() || $$10 == dkg.g.m() || $$10 == dkg.c.m() || $$10 == dkg.e.m()) {
               dxq $$11 = !$$9.l() && !this.b($$9) ? $$9 : dkg.L.m();

               for (jn $$12 : jn.values()) {
                  ji $$13 = $$8.a($$12);
                  dxq $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     ji $$15 = $$13.e();
                     dxq $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jn.b) {
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

      private boolean b(dxq $$0) {
         return $$0 == dkg.J.m() || $$0 == dkg.K.m();
      }
   }
}
