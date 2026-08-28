public class emh {
   public static class a extends eks {
      public a(je $$0) {
         super(elf.aa, 0, new ekg($$0));
      }

      public a(uf $$0) {
         super(elf.aa, $$0);
      }

      @Override
      protected void a(ele $$0, uf $$1) {
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         int $$7 = $$0.a(dzw.a.c, this.f.h(), this.f.j());
         je.a $$8 = new je.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            dua $$9 = $$0.a_($$8);
            dua $$10 = $$0.a_($$8.e());
            if ($$10 == dgx.aV.o() || $$10 == dgx.b.o() || $$10 == dgx.g.o() || $$10 == dgx.c.o() || $$10 == dgx.e.o()) {
               dua $$11 = !$$9.l() && !this.b($$9) ? $$9 : dgx.I.o();

               for (jj $$12 : jj.values()) {
                  je $$13 = $$8.a($$12);
                  dua $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     je $$15 = $$13.e();
                     dua $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jj.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ekg($$8);
               this.a($$0, $$4, $$3, $$8, esp.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dua $$0) {
         return $$0 == dgx.G.o() || $$0 == dgx.H.o();
      }
   }
}
