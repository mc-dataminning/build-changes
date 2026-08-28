public class elp extends eiu {
   private boolean h;
   private boolean i;

   public elp(ayo $$0, int $$1, int $$2) {
      super(ejn.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public elp(tx $$0) {
      super(ejn.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ejm $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dfj.o.o(), dfj.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dfj.o.o(), dfj.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dfj.o.o(), dfj.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dfj.o.o(), dfj.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dfj.o.o(), dfj.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dfj.o.o(), dfj.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dfj.o.o(), dfj.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dfj.U.o(), dfj.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dfj.U.o(), dfj.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dfj.U.o(), dfj.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dfj.U.o(), dfj.U.o(), false);
         this.a($$0, dfj.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dfj.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dfj.a.o(), 1, 3, 4, $$4);
         this.a($$0, dfj.a.o(), 5, 3, 4, $$4);
         this.a($$0, dfj.a.o(), 5, 3, 5, $$4);
         this.a($$0, dfj.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dfj.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dfj.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dfj.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dfj.dU.o(), 5, 2, 1, $$4);
         dsk $$7 = dfj.fK.o().a(dnb.b, jf.c);
         dsk $$8 = dfj.fK.o().a(dnb.b, jf.f);
         dsk $$9 = dfj.fK.o().a(dnb.b, jf.e);
         dsk $$10 = dfj.fK.o().a(dnb.b, jf.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dnb.d, dtt.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dnb.d, dtt.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dnb.d, dtt.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dnb.d, dtt.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dfj.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ja $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckg $$14 = bsm.bo.a((dcf)$$0.E());
               if ($$14 != null) {
                  $$14.fR();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btf.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dcu $$0, eio $$1) {
      if (!this.i) {
         ja $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            ceu $$3 = bsm.p.a((dcf)$$0.E());
            if ($$3 != null) {
               $$3.fR();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btf.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
