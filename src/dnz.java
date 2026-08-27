public class dnz extends dpl {
   private jg<cto> d = jg.a(27, cto.i);
   private final dot e = new dot() {
      @Override
      protected void a(dax $$0, io $$1, drb $$2) {
         dnz.this.a($$2, avh.bz);
         dnz.this.a($$2, true);
      }

      @Override
      protected void b(dax $$0, io $$1, drb $$2) {
         dnz.this.a($$2, avh.by);
         dnz.this.a($$2, false);
      }

      @Override
      protected void a(dax $$0, io $$1, drb $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(clw $$0) {
         if ($$0.cc instanceof cpa) {
            bpn $$1 = ((cpa)$$0.cc).l();
            return $$1 == dnz.this;
         } else {
            return false;
         }
      }
   };

   public dnz(io $$0, drb $$1) {
      super(doi.A, $$0, $$1);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpo.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.d = jg.a(this.b(), cto.i);
      if (!this.a_($$0)) {
         bpo.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jg<cto> j() {
      return this.d;
   }

   @Override
   protected void a(jg<cto> $$0) {
      this.d = $$0;
   }

   @Override
   protected wx k() {
      return wx.c("container.barrel");
   }

   @Override
   protected cot a(int $$0, clv $$1) {
      return cpa.a($$0, $$1, this);
   }

   @Override
   public void d_(clw $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(clw $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(drb $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(dde.c, Boolean.valueOf($$1)), 3);
   }

   void a(drb $$0, avg $$1) {
      js $$2 = $$0.c(dde.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avi.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}
