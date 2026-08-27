public class ell {
   public static class a extends ejx {
      public a(ir $$0) {
         super(ekk.aa, 0, new ejl($$0));
      }

      public a(uk $$0) {
         super(ekk.aa, $$0);
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         int $$7 = $$0.a(dyu.a.c, this.f.h(), this.f.j());
         ir.a $$8 = new ir.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.J_()) {
            dtc $$9 = $$0.a_($$8);
            dtc $$10 = $$0.a_($$8.d());
            if ($$10 == dfe.bF.n()
               || $$10 == dfe.b.n()
               || $$10 == dfe.h.n()
               || $$10 == dfe.d.n()
               || $$10 == dfe.f.n()
               || $$10 == dfe.r.n()
               || $$10 == dfe.c.n()) {
               dtc $$11 = !$$9.i() && !this.b($$9) ? $$9 : ($$0.z_() ? dfe.an.n() : dfe.ao.n());

               for (iw $$12 : iw.values()) {
                  ir $$13 = $$8.a($$12);
                  dtc $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ir $$15 = $$13.d();
                     dtc $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != iw.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ejl($$8);
               this.a($$0, $$4, $$3, $$8, ern.I, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dtc $$0) {
         return $$0 == dfe.al.n() || $$0 == dfe.am.n();
      }
   }
}
