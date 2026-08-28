public class esm {
   public static class a extends eqx {
      public a(iu $$0) {
         super(erk.aa, 0, new eql($$0));
      }

      public a(tz $$0) {
         super(erk.aa, $$0);
      }

      @Override
      protected void a(erj $$0, tz $$1) {
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         int $$7 = $$0.a(efy.a.c, this.f.h(), this.f.j());
         iu.a $$8 = new iu.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            dzz $$9 = $$0.a_($$8);
            dzz $$10 = $$0.a_($$8.e());
            if ($$10 == dmc.bc.m() || $$10 == dmc.b.m() || $$10 == dmc.g.m() || $$10 == dmc.c.m() || $$10 == dmc.e.m()) {
               dzz $$11 = !$$9.l() && !this.b($$9) ? $$9 : dmc.L.m();

               for (ja $$12 : ja.values()) {
                  iu $$13 = $$8.a($$12);
                  dzz $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iu $$15 = $$13.e();
                     dzz $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != ja.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eql($$8);
               this.a($$0, $$4, $$3, $$8, eyv.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dzz $$0) {
         return $$0 == dmc.J.m() || $$0 == dmc.K.m();
      }
   }
}
