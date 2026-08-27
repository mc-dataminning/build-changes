public class ehi {
   public static class a extends efu {
      public a(id $$0) {
         super(egh.aa, 0, new efi($$0));
      }

      public a(to $$0) {
         super(egh.aa, $$0);
      }

      @Override
      protected void a(egg $$0, to $$1) {
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         int $$7 = $$0.a(dva.a.c, this.f.h(), this.f.j());
         id.a $$8 = new id.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dpi $$9 = $$0.a_($$8);
            dpi $$10 = $$0.a_($$8.d());
            if ($$10 == dcj.aV.n() || $$10 == dcj.b.n() || $$10 == dcj.g.n() || $$10 == dcj.c.n() || $$10 == dcj.e.n()) {
               dpi $$11 = !$$9.i() && !this.b($$9) ? $$9 : dcj.I.n();

               for (ij $$12 : ij.values()) {
                  id $$13 = $$8.a($$12);
                  dpi $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     id $$15 = $$13.d();
                     dpi $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ij.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new efi($$8);
               this.a($$0, $$4, $$3, $$8, eni.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dpi $$0) {
         return $$0 == dcj.G.n() || $$0 == dcj.H.n();
      }
   }
}
