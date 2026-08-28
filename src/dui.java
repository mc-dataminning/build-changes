public class dui extends dvx {
   private jz<cxk> d = jz.a(27, cxk.k);
   private final dvc e = new dvc() {
      @Override
      protected void a(dha $$0, jh $$1, dxn $$2) {
         dui.this.a($$2, axf.bz);
         dui.this.a($$2, true);
      }

      @Override
      protected void b(dha $$0, jh $$1, dxn $$2) {
         dui.this.a($$2, axf.by);
         dui.this.a($$2, false);
      }

      @Override
      protected void a(dha $$0, jh $$1, dxn $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cps $$0) {
         if ($$0.cd instanceof ctg) {
            bsx $$1 = ((ctg)$$0.cd).l();
            return $$1 == dui.this;
         } else {
            return false;
         }
      }
   };

   public dui(jh $$0, dxn $$1) {
      super(dur.B, $$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsy.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = jz.a(this.b(), cxk.k);
      if (!this.b_($$0)) {
         bsy.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jz<cxk> f() {
      return this.d;
   }

   @Override
   protected void a(jz<cxk> $$0) {
      this.d = $$0;
   }

   @Override
   protected xv j() {
      return xv.c("container.barrel");
   }

   @Override
   protected csx a(int $$0, cpr $$1) {
      return ctg.a($$0, $$1, this);
   }

   @Override
   public void c_(cps $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cps $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(dxn $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.b(djk.c, Boolean.valueOf($$1)), 3);
   }

   void a(dxn $$0, axe $$1) {
      kl $$2 = $$0.c(djk.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, axg.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}
