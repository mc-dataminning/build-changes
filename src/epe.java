public class epe {
   public static class a extends enp {
      public a(ji $$0) {
         super(eoc.aa, 0, new end($$0));
      }

      public a(tq $$0) {
         super(eoc.aa, $$0);
      }

      @Override
      protected void a(eob $$0, tq $$1) {
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         int $$7 = $$0.a(ecr.a.c, this.f.h(), this.f.j());
         ji.a $$8 = new ji.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dww $$9 = $$0.a_($$8);
            dww $$10 = $$0.a_($$8.e());
            if ($$10 == djn.bc.m() || $$10 == djn.b.m() || $$10 == djn.g.m() || $$10 == djn.c.m() || $$10 == djn.e.m()) {
               dww $$11 = !$$9.l() && !this.b($$9) ? $$9 : djn.L.m();

               for (jn $$12 : jn.values()) {
                  ji $$13 = $$8.a($$12);
                  dww $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     ji $$15 = $$13.e();
                     dww $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jn.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new end($$8);
               this.a($$0, $$4, $$3, $$8, evm.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dww $$0) {
         return $$0 == djn.J.m() || $$0 == djn.K.m();
      }
   }
}
