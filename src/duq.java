public class duq extends dwf {
   private jz<cxp> d = jz.a(27, cxp.j);
   private final dvk e = new dvk() {
      @Override
      protected void a(dhi $$0, jh $$1, dxv $$2) {
         duq.this.a($$2, axf.bz);
         duq.this.a($$2, true);
      }

      @Override
      protected void b(dhi $$0, jh $$1, dxv $$2) {
         duq.this.a($$2, axf.by);
         duq.this.a($$2, false);
      }

      @Override
      protected void a(dhi $$0, jh $$1, dxv $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cpx $$0) {
         if ($$0.cd instanceof ctl) {
            btc $$1 = ((ctl)$$0.cd).l();
            return $$1 == duq.this;
         } else {
            return false;
         }
      }
   };

   public duq(jh $$0, dxv $$1) {
      super(duz.B, $$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btd.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = jz.a(this.b(), cxp.j);
      if (!this.b_($$0)) {
         btd.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jz<cxp> f() {
      return this.d;
   }

   @Override
   protected void a(jz<cxp> $$0) {
      this.d = $$0;
   }

   @Override
   protected xv j() {
      return xv.c("container.barrel");
   }

   @Override
   protected ctc a(int $$0, cpw $$1) {
      return ctl.a($$0, $$1, this);
   }

   @Override
   public void c_(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(dxv $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.b(djs.c, Boolean.valueOf($$1)), 3);
   }

   void a(dxv $$0, axe $$1) {
      kl $$2 = $$0.c(djs.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, axg.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}
