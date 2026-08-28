public class dwp extends dyg {
   private jn<cyy> d = jn.a(27, cyy.k);
   private final dxl e = new dxl() {
      @Override
      protected void a(div $$0, iu $$1, dzz $$2) {
         dwp.this.a($$2, awn.bz);
         dwp.this.a($$2, true);
      }

      @Override
      protected void b(div $$0, iu $$1, dzz $$2) {
         dwp.this.a($$2, awn.by);
         dwp.this.a($$2, false);
      }

      @Override
      protected void a(div $$0, iu $$1, dzz $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cqy $$0) {
         if ($$0.bQ instanceof cuz) {
            btu $$1 = ((cuz)$$0.bQ).l();
            return $$1 == dwp.this;
         } else {
            return false;
         }
      }
   };

   public dwp(iu $$0, dzz $$1) {
      super(dwz.B, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btv.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = jn.a(this.b(), cyy.k);
      if (!this.b_($$0)) {
         btv.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jn<cyy> f() {
      return this.d;
   }

   @Override
   protected void a(jn<cyy> $$0) {
      this.d = $$0;
   }

   @Override
   protected wy j() {
      return wy.c("container.barrel");
   }

   @Override
   protected cuq a(int $$0, cqx $$1) {
      return cuz.a($$0, $$1, this);
   }

   @Override
   public void c_(cqy $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   public void c(cqy $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aw_(), this.m());
      }
   }

   void a(dzz $$0, boolean $$1) {
      this.n.a(this.aw_(), $$0.b(dlg.c, Boolean.valueOf($$1)), 3);
   }

   void a(dzz $$0, awm $$1) {
      jz $$2 = $$0.c(dlg.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
