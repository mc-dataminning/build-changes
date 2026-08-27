public class djz extends dlk {
   private iu<cqk> e = iu.a(27, cqk.h);
   private final dkt f = new dkt() {
      @Override
      protected void a(cwz $$0, ib $$1, dmz $$2) {
         djz.this.a($$2, aty.bz);
         djz.this.a($$2, true);
      }

      @Override
      protected void b(cwz $$0, ib $$1, dmz $$2) {
         djz.this.a($$2, aty.by);
         djz.this.a($$2, false);
      }

      @Override
      protected void a(cwz $$0, ib $$1, dmz $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cis $$0) {
         if ($$0.bZ instanceof clv) {
            bmv $$1 = ((clv)$$0.bZ).l();
            return $$1 == djz.this;
         } else {
            return false;
         }
      }
   };

   public djz(ib $$0, dmz $$1) {
      super(dki.A, $$0, $$1);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmw.a($$0, this.e);
      }
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = iu.a(this.b(), cqk.h);
      if (!this.c_($$0)) {
         bmw.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iu<cqk> j() {
      return this.e;
   }

   @Override
   protected void a(iu<cqk> $$0) {
      this.e = $$0;
   }

   @Override
   protected vu k() {
      return vu.c("container.barrel");
   }

   @Override
   protected clo a(int $$0, cir $$1) {
      return clv.a($$0, $$1, this);
   }

   @Override
   public void d_(cis $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.a($$0, this.i(), this.aC_(), this.n());
      }
   }

   @Override
   public void c(cis $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.b($$0, this.i(), this.aC_(), this.n());
      }
   }

   public void l() {
      if (!this.q) {
         this.f.c(this.i(), this.aC_(), this.n());
      }
   }

   void a(dmz $$0, boolean $$1) {
      this.o.a(this.aC_(), $$0.a(czg.c, Boolean.valueOf($$1)), 3);
   }

   void a(dmz $$0, atx $$1) {
      jg $$2 = $$0.c(czg.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, atz.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
