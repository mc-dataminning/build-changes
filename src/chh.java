public abstract class chh extends chi {
   private static final ajw<Boolean> cc = aka.a(chh.class, ajy.k);
   private final bsu cd;

   protected chh(bsx<? extends chh> $$0, dcw $$1) {
      super($$0, $$1);
      this.cA = false;
      this.cd = $$0.n().a(bst.a().a(bss.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayw $$0) {
      this.f(buw.s).a((double)a($$0::a));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   public static buv.a s() {
      return gK().a(buw.v, 0.175F).a(buw.o, 0.5);
   }

   public boolean t() {
      return this.ao.a(cc);
   }

   public void x(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? this.cd : super.e($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.t()) {
         if (!this.dO().B) {
            this.a(dga.cv);
         }

         this.x(false);
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uh $$1 = new uh();

         for (int $$2 = 1; $$2 < this.cw.b(); $$2++) {
            cuq $$3 = this.cw.a($$2);
            if (!$$3.e()) {
               ub $$4 = new ub();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dQ(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gH();
      if (this.t()) {
         uh $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ub $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cw.b() - 1) {
               this.cw.a($$4 + 1, cuq.a(this.dQ(), (uy)$$3).orElse(cuq.l));
            }
         }
      }

      this.gI();
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 499 ? new bug() {
         @Override
         public cuq a() {
            return chh.this.t() ? new cuq(cut.eN) : cuq.l;
         }

         @Override
         public boolean a(cuq $$0) {
            if ($$0.e()) {
               if (chh.this.t()) {
                  chh.this.x(false);
                  chh.this.gH();
               }

               return true;
            } else if ($$0.a(cut.eN)) {
               if (!chh.this.t()) {
                  chh.this.x(true);
                  chh.this.gH();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      boolean $$2 = !this.o_() && this.gz() && $$0.fN();
      if (!this.bT() && !$$2) {
         cuq $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gz()) {
               this.gQ();
               return bqr.a(this.dO().B);
            }

            if (!this.t() && $$3.a(cut.eN)) {
               this.d($$0, $$3);
               return bqr.a(this.dO().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cmx $$0, cuq $$1) {
      this.x(true);
      this.x();
      $$1.a(1, $$0);
      this.gH();
   }

   @Override
   protected void x() {
      this.a(avp.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? 5 : 0;
   }
}
