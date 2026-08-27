public abstract class buu extends bvz implements buz {
   private static final aef<Boolean> b = aei.a(buu.class, aeh.k);

   public buu(bja<? extends buu> $$0, cqb $$1) {
      super($$0, $$1);
      this.bL = new buu.a(this);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.65F;
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 3.0);
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
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bra(this, 1.25));
      this.bO.a(2, new bpo<>(this, cca.class, 8.0F, 1.6, 1.4, biz.f::test));
      this.bO.a(4, new buu.b(this));
   }

   @Override
   protected bsv b(cqb $$0) {
      return new bsx(this, $$0);
   }

   @Override
   public void h(ehh $$0) {
      if (this.cX() && this.aX()) {
         this.a(0.01F, $$0);
         this.a(bjs.a, this.do());
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
      if (!this.aX() && this.aA() && this.Q) {
         this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gf(), this.eV(), this.eW());
      }

      super.b_();
   }

   @Override
   protected bhe b(cca $$0, bhd $$1) {
      return buz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cjl $$0) {
      buz.a(this, $$0);
   }

   @Override
   public void c(qw $$0) {
      buz.a(this, $$0);
   }

   @Override
   public apf y() {
      return apg.cD;
   }

   protected boolean ge() {
      return true;
   }

   protected abstract apf gf();

   @Override
   protected apf aL() {
      return apg.hO;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
   }

   static class a extends bpk {
      private final buu l;

      a(buu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(aqa.a)) {
            this.l.f(this.l.do().b(0.0, 0.005, 0.0));
         }

         if (this.k == bpk.a.b && !this.l.L().l()) {
            float $$0 = (float)(this.h * this.l.b(bks.m));
            this.l.w(asb.i(0.125F, this.l.fe(), $$0));
            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.f(this.l.do().b(0.0, (double)this.l.fe() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(asb.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$5, 90.0F));
               this.l.aU = this.l.dB();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends brf {
      private final buu i;

      public b(buu $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() && super.a();
      }
   }
}
