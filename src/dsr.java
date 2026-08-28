public class dsr extends duf {
   private jz<cwm> d = jz.a(27, cwm.k);
   private final dtl e = new dtl() {
      @Override
      protected void a(dfm $$0, jh $$1, dvv $$2) {
         dsr.this.a($$2, awn.bz);
         dsr.this.a($$2, true);
      }

      @Override
      protected void b(dfm $$0, jh $$1, dvv $$2) {
         dsr.this.a($$2, awn.by);
         dsr.this.a($$2, false);
      }

      @Override
      protected void a(dfm $$0, jh $$1, dvv $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cou $$0) {
         if ($$0.cc instanceof csi) {
            bsd $$1 = ((csi)$$0.cc).l();
            return $$1 == dsr.this;
         } else {
            return false;
         }
      }
   };

   public dsr(jh $$0, dvv $$1) {
      super(dta.A, $$0, $$1);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bse.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = jz.a(this.b(), cwm.k);
      if (!this.b_($$0)) {
         bse.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jz<cwm> f() {
      return this.d;
   }

   @Override
   protected void a(jz<cwm> $$0) {
      this.d = $$0;
   }

   @Override
   protected xj j() {
      return xj.c("container.barrel");
   }

   @Override
   protected crz a(int $$0, cot $$1) {
      return csi.a($$0, $$1, this);
   }

   @Override
   public void c_(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         this.e.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         this.e.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aA_(), this.m());
      }
   }

   void a(dvv $$0, boolean $$1) {
      this.o.a(this.aA_(), $$0.b(dhw.c, Boolean.valueOf($$1)), 3);
   }

   void a(dvv $$0, awm $$1) {
      kl $$2 = $$0.c(dhw.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awo.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}
