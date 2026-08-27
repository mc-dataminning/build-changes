public class emm extends ejr {
   private boolean h;
   private boolean i;

   public emm(ayt $$0, int $$1, int $$2) {
      super(ekk.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public emm(uk $$0) {
      super(ekk.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ekj $$0, uk $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dfe.T.n(), dfe.T.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dfe.T.n(), dfe.T.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dfe.T.n(), dfe.T.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dfe.T.n(), dfe.T.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dfe.T.n(), dfe.T.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dfe.T.n(), dfe.T.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dfe.T.n(), dfe.T.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dfe.aC.n(), dfe.aC.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dfe.aC.n(), dfe.aC.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dfe.aC.n(), dfe.aC.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dfe.aC.n(), dfe.aC.n(), false);
         this.a($$0, dfe.eI.n(), 2, 3, 2, $$4);
         this.a($$0, dfe.eI.n(), 3, 3, 7, $$4);
         this.a($$0, dfe.a.n(), 1, 3, 4, $$4);
         this.a($$0, dfe.a.n(), 5, 3, 4, $$4);
         this.a($$0, dfe.a.n(), 5, 3, 5, $$4);
         this.a($$0, dfe.hj.n(), 1, 3, 5, $$4);
         this.a($$0, dfe.dl.n(), 3, 2, 6, $$4);
         this.a($$0, dfe.gl.n(), 4, 2, 6, $$4);
         this.a($$0, dfe.eI.n(), 1, 2, 1, $$4);
         this.a($$0, dfe.eI.n(), 5, 2, 1, $$4);
         dtc $$7 = dfe.gD.n().a(dnk.b, iw.c);
         dtc $$8 = dfe.gD.n().a(dnk.b, iw.f);
         dtc $$9 = dfe.gD.n().a(dnk.b, iw.e);
         dtc $$10 = dfe.gD.n().a(dnk.b, iw.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dnk.d, dul.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dnk.d, dul.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dnk.d, dul.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dnk.d, dul.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dfe.aC.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ir $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cju $$14 = bsb.bs.a((dca)$$0.E());
               if ($$14 != null) {
                  $$14.gc();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bss.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dcp $$0, ejl $$1) {
      if (!this.i) {
         ir $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            ceh $$3 = bsb.r.a((dca)$$0.E());
            if ($$3 != null) {
               $$3.gc();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bss.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
