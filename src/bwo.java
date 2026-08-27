public abstract class bwo extends bxt implements bwt {
   private static final afo<Boolean> b = afr.a(bwo.class, afq.k);

   public bwo(bku<? extends bwo> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new bwo.a(this);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.65F;
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 3.0);
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
   protected void b_() {
      super.b_();
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsu(this, 1.25));
      this.bO.a(2, new bri<>(this, cdu.class, 8.0F, 1.6, 1.4, bkt.f::test));
      this.bO.a(4, new bwo.b(this));
   }

   @Override
   protected bup b(csa $$0) {
      return new bur(this, $$0);
   }

   @Override
   public void a(eju $$0) {
      if (this.cZ() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(blm.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.q() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void c_() {
      if (!this.aZ() && this.aC() && this.Q) {
         this.g(this.dq().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gg(), this.eX(), this.eY());
      }

      super.c_();
   }

   @Override
   protected bix b(cdu $$0, biw $$1) {
      return bwt.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(clj $$0) {
      bwt.a(this, $$0);
   }

   @Override
   public void c(rz $$0) {
      bwt.a(this, $$0);
   }

   @Override
   public aqq A() {
      return aqr.cD;
   }

   protected boolean gf() {
      return true;
   }

   protected abstract aqq gg();

   @Override
   protected aqq aN() {
      return aqr.ii;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
   }

   static class a extends bre {
      private final bwo l;

      a(bwo $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(arl.a)) {
            this.l.g(this.l.dq().b(0.0, 0.005, 0.0));
         }

         if (this.k == bre.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.b(bmm.m));
            this.l.w(atm.i(0.125F, this.l.fg(), $$0));
            double $$1 = this.e - this.l.ds();
            double $$2 = this.f - this.l.du();
            double $$3 = this.g - this.l.dy();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dq().b(0.0, (double)this.l.fg() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(atm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$5, 90.0F));
               this.l.aU = this.l.dD();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bsz {
      private final bwo i;

      public b(bwo $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gf() && super.a();
      }
   }
}
