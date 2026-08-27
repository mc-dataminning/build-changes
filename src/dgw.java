public class dgw extends dih {
   private iq<cng> e = iq.a(27, cng.f);
   private final dhq f = new dhq() {
      @Override
      protected void a(ctx $$0, hx $$1, djp $$2) {
         dgw.this.a($$2, art.bw);
         dgw.this.a($$2, true);
      }

      @Override
      protected void b(ctx $$0, hx $$1, djp $$2) {
         dgw.this.a($$2, art.bv);
         dgw.this.a($$2, false);
      }

      @Override
      protected void a(ctx $$0, hx $$1, djp $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cfq $$0) {
         if ($$0.bW instanceof ciq) {
            bjv $$1 = ((ciq)$$0.bW).l();
            return $$1 == dgw.this;
         } else {
            return false;
         }
      }
   };

   public dgw(hx $$0, djp $$1) {
      super(dhf.A, $$0, $$1);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjw.a($$0, this.e);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.e = iq.a(this.b(), cng.f);
      if (!this.c_($$0)) {
         bjw.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iq<cng> k() {
      return this.e;
   }

   @Override
   protected void a(iq<cng> $$0) {
      this.e = $$0;
   }

   @Override
   protected vg l() {
      return vg.c("container.barrel");
   }

   @Override
   protected cij a(int $$0, cfp $$1) {
      return ciq.a($$0, $$1, this);
   }

   @Override
   public void d_(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   public void c(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aE_(), this.r());
      }
   }

   void a(djp $$0, boolean $$1) {
      this.o.a(this.aE_(), $$0.a(cwe.c, Boolean.valueOf($$1)), 3);
   }

   void a(djp $$0, ars $$1) {
      jb $$2 = $$0.c(cwe.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aru.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
