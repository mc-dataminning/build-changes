public abstract class cfz extends chf implements cgf {
   private static final akh<Boolean> b = akl.a(cfz.class, akj.k);

   public cfz(bty<? extends cfz> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cfz.a(this);
   }

   public static bvt.a q() {
      return bup.E().a(bvu.s, 3.0);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ak();
   }

   @Override
   public int fS() {
      return 8;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean t() {
      return this.am.a(b);
   }

   @Override
   public void x(boolean $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new ccd(this, 1.25));
      this.bS.a(2, new car<>(this, cnx.class, 8.0F, 1.6, 1.4, btw.f::test));
      this.bS.a(4, new cfz.b(this));
   }

   @Override
   protected cdy b(dej $$0) {
      return new cea(this, $$0);
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de() && this.bi()) {
         this.a(0.01F, $$0);
         this.a(bur.a, this.dv());
         this.h(this.dv().c(0.9));
         if (this.m() == null) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bi() && this.aH() && this.R) {
         this.h(this.dv().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.as = true;
         this.b(this.gp());
      }

      super.n_();
   }

   @Override
   protected brs b(cnx $$0, brr $$1) {
      return cgf.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void m(cvs $$0) {
      cgf.a(this, $$0);
   }

   @Override
   public void h(ug $$0) {
      cgf.a(this, $$0);
   }

   @Override
   public awf y() {
      return awg.dk;
   }

   protected boolean go() {
      return true;
   }

   protected abstract awf gp();

   @Override
   protected awf aT() {
      return awg.iW;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
   }

   static class a extends can {
      private final cfz l;

      a(cfz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axb.a)) {
            this.l.h(this.l.dv().b(0.0, 0.005, 0.0));
         }

         if (this.k == can.a.b && !this.l.P().m()) {
            float $$0 = (float)(this.h * this.l.h(bvu.v));
            this.l.C(azf.h(0.125F, this.l.fm(), $$0));
            double $$1 = this.e - this.l.dx();
            double $$2 = this.f - this.l.dz();
            double $$3 = this.g - this.l.dD();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dv().b(0.0, (double)this.l.fm() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azf.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.a(this.l.dI(), $$5, 90.0F));
               this.l.aT = this.l.dI();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cci {
      private final cfz i;

      public b(cfz $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.go() && super.b();
      }
   }
}
