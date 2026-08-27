public abstract class bri extends bsn implements brn {
   private static final aby<Boolean> b = acb.a(bri.class, aca.k);

   public bri(bfn<? extends bri> $$0, cmm $$1) {
      super($$0, $$1);
      this.bL = new bri.a(this);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b * 0.65F;
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 3.0);
   }

   @Override
   public boolean T() {
      return super.T() || this.r();
   }

   @Override
   public boolean h(double $$0) {
      return !this.r() && !this.aa();
   }

   @Override
   public int fE() {
      return 8;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, false);
   }

   @Override
   public boolean r() {
      return this.am.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.r());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(0, new bno(this, 1.25));
      this.bO.a(2, new bmc<>(this, byo.class, 8.0F, 1.6, 1.4, bfm.f::test));
      this.bO.a(4, new bri.b(this));
   }

   @Override
   protected bpj b(cmm $$0) {
      return new bpl(this, $$0);
   }

   @Override
   public void h(eei $$0) {
      if (this.cV() && this.aV()) {
         this.a(0.01F, $$0);
         this.a(bgf.a, this.dl());
         this.f(this.dl().a(0.9));
         if (this.j() == null) {
            this.f(this.dl().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public void b_() {
      if (!this.aV() && this.ay() && this.P) {
         this.f(this.dl().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.at = true;
         this.a(this.fZ(), this.eR(), this.eS());
      }

      super.b_();
   }

   @Override
   protected bdx b(byo $$0, bdw $$1) {
      return brn.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cfz $$0) {
      brn.a(this, $$0);
   }

   @Override
   public void c(qr $$0) {
      brn.a(this, $$0);
   }

   @Override
   public amg w() {
      return amh.cD;
   }

   protected boolean fY() {
      return true;
   }

   protected abstract amg fZ();

   @Override
   protected amg aJ() {
      return amh.hO;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
   }

   static class a extends bly {
      private final bri l;

      a(bri $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(anb.a)) {
            this.l.f(this.l.dl().b(0.0, 0.005, 0.0));
         }

         if (this.k == bly.a.b && !this.l.J().l()) {
            float $$0 = (float)(this.h * this.l.b(bhg.d));
            this.l.w(apa.i(0.125F, this.l.fa(), $$0));
            double $$1 = this.e - this.l.dn();
            double $$2 = this.f - this.l.dp();
            double $$3 = this.g - this.l.dt();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.f(this.l.dl().b(0.0, (double)this.l.fa() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(apa.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.a_(this.a(this.l.dy(), $$5, 90.0F));
               this.l.aV = this.l.dy();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bnt {
      private final bri i;

      public b(bri $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.fY() && super.a();
      }
   }
}
