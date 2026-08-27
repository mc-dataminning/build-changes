public class eih {
   public static class a extends egt {
      public a(in $$0) {
         super(ehg.aa, 0, new egh($$0));
      }

      public a(ua $$0) {
         super(ehg.aa, $$0);
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         int $$7 = $$0.a(dvz.a.c, this.f.h(), this.f.j());
         in.a $$8 = new in.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dqh $$9 = $$0.a_($$8);
            dqh $$10 = $$0.a_($$8.d());
            if ($$10 == ddg.aV.n() || $$10 == ddg.b.n() || $$10 == ddg.g.n() || $$10 == ddg.c.n() || $$10 == ddg.e.n()) {
               dqh $$11 = !$$9.i() && !this.b($$9) ? $$9 : ddg.I.n();

               for (is $$12 : is.values()) {
                  in $$13 = $$8.a($$12);
                  dqh $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     in $$15 = $$13.d();
                     dqh $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != is.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new egh($$8);
               this.a($$0, $$4, $$3, $$8, eoj.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dqh $$0) {
         return $$0 == ddg.G.n() || $$0 == ddg.H.n();
      }
   }
}
