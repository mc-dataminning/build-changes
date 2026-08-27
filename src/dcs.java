public class dcs extends dec {
   private hn<cjl> c = hn.a(27, cjl.b);
   private final ddm f = new ddm() {
      @Override
      protected void a(cqb $$0, gw $$1, dfd $$2) {
         dcs.this.a($$2, apg.bk);
         dcs.this.a($$2, true);
      }

      @Override
      protected void b(cqb $$0, gw $$1, dfd $$2) {
         dcs.this.a($$2, apg.bj);
         dcs.this.a($$2, false);
      }

      @Override
      protected void a(cqb $$0, gw $$1, dfd $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cca $$0) {
         if ($$0.bS instanceof cey) {
            bgx $$1 = ((cey)$$0.bS).l();
            return $$1 == dcs.this;
         } else {
            return false;
         }
      }
   };

   public dcs(gw $$0, dfd $$1) {
      super(ddb.A, $$0, $$1);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgy.a($$0, this.c);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.c = hn.a(this.b(), cjl.b);
      if (!this.d($$0)) {
         bgy.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected hn<cjl> f() {
      return this.c;
   }

   @Override
   protected void a(hn<cjl> $$0) {
      this.c = $$0;
   }

   @Override
   protected tl g() {
      return tl.c("container.barrel");
   }

   @Override
   protected cer a(int $$0, cbz $$1) {
      return cey.a($$0, $$1, this);
   }

   @Override
   public void d_(cca $$0) {
      if (!this.q && !$$0.M_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cca $$0) {
      if (!this.q && !$$0.M_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dfd $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(csi.c, Boolean.valueOf($$1)), 3);
   }

   void a(dfd $$0, apf $$1) {
      hy $$2 = $$0.c(csi.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aph.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
