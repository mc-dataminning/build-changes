public class epf {
   public static class a extends enq {
      public a(ji $$0) {
         super(eod.aa, 0, new ene($$0));
      }

      public a(tq $$0) {
         super(eod.aa, $$0);
      }

      @Override
      protected void a(eoc $$0, tq $$1) {
      }

      @Override
      public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, ji $$6) {
         int $$7 = $$0.a(ecs.a.c, this.f.h(), this.f.j());
         ji.a $$8 = new ji.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dwx $$9 = $$0.a_($$8);
            dwx $$10 = $$0.a_($$8.e());
            if ($$10 == djo.bc.m() || $$10 == djo.b.m() || $$10 == djo.g.m() || $$10 == djo.c.m() || $$10 == djo.e.m()) {
               dwx $$11 = !$$9.l() && !this.b($$9) ? $$9 : djo.L.m();

               for (jn $$12 : jn.values()) {
                  ji $$13 = $$8.a($$12);
                  dwx $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     ji $$15 = $$13.e();
                     dwx $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jn.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ene($$8);
               this.a($$0, $$4, $$3, $$8, evn.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dwx $$0) {
         return $$0 == djo.J.m() || $$0 == djo.K.m();
      }
   }
}
