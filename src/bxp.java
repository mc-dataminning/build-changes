public abstract class bxp extends byu implements bxu {
   private static final agj<Boolean> b = agm.a(bxp.class, agl.k);

   public bxp(blt<? extends bxp> $$0, cti $$1) {
      super($$0, $$1);
      this.bL = new bxp.a(this);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return $$1.b * 0.65F;
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   @Override
   public int fI() {
      return 8;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean w() {
      return this.an.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new btu(this, 1.25));
      this.bO.a(2, new bsi<>(this, cfb.class, 8.0F, 1.6, 1.4, bls.f::test));
      this.bO.a(4, new bxp.b(this));
   }

   @Override
   protected bvp b(cti $$0) {
      return new bvr(this, $$0);
   }

   @Override
   public void a(elm $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(bml.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.aZ() && this.aC() && this.Q) {
         this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gf(), this.eW(), this.eX());
      }

      super.d_();
   }

   @Override
   protected bjv b(cfb $$0, bju $$1) {
      return bxu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cmr $$0) {
      bxu.a(this, $$0);
   }

   @Override
   public void c(sl $$0) {
      bxu.a(this, $$0);
   }

   @Override
   public arl A() {
      return arm.cM;
   }

   protected boolean ge() {
      return true;
   }

   protected abstract arl gf();

   @Override
   protected arl aN() {
      return arm.ir;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
   }

   static class a extends bse {
      private final bxp l;

      a(bxp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(asg.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bse.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.b(bnl.m));
            this.l.w(aui.i(0.125F, this.l.ff(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(aui.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aU = this.l.dC();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends btz {
      private final bxp i;

      public b(bxp $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() && super.a();
      }
   }
}
