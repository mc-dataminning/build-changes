public class ehy {
   public static class a extends egk {
      public a(im $$0) {
         super(egx.aa, 0, new efy($$0));
      }

      public a(ty $$0) {
         super(egx.aa, $$0);
      }

      @Override
      protected void a(egw $$0, ty $$1) {
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         int $$7 = $$0.a(dvq.a.c, this.f.h(), this.f.j());
         im.a $$8 = new im.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dpy $$9 = $$0.a_($$8);
            dpy $$10 = $$0.a_($$8.d());
            if ($$10 == dcx.aV.n() || $$10 == dcx.b.n() || $$10 == dcx.g.n() || $$10 == dcx.c.n() || $$10 == dcx.e.n()) {
               dpy $$11 = !$$9.i() && !this.b($$9) ? $$9 : dcx.I.n();

               for (ir $$12 : ir.values()) {
                  im $$13 = $$8.a($$12);
                  dpy $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     im $$15 = $$13.d();
                     dpy $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ir.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new efy($$8);
               this.a($$0, $$4, $$3, $$8, eny.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dpy $$0) {
         return $$0 == dcx.G.n() || $$0 == dcx.H.n();
      }
   }
}
