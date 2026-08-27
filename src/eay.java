public class eay {
   public static class a extends dzk {
      public a(hx $$0) {
         super(dzx.aa, 0, new dyy($$0));
      }

      public a(sn $$0) {
         super(dzx.aa, $$0);
      }

      @Override
      protected void a(dzw $$0, sn $$1) {
      }

      @Override
      public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, hx $$6) {
         int $$7 = $$0.a(doq.a.c, this.f.h(), this.f.j());
         hx.a $$8 = new hx.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            djh $$9 = $$0.a_($$8);
            djh $$10 = $$0.a_($$8.d());
            if ($$10 == cws.aV.o() || $$10 == cws.b.o() || $$10 == cws.g.o() || $$10 == cws.c.o() || $$10 == cws.e.o()) {
               djh $$11 = !$$9.i() && !this.b($$9) ? $$9 : cws.I.o();

               for (ic $$12 : ic.values()) {
                  hx $$13 = $$8.a($$12);
                  djh $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     hx $$15 = $$13.d();
                     djh $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ic.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dyy($$8);
               this.a($$0, $$4, $$3, $$8, egu.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(djh $$0) {
         return $$0 == cws.G.o() || $$0 == cws.H.o();
      }
   }
}
