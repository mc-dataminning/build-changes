public class dqx extends dsl {
   private jw<cvl> d = jw.a(27, cvl.k);
   private final drr e = new drr() {
      @Override
      protected void a(dds $$0, je $$1, dua $$2) {
         dqx.this.a($$2, awd.bz);
         dqx.this.a($$2, true);
      }

      @Override
      protected void b(dds $$0, je $$1, dua $$2) {
         dqx.this.a($$2, awd.by);
         dqx.this.a($$2, false);
      }

      @Override
      protected void a(dds $$0, je $$1, dua $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cnp $$0) {
         if ($$0.ca instanceof cqz) {
            brd $$1 = ((cqz)$$0.ca).l();
            return $$1 == dqx.this;
         } else {
            return false;
         }
      }
   };

   public dqx(je $$0, dua $$1) {
      super(drg.A, $$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bre.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.d = jw.a(this.b(), cvl.k);
      if (!this.b_($$0)) {
         bre.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jw<cvl> f() {
      return this.d;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.d = $$0;
   }

   @Override
   protected xd j() {
      return xd.c("container.barrel");
   }

   @Override
   protected cqq a(int $$0, cno $$1) {
      return cqz.a($$0, $$1, this);
   }

   @Override
   public void d_(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         this.e.a($$0, this.i(), this.aD_(), this.m());
      }
   }

   @Override
   public void c(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         this.e.b($$0, this.i(), this.aD_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aD_(), this.m());
      }
   }

   void a(dua $$0, boolean $$1) {
      this.o.a(this.aD_(), $$0.b(dgb.c, Boolean.valueOf($$1)), 3);
   }

   void a(dua $$0, awc $$1) {
      ki $$2 = $$0.c(dgb.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awe.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
