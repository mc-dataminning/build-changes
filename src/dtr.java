public class dtr extends dvg {
   private ka<cwo> d = ka.a(27, cwo.j);
   private final dul e = new dul() {
      @Override
      protected void a(dgh $$0, ji $$1, dww $$2) {
         dtr.this.a($$2, awa.bz);
         dtr.this.a($$2, true);
      }

      @Override
      protected void b(dgh $$0, ji $$1, dww $$2) {
         dtr.this.a($$2, awa.by);
         dtr.this.a($$2, false);
      }

      @Override
      protected void a(dgh $$0, ji $$1, dww $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cow $$0) {
         if ($$0.cd instanceof csk) {
            bsc $$1 = ((csk)$$0.cd).l();
            return $$1 == dtr.this;
         } else {
            return false;
         }
      }
   };

   public dtr(ji $$0, dww $$1) {
      super(dua.B, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsd.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = ka.a(this.b(), cwo.j);
      if (!this.b_($$0)) {
         bsd.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ka<cwo> f() {
      return this.d;
   }

   @Override
   protected void a(ka<cwo> $$0) {
      this.d = $$0;
   }

   @Override
   protected wp j() {
      return wp.c("container.barrel");
   }

   @Override
   protected csb a(int $$0, cov $$1) {
      return csk.a($$0, $$1, this);
   }

   @Override
   public void c_(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         this.e.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         this.e.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aA_(), this.m());
      }
   }

   void a(dww $$0, boolean $$1) {
      this.o.a(this.aA_(), $$0.b(dir.c, Boolean.valueOf($$1)), 3);
   }

   void a(dww $$0, avz $$1) {
      km $$2 = $$0.c(dir.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awb.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}
