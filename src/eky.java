public class eky extends eid {
   private boolean h;
   private boolean i;

   public eky(azc $$0, int $$1, int $$2) {
      super(eiw.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eky(ur $$0) {
      super(eiw.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(eiv $$0, ur $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dew.o.n(), dew.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dew.o.n(), dew.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dew.o.n(), dew.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dew.o.n(), dew.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dew.o.n(), dew.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dew.o.n(), dew.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dew.o.n(), dew.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dew.U.n(), dew.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dew.U.n(), dew.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dew.U.n(), dew.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dew.U.n(), dew.U.n(), false);
         this.a($$0, dew.dU.n(), 2, 3, 2, $$4);
         this.a($$0, dew.dU.n(), 3, 3, 7, $$4);
         this.a($$0, dew.a.n(), 1, 3, 4, $$4);
         this.a($$0, dew.a.n(), 5, 3, 4, $$4);
         this.a($$0, dew.a.n(), 5, 3, 5, $$4);
         this.a($$0, dew.gp.n(), 1, 3, 5, $$4);
         this.a($$0, dew.cA.n(), 3, 2, 6, $$4);
         this.a($$0, dew.ft.n(), 4, 2, 6, $$4);
         this.a($$0, dew.dU.n(), 1, 2, 1, $$4);
         this.a($$0, dew.dU.n(), 5, 2, 1, $$4);
         drx $$7 = dew.fK.n().a(dmo.b, je.c);
         drx $$8 = dew.fK.n().a(dmo.b, je.f);
         drx $$9 = dew.fK.n().a(dmo.b, je.e);
         drx $$10 = dew.fK.n().a(dmo.b, je.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dmo.d, dtg.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dmo.d, dtg.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dmo.d, dtg.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dmo.d, dtg.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dew.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iz $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cko $$14 = bsv.bo.a((dbt)$$0.E());
               if ($$14 != null) {
                  $$14.fU();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bto.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dci $$0, ehx $$1) {
      if (!this.i) {
         iz $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cfd $$3 = bsv.p.a((dbt)$$0.E());
            if ($$3 != null) {
               $$3.fU();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bto.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
