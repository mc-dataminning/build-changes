public class epg {
   public static class a extends enr {
      public a(ji $$0) {
         super(eoe.aa, 0, new enf($$0));
      }

      public a(tq $$0) {
         super(eoe.aa, $$0);
      }

      @Override
      protected void a(eod $$0, tq $$1) {
      }

      @Override
      public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, ji $$6) {
         int $$7 = $$0.a(ect.a.c, this.f.h(), this.f.j());
         ji.a $$8 = new ji.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dwy $$9 = $$0.a_($$8);
            dwy $$10 = $$0.a_($$8.e());
            if ($$10 == djp.bc.m() || $$10 == djp.b.m() || $$10 == djp.g.m() || $$10 == djp.c.m() || $$10 == djp.e.m()) {
               dwy $$11 = !$$9.l() && !this.b($$9) ? $$9 : djp.L.m();

               for (jn $$12 : jn.values()) {
                  ji $$13 = $$8.a($$12);
                  dwy $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     ji $$15 = $$13.e();
                     dwy $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jn.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new enf($$8);
               this.a($$0, $$4, $$3, $$8, evo.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dwy $$0) {
         return $$0 == djp.J.m() || $$0 == djp.K.m();
      }
   }
}
