public abstract class bzu extends caz implements bzz {
   private static final aie<Boolean> b = aih.a(bzu.class, aig.k);

   public bzu(bnw<? extends bzu> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new bzu.a(this);
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 3.0);
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
   public int fK() {
      return 8;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
   }

   @Override
   public boolean w() {
      return this.am.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bvy(this, 1.25));
      this.bO.a(2, new bum<>(this, chl.class, 8.0F, 1.6, 1.4, bnv.f::test));
      this.bO.a(4, new bzu.b(this));
   }

   @Override
   protected bxt b(cvr $$0) {
      return new bxv(this, $$0);
   }

   @Override
   public void a(enz $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(bon.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.aZ() && this.aC() && this.P) {
         this.g(this.dp().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.at = true;
         this.b(this.gh());
      }

      super.d_();
   }

   @Override
   protected blw b(chl $$0, blv $$1) {
      return bzz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cpd $$0) {
      bzz.a(this, $$0);
   }

   @Override
   public void c(sw $$0) {
      bzz.a(this, $$0);
   }

   @Override
   public atk A() {
      return atl.dc;
   }

   protected boolean gg() {
      return true;
   }

   protected abstract atk gh();

   @Override
   protected atk aN() {
      return atl.iH;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
   }

   static class a extends bui {
      private final bzu l;

      a(bzu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(auf.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bui.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.g(bpp.o));
            this.l.w(awi.i(0.125F, this.l.ff(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(awi.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aU = this.l.dC();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bwd {
      private final bzu i;

      public b(bzu $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gg() && super.a();
      }
   }
}
