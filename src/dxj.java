public class dxj extends dza {
   private jo<czn> d = jo.a(27, czn.k);
   private final dyf e = new dyf() {
      @Override
      protected void a(djm $$0, iv $$1, eat $$2) {
         dxj.this.a($$2, awn.bz);
         dxj.this.a($$2, true);
      }

      @Override
      protected void b(djm $$0, iv $$1, eat $$2) {
         dxj.this.a($$2, awn.by);
         dxj.this.a($$2, false);
      }

      @Override
      protected void a(djm $$0, iv $$1, eat $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(crm $$0) {
         if ($$0.bR instanceof cvo) {
            btz $$1 = ((cvo)$$0.bR).l();
            return $$1 == dxj.this;
         } else {
            return false;
         }
      }
   };

   public dxj(iv $$0, eat $$1) {
      super(dxt.B, $$0, $$1);
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
      this.d = jo.a(this.b(), czn.k);
      if (!this.b_($$0)) {
         bua.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jo<czn> f() {
      return this.d;
   }

   @Override
   protected void a(jo<czn> $$0) {
      this.d = $$0;
   }

   @Override
   protected wy j() {
      return wy.c("container.barrel");
   }

   @Override
   protected cvf a(int $$0, crl $$1) {
      return cvo.a($$0, $$1, this);
   }

   @Override
   public void c_(crm $$0) {
      if (!this.p && !$$0.V_()) {
         this.e.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(crm $$0) {
      if (!this.p && !$$0.V_()) {
         this.e.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.ax_(), this.m());
      }
   }

   void a(eat $$0, boolean $$1) {
      this.n.a(this.ax_(), $$0.b(dlx.c, Boolean.valueOf($$1)), 3);
   }

   void a(eat $$0, awm $$1) {
      ka $$2 = $$0.c(dlx.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
