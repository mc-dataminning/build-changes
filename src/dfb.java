public class dfb extends dgm {
   private ip<clo> e = ip.a(27, clo.b);
   private final dfv f = new dfv() {
      @Override
      protected void a(csf $$0, hx $$1, dhn $$2) {
         dfb.this.a($$2, aqv.bk);
         dfb.this.a($$2, true);
      }

      @Override
      protected void b(csf $$0, hx $$1, dhn $$2) {
         dfb.this.a($$2, aqv.bj);
         dfb.this.a($$2, false);
      }

      @Override
      protected void a(csf $$0, hx $$1, dhn $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cdz $$0) {
         if ($$0.bS instanceof cgy) {
            biu $$1 = ((cgy)$$0.bS).l();
            return $$1 == dfb.this;
         } else {
            return false;
         }
      }
   };

   public dfb(hx $$0, dhn $$1) {
      super(dfk.A, $$0, $$1);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         biv.a($$0, this.e);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.e = ip.a(this.b(), clo.b);
      if (!this.c_($$0)) {
         biv.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ip<clo> k() {
      return this.e;
   }

   @Override
   protected void a(ip<clo> $$0) {
      this.e = $$0;
   }

   @Override
   protected uv l() {
      return uv.c("container.barrel");
   }

   @Override
   protected cgr a(int $$0, cdy $$1) {
      return cgy.a($$0, $$1, this);
   }

   @Override
   public void d_(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aC_(), this.r());
      }
   }

   @Override
   public void c(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aC_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aC_(), this.r());
      }
   }

   void a(dhn $$0, boolean $$1) {
      this.o.a(this.aC_(), $$0.a(cul.c, Boolean.valueOf($$1)), 3);
   }

   void a(dhn $$0, aqu $$1) {
      ja $$2 = $$0.c(cul.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aqw.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
