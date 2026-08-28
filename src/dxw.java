public class dxw extends dzn {
   private jp<daa> d = jp.a(27, daa.k);
   private final dys e = new dys() {
      @Override
      protected void a(djz $$0, iw $$1, ebg $$2) {
         dxw.this.a($$2, awr.bz);
         dxw.this.a($$2, true);
      }

      @Override
      protected void b(djz $$0, iw $$1, ebg $$2) {
         dxw.this.a($$2, awr.by);
         dxw.this.a($$2, false);
      }

      @Override
      protected void a(djz $$0, iw $$1, ebg $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(crz $$0) {
         if ($$0.bR instanceof cwb) {
            bum $$1 = ((cwb)$$0.bR).l();
            return $$1 == dxw.this;
         } else {
            return false;
         }
      }
   };

   public dxw(iw $$0, ebg $$1) {
      super(dyg.B, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bun.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.d = jp.a(this.b(), daa.k);
      if (!this.b_($$0)) {
         bun.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jp<daa> f() {
      return this.d;
   }

   @Override
   protected void a(jp<daa> $$0) {
      this.d = $$0;
   }

   @Override
   protected xc j() {
      return xc.c("container.barrel");
   }

   @Override
   protected cvs a(int $$0, cry $$1) {
      return cwb.a($$0, $$1, this);
   }

   @Override
   public void c_(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(ebg $$0, boolean $$1) {
      this.n.a(this.aB_(), $$0.b(dmk.c, Boolean.valueOf($$1)), 3);
   }

   void a(ebg $$0, awq $$1) {
      kb $$2 = $$0.c(dmk.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, aws.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
