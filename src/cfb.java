public abstract class cfb extends cgg implements cfg {
   private static final ajw<Boolean> b = aka.a(cfb.class, ajy.k);

   public cfb(bsx<? extends cfb> $$0, dcw $$1) {
      super($$0, $$1);
      this.bT = new cfb.a(this);
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 3.0);
   }

   @Override
   public boolean Y() {
      return super.Y() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ai();
   }

   @Override
   public int fN() {
      return 8;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean t() {
      return this.ao.a(b);
   }

   @Override
   public void x(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bW.a(0, new cbf(this, 1.25));
      this.bW.a(2, new bzt<>(this, cmx.class, 8.0F, 1.6, 1.4, bsw.f::test));
      this.bW.a(4, new cfb.b(this));
   }

   @Override
   protected cda b(dcw $$0) {
      return new cdc(this, $$0);
   }

   @Override
   public void a(exc $$0) {
      if (this.db() && this.bf()) {
         this.a(0.01F, $$0);
         this.a(bts.a, this.dr());
         this.i(this.dr().a(0.9));
         if (this.p() == null) {
            this.i(this.dr().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      if (!this.bf() && this.aF() && this.R) {
         this.i(this.dr().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.gl());
      }

      super.m_();
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      return cfg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuq $$0) {
      cfg.a(this, $$0);
   }

   @Override
   public void h(ub $$0) {
      cfg.a(this, $$0);
   }

   @Override
   public avo x() {
      return avp.dk;
   }

   protected boolean gk() {
      return true;
   }

   protected abstract avo gl();

   @Override
   protected avo aQ() {
      return avp.iV;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
   }

   static class a extends bzp {
      private final cfb l;

      a(cfb $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awk.a)) {
            this.l.i(this.l.dr().b(0.0, 0.005, 0.0));
         }

         if (this.k == bzp.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.g(buw.v));
            this.l.A(ayo.i(0.125F, this.l.fj(), $$0));
            double $$1 = this.e - this.l.dt();
            double $$2 = this.f - this.l.dv();
            double $$3 = this.g - this.l.dz();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dr().b(0.0, (double)this.l.fj() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayo.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.t(this.a(this.l.dE(), $$5, 90.0F));
               this.l.aY = this.l.dE();
            }
         } else {
            this.l.A(0.0F);
         }
      }
   }

   static class b extends cbk {
      private final cfb i;

      public b(cfb $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gk() && super.b();
      }
   }
}
