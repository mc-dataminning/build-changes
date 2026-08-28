public class dpi extends dqv {
   private js<cuc> d = js.a(27, cuc.l);
   private final dqc e = new dqc() {
      @Override
      protected void a(dcf $$0, ja $$1, dsk $$2) {
         dpi.this.a($$2, avh.bz);
         dpi.this.a($$2, true);
      }

      @Override
      protected void b(dcf $$0, ja $$1, dsk $$2) {
         dpi.this.a($$2, avh.by);
         dpi.this.a($$2, false);
      }

      @Override
      protected void a(dcf $$0, ja $$1, dsk $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmk $$0) {
         if ($$0.cd instanceof cpp) {
            bpz $$1 = ((cpp)$$0.cd).l();
            return $$1 == dpi.this;
         } else {
            return false;
         }
      }
   };

   public dpi(ja $$0, dsk $$1) {
      super(dpr.A, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqa.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.d = js.a(this.b(), cuc.l);
      if (!this.a_($$0)) {
         bqa.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected js<cuc> j() {
      return this.d;
   }

   @Override
   protected void a(js<cuc> $$0) {
      this.d = $$0;
   }

   @Override
   protected wu k() {
      return wu.c("container.barrel");
   }

   @Override
   protected cph a(int $$0, cmj $$1) {
      return cpp.a($$0, $$1, this);
   }

   @Override
   public void d_(cmk $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cmk $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dsk $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(den.c, Boolean.valueOf($$1)), 3);
   }

   void a(dsk $$0, avg $$1) {
      ke $$2 = $$0.c(den.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avi.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}
