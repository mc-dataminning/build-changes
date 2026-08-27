public class dgo extends dhz {
   private iq<cmy> e = iq.a(27, cmy.f);
   private final dhi f = new dhi() {
      @Override
      protected void a(ctp $$0, hx $$1, djh $$2) {
         dgo.this.a($$2, ars.bk);
         dgo.this.a($$2, true);
      }

      @Override
      protected void b(ctp $$0, hx $$1, djh $$2) {
         dgo.this.a($$2, ars.bj);
         dgo.this.a($$2, false);
      }

      @Override
      protected void a(ctp $$0, hx $$1, djh $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cfi $$0) {
         if ($$0.bS instanceof cii) {
            bju $$1 = ((cii)$$0.bS).l();
            return $$1 == dgo.this;
         } else {
            return false;
         }
      }
   };

   public dgo(hx $$0, djh $$1) {
      super(dgx.A, $$0, $$1);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjv.a($$0, this.e);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.e = iq.a(this.b(), cmy.f);
      if (!this.c_($$0)) {
         bjv.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iq<cmy> k() {
      return this.e;
   }

   @Override
   protected void a(iq<cmy> $$0) {
      this.e = $$0;
   }

   @Override
   protected vf l() {
      return vf.c("container.barrel");
   }

   @Override
   protected cib a(int $$0, cfh $$1) {
      return cii.a($$0, $$1, this);
   }

   @Override
   public void d_(cfi $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cfi $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.r());
      }
   }

   void a(djh $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.a(cvw.c, Boolean.valueOf($$1)), 3);
   }

   void a(djh $$0, arr $$1) {
      jb $$2 = $$0.c(cvw.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, art.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
