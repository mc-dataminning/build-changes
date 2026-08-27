public class dxl {
   public static class a extends dwe {
      public a(ht $$0) {
         super(dwr.aa, 0, new dvs($$0));
      }

      public a(rt $$0) {
         super(dwr.aa, $$0);
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         int $$7 = $$0.a(dlk.a.c, this.f.g(), this.f.i());
         ht.a $$8 = new ht.a(this.f.g(), $$7, this.f.i());

         while ($$8.v() > $$0.I_()) {
            dgb $$9 = $$0.a_($$8);
            dgb $$10 = $$0.a_($$8.d());
            if ($$10 == cuc.aV.o() || $$10 == cuc.b.o() || $$10 == cuc.g.o() || $$10 == cuc.c.o() || $$10 == cuc.e.o()) {
               dgb $$11 = !$$9.i() && !this.b($$9) ? $$9 : cuc.I.o();

               for (hx $$12 : hx.values()) {
                  ht $$13 = $$8.a($$12);
                  dgb $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ht $$15 = $$13.d();
                     dgb $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != hx.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dvs($$8);
               this.a($$0, $$4, $$3, $$8, edg.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dgb $$0) {
         return $$0 == cuc.G.o() || $$0 == cuc.H.o();
      }
   }
}
