public class eol extends elp {
   private boolean h;
   private boolean i;

   public eol(azr $$0, int $$1, int $$2) {
      super(emi.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eol(uj $$0) {
      super(emi.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(emh $$0, uj $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dia.o.m(), dia.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dia.o.m(), dia.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dia.o.m(), dia.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dia.o.m(), dia.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dia.o.m(), dia.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dia.o.m(), dia.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dia.o.m(), dia.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dia.U.m(), dia.U.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dia.U.m(), dia.U.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dia.U.m(), dia.U.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dia.U.m(), dia.U.m(), false);
         this.a($$0, dia.dU.m(), 2, 3, 2, $$4);
         this.a($$0, dia.dU.m(), 3, 3, 7, $$4);
         this.a($$0, dia.a.m(), 1, 3, 4, $$4);
         this.a($$0, dia.a.m(), 5, 3, 4, $$4);
         this.a($$0, dia.a.m(), 5, 3, 5, $$4);
         this.a($$0, dia.gp.m(), 1, 3, 5, $$4);
         this.a($$0, dia.cA.m(), 3, 2, 6, $$4);
         this.a($$0, dia.ft.m(), 4, 2, 6, $$4);
         this.a($$0, dia.dU.m(), 1, 2, 1, $$4);
         this.a($$0, dia.dU.m(), 5, 2, 1, $$4);
         dvd $$7 = dia.fK.m().b(dps.b, jl.c);
         dvd $$8 = dia.fK.m().b(dps.b, jl.f);
         dvd $$9 = dia.fK.m().b(dps.b, jl.e);
         dvd $$10 = dia.fK.m().b(dps.b, jl.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dps.d, dwm.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dps.d, dwm.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dps.d, dwm.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dps.d, dwm.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dia.U.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jg $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cmc $$14 = bug.bo.a($$0.E(), buf.d);
               if ($$14 != null) {
                  $$14.gb();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), buf.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dfl $$0, elj $$1) {
      if (!this.i) {
         jg $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cgp $$3 = bug.p.a($$0.E(), buf.d);
            if ($$3 != null) {
               $$3.gb();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), buf.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
