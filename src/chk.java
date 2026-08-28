public abstract class chk extends ciq implements chq {
   private static final aks<Boolean> a = akw.a(chk.class, aku.k);

   public chk(bvi<? extends chk> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new chk.a(this);
   }

   public static bxe.a m() {
      return bvz.C().a(bxf.s, 3.0);
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
   protected void a(akw.a $$0) {
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
   public void b(um $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cdo(this, 1.25));
      this.bT.a(2, new ccc<>(this, cpo.class, 8.0F, 1.6, 1.4, bvg.f::test));
      this.bT.a(4, new chk.b(this));
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cfl(this, $$0);
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di() && this.bj()) {
         this.a(0.01F, $$0);
         this.a(bwb.a, this.dz());
         this.h(this.dz().c(0.9));
         if (this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.h(this.dz().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.go());
      }

      super.d_();
   }

   @Override
   protected bta b(cpo $$0, bsz $$1) {
      return chq.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxg $$0) {
      chq.a(this, $$0);
   }

   @Override
   public void h(um $$0) {
      chq.a(this, $$0);
   }

   @Override
   public awu t() {
      return awv.dl;
   }

   protected boolean x() {
      return true;
   }

   protected abstract awu go();

   @Override
   protected awu aV() {
      return awv.jv;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
   }

   static class a extends cby {
      private final chk l;

      a(chk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axq.a)) {
            this.l.h(this.l.dz().b(0.0, 0.005, 0.0));
         }

         if (this.k == cby.a.b && !this.l.L().m()) {
            float $$0 = (float)(this.h * this.l.h(bxf.v));
            this.l.C(azu.h(0.125F, this.l.fp(), $$0));
            double $$1 = this.e - this.l.dB();
            double $$2 = this.f - this.l.dD();
            double $$3 = this.g - this.l.dH();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dz().b(0.0, (double)this.l.fp() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azu.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dM(), $$5, 90.0F));
               this.l.aX = this.l.dM();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cdt {
      private final chk i;

      public b(chk $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.x() && super.b();
      }
   }
}
