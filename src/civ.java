public abstract class civ extends ckh implements cjb {
   private static final akj<Boolean> a = akn.a(civ.class, akl.k);

   public civ(bwr<? extends civ> $$0, djh $$1) {
      super($$0, $$1);
      this.bA = new civ.a(this);
   }

   public static byo.a j() {
      return bxl.E().a(byp.s, 3.0);
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
   public int fW() {
      return 8;
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cey(this, 1.25));
      this.bD.a(2, new cdm<>(this, crj.class, 8.0F, 1.6, 1.4, bwp.f::test));
      this.bD.a(4, new civ.b(this));
   }

   @Override
   protected cgt b(djh $$0) {
      return new cgv(this, $$0);
   }

   @Override
   public void a_(fex $$0) {
      if (this.bh()) {
         this.a(0.01F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
         if (this.f() == null) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void k_() {
      if (!this.bh() && this.aH() && this.Q) {
         this.i(this.dx().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.t());
      }

      super.k_();
   }

   @Override
   protected bug b(crj $$0, buf $$1) {
      return cjb.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(czk $$0) {
      cjb.a(this, $$0);
   }

   @Override
   public void h(tz $$0) {
      cjb.a(this, $$0);
   }

   @Override
   public awm n() {
      return awn.dl;
   }

   protected boolean q() {
      return true;
   }

   protected abstract awm t();

   @Override
   protected awm aT() {
      return awn.jz;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
   }

   static class a extends cdi {
      private final civ l;

      a(civ $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axh.a)) {
            this.l.i(this.l.dx().b(0.0, 0.005, 0.0));
         }

         if (this.k == cdi.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(byp.v));
            this.l.B(azm.h(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.dz();
            double $$2 = this.f - this.l.dB();
            double $$3 = this.g - this.l.dF();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dx().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dK(), $$5, 90.0F));
               this.l.aV = this.l.dK();
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class b extends cfd {
      private final civ i;

      public b(civ $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
