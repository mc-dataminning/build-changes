public class dyg extends dzx {
   private jp<dak> d = jp.a(27, dak.l);
   private final dzc e = new dzc() {
      @Override
      protected void a(dkj $$0, iw $$1, ebq $$2) {
         dyg.this.a($$2, awy.bz);
         dyg.this.a($$2, true);
      }

      @Override
      protected void b(dkj $$0, iw $$1, ebq $$2) {
         dyg.this.a($$2, awy.by);
         dyg.this.a($$2, false);
      }

      @Override
      protected void a(dkj $$0, iw $$1, ebq $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(csi $$0) {
         if ($$0.bR instanceof cwk) {
            buv $$1 = ((cwk)$$0.bR).l();
            return $$1 == dyg.this;
         } else {
            return false;
         }
      }
   };

   public dyg(iw $$0, ebq $$1) {
      super(dyq.B, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         buw.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.d = jp.a(this.b(), dak.l);
      if (!this.b_($$0)) {
         buw.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jp<dak> f() {
      return this.d;
   }

   @Override
   protected void a(jp<dak> $$0) {
      this.d = $$0;
   }

   @Override
   protected xg j() {
      return xg.c("container.barrel");
   }

   @Override
   protected cwb a(int $$0, csh $$1) {
      return cwk.a($$0, $$1, this);
   }

   @Override
   public void c_(csi $$0) {
      if (!this.p && !$$0.ak()) {
         this.e.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(csi $$0) {
      if (!this.p && !$$0.ak()) {
         this.e.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.ax_(), this.m());
      }
   }

   void a(ebq $$0, boolean $$1) {
      this.n.a(this.ax_(), $$0.b(dmu.c, Boolean.valueOf($$1)), 3);
   }

   void a(ebq $$0, awx $$1) {
      kb $$2 = $$0.c(dmu.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awz.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
