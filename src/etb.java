public class etb {
   public static class a extends erm {
      public a(iv $$0) {
         super(erz.aa, 0, new era($$0));
      }

      public a(tz $$0) {
         super(erz.aa, $$0);
      }

      @Override
      protected void a(ery $$0, tz $$1) {
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         int $$7 = $$0.a(egn.a.c, this.f.h(), this.f.j());
         iv.a $$8 = new iv.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            eao $$9 = $$0.a_($$8);
            eao $$10 = $$0.a_($$8.e());
            if ($$10 == dmo.bc.m() || $$10 == dmo.b.m() || $$10 == dmo.g.m() || $$10 == dmo.c.m() || $$10 == dmo.e.m()) {
               eao $$11 = !$$9.l() && !this.b($$9) ? $$9 : dmo.L.m();

               for (jb $$12 : jb.values()) {
                  iv $$13 = $$8.a($$12);
                  eao $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iv $$15 = $$13.e();
                     eao $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jb.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new era($$8);
               this.a($$0, $$4, $$3, $$8, ezk.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(eao $$0) {
         return $$0 == dmo.J.m() || $$0 == dmo.K.m();
      }
   }
}
