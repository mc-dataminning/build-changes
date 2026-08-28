public class dup extends dwe {
   private jz<cxo> d = jz.a(27, cxo.k);
   private final dvj e = new dvj() {
      @Override
      protected void a(dhh $$0, jh $$1, dxu $$2) {
         dup.this.a($$2, axf.bz);
         dup.this.a($$2, true);
      }

      @Override
      protected void b(dhh $$0, jh $$1, dxu $$2) {
         dup.this.a($$2, axf.by);
         dup.this.a($$2, false);
      }

      @Override
      protected void a(dhh $$0, jh $$1, dxu $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cpw $$0) {
         if ($$0.cd instanceof ctk) {
            btb $$1 = ((ctk)$$0.cd).l();
            return $$1 == dup.this;
         } else {
            return false;
         }
      }
   };

   public dup(jh $$0, dxu $$1) {
      super(duy.B, $$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btc.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = jz.a(this.b(), cxo.k);
      if (!this.b_($$0)) {
         btc.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jz<cxo> f() {
      return this.d;
   }

   @Override
   protected void a(jz<cxo> $$0) {
      this.d = $$0;
   }

   @Override
   protected xv j() {
      return xv.c("container.barrel");
   }

   @Override
   protected ctb a(int $$0, cpv $$1) {
      return ctk.a($$0, $$1, this);
   }

   @Override
   public void c_(cpw $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cpw $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(dxu $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.b(djr.c, Boolean.valueOf($$1)), 3);
   }

   void a(dxu $$0, axe $$1) {
      kl $$2 = $$0.c(djr.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, axg.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}
