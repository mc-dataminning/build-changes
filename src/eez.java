public class eez extends ece {
   private boolean h;
   private boolean i;

   public eez(awt $$0, int $$1, int $$2) {
      super(ecx.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eez(sy $$0) {
      super(ecx.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ecw $$0, sy $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, czh.o.o(), czh.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, czh.o.o(), czh.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, czh.o.o(), czh.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, czh.o.o(), czh.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, czh.o.o(), czh.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, czh.o.o(), czh.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, czh.o.o(), czh.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, czh.U.o(), czh.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, czh.U.o(), czh.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, czh.U.o(), czh.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, czh.U.o(), czh.U.o(), false);
         this.a($$0, czh.dU.o(), 2, 3, 2, $$4);
         this.a($$0, czh.dU.o(), 3, 3, 7, $$4);
         this.a($$0, czh.a.o(), 1, 3, 4, $$4);
         this.a($$0, czh.a.o(), 5, 3, 4, $$4);
         this.a($$0, czh.a.o(), 5, 3, 5, $$4);
         this.a($$0, czh.gp.o(), 1, 3, 5, $$4);
         this.a($$0, czh.cA.o(), 3, 2, 6, $$4);
         this.a($$0, czh.ft.o(), 4, 2, 6, $$4);
         this.a($$0, czh.dU.o(), 1, 2, 1, $$4);
         this.a($$0, czh.dU.o(), 5, 2, 1, $$4);
         dme $$7 = czh.fK.o().a(dgy.b, ih.c);
         dme $$8 = czh.fK.o().a(dgy.b, ih.f);
         dme $$9 = czh.fK.o().a(dgy.b, ih.e);
         dme $$10 = czh.fK.o().a(dgy.b, ih.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dgy.d, dnn.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dgy.d, dnn.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dgy.d, dnn.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dgy.d, dnn.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, czh.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ib $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cfw $$14 = bol.bm.a((cwe)$$0.E());
               if ($$14 != null) {
                  $$14.fQ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bpb.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cwt $$0, eby $$1) {
      if (!this.i) {
         ib $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cap $$3 = bol.o.a((cwe)$$0.E());
            if ($$3 != null) {
               $$3.fQ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bpb.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
