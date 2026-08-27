public class dmw extends doi {
   private je<csd> e = je.a(27, csd.i);
   private final dnq f = new dnq() {
      @Override
      protected void a(czu $$0, im $$1, dpy $$2) {
         dmw.this.a($$2, auz.bz);
         dmw.this.a($$2, true);
      }

      @Override
      protected void b(czu $$0, im $$1, dpy $$2) {
         dmw.this.a($$2, auz.by);
         dmw.this.a($$2, false);
      }

      @Override
      protected void a(czu $$0, im $$1, dpy $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(ckl $$0) {
         if ($$0.cc instanceof cno) {
            boj $$1 = ((cno)$$0.cc).l();
            return $$1 == dmw.this;
         } else {
            return false;
         }
      }
   };

   public dmw(im $$0, dpy $$1) {
      super(dnf.A, $$0, $$1);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bok.a($$0, this.e, $$1);
      }
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.e = je.a(this.b(), csd.i);
      if (!this.a_($$0)) {
         bok.b($$0, this.e, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected je<csd> j() {
      return this.e;
   }

   @Override
   protected void a(je<csd> $$0) {
      this.e = $$0;
   }

   @Override
   protected ws k() {
      return ws.c("container.barrel");
   }

   @Override
   protected cnh a(int $$0, ckk $$1) {
      return cno.a($$0, $$1, this);
   }

   @Override
   public void d_(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.q) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dpy $$0, boolean $$1) {
      this.o.a(this.az_(), $$0.a(dcb.c, Boolean.valueOf($$1)), 3);
   }

   void a(dpy $$0, auy $$1) {
      jq $$2 = $$0.c(dcb.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, ava.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
