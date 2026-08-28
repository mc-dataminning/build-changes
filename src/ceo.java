public abstract class ceo extends cft implements cet {
   private static final ajp<Boolean> b = ajt.a(ceo.class, ajr.k);

   public ceo(bsm<? extends ceo> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new ceo.a(this);
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ah();
   }

   @Override
   public int fN() {
      return 8;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean u() {
      return this.ao.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cas(this, 1.25));
      this.bU.a(2, new bzg<>(this, cmk.class, 8.0F, 1.6, 1.4, bsl.f::test));
      this.bU.a(4, new ceo.b(this));
   }

   @Override
   protected ccn b(dcf $$0) {
      return new ccp(this, $$0);
   }

   @Override
   public void a(ewf $$0) {
      if (this.dc() && this.bf()) {
         this.a(0.01F, $$0);
         this.a(btg.a, this.dt());
         this.i(this.dt().a(0.9));
         if (this.p() == null) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bf() && this.aF() && this.R) {
         this.i(this.dt().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.gp());
      }

      super.n_();
   }

   @Override
   protected bqg b(cmk $$0, bqf $$1) {
      return cet.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuc $$0) {
      cet.a(this, $$0);
   }

   @Override
   public void c(tx $$0) {
      cet.a(this, $$0);
   }

   @Override
   public avg y() {
      return avh.dk;
   }

   protected boolean go() {
      return true;
   }

   protected abstract avg gp();

   @Override
   protected avg aQ() {
      return avh.iV;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
   }

   static class a extends bzc {
      private final ceo l;

      a(ceo $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awc.a)) {
            this.l.i(this.l.dt().b(0.0, 0.005, 0.0));
         }

         if (this.k == bzc.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(buj.v));
            this.l.z(ayg.i(0.125F, this.l.fk(), $$0));
            double $$1 = this.e - this.l.dv();
            double $$2 = this.f - this.l.dx();
            double $$3 = this.g - this.l.dB();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dt().b(0.0, (double)this.l.fk() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayg.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dG(), $$5, 90.0F));
               this.l.aY = this.l.dG();
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class b extends cax {
      private final ceo i;

      public b(ceo $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.go() && super.a();
      }
   }
}
