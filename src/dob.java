public class dob extends dpn {
   private jg<ctq> d = jg.a(27, ctq.i);
   private final dov e = new dov() {
      @Override
      protected void a(daz $$0, io $$1, drd $$2) {
         dob.this.a($$2, avi.bz);
         dob.this.a($$2, true);
      }

      @Override
      protected void b(daz $$0, io $$1, drd $$2) {
         dob.this.a($$2, avi.by);
         dob.this.a($$2, false);
      }

      @Override
      protected void a(daz $$0, io $$1, drd $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cly $$0) {
         if ($$0.cb instanceof cpc) {
            bpp $$1 = ((cpc)$$0.cb).l();
            return $$1 == dob.this;
         } else {
            return false;
         }
      }
   };

   public dob(io $$0, drd $$1) {
      super(dok.A, $$0, $$1);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpq.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.d = jg.a(this.b(), ctq.i);
      if (!this.a_($$0)) {
         bpq.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jg<ctq> j() {
      return this.d;
   }

   @Override
   protected void a(jg<ctq> $$0) {
      this.d = $$0;
   }

   @Override
   protected wx k() {
      return wx.c("container.barrel");
   }

   @Override
   protected cov a(int $$0, clx $$1) {
      return cpc.a($$0, $$1, this);
   }

   @Override
   public void d_(cly $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public void c(cly $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.aA_(), this.n());
      }
   }

   void a(drd $$0, boolean $$1) {
      this.n.a(this.aA_(), $$0.a(ddg.c, Boolean.valueOf($$1)), 3);
   }

   void a(drd $$0, avh $$1) {
      js $$2 = $$0.c(ddg.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avj.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}
