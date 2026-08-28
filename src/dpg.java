public class dpg extends dqs {
   private js<cua> d = js.a(27, cua.l);
   private final dqa e = new dqa() {
      @Override
      protected void a(dcd $$0, ja $$1, dsh $$2) {
         dpg.this.a($$2, avf.bz);
         dpg.this.a($$2, true);
      }

      @Override
      protected void b(dcd $$0, ja $$1, dsh $$2) {
         dpg.this.a($$2, avf.by);
         dpg.this.a($$2, false);
      }

      @Override
      protected void a(dcd $$0, ja $$1, dsh $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmh $$0) {
         if ($$0.cd instanceof cpm) {
            bpw $$1 = ((cpm)$$0.cd).l();
            return $$1 == dpg.this;
         } else {
            return false;
         }
      }
   };

   public dpg(ja $$0, dsh $$1) {
      super(dpp.A, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpx.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.d = js.a(this.b(), cua.l);
      if (!this.a_($$0)) {
         bpx.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected js<cua> j() {
      return this.d;
   }

   @Override
   protected void a(js<cua> $$0) {
      this.d = $$0;
   }

   @Override
   protected wu k() {
      return wu.c("container.barrel");
   }

   @Override
   protected cpe a(int $$0, cmg $$1) {
      return cpm.a($$0, $$1, this);
   }

   @Override
   public void d_(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dsh $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(del.c, Boolean.valueOf($$1)), 3);
   }

   void a(dsh $$0, ave $$1) {
      ke $$2 = $$0.c(del.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avg.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}
