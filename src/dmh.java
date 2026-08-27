public class dmh extends dnt {
   private iw<crs> e = iw.a(27, crs.i);
   private final dnb f = new dnb() {
      @Override
      protected void a(czg $$0, id $$1, dpi $$2) {
         dmh.this.a($$2, auo.bz);
         dmh.this.a($$2, true);
      }

      @Override
      protected void b(czg $$0, id $$1, dpi $$2) {
         dmh.this.a($$2, auo.by);
         dmh.this.a($$2, false);
      }

      @Override
      protected void a(czg $$0, id $$1, dpi $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cka $$0) {
         if ($$0.ca instanceof cnd) {
            bny $$1 = ((cnd)$$0.ca).l();
            return $$1 == dmh.this;
         } else {
            return false;
         }
      }
   };

   public dmh(id $$0, dpi $$1) {
      super(dmq.A, $$0, $$1);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnz.a($$0, this.e, $$1);
      }
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.e = iw.a(this.b(), crs.i);
      if (!this.a_($$0)) {
         bnz.b($$0, this.e, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iw<crs> j() {
      return this.e;
   }

   @Override
   protected void a(iw<crs> $$0) {
      this.e = $$0;
   }

   @Override
   protected wi k() {
      return wi.c("container.barrel");
   }

   @Override
   protected cmw a(int $$0, cjz $$1) {
      return cnd.a($$0, $$1, this);
   }

   @Override
   public void d_(cka $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cka $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.q) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dpi $$0, boolean $$1) {
      this.o.a(this.az_(), $$0.a(dbn.c, Boolean.valueOf($$1)), 3);
   }

   void a(dpi $$0, aun $$1) {
      ji $$2 = $$0.c(dbn.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aup.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
