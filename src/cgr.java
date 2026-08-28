public abstract class cgr extends chx implements cgx {
   private static final ako<Boolean> b = aks.a(cgr.class, akq.k);

   public cgr(bup<? extends cgr> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cgr.a(this);
   }

   public static bwl.a q() {
      return bvg.E().a(bwm.s, 3.0);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.an();
   }

   @Override
   public int aj() {
      return 8;
   }

   @Override
   protected void a(aks.a $$0) {
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
   public void b(un $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new ccv(this, 1.25));
      this.bS.a(2, new cbj<>(this, cor.class, 8.0F, 1.6, 1.4, bun.f::test));
      this.bS.a(4, new cgr.b(this));
   }

   @Override
   protected ceq b(dff $$0) {
      return new ces(this, $$0);
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk() && this.bl()) {
         this.a(0.01F, $$0);
         this.a(bvi.a, this.dB());
         this.h(this.dB().c(0.9));
         if (this.m() == null) {
            this.h(this.dB().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bl() && this.aL() && this.R) {
         this.h(this.dB().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.as = true;
         this.b(this.gw());
      }

      super.n_();
   }

   @Override
   protected bsh b(cor $$0, bsg $$1) {
      return cgx.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void k(cwf $$0) {
      cgx.a(this, $$0);
   }

   @Override
   public void h(un $$0) {
      cgx.a(this, $$0);
   }

   @Override
   public awn y() {
      return awo.dk;
   }

   protected boolean gv() {
      return true;
   }

   protected abstract awn gw();

   @Override
   protected awn aX() {
      return awo.iW;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
   }

   static class a extends cbf {
      private final cgr l;

      a(cgr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axj.a)) {
            this.l.h(this.l.dB().b(0.0, 0.005, 0.0));
         }

         if (this.k == cbf.a.b && !this.l.P().m()) {
            float $$0 = (float)(this.h * this.l.h(bwm.v));
            this.l.C(azn.h(0.125F, this.l.fs(), $$0));
            double $$1 = this.e - this.l.dD();
            double $$2 = this.f - this.l.dF();
            double $$3 = this.g - this.l.dJ();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dB().b(0.0, (double)this.l.fs() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azn.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dO(), $$5, 90.0F));
               this.l.aX = this.l.dO();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cda {
      private final cgr i;

      public b(cgr $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gv() && super.b();
      }
   }
}
