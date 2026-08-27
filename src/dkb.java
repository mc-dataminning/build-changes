public class dkb extends dlm {
   private iu<cqm> e = iu.a(27, cqm.h);
   private final dkv f = new dkv() {
      @Override
      protected void a(cxb $$0, ib $$1, dnb $$2) {
         dkb.this.a($$2, aty.bz);
         dkb.this.a($$2, true);
      }

      @Override
      protected void b(cxb $$0, ib $$1, dnb $$2) {
         dkb.this.a($$2, aty.by);
         dkb.this.a($$2, false);
      }

      @Override
      protected void a(cxb $$0, ib $$1, dnb $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(ciu $$0) {
         if ($$0.bZ instanceof clx) {
            bmw $$1 = ((clx)$$0.bZ).l();
            return $$1 == dkb.this;
         } else {
            return false;
         }
      }
   };

   public dkb(ib $$0, dnb $$1) {
      super(dkk.A, $$0, $$1);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmx.a($$0, this.e);
      }
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = iu.a(this.b(), cqm.h);
      if (!this.c_($$0)) {
         bmx.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iu<cqm> j() {
      return this.e;
   }

   @Override
   protected void a(iu<cqm> $$0) {
      this.e = $$0;
   }

   @Override
   protected vu k() {
      return vu.c("container.barrel");
   }

   @Override
   protected clq a(int $$0, cit $$1) {
      return clx.a($$0, $$1, this);
   }

   @Override
   public void d_(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.a($$0, this.i(), this.aC_(), this.n());
      }
   }

   @Override
   public void c(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.b($$0, this.i(), this.aC_(), this.n());
      }
   }

   public void l() {
      if (!this.q) {
         this.f.c(this.i(), this.aC_(), this.n());
      }
   }

   void a(dnb $$0, boolean $$1) {
      this.o.a(this.aC_(), $$0.a(czi.c, Boolean.valueOf($$1)), 3);
   }

   void a(dnb $$0, atx $$1) {
      jg $$2 = $$0.c(czi.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, atz.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
