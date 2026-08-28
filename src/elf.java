public class elf {
   public static class a extends ejq {
      public a(jd $$0) {
         super(ekd.aa, 0, new eje($$0));
      }

      public a(ua $$0) {
         super(ekd.aa, $$0);
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         int $$7 = $$0.a(dyv.a.c, this.f.h(), this.f.j());
         jd.a $$8 = new jd.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dta $$9 = $$0.a_($$8);
            dta $$10 = $$0.a_($$8.d());
            if ($$10 == dfy.aV.o() || $$10 == dfy.b.o() || $$10 == dfy.g.o() || $$10 == dfy.c.o() || $$10 == dfy.e.o()) {
               dta $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfy.I.o();

               for (ji $$12 : ji.values()) {
                  jd $$13 = $$8.a($$12);
                  dta $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     jd $$15 = $$13.d();
                     dta $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ji.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eje($$8);
               this.a($$0, $$4, $$3, $$8, erh.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dta $$0) {
         return $$0 == dfy.G.o() || $$0 == dfy.H.o();
      }
   }
}
