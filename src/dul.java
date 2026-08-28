public class dul extends dwa {
   private ka<cxh> d = ka.a(27, cxh.k);
   private final dvf e = new dvf() {
      @Override
      protected void a(dgz $$0, ji $$1, dxq $$2) {
         dul.this.a($$2, awa.bz);
         dul.this.a($$2, true);
      }

      @Override
      protected void b(dgz $$0, ji $$1, dxq $$2) {
         dul.this.a($$2, awa.by);
         dul.this.a($$2, false);
      }

      @Override
      protected void a(dgz $$0, ji $$1, dxq $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cpr $$0) {
         if ($$0.bQ instanceof ctf) {
            bsr $$1 = ((ctf)$$0.bQ).l();
            return $$1 == dul.this;
         } else {
            return false;
         }
      }
   };

   public dul(ji $$0, dxq $$1) {
      super(duu.B, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bss.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = ka.a(this.b(), cxh.k);
      if (!this.b_($$0)) {
         bss.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ka<cxh> f() {
      return this.d;
   }

   @Override
   protected void a(ka<cxh> $$0) {
      this.d = $$0;
   }

   @Override
   protected wp j() {
      return wp.c("container.barrel");
   }

   @Override
   protected csw a(int $$0, cpq $$1) {
      return ctf.a($$0, $$1, this);
   }

   @Override
   public void c_(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aA_(), this.m());
      }
   }

   void a(dxq $$0, boolean $$1) {
      this.n.a(this.aA_(), $$0.b(djk.c, Boolean.valueOf($$1)), 3);
   }

   void a(dxq $$0, avz $$1) {
      km $$2 = $$0.c(djk.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awb.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
