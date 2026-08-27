public class dim extends djx {
   private is<coz> e = is.a(27, coz.h);
   private final djg f = new djg() {
      @Override
      protected void a(cvn $$0, hz $$1, dlf $$2) {
         dim.this.a($$2, atk.bw);
         dim.this.a($$2, true);
      }

      @Override
      protected void b(cvn $$0, hz $$1, dlf $$2) {
         dim.this.a($$2, atk.bv);
         dim.this.a($$2, false);
      }

      @Override
      protected void a(cvn $$0, hz $$1, dlf $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(chh $$0) {
         if ($$0.bW instanceof cki) {
            bln $$1 = ((cki)$$0.bW).l();
            return $$1 == dim.this;
         } else {
            return false;
         }
      }
   };

   public dim(hz $$0, dlf $$1) {
      super(div.A, $$0, $$1);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blo.a($$0, this.e);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.e = is.a(this.b(), coz.h);
      if (!this.c_($$0)) {
         blo.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected is<coz> k() {
      return this.e;
   }

   @Override
   protected void a(is<coz> $$0) {
      this.e = $$0;
   }

   @Override
   protected vq l() {
      return vq.c("container.barrel");
   }

   @Override
   protected ckb a(int $$0, chg $$1) {
      return cki.a($$0, $$1, this);
   }

   @Override
   public void d_(chh $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   public void c(chh $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aE_(), this.r());
      }
   }

   void a(dlf $$0, boolean $$1) {
      this.o.a(this.aE_(), $$0.a(cxu.c, Boolean.valueOf($$1)), 3);
   }

   void a(dlf $$0, atj $$1) {
      jd $$2 = $$0.c(cxu.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, atl.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
