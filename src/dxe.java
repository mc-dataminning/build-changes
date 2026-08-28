public class dxe extends dyv {
   private jo<czk> d = jo.a(27, czk.k);
   private final dya e = new dya() {
      @Override
      protected void a(djh $$0, iv $$1, eao $$2) {
         dxe.this.a($$2, awn.bz);
         dxe.this.a($$2, true);
      }

      @Override
      protected void b(djh $$0, iv $$1, eao $$2) {
         dxe.this.a($$2, awn.by);
         dxe.this.a($$2, false);
      }

      @Override
      protected void a(djh $$0, iv $$1, eao $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(crj $$0) {
         if ($$0.bR instanceof cvl) {
            btz $$1 = ((cvl)$$0.bR).l();
            return $$1 == dxe.this;
         } else {
            return false;
         }
      }
   };

   public dxe(iv $$0, eao $$1) {
      super(dxo.B, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bua.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.d = jo.a(this.b(), czk.k);
      if (!this.b_($$0)) {
         bua.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jo<czk> f() {
      return this.d;
   }

   @Override
   protected void a(jo<czk> $$0) {
      this.d = $$0;
   }

   @Override
   protected wy j() {
      return wy.c("container.barrel");
   }

   @Override
   protected cvc a(int $$0, cri $$1) {
      return cvl.a($$0, $$1, this);
   }

   @Override
   public void c_(crj $$0) {
      if (!this.p && !$$0.V_()) {
         this.e.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(crj $$0) {
      if (!this.p && !$$0.V_()) {
         this.e.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.ax_(), this.m());
      }
   }

   void a(eao $$0, boolean $$1) {
      this.n.a(this.ax_(), $$0.b(dls.c, Boolean.valueOf($$1)), 3);
   }

   void a(eao $$0, awm $$1) {
      ka $$2 = $$0.c(dls.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
