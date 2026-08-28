public class eml extends ejp {
   private boolean h;
   private boolean i;

   public eml(ayw $$0, int $$1, int $$2) {
      super(eki.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eml(ub $$0) {
      super(eki.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ekh $$0, ub $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dga.o.o(), dga.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dga.o.o(), dga.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dga.o.o(), dga.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dga.o.o(), dga.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dga.o.o(), dga.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dga.o.o(), dga.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dga.o.o(), dga.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dga.U.o(), dga.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dga.U.o(), dga.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dga.U.o(), dga.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dga.U.o(), dga.U.o(), false);
         this.a($$0, dga.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dga.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dga.a.o(), 1, 3, 4, $$4);
         this.a($$0, dga.a.o(), 5, 3, 4, $$4);
         this.a($$0, dga.a.o(), 5, 3, 5, $$4);
         this.a($$0, dga.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dga.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dga.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dga.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dga.dU.o(), 5, 2, 1, $$4);
         dtc $$7 = dga.fK.o().a(dnt.b, ji.c);
         dtc $$8 = dga.fK.o().a(dnt.b, ji.f);
         dtc $$9 = dga.fK.o().a(dnt.b, ji.e);
         dtc $$10 = dga.fK.o().a(dnt.b, ji.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dnt.d, dul.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dnt.d, dul.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dnt.d, dul.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dnt.d, dul.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dga.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jd $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckt $$14 = bsx.bo.a((dcw)$$0.E());
               if ($$14 != null) {
                  $$14.fR();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btr.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(ddl $$0, ejj $$1) {
      if (!this.i) {
         jd $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cfh $$3 = bsx.p.a((dcw)$$0.E());
            if ($$3 != null) {
               $$3.fR();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btr.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
