public abstract class cgu extends cia implements cha {
   private static final akm<Boolean> a = akq.a(cgu.class, ako.k);

   public cgu(bus<? extends cgu> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new cgu.a(this);
   }

   public static bwo.a n() {
      return bvj.C().a(bwp.s, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.q();
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.k_();
   }

   @Override
   public int ad() {
      return 8;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean q() {
      return this.al.a(a);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new ccy(this, 1.25));
      this.bS.a(2, new cbm<>(this, cou.class, 8.0F, 1.6, 1.4, buq.f::test));
      this.bS.a(4, new cgu.b(this));
   }

   @Override
   protected cet b(dfm $$0) {
      return new cev(this, $$0);
   }

   @Override
   public void a_(ezy $$0) {
      if (this.di() && this.bj()) {
         this.a(0.01F, $$0);
         this.a(bvl.a, this.dy());
         this.h(this.dy().c(0.9));
         if (this.aa_() == null) {
            this.h(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.h(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.gn());
      }

      super.d_();
   }

   @Override
   protected bsk b(cou $$0, bsj $$1) {
      return cha.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cwm $$0) {
      cha.a(this, $$0);
   }

   @Override
   public void h(ul $$0) {
      cha.a(this, $$0);
   }

   @Override
   public awm v() {
      return awn.dk;
   }

   protected boolean gm() {
      return true;
   }

   protected abstract awm gn();

   @Override
   protected awm aV() {
      return awn.iW;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
   }

   static class a extends cbi {
      private final cgu l;

      a(cgu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axi.a)) {
            this.l.h(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == cbi.a.b && !this.l.L().m()) {
            float $$0 = (float)(this.h * this.l.h(bwp.v));
            this.l.C(azm.h(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dy().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aW = this.l.dL();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cdd {
      private final cgu i;

      public b(cgu $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gm() && super.b();
      }
   }
}
