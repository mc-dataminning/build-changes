public class dfw extends dhh {
   private io<cmh> e = io.a(27, cmh.f);
   private final dgq f = new dgq() {
      @Override
      protected void a(csy $$0, hv $$1, dip $$2) {
         dfw.this.a($$2, arc.bk);
         dfw.this.a($$2, true);
      }

      @Override
      protected void b(csy $$0, hv $$1, dip $$2) {
         dfw.this.a($$2, arc.bj);
         dfw.this.a($$2, false);
      }

      @Override
      protected void a(csy $$0, hv $$1, dip $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cer $$0) {
         if ($$0.bS instanceof chr) {
            bje $$1 = ((chr)$$0.bS).l();
            return $$1 == dfw.this;
         } else {
            return false;
         }
      }
   };

   public dfw(hv $$0, dip $$1) {
      super(dgf.A, $$0, $$1);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjf.a($$0, this.e);
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.e = io.a(this.b(), cmh.f);
      if (!this.c_($$0)) {
         bjf.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected io<cmh> k() {
      return this.e;
   }

   @Override
   protected void a(io<cmh> $$0) {
      this.e = $$0;
   }

   @Override
   protected vb l() {
      return vb.c("container.barrel");
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return chr.a($$0, $$1, this);
   }

   @Override
   public void d_(cer $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cer $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.r());
      }
   }

   void a(dip $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.a(cvf.c, Boolean.valueOf($$1)), 3);
   }

   void a(dip $$0, arb $$1) {
      iz $$2 = $$0.c(cvf.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, ard.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
