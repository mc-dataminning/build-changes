public class ear {
   public static class a extends dzd {
      public a(hx $$0) {
         super(dzq.aa, 0, new dyr($$0));
      }

      public a(sl $$0) {
         super(dzq.aa, $$0);
      }

      @Override
      protected void a(dzp $$0, sl $$1) {
      }

      @Override
      public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
         int $$7 = $$0.a(doj.a.c, this.f.h(), this.f.j());
         hx.a $$8 = new hx.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            dja $$9 = $$0.a_($$8);
            dja $$10 = $$0.a_($$8.d());
            if ($$10 == cwl.aV.o() || $$10 == cwl.b.o() || $$10 == cwl.g.o() || $$10 == cwl.c.o() || $$10 == cwl.e.o()) {
               dja $$11 = !$$9.i() && !this.b($$9) ? $$9 : cwl.I.o();

               for (ic $$12 : ic.values()) {
                  hx $$13 = $$8.a($$12);
                  dja $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     hx $$15 = $$13.d();
                     dja $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ic.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dyr($$8);
               this.a($$0, $$4, $$3, $$8, egn.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dja $$0) {
         return $$0 == cwl.G.o() || $$0 == cwl.H.o();
      }
   }
}
