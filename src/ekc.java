public class ekc extends ehh {
   private boolean h;
   private boolean i;

   public ekc(ayk $$0, int $$1, int $$2) {
      super(eia.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public ekc(ud $$0) {
      super(eia.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ehz $$0, ud $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dea.o.n(), dea.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dea.o.n(), dea.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dea.o.n(), dea.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dea.o.n(), dea.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dea.o.n(), dea.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dea.o.n(), dea.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dea.o.n(), dea.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dea.U.n(), dea.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dea.U.n(), dea.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dea.U.n(), dea.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dea.U.n(), dea.U.n(), false);
         this.a($$0, dea.dU.n(), 2, 3, 2, $$4);
         this.a($$0, dea.dU.n(), 3, 3, 7, $$4);
         this.a($$0, dea.a.n(), 1, 3, 4, $$4);
         this.a($$0, dea.a.n(), 5, 3, 4, $$4);
         this.a($$0, dea.a.n(), 5, 3, 5, $$4);
         this.a($$0, dea.gp.n(), 1, 3, 5, $$4);
         this.a($$0, dea.cA.n(), 3, 2, 6, $$4);
         this.a($$0, dea.ft.n(), 4, 2, 6, $$4);
         this.a($$0, dea.dU.n(), 1, 2, 1, $$4);
         this.a($$0, dea.dU.n(), 5, 2, 1, $$4);
         drb $$7 = dea.fK.n().a(dls.b, it.c);
         drb $$8 = dea.fK.n().a(dls.b, it.f);
         drb $$9 = dea.fK.n().a(dls.b, it.e);
         drb $$10 = dea.fK.n().a(dls.b, it.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dls.d, dsk.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dls.d, dsk.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dls.d, dsk.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dls.d, dsk.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dea.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            io $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cjs $$14 = bsa.bo.a((dax)$$0.E());
               if ($$14 != null) {
                  $$14.fT();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bss.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dbm $$0, ehb $$1) {
      if (!this.i) {
         io $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            ceh $$3 = bsa.p.a((dax)$$0.E());
            if ($$3 != null) {
               $$3.fT();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bss.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
