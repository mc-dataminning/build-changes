public abstract class cik extends cjt implements ciq {
   private static final akh<Boolean> a = akl.a(cik.class, akj.k);

   public cik(bwj<? extends cik> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new cik.a(this);
   }

   public static bye.a j() {
      return bxb.E().a(byf.s, 3.0);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && !this.h_();
   }

   @Override
   public int ai() {
      return 8;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean m() {
      return this.al.a(a);
   }

   @Override
   public void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ceo(this, 1.25));
      this.bC.a(2, new cdc<>(this, cqs.class, 8.0F, 1.6, 1.4, bwh.f::test));
      this.bC.a(4, new cik.b(this));
   }

   @Override
   protected cgj b(dip $$0) {
      return new cgl(this, $$0);
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bj()) {
         this.a(0.01F, $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void k_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.t());
      }

      super.k_();
   }

   @Override
   protected bty b(cqs $$0, btx $$1) {
      return ciq.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void j(cys $$0) {
      ciq.a(this, $$0);
   }

   @Override
   public void h(tx $$0) {
      ciq.a(this, $$0);
   }

   @Override
   public awk n() {
      return awl.dl;
   }

   protected boolean q() {
      return true;
   }

   protected abstract awk t();

   @Override
   protected awk aV() {
      return awl.jv;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
   }

   static class a extends ccy {
      private final cik l;

      a(cik $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axf.a)) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == ccy.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(byf.v));
            this.l.B(azk.h(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dy().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aV = this.l.dL();
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class b extends cet {
      private final cik i;

      public b(cik $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
