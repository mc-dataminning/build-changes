public abstract class chh extends chi {
   private static final ajw<Boolean> ca = aka.a(chh.class, ajy.k);
   private final bsu cb;

   protected chh(bsx<? extends chh> $$0, dcw $$1) {
      super($$0, $$1);
      this.cy = false;
      this.cb = $$0.n().a(bst.a().a(bss.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayw $$0) {
      this.f(buw.s).a((double)a($$0::a));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   public static buv.a s() {
      return gL().a(buw.v, 0.175F).a(buw.o, 0.5);
   }

   public boolean t() {
      return this.ao.a(ca);
   }

   public void w(boolean $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? this.cb : super.e($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.t()) {
         if (!this.dP().B) {
            this.a(dga.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uh $$1 = new uh();

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cuq $$3 = this.cu.a($$2);
            if (!$$3.e()) {
               ub $$4 = new ub();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dR(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gI();
      if (this.t()) {
         uh $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ub $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cuq.a(this.dR(), (uy)$$3).orElse(cuq.l));
            }
         }
      }

      this.gJ();
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
                  chh.this.w(false);
                  chh.this.gI();
               }

               return true;
            } else if ($$0.a(cut.eN)) {
               if (!chh.this.t()) {
                  chh.this.w(true);
                  chh.this.gI();
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
      boolean $$2 = !this.o_() && this.gA() && $$0.fO();
      if (!this.bT() && !$$2) {
         cuq $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gA()) {
               this.gR();
               return bqr.a(this.dP().B);
            }

            if (!this.t() && $$3.a(cut.eN)) {
               this.d($$0, $$3);
               return bqr.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cmx $$0, cuq $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gI();
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
