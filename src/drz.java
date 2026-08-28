public class drz extends dtn {
   private jy<cvx> d = jy.a(27, cvx.k);
   private final dst e = new dst() {
      @Override
      protected void a(dev $$0, jg $$1, dvd $$2) {
         drz.this.a($$2, awk.bz);
         drz.this.a($$2, true);
      }

      @Override
      protected void b(dev $$0, jg $$1, dvd $$2) {
         drz.this.a($$2, awk.by);
         drz.this.a($$2, false);
      }

      @Override
      protected void a(dev $$0, jg $$1, dvd $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(coh $$0) {
         if ($$0.ca instanceof crs) {
            brr $$1 = ((crs)$$0.ca).l();
            return $$1 == drz.this;
         } else {
            return false;
         }
      }
   };

   public drz(jg $$0, dvd $$1) {
      super(dsi.A, $$0, $$1);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brs.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.d = jy.a(this.b(), cvx.k);
      if (!this.b_($$0)) {
         brs.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jy<cvx> f() {
      return this.d;
   }

   @Override
   protected void a(jy<cvx> $$0) {
      this.d = $$0;
   }

   @Override
   protected xh j() {
      return xh.c("container.barrel");
   }

   @Override
   protected crj a(int $$0, cog $$1) {
      return crs.a($$0, $$1, this);
   }

   @Override
   public void d_(coh $$0) {
      if (!this.q && !$$0.R_()) {
         this.e.a($$0, this.i(), this.aC_(), this.m());
      }
   }

   @Override
   public void c(coh $$0) {
      if (!this.q && !$$0.R_()) {
         this.e.b($$0, this.i(), this.aC_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aC_(), this.m());
      }
   }

   void a(dvd $$0, boolean $$1) {
      this.o.a(this.aC_(), $$0.b(dhe.c, Boolean.valueOf($$1)), 3);
   }

   void a(dvd $$0, awj $$1) {
      kk $$2 = $$0.c(dhe.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awl.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}
