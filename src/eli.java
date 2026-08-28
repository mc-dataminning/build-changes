public class eli {
   public static class a extends ejt {
      public a(jd $$0) {
         super(ekg.aa, 0, new ejh($$0));
      }

      public a(ub $$0) {
         super(ekg.aa, $$0);
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         int $$7 = $$0.a(dyy.a.c, this.f.h(), this.f.j());
         jd.a $$8 = new jd.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dtc $$9 = $$0.a_($$8);
            dtc $$10 = $$0.a_($$8.e());
            if ($$10 == dga.aV.o() || $$10 == dga.b.o() || $$10 == dga.g.o() || $$10 == dga.c.o() || $$10 == dga.e.o()) {
               dtc $$11 = !$$9.i() && !this.b($$9) ? $$9 : dga.I.o();

               for (ji $$12 : ji.values()) {
                  jd $$13 = $$8.a($$12);
                  dtc $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     jd $$15 = $$13.e();
                     dtc $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != ji.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new ejh($$8);
               this.a($$0, $$4, $$3, $$8, erl.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dtc $$0) {
         return $$0 == dga.G.o() || $$0 == dga.H.o();
      }
   }
}
