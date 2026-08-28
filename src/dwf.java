public class dwf extends dxw {
   private jn<cys> d = jn.a(27, cys.k);
   private final dxb e = new dxb() {
      @Override
      protected void a(dip $$0, iu $$1, dzo $$2) {
         dwf.this.a($$2, awl.bz);
         dwf.this.a($$2, true);
      }

      @Override
      protected void b(dip $$0, iu $$1, dzo $$2) {
         dwf.this.a($$2, awl.by);
         dwf.this.a($$2, false);
      }

      @Override
      protected void a(dip $$0, iu $$1, dzo $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cqs $$0) {
         if ($$0.bQ instanceof cut) {
            btr $$1 = ((cut)$$0.bQ).l();
            return $$1 == dwf.this;
         } else {
            return false;
         }
      }
   };

   public dwf(iu $$0, dzo $$1) {
      super(dwp.B, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bts.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = jn.a(this.b(), cys.k);
      if (!this.b_($$0)) {
         bts.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jn<cys> f() {
      return this.d;
   }

   @Override
   protected void a(jn<cys> $$0) {
      this.d = $$0;
   }

   @Override
   protected ww j() {
      return ww.c("container.barrel");
   }

   @Override
   protected cuk a(int $$0, cqr $$1) {
      return cut.a($$0, $$1, this);
   }

   @Override
   public void c_(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   public void c(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aw_(), this.m());
      }
   }

   void a(dzo $$0, boolean $$1) {
      this.n.a(this.aw_(), $$0.b(dla.c, Boolean.valueOf($$1)), 3);
   }

   void a(dzo $$0, awk $$1) {
      jz $$2 = $$0.c(dla.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awm.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
