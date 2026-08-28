public abstract class ciq extends ckd implements ciw {
   private static final akj<Boolean> a = akn.a(ciq.class, akl.k);

   public ciq(bwo<? extends ciq> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new ciq.a(this);
   }

   public static byj.a j() {
      return bxg.E().a(byk.s, 3.0);
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
      this.bD.a(0, new cet(this, 1.25));
      this.bD.a(2, new cdh<>(this, crc.class, 8.0F, 1.6, 1.4, bwm.f::test));
      this.bD.a(4, new ciq.b(this));
   }

   @Override
   protected cgo b(dja $$0) {
      return new cgq(this, $$0);
   }

   @Override
   public void a_(feq $$0) {
      if (this.bj()) {
         this.a(0.01F, $$0);
         this.a(bxi.a, this.dy());
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
   protected bud b(crc $$0, buc $$1) {
      return ciw.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(czd $$0) {
      ciw.a(this, $$0);
   }

   @Override
   public void h(tz $$0) {
      ciw.a(this, $$0);
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
      return awn.jz;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
   }

   static class a extends cdd {
      private final ciq l;

      a(ciq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axh.a)) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == cdd.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(byk.v));
            this.l.B(azm.h(0.125F, this.l.fo(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dy().b(0.0, (double)this.l.fo() * ($$2 / $$4) * 0.1, 0.0));
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

   static class b extends cey {
      private final ciq i;

      public b(ciq $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
