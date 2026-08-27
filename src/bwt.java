public abstract class bwt extends bxy implements bwy {
   private static final afs<Boolean> b = afv.a(bwt.class, afu.k);

   public bwt(bkz<? extends bwt> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new bwt.a(this);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.65F;
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
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
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsz(this, 1.25));
      this.bO.a(2, new brn<>(this, cdz.class, 8.0F, 1.6, 1.4, bky.f::test));
      this.bO.a(4, new bwt.b(this));
   }

   @Override
   protected buu b(csf $$0) {
      return new buw(this, $$0);
   }

   @Override
   public void a(ejz $$0) {
      if (this.cZ() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(blr.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.q() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.aZ() && this.aC() && this.Q) {
         this.g(this.dq().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gg(), this.eX(), this.eY());
      }

      super.d_();
   }

   @Override
   protected bjb b(cdz $$0, bja $$1) {
      return bwy.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(clo $$0) {
      bwy.a(this, $$0);
   }

   @Override
   public void c(sd $$0) {
      bwy.a(this, $$0);
   }

   @Override
   public aqu A() {
      return aqv.cD;
   }

   protected boolean gf() {
      return true;
   }

   protected abstract aqu gg();

   @Override
   protected aqu aN() {
      return aqv.ii;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
   }

   static class a extends brj {
      private final bwt l;

      a(bwt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(arp.a)) {
            this.l.g(this.l.dq().b(0.0, 0.005, 0.0));
         }

         if (this.k == brj.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.b(bmr.m));
            this.l.w(atq.i(0.125F, this.l.fg(), $$0));
            double $$1 = this.e - this.l.ds();
            double $$2 = this.f - this.l.du();
            double $$3 = this.g - this.l.dy();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dq().b(0.0, (double)this.l.fg() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(atq.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$5, 90.0F));
               this.l.aU = this.l.dD();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bte {
      private final bwt i;

      public b(bwt $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gf() && super.a();
      }
   }
}
