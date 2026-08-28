public class dvd extends dwu {
   private kb<cxy> d = kb.a(27, cxy.k);
   private final dvz e = new dvz() {
      @Override
      protected void a(dhp $$0, jj $$1, dym $$2) {
         dvd.this.a($$2, awk.bz);
         dvd.this.a($$2, true);
      }

      @Override
      protected void b(dhp $$0, jj $$1, dym $$2) {
         dvd.this.a($$2, awk.by);
         dvd.this.a($$2, false);
      }

      @Override
      protected void a(dhp $$0, jj $$1, dym $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cqi $$0) {
         if ($$0.bP instanceof ctw) {
            btj $$1 = ((ctw)$$0.bP).l();
            return $$1 == dvd.this;
         } else {
            return false;
         }
      }
   };

   public dvd(jj $$0, dym $$1) {
      super(dvn.B, $$0, $$1);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btk.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.d = kb.a(this.b(), cxy.k);
      if (!this.b_($$0)) {
         btk.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected kb<cxy> f() {
      return this.d;
   }

   @Override
   protected void a(kb<cxy> $$0) {
      this.d = $$0;
   }

   @Override
   protected wv j() {
      return wv.c("container.barrel");
   }

   @Override
   protected ctn a(int $$0, cqh $$1) {
      return ctw.a($$0, $$1, this);
   }

   @Override
   public void c_(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   public void c(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         this.e.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aw_(), this.m());
      }
   }

   void a(dym $$0, boolean $$1) {
      this.n.a(this.aw_(), $$0.b(dka.c, Boolean.valueOf($$1)), 3);
   }

   void a(dym $$0, awj $$1) {
      kn $$2 = $$0.c(dka.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awl.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
