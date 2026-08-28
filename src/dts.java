public class dts extends dvh {
   private ka<cwp> d = ka.a(27, cwp.j);
   private final dum e = new dum() {
      @Override
      protected void a(dgi $$0, ji $$1, dwx $$2) {
         dts.this.a($$2, awa.bz);
         dts.this.a($$2, true);
      }

      @Override
      protected void b(dgi $$0, ji $$1, dwx $$2) {
         dts.this.a($$2, awa.by);
         dts.this.a($$2, false);
      }

      @Override
      protected void a(dgi $$0, ji $$1, dwx $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cox $$0) {
         if ($$0.cd instanceof csl) {
            bsd $$1 = ((csl)$$0.cd).l();
            return $$1 == dts.this;
         } else {
            return false;
         }
      }
   };

   public dts(ji $$0, dwx $$1) {
      super(dub.B, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bse.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = ka.a(this.b(), cwp.j);
      if (!this.b_($$0)) {
         bse.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ka<cwp> f() {
      return this.d;
   }

   @Override
   protected void a(ka<cwp> $$0) {
      this.d = $$0;
   }

   @Override
   protected wp j() {
      return wp.c("container.barrel");
   }

   @Override
   protected csc a(int $$0, cow $$1) {
      return csl.a($$0, $$1, this);
   }

   @Override
   public void c_(cox $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cox $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aA_(), this.m());
      }
   }

   void a(dwx $$0, boolean $$1) {
      this.n.a(this.aA_(), $$0.b(dis.c, Boolean.valueOf($$1)), 3);
   }

   void a(dwx $$0, avz $$1) {
      km $$2 = $$0.c(dis.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awb.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
