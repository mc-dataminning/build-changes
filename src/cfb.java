public abstract class cfb extends cgg implements cfg {
   private static final akj<Boolean> b = akn.a(cfb.class, akl.k);

   public cfb(bsz<? extends cfb> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new cfb.a(this);
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   @Override
   public int fQ() {
      return 8;
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cbf(this, 1.25));
      this.bS.a(2, new bzt<>(this, cmw.class, 8.0F, 1.6, 1.4, bsy.f::test));
      this.bS.a(4, new cfb.b(this));
   }

   @Override
   protected cda b(dbx $$0) {
      return new cdc(this, $$0);
   }

   @Override
   public void a(evq $$0) {
      if (this.db() && this.be()) {
         this.a(0.01F, $$0);
         this.a(btt.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.be() && this.aE() && this.R) {
         this.h(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.gr());
      }

      super.n_();
   }

   @Override
   protected bqt b(cmw $$0, bqs $$1) {
      return cfg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuo $$0) {
      cfg.a(this, $$0);
   }

   @Override
   public void c(ur $$0) {
      cfg.a(this, $$0);
   }

   @Override
   public avy y() {
      return avz.dk;
   }

   protected boolean gq() {
      return true;
   }

   protected abstract avy gr();

   @Override
   protected avy aP() {
      return avz.iV;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
   }

   static class a extends bzp {
      private final cfb l;

      a(cfb $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awu.a)) {
            this.l.h(this.l.ds().b(0.0, 0.005, 0.0));
         }

         if (this.k == bzp.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(buw.r));
            this.l.y(ayy.i(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.ds().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayy.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dF(), $$5, 90.0F));
               this.l.aY = this.l.dF();
            }
         } else {
            this.l.y(0.0F);
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
      public boolean a() {
         return this.i.gq() && super.a();
      }
   }
}
