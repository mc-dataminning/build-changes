public class eag {
   public static class a extends dys {
      public a(hv $$0) {
         super(dzf.aa, 0, new dyg($$0));
      }

      public a(sj $$0) {
         super(dzf.aa, $$0);
      }

      @Override
      protected void a(dze $$0, sj $$1) {
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         int $$7 = $$0.a(dny.a.c, this.f.h(), this.f.j());
         hv.a $$8 = new hv.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            dip $$9 = $$0.a_($$8);
            dip $$10 = $$0.a_($$8.d());
            if ($$10 == cwb.aV.o() || $$10 == cwb.b.o() || $$10 == cwb.g.o() || $$10 == cwb.c.o() || $$10 == cwb.e.o()) {
               dip $$11 = !$$9.i() && !this.b($$9) ? $$9 : cwb.I.o();

               for (ia $$12 : ia.values()) {
                  hv $$13 = $$8.a($$12);
                  dip $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     hv $$15 = $$13.d();
                     dip $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ia.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dyg($$8);
               this.a($$0, $$4, $$3, $$8, egc.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dip $$0) {
         return $$0 == cwb.G.o() || $$0 == cwb.H.o();
      }
   }
}
