public class etu {
   public static class a extends esf {
      public a(iv $$0) {
         super(ess.aa, 0, new ert($$0));
      }

      public a(tz $$0) {
         super(ess.aa, $$0);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         int $$7 = $$0.a(ehd.a.c, this.f.h(), this.f.j());
         iv.a $$8 = new iv.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.K_()) {
            ebe $$9 = $$0.a_($$8);
            ebe $$10 = $$0.a_($$8.e());
            if ($$10 == dne.bc.m() || $$10 == dne.b.m() || $$10 == dne.g.m() || $$10 == dne.c.m() || $$10 == dne.e.m()) {
               ebe $$11 = !$$9.l() && !this.b($$9) ? $$9 : dne.L.m();

               for (jb $$12 : jb.values()) {
                  iv $$13 = $$8.a($$12);
                  ebe $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iv $$15 = $$13.e();
                     ebe $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jb.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ert($$8);
               this.a($$0, $$4, $$3, $$8, fad.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(ebe $$0) {
         return $$0 == dne.J.m() || $$0 == dne.K.m();
      }
   }
}
