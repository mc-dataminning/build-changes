public abstract class cdm extends cer implements cdr {
   private static final ajm<Boolean> b = ajq.a(cdm.class, ajo.k);

   public cdm(brn<? extends cdm> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new cdm.a(this);
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 3.0);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ae();
   }

   @Override
   public int fP() {
      return 8;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean u() {
      return this.ao.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzq(this, 1.25));
      this.bS.a(2, new bye<>(this, clh.class, 8.0F, 1.6, 1.4, brm.f::test));
      this.bS.a(4, new cdm.b(this));
   }

   @Override
   protected cbl b(dad $$0) {
      return new cbn(this, $$0);
   }

   @Override
   public void a(etp $$0) {
      if (this.cZ() && this.bc()) {
         this.a(0.01F, $$0);
         this.a(bsf.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.p() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bc() && this.aC() && this.R) {
         this.g(this.dq().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.gq());
      }

      super.n_();
   }

   @Override
   protected bpm b(clh $$0, bpl $$1) {
      return cdr.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(csz $$0) {
      cdr.a(this, $$0);
   }

   @Override
   public void c(ua $$0) {
      cdr.a(this, $$0);
   }

   @Override
   public avb y() {
      return avc.dk;
   }

   protected boolean gp() {
      return true;
   }

   protected abstract avb gq();

   @Override
   protected avb aN() {
      return avc.iQ;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
   }

   static class a extends bya {
      private final cdm l;

      a(cdm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(avw.a)) {
            this.l.g(this.l.dq().b(0.0, 0.005, 0.0));
         }

         if (this.k == bya.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(bth.r));
            this.l.y(axz.i(0.125F, this.l.fl(), $$0));
            double $$1 = this.e - this.l.ds();
            double $$2 = this.f - this.l.du();
            double $$3 = this.g - this.l.dy();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dq().b(0.0, (double)this.l.fl() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(axz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$5, 90.0F));
               this.l.aZ = this.l.dD();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends bzv {
      private final cdm i;

      public b(cdm $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gp() && super.a();
      }
   }
}
