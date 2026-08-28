public class eqz {
   public static class a extends epk {
      public a(jj $$0) {
         super(epx.aa, 0, new eoy($$0));
      }

      public a(tw $$0) {
         super(epx.aa, $$0);
      }

      @Override
      protected void a(epw $$0, tw $$1) {
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         int $$7 = $$0.a(eel.a.c, this.f.h(), this.f.j());
         jj.a $$8 = new jj.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            dym $$9 = $$0.a_($$8);
            dym $$10 = $$0.a_($$8.e());
            if ($$10 == dkw.bc.m() || $$10 == dkw.b.m() || $$10 == dkw.g.m() || $$10 == dkw.c.m() || $$10 == dkw.e.m()) {
               dym $$11 = !$$9.l() && !this.b($$9) ? $$9 : dkw.L.m();

               for (jo $$12 : jo.values()) {
                  jj $$13 = $$8.a($$12);
                  dym $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jj $$15 = $$13.e();
                     dym $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jo.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eoy($$8);
               this.a($$0, $$4, $$3, $$8, exh.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dym $$0) {
         return $$0 == dkw.J.m() || $$0 == dkw.K.m();
      }
   }
}
