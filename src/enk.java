public class enk {
   public static class a extends elv {
      public a(jg $$0) {
         super(emi.aa, 0, new elj($$0));
      }

      public a(uj $$0) {
         super(emi.aa, $$0);
      }

      @Override
      protected void a(emh $$0, uj $$1) {
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         int $$7 = $$0.a(eaz.a.c, this.f.h(), this.f.j());
         jg.a $$8 = new jg.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dvd $$9 = $$0.a_($$8);
            dvd $$10 = $$0.a_($$8.e());
            if ($$10 == dia.aV.m() || $$10 == dia.b.m() || $$10 == dia.g.m() || $$10 == dia.c.m() || $$10 == dia.e.m()) {
               dvd $$11 = !$$9.l() && !this.b($$9) ? $$9 : dia.I.m();

               for (jl $$12 : jl.values()) {
                  jg $$13 = $$8.a($$12);
                  dvd $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jg $$15 = $$13.e();
                     dvd $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jl.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new elj($$8);
               this.a($$0, $$4, $$3, $$8, ets.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dvd $$0) {
         return $$0 == dia.G.m() || $$0 == dia.H.m();
      }
   }
}
