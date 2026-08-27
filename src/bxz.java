public abstract class bxz extends bze implements bye {
   private static final agn<Boolean> b = agq.a(bxz.class, agp.k);

   public bxz(bmc<? extends bxz> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bxz.a(this);
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 3.0);
   }

   @Override
   public boolean X() {
      return super.X() || this.w();
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   @Override
   public int fJ() {
      return 8;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean w() {
      return this.an.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bud(this, 1.25));
      this.bP.a(2, new bsr<>(this, cfq.class, 8.0F, 1.6, 1.4, bmb.f::test));
      this.bP.a(4, new bxz.b(this));
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bwa(this, $$0);
   }

   @Override
   public void a(emc $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(bmu.a, this.do());
         this.g(this.do().a(0.9));
         if (this.q() == null) {
            this.g(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.aZ() && this.aC() && this.Q) {
         this.g(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gg(), this.eW(), this.eX());
      }

      super.d_();
   }

   @Override
   protected bkc b(cfq $$0, bkb $$1) {
      return bye.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cng $$0) {
      bye.a(this, $$0);
   }

   @Override
   public void c(so $$0) {
      bye.a(this, $$0);
   }

   @Override
   public ars A() {
      return art.db;
   }

   protected boolean gf() {
      return true;
   }

   protected abstract ars gg();

   @Override
   protected ars aN() {
      return art.iG;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
   }

   static class a extends bsn {
      private final bxz l;

      a(bxz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(asn.a)) {
            this.l.g(this.l.do().b(0.0, 0.005, 0.0));
         }

         if (this.k == bsn.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.g(bnu.o));
            this.l.v(aup.i(0.125F, this.l.ff(), $$0));
            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.do().b(0.0, (double)this.l.ff() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(aup.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$5, 90.0F));
               this.l.aU = this.l.dB();
            }
         } else {
            this.l.v(0.0F);
         }
      }
   }

   static class b extends bui {
      private final bxz i;

      public b(bxz $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gf() && super.a();
      }
   }
}
