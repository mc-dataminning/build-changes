public abstract class buo extends bvt implements but {
   private static final aef<Boolean> b = aei.a(buo.class, aeh.k);

   public buo(biu<? extends buo> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new buo.a(this);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b * 0.65F;
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 3.0);
   }

   @Override
   public boolean U() {
      return super.U() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ad();
   }

   @Override
   public int fH() {
      return 8;
   }

   @Override
   protected void a_() {
      super.a_();
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
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqu(this, 1.25));
      this.bO.a(2, new bpi<>(this, cbu.class, 8.0F, 1.6, 1.4, bit.f::test));
      this.bO.a(4, new buo.b(this));
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bsr(this, $$0);
   }

   @Override
   public void h(ehn $$0) {
      if (this.cY() && this.aY()) {
         this.a(0.01F, $$0);
         this.a(bjm.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public void b_() {
      if (!this.aY() && this.aB() && this.Q) {
         this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.ge(), this.eV(), this.eW());
      }

      super.b_();
   }

   @Override
   protected bgy b(cbu $$0, bgx $$1) {
      return but.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cjf $$0) {
      but.a(this, $$0);
   }

   @Override
   public void c(qx $$0) {
      but.a(this, $$0);
   }

   @Override
   public apd y() {
      return ape.cD;
   }

   protected boolean gd() {
      return true;
   }

   protected abstract apd ge();

   @Override
   protected apd aM() {
      return ape.hO;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
   }

   static class a extends bpe {
      private final buo l;

      a(buo $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(apy.a)) {
            this.l.f(this.l.do().b(0.0, 0.005, 0.0));
         }

         if (this.k == bpe.a.b && !this.l.L().l()) {
            float $$0 = (float)(this.h * this.l.b(bkm.d));
            this.l.w(arx.i(0.125F, this.l.fe(), $$0));
            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.f(this.l.do().b(0.0, (double)this.l.fe() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(arx.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$5, 90.0F));
               this.l.aU = this.l.dB();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bqz {
      private final buo i;

      public b(buo $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gd() && super.a();
      }
   }
}
