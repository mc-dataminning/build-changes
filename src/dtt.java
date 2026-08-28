public class dtt extends dvi {
   private ka<cwq> d = ka.a(27, cwq.j);
   private final dun e = new dun() {
      @Override
      protected void a(dgj $$0, ji $$1, dwy $$2) {
         dtt.this.a($$2, awa.bz);
         dtt.this.a($$2, true);
      }

      @Override
      protected void b(dgj $$0, ji $$1, dwy $$2) {
         dtt.this.a($$2, awa.by);
         dtt.this.a($$2, false);
      }

      @Override
      protected void a(dgj $$0, ji $$1, dwy $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(coy $$0) {
         if ($$0.cd instanceof csm) {
            bse $$1 = ((csm)$$0.cd).l();
            return $$1 == dtt.this;
         } else {
            return false;
         }
      }
   };

   public dtt(ji $$0, dwy $$1) {
      super(duc.B, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsf.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = ka.a(this.b(), cwq.j);
      if (!this.b_($$0)) {
         bsf.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ka<cwq> f() {
      return this.d;
   }

   @Override
   protected void a(ka<cwq> $$0) {
      this.d = $$0;
   }

   @Override
   protected wp j() {
      return wp.c("container.barrel");
   }

   @Override
   protected csd a(int $$0, cox $$1) {
      return csm.a($$0, $$1, this);
   }

   @Override
   public void c_(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         this.e.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aA_(), this.m());
      }
   }

   void a(dwy $$0, boolean $$1) {
      this.n.a(this.aA_(), $$0.b(dit.c, Boolean.valueOf($$1)), 3);
   }

   void a(dwy $$0, avz $$1) {
      km $$2 = $$0.c(dit.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awb.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
