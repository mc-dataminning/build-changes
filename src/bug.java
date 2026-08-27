public abstract class bug extends bvl implements bul {
   private static final adz<Boolean> b = aec.a(bug.class, aeb.k);

   public bug(bim<? extends bug> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new bug.a(this);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * 0.65F;
   }

   public static bkd.a p() {
      return bja.x().a(bke.a, 3.0);
   }

   @Override
   public boolean R() {
      return super.R() || this.q();
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.ac();
   }

   @Override
   public int Z() {
      return 8;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean q() {
      return this.an.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bqm(this, 1.25));
      this.bO.a(2, new bpa<>(this, cbm.class, 8.0F, 1.6, 1.4, bil.f::test));
      this.bO.a(4, new bug.b(this));
   }

   @Override
   protected bsh b(cpl $$0) {
      return new bsj(this, $$0);
   }

   @Override
   public void h(ehd $$0) {
      if (this.cX() && this.aX()) {
         this.a(0.01F, $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
         if (this.j() == null) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public void b_() {
      if (!this.aX() && this.aA() && this.Q) {
         this.f(this.dn().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gb(), this.eU(), this.eV());
      }

      super.b_();
   }

   @Override
   protected bgq b(cbm $$0, bgp $$1) {
      return bul.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cix $$0) {
      bul.a(this, $$0);
   }

   @Override
   public void c(qr $$0) {
      bul.a(this, $$0);
   }

   @Override
   public aov t() {
      return aow.cD;
   }

   protected boolean ga() {
      return true;
   }

   protected abstract aov gb();

   @Override
   protected aov aL() {
      return aow.hO;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
   }

   static class a extends bow {
      private final bug l;

      a(bug $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(apq.a)) {
            this.l.f(this.l.dn().b(0.0, 0.005, 0.0));
         }

         if (this.k == bow.a.b && !this.l.H().l()) {
            float $$0 = (float)(this.h * this.l.b(bke.d));
            this.l.w(arp.i(0.125F, this.l.fd(), $$0));
            double $$1 = this.e - this.l.dp();
            double $$2 = this.f - this.l.dr();
            double $$3 = this.g - this.l.dv();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.f(this.l.dn().b(0.0, (double)this.l.fd() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(arp.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dA(), $$5, 90.0F));
               this.l.aU = this.l.dA();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bqr {
      private final bug i;

      public b(bug $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ga() && super.a();
      }
   }
}
