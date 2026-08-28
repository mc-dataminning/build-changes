public abstract class cep extends cfu implements ceu {
   private static final ajp<Boolean> b = ajt.a(cep.class, ajr.k);

   public cep(bsn<? extends cep> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new cep.a(this);
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 3.0);
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
   protected void a(ajt.a $$0) {
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cat(this, 1.25));
      this.bU.a(2, new bzh<>(this, cml.class, 8.0F, 1.6, 1.4, bsm.f::test));
      this.bU.a(4, new cep.b(this));
   }

   @Override
   protected cco b(dcg $$0) {
      return new ccq(this, $$0);
   }

   @Override
   public void a(ewh $$0) {
      if (this.dd() && this.bg()) {
         this.a(0.01F, $$0);
         this.a(bth.a, this.du());
         this.j(this.du().a(0.9));
         if (this.p() == null) {
            this.j(this.du().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      if (!this.bg() && this.aG() && this.R) {
         this.j(this.du().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.e(false);
         this.av = true;
         this.b(this.go());
      }

      super.m_();
   }

   @Override
   protected bqh b(cml $$0, bqg $$1) {
      return ceu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cud $$0) {
      ceu.a(this, $$0);
   }

   @Override
   public void c(tx $$0) {
      ceu.a(this, $$0);
   }

   @Override
   public avg x() {
      return avh.dk;
   }

   protected boolean gn() {
      return true;
   }

   protected abstract avg go();

   @Override
   protected avg aR() {
      return avh.iV;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
   }

   static class a extends bzd {
      private final cep l;

      a(cep $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awc.a)) {
            this.l.j(this.l.du().b(0.0, 0.005, 0.0));
         }

         if (this.k == bzd.a.b && !this.l.J().l()) {
            float $$0 = (float)(this.h * this.l.g(buk.v));
            this.l.z(ayg.i(0.125F, this.l.fl(), $$0));
            double $$1 = this.e - this.l.dw();
            double $$2 = this.f - this.l.dy();
            double $$3 = this.g - this.l.dC();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.j(this.l.du().b(0.0, (double)this.l.fl() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayg.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dH(), $$5, 90.0F));
               this.l.aZ = this.l.dH();
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class b extends cay {
      private final cep i;

      public b(cep $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() && super.a();
      }
   }
}
