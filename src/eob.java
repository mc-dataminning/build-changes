public class eob {
   public static class a extends emm {
      public a(jh $$0) {
         super(emz.aa, 0, new ema($$0));
      }

      public a(ul $$0) {
         super(emz.aa, $$0);
      }

      @Override
      protected void a(emy $$0, ul $$1) {
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         int $$7 = $$0.a(ebq.a.c, this.f.h(), this.f.j());
         jh.a $$8 = new jh.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.K_()) {
            dvv $$9 = $$0.a_($$8);
            dvv $$10 = $$0.a_($$8.e());
            if ($$10 == dis.aV.m() || $$10 == dis.b.m() || $$10 == dis.g.m() || $$10 == dis.c.m() || $$10 == dis.e.m()) {
               dvv $$11 = !$$9.l() && !this.b($$9) ? $$9 : dis.I.m();

               for (jm $$12 : jm.values()) {
                  jh $$13 = $$8.a($$12);
                  dvv $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jh $$15 = $$13.e();
                     dvv $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jm.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ema($$8);
               this.a($$0, $$4, $$3, $$8, euj.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dvv $$0) {
         return $$0 == dis.G.m() || $$0 == dis.H.m();
      }
   }
}
