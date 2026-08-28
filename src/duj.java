public class duj extends dvy {
   private jz<cxg> d = jz.a(27, cxg.j);
   private final dvd e = new dvd() {
      @Override
      protected void a(dgz $$0, jh $$1, dxo $$2) {
         duj.this.a($$2, awv.bz);
         duj.this.a($$2, true);
      }

      @Override
      protected void b(dgz $$0, jh $$1, dxo $$2) {
         duj.this.a($$2, awv.by);
         duj.this.a($$2, false);
      }

      @Override
      protected void a(dgz $$0, jh $$1, dxo $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cpo $$0) {
         if ($$0.cd instanceof ctc) {
            bst $$1 = ((ctc)$$0.cd).l();
            return $$1 == duj.this;
         } else {
            return false;
         }
      }
   };

   public duj(jh $$0, dxo $$1) {
      super(dus.B, $$0, $$1);
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsu.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = jz.a(this.b(), cxg.j);
      if (!this.b_($$0)) {
         bsu.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jz<cxg> f() {
      return this.d;
   }

   @Override
   protected void a(jz<cxg> $$0) {
      this.d = $$0;
   }

   @Override
   protected xk j() {
      return xk.c("container.barrel");
   }

   @Override
   protected cst a(int $$0, cpn $$1) {
      return ctc.a($$0, $$1, this);
   }

   @Override
   public void c_(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(dxo $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.b(djj.c, Boolean.valueOf($$1)), 3);
   }

   void a(dxo $$0, awu $$1) {
      kl $$2 = $$0.c(djj.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aww.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}
