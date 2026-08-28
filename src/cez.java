public abstract class cez extends cge implements cfe {
   private static final ajv<Boolean> b = ajz.a(cez.class, ajx.k);

   public cez(bsw<? extends cez> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new cez.a(this);
   }

   public static but.a s() {
      return btn.A().a(buu.s, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ai();
   }

   @Override
   public int af() {
      return 8;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean t() {
      return this.ao.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cbd(this, 1.25));
      this.bU.a(2, new bzr<>(this, cmv.class, 8.0F, 1.6, 1.4, bsv.f::test));
      this.bU.a(4, new cez.b(this));
   }

   @Override
   protected ccy b(dcu $$0) {
      return new cda(this, $$0);
   }

   @Override
   public void a(eww $$0) {
      if (this.dc() && this.bf()) {
         this.a(0.01F, $$0);
         this.a(btq.a, this.dt());
         this.i(this.dt().a(0.9));
         if (this.p() == null) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      if (!this.bf() && this.aF() && this.R) {
         this.i(this.dt().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.e(false);
         this.av = true;
         this.b(this.gn());
      }

      super.m_();
   }

   @Override
   protected bqq b(cmv $$0, bqp $$1) {
      return cfe.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuo $$0) {
      cfe.a(this, $$0);
   }

   @Override
   public void c(ua $$0) {
      cfe.a(this, $$0);
   }

   @Override
   public avn x() {
      return avo.dk;
   }

   protected boolean gm() {
      return true;
   }

   protected abstract avn gn();

   @Override
   protected avn aQ() {
      return avo.iV;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
   }

   static class a extends bzn {
      private final cez l;

      a(cez $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awj.a)) {
            this.l.i(this.l.dt().b(0.0, 0.005, 0.0));
         }

         if (this.k == bzn.a.b && !this.l.J().l()) {
            float $$0 = (float)(this.h * this.l.g(buu.v));
            this.l.z(ayn.i(0.125F, this.l.fk(), $$0));
            double $$1 = this.e - this.l.dv();
            double $$2 = this.f - this.l.dx();
            double $$3 = this.g - this.l.dB();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dt().b(0.0, (double)this.l.fk() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayn.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dG(), $$5, 90.0F));
               this.l.aY = this.l.dG();
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class b extends cbi {
      private final cez i;

      public b(cez $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gm() && super.b();
      }
   }
}
