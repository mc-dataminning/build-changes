public abstract class cgi extends cho implements cgo {
   private static final akk<Boolean> b = ako.a(cgi.class, akm.k);

   public cgi(bug<? extends cgi> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cgi.a(this);
   }

   public static bwc.a q() {
      return bux.E().a(bwd.s, 3.0);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.am();
   }

   @Override
   public int aj() {
      return 8;
   }

   @Override
   protected void a(ako.a $$0) {
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
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new ccm(this, 1.25));
      this.bS.a(2, new cba<>(this, coh.class, 8.0F, 1.6, 1.4, bue.f::test));
      this.bS.a(4, new cgi.b(this));
   }

   @Override
   protected ceh b(dev $$0) {
      return new cej(this, $$0);
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj() && this.bk()) {
         this.a(0.01F, $$0);
         this.a(buz.a, this.dA());
         this.h(this.dA().c(0.9));
         if (this.m() == null) {
            this.h(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bk() && this.aJ() && this.R) {
         this.h(this.dA().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.as = true;
         this.b(this.gw());
      }

      super.n_();
   }

   @Override
   protected bry b(coh $$0, brx $$1) {
      return cgo.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void k(cvx $$0) {
      cgo.a(this, $$0);
   }

   @Override
   public void h(uj $$0) {
      cgo.a(this, $$0);
   }

   @Override
   public awj y() {
      return awk.dk;
   }

   protected boolean gv() {
      return true;
   }

   protected abstract awj gw();

   @Override
   protected awj aV() {
      return awk.iW;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
   }

   static class a extends caw {
      private final cgi l;

      a(cgi $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axf.a)) {
            this.l.h(this.l.dA().b(0.0, 0.005, 0.0));
         }

         if (this.k == caw.a.b && !this.l.P().m()) {
            float $$0 = (float)(this.h * this.l.h(bwd.v));
            this.l.C(azj.h(0.125F, this.l.fr(), $$0));
            double $$1 = this.e - this.l.dC();
            double $$2 = this.f - this.l.dE();
            double $$3 = this.g - this.l.dI();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dA().b(0.0, (double)this.l.fr() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azj.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dN(), $$5, 90.0F));
               this.l.aU = this.l.dN();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends ccr {
      private final cgi i;

      public b(cgi $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gv() && super.b();
      }
   }
}
