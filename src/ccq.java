public abstract class ccq extends cdv implements ccv {
   private static final ajk<Boolean> b = ajo.a(ccq.class, ajm.k);

   public ccq(bqr<? extends ccq> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new ccq.a(this);
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 3.0);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ae();
   }

   @Override
   public int fP() {
      return 8;
   }

   @Override
   protected void a(ajo.a $$0) {
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
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byu(this, 1.25));
      this.bS.a(2, new bxi<>(this, ckl.class, 8.0F, 1.6, 1.4, bqq.f::test));
      this.bS.a(4, new ccq.b(this));
   }

   @Override
   protected cap b(czu $$0) {
      return new car(this, $$0);
   }

   @Override
   public void a(etf $$0) {
      if (this.cZ() && this.bc()) {
         this.a(0.01F, $$0);
         this.a(brj.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.p() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bc() && this.aC() && this.R) {
         this.g(this.dq().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.gq());
      }

      super.n_();
   }

   @Override
   protected boq b(ckl $$0, bop $$1) {
      return ccv.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(csd $$0) {
      ccv.a(this, $$0);
   }

   @Override
   public void c(ty $$0) {
      ccv.a(this, $$0);
   }

   @Override
   public auy y() {
      return auz.dk;
   }

   protected boolean gp() {
      return true;
   }

   protected abstract auy gq();

   @Override
   protected auy aN() {
      return auz.iQ;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
   }

   static class a extends bxe {
      private final ccq l;

      a(ccq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(avt.a)) {
            this.l.g(this.l.dq().b(0.0, 0.005, 0.0));
         }

         if (this.k == bxe.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(bsl.r));
            this.l.y(axw.i(0.125F, this.l.fl(), $$0));
            double $$1 = this.e - this.l.ds();
            double $$2 = this.f - this.l.du();
            double $$3 = this.g - this.l.dy();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dq().b(0.0, (double)this.l.fl() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(axw.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$5, 90.0F));
               this.l.aZ = this.l.dD();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends byz {
      private final ccq i;

      public b(ccq $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gp() && super.a();
      }
   }
}
