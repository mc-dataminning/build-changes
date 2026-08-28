public class esu {
   public static class a extends erf {
      public a(iu $$0) {
         super(ers.aa, 0, new eqt($$0));
      }

      public a(tz $$0) {
         super(ers.aa, $$0);
      }

      @Override
      protected void a(err $$0, tz $$1) {
      }

      @Override
      public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, iu $$6) {
         int $$7 = $$0.a(egg.a.c, this.f.h(), this.f.j());
         iu.a $$8 = new iu.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            eah $$9 = $$0.a_($$8);
            eah $$10 = $$0.a_($$8.e());
            if ($$10 == dmh.bc.m() || $$10 == dmh.b.m() || $$10 == dmh.g.m() || $$10 == dmh.c.m() || $$10 == dmh.e.m()) {
               eah $$11 = !$$9.l() && !this.b($$9) ? $$9 : dmh.L.m();

               for (ja $$12 : ja.values()) {
                  iu $$13 = $$8.a($$12);
                  eah $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iu $$15 = $$13.e();
                     eah $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != ja.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eqt($$8);
               this.a($$0, $$4, $$3, $$8, ezd.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(eah $$0) {
         return $$0 == dmh.J.m() || $$0 == dmh.K.m();
      }
   }
}
