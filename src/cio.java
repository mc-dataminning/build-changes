public abstract class cio extends cjz implements ciu {
   private static final akj<Boolean> a = akn.a(cio.class, akl.k);

   public cio(bwm<? extends cio> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new cio.a(this);
   }

   public static byh.a j() {
      return bxe.E().a(byi.s, 3.0);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && !this.h_();
   }

   @Override
   public int ai() {
      return 8;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean m() {
      return this.al.a(a);
   }

   @Override
   public void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cer(this, 1.25));
      this.bC.a(2, new cdf<>(this, cqy.class, 8.0F, 1.6, 1.4, bwk.f::test));
      this.bC.a(4, new cio.b(this));
   }

   @Override
   protected cgm b(div $$0) {
      return new cgo(this, $$0);
   }

   @Override
   public void a_(fei $$0) {
      if (this.bj()) {
         this.a(0.01F, $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void k_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.t());
      }

      super.k_();
   }

   @Override
   protected bub b(cqy $$0, bua $$1) {
      return ciu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(cyy $$0) {
      ciu.a(this, $$0);
   }

   @Override
   public void h(tz $$0) {
      ciu.a(this, $$0);
   }

   @Override
   public awm n() {
      return awn.dl;
   }

   protected boolean q() {
      return true;
   }

   protected abstract awm t();

   @Override
   protected awm aV() {
      return awn.jw;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
   }

   static class a extends cdb {
      private final cio l;

      a(cio $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axh.a)) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == cdb.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(byi.v));
            this.l.B(azm.h(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dy().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aV = this.l.dL();
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class b extends cew {
      private final cio i;

      public b(cio $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
