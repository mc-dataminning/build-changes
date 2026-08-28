public class eug {
   public static class a extends esr {
      public a(iw $$0) {
         super(ete.aa, 0, new esf($$0));
      }

      public a(ua $$0) {
         super(ete.aa, $$0);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         int $$7 = $$0.a(ehp.a.c, this.f.h(), this.f.j());
         iw.a $$8 = new iw.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.K_()) {
            ebq $$9 = $$0.a_($$8);
            ebq $$10 = $$0.a_($$8.e());
            if ($$10 == dnq.bc.m() || $$10 == dnq.b.m() || $$10 == dnq.g.m() || $$10 == dnq.c.m() || $$10 == dnq.e.m()) {
               ebq $$11 = !$$9.l() && !this.b($$9) ? $$9 : dnq.L.m();

               for (jc $$12 : jc.values()) {
                  iw $$13 = $$8.a($$12);
                  ebq $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iw $$15 = $$13.e();
                     ebq $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jc.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new esf($$8);
               this.a($$0, $$4, $$3, $$8, fap.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(ebq $$0) {
         return $$0 == dnq.J.m() || $$0 == dnq.K.m();
      }
   }
}
