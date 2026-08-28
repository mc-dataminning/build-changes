public class dwx extends dyo {
   private jn<czd> d = jn.a(27, czd.k);
   private final dxt e = new dxt() {
      @Override
      protected void a(dja $$0, iu $$1, eah $$2) {
         dwx.this.a($$2, awn.bz);
         dwx.this.a($$2, true);
      }

      @Override
      protected void b(dja $$0, iu $$1, eah $$2) {
         dwx.this.a($$2, awn.by);
         dwx.this.a($$2, false);
      }

      @Override
      protected void a(dja $$0, iu $$1, eah $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(crc $$0) {
         if ($$0.bR instanceof cve) {
            btw $$1 = ((cve)$$0.bR).l();
            return $$1 == dwx.this;
         } else {
            return false;
         }
      }
   };

   public dwx(iu $$0, eah $$1) {
      super(dxh.B, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btx.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = jn.a(this.b(), czd.k);
      if (!this.b_($$0)) {
         btx.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jn<czd> f() {
      return this.d;
   }

   @Override
   protected void a(jn<czd> $$0) {
      this.d = $$0;
   }

   @Override
   protected wy j() {
      return wy.c("container.barrel");
   }

   @Override
   protected cuv a(int $$0, crb $$1) {
      return cve.a($$0, $$1, this);
   }

   @Override
   public void c_(crc $$0) {
      if (!this.p && !$$0.V_()) {
         this.e.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(crc $$0) {
      if (!this.p && !$$0.V_()) {
         this.e.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.ax_(), this.m());
      }
   }

   void a(eah $$0, boolean $$1) {
      this.n.a(this.ax_(), $$0.b(dll.c, Boolean.valueOf($$1)), 3);
   }

   void a(eah $$0, awm $$1) {
      jz $$2 = $$0.c(dll.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
