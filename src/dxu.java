public class dxu extends dzl {
   private jo<czy> d = jo.a(27, czy.k);
   private final dyq e = new dyq() {
      @Override
      protected void a(djx $$0, iv $$1, ebe $$2) {
         dxu.this.a($$2, awp.bz);
         dxu.this.a($$2, true);
      }

      @Override
      protected void b(djx $$0, iv $$1, ebe $$2) {
         dxu.this.a($$2, awp.by);
         dxu.this.a($$2, false);
      }

      @Override
      protected void a(djx $$0, iv $$1, ebe $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(crx $$0) {
         if ($$0.bR instanceof cvz) {
            buk $$1 = ((cvz)$$0.bR).l();
            return $$1 == dxu.this;
         } else {
            return false;
         }
      }
   };

   public dxu(iv $$0, ebe $$1) {
      super(dye.B, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bul.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.d = jo.a(this.b(), czy.k);
      if (!this.b_($$0)) {
         bul.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jo<czy> f() {
      return this.d;
   }

   @Override
   protected void a(jo<czy> $$0) {
      this.d = $$0;
   }

   @Override
   protected xa j() {
      return xa.c("container.barrel");
   }

   @Override
   protected cvq a(int $$0, crw $$1) {
      return cvz.a($$0, $$1, this);
   }

   @Override
   public void c_(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(ebe $$0, boolean $$1) {
      this.n.a(this.aB_(), $$0.b(dmi.c, Boolean.valueOf($$1)), 3);
   }

   void a(ebe $$0, awo $$1) {
      ka $$2 = $$0.c(dmi.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awq.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
