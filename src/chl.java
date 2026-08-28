public abstract class chl extends ciu implements chr {
   private static final ajx<Boolean> a = akb.a(chl.class, ajz.k);

   public chl(bvi<? extends chl> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new chl.a(this);
   }

   public static bxf.a j() {
      return bwa.E().a(bxg.s, 3.0);
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
   protected void a(akb.a $$0) {
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
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this, 1.25));
      this.bC.a(2, new ccd<>(this, cpr.class, 8.0F, 1.6, 1.4, bvg.f::test));
      this.bC.a(4, new chl.b(this));
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cfm(this, $$0);
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(0.01F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.9));
         if (this.f() == null) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void k_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.i(this.dx().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.t());
      }

      super.k_();
   }

   @Override
   protected bsy b(cpr $$0, bsx $$1) {
      return chr.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxh $$0) {
      chr.a(this, $$0);
   }

   @Override
   public void h(tq $$0) {
      chr.a(this, $$0);
   }

   @Override
   public avz n() {
      return awa.dl;
   }

   protected boolean q() {
      return true;
   }

   protected abstract avz t();

   @Override
   protected avz aV() {
      return awa.jv;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
   }

   static class a extends cbz {
      private final chl l;

      a(chl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awv.a)) {
            this.l.i(this.l.dx().b(0.0, 0.005, 0.0));
         }

         if (this.k == cbz.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(bxg.v));
            this.l.C(ayz.h(0.125F, this.l.fq(), $$0));
            double $$1 = this.e - this.l.dz();
            double $$2 = this.f - this.l.dB();
            double $$3 = this.g - this.l.dF();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dx().b(0.0, (double)this.l.fq() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dK(), $$5, 90.0F));
               this.l.aV = this.l.dK();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cdu {
      private final chl i;

      public b(chl $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
