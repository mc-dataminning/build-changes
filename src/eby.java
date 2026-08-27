public class eby extends dzd {
   private boolean h;
   private boolean i;

   public eby(auu $$0, int $$1, int $$2) {
      super(dzw.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eby(sn $$0) {
      super(dzw.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dzv $$0, sn $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, hx $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cwr.o.o(), cwr.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cwr.o.o(), cwr.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cwr.o.o(), cwr.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cwr.o.o(), cwr.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cwr.o.o(), cwr.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cwr.o.o(), cwr.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cwr.o.o(), cwr.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cwr.U.o(), cwr.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cwr.U.o(), cwr.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cwr.U.o(), cwr.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cwr.U.o(), cwr.U.o(), false);
         this.a($$0, cwr.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cwr.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cwr.a.o(), 1, 3, 4, $$4);
         this.a($$0, cwr.a.o(), 5, 3, 4, $$4);
         this.a($$0, cwr.a.o(), 5, 3, 5, $$4);
         this.a($$0, cwr.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cwr.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cwr.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cwr.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cwr.dU.o(), 5, 2, 1, $$4);
         djg $$7 = cwr.fK.o().a(dei.b, ic.c);
         djg $$8 = cwr.fK.o().a(dei.b, ic.f);
         djg $$9 = cwr.fK.o().a(dei.b, ic.e);
         djg $$10 = cwr.fK.o().a(dei.b, ic.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dei.d, dkp.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dei.d, dkp.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dei.d, dkp.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dei.d, dkp.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cwr.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            hx $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cde $$14 = bly.bl.a((cto)$$0.E());
               if ($$14 != null) {
                  $$14.fJ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bmo.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cud $$0, dyx $$1) {
      if (!this.i) {
         hx $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bya $$3 = bly.n.a((cto)$$0.E());
            if ($$3 != null) {
               $$3.fJ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bmo.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
