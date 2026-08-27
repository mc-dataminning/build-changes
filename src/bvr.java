public abstract class bvr extends bww implements bvw {
   private static final afc<Boolean> b = aff.a(bvr.class, afe.k);

   public bvr(bjx<? extends bvr> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bvr.a(this);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * 0.65F;
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 3.0);
   }

   @Override
   public boolean U() {
      return super.U() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ac();
   }

   @Override
   public int fI() {
      return 8;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public boolean t() {
      return this.an.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new brx(this, 1.25));
      this.bO.a(2, new bql<>(this, ccx.class, 8.0F, 1.6, 1.4, bjw.f::test));
      this.bO.a(4, new bvr.b(this));
   }

   @Override
   protected bts b(cqz $$0) {
      return new btu(this, $$0);
   }

   @Override
   public void h(eif $$0) {
      if (this.cX() && this.aX()) {
         this.a(0.01F, $$0);
         this.a(bkp.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public void c_() {
      if (!this.aX() && this.aA() && this.Q) {
         this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gf(), this.eV(), this.eW());
      }

      super.c_();
   }

   @Override
   protected bib b(ccx $$0, bia $$1) {
      return bvw.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(ckj $$0) {
      bvw.a(this, $$0);
   }

   @Override
   public void c(rt $$0) {
      bvw.a(this, $$0);
   }

   @Override
   public aqc y() {
      return aqd.cD;
   }

   protected boolean ge() {
      return true;
   }

   protected abstract aqc gf();

   @Override
   protected aqc aL() {
      return aqd.hQ;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
   }

   static class a extends bqh {
      private final bvr l;

      a(bvr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(aqx.a)) {
            this.l.f(this.l.do().b(0.0, 0.005, 0.0));
         }

         if (this.k == bqh.a.b && !this.l.L().l()) {
            float $$0 = (float)(this.h * this.l.b(blp.m));
            this.l.w(asy.i(0.125F, this.l.fe(), $$0));
            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.f(this.l.do().b(0.0, (double)this.l.fe() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(asy.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$5, 90.0F));
               this.l.aU = this.l.dB();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bsc {
      private final bvr i;

      public b(bvr $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() && super.a();
      }
   }
}
