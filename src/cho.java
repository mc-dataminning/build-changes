public abstract class cho extends ciu implements chu {
   private static final alc<Boolean> a = alg.a(cho.class, ale.k);

   public cho(bvm<? extends cho> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cho.a(this);
   }

   public static bxi.a m() {
      return bwd.C().a(bxj.s, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.p();
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && !this.l_();
   }

   @Override
   public int ad() {
      return 8;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean p() {
      return this.al.a(a);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cds(this, 1.25));
      this.bT.a(2, new ccg<>(this, cps.class, 8.0F, 1.6, 1.4, bvk.f::test));
      this.bT.a(4, new cho.b(this));
   }

   @Override
   protected cfn b(dha $$0) {
      return new cfp(this, $$0);
   }

   @Override
   public void a_(fbs $$0) {
      if (this.di() && this.bj()) {
         this.a(0.01F, $$0);
         this.a(bwf.a, this.dy());
         this.h(this.dy().c(0.9));
         if (this.O_() == null) {
            this.h(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.h(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.gm());
      }

      super.d_();
   }

   @Override
   protected bte b(cps $$0, btd $$1) {
      return chu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxk $$0) {
      chu.a(this, $$0);
   }

   @Override
   public void h(ux $$0) {
      chu.a(this, $$0);
   }

   @Override
   public axe t() {
      return axf.dk;
   }

   protected boolean x() {
      return true;
   }

   protected abstract axe gm();

   @Override
   protected axe aV() {
      return axf.jo;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
   }

   static class a extends ccc {
      private final cho l;

      a(cho $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(aya.a)) {
            this.l.h(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == ccc.a.b && !this.l.L().m()) {
            float $$0 = (float)(this.h * this.l.h(bxj.v));
            this.l.C(bae.h(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dy().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(bae.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aX = this.l.dL();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cdx {
      private final cho i;

      public b(cho $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.x() && super.b();
      }
   }
}
