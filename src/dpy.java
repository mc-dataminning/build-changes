public class dpy extends drl {
   private jv<cuo> d = jv.a(27, cuo.l);
   private final dqs e = new dqs() {
      @Override
      protected void a(dcu $$0, jd $$1, dta $$2) {
         dpy.this.a($$2, avo.bz);
         dpy.this.a($$2, true);
      }

      @Override
      protected void b(dcu $$0, jd $$1, dta $$2) {
         dpy.this.a($$2, avo.by);
         dpy.this.a($$2, false);
      }

      @Override
      protected void a(dcu $$0, jd $$1, dta $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmv $$0) {
         if ($$0.cd instanceof cqa) {
            bqj $$1 = ((cqa)$$0.cd).l();
            return $$1 == dpy.this;
         } else {
            return false;
         }
      }
   };

   public dpy(jd $$0, dta $$1) {
      super(dqh.A, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqk.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.d = jv.a(this.b(), cuo.l);
      if (!this.a_($$0)) {
         bqk.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jv<cuo> j() {
      return this.d;
   }

   @Override
   protected void a(jv<cuo> $$0) {
      this.d = $$0;
   }

   @Override
   protected wy k() {
      return wy.c("container.barrel");
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return cqa.a($$0, $$1, this);
   }

   @Override
   public void d_(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dta $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(dfc.c, Boolean.valueOf($$1)), 3);
   }

   void a(dta $$0, avn $$1) {
      kh $$2 = $$0.c(dfc.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avp.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}
