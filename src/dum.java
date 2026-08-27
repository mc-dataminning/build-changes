public class dum extends dry {
   private boolean h;
   private boolean i;

   public dum(apf $$0, int $$1, int $$2) {
      super(dsr.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dum(qr $$0) {
      super(dsr.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dsq $$0, qr $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cpo.o.n(), cpo.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cpo.o.n(), cpo.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cpo.o.n(), cpo.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cpo.o.n(), cpo.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cpo.o.n(), cpo.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cpo.o.n(), cpo.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cpo.o.n(), cpo.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cpo.U.n(), cpo.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cpo.U.n(), cpo.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cpo.U.n(), cpo.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cpo.U.n(), cpo.U.n(), false);
         this.a($$0, cpo.dU.n(), 2, 3, 2, $$4);
         this.a($$0, cpo.dU.n(), 3, 3, 7, $$4);
         this.a($$0, cpo.a.n(), 1, 3, 4, $$4);
         this.a($$0, cpo.a.n(), 5, 3, 4, $$4);
         this.a($$0, cpo.a.n(), 5, 3, 5, $$4);
         this.a($$0, cpo.gp.n(), 1, 3, 5, $$4);
         this.a($$0, cpo.cA.n(), 3, 2, 6, $$4);
         this.a($$0, cpo.ft.n(), 4, 2, 6, $$4);
         this.a($$0, cpo.dU.n(), 1, 2, 1, $$4);
         this.a($$0, cpo.dU.n(), 5, 2, 1, $$4);
         dcb $$7 = cpo.fK.n().a(cxh.a, ha.c);
         dcb $$8 = cpo.fK.n().a(cxh.a, ha.f);
         dcb $$9 = cpo.fK.n().a(cxh.a, ha.e);
         dcb $$10 = cpo.fK.n().a(cxh.a, ha.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(cxh.c, ddk.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(cxh.c, ddk.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(cxh.c, ddk.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(cxh.c, ddk.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cpo.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            gu $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               bws $$14 = bfn.bj.a((cmm)$$0.C());
               if ($$14 != null) {
                  $$14.fF();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bgd.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cnb $$0, drs $$1) {
      if (!this.i) {
         gu $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bro $$3 = bfn.m.a((cmm)$$0.C());
            if ($$3 != null) {
               $$3.fF();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bgd.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
