public abstract class bwg extends bxl implements bwl {
   private static final afm<Boolean> b = afp.a(bwg.class, afo.k);

   public bwg(bkm<? extends bwg> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new bwg.a(this);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return $$1.b * 0.65F;
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 3.0);
   }

   @Override
   public boolean U() {
      return super.U() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ac();
   }

   @Override
   public int fI() {
      return 8;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public boolean t() {
      return this.an.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bsm(this, 1.25));
      this.bO.a(2, new bra<>(this, cdm.class, 8.0F, 1.6, 1.4, bkl.f::test));
      this.bO.a(4, new bwg.b(this));
   }

   @Override
   protected buh b(crs $$0) {
      return new buj(this, $$0);
   }

   @Override
   public void h(eji $$0) {
      if (this.cX() && this.aX()) {
         this.a(0.01F, $$0);
         this.a(ble.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public void c_() {
      if (!this.aX() && this.aA() && this.Q) {
         this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gf(), this.eV(), this.eW());
      }

      super.c_();
   }

   @Override
   protected biq b(cdm $$0, bip $$1) {
      return bwl.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(clb $$0) {
      bwl.a(this, $$0);
   }

   @Override
   public void c(rz $$0) {
      bwl.a(this, $$0);
   }

   @Override
   public aqm y() {
      return aqn.cD;
   }

   protected boolean ge() {
      return true;
   }

   protected abstract aqm gf();

   @Override
   protected aqm aL() {
      return aqn.hS;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
   }

   static class a extends bqw {
      private final bwg l;

      a(bwg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(arh.a)) {
            this.l.f(this.l.do().b(0.0, 0.005, 0.0));
         }

         if (this.k == bqw.a.b && !this.l.L().l()) {
            float $$0 = (float)(this.h * this.l.b(bme.m));
            this.l.w(ati.i(0.125F, this.l.fe(), $$0));
            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.f(this.l.do().b(0.0, (double)this.l.fe() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ati.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$5, 90.0F));
               this.l.aU = this.l.dB();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bsr {
      private final bwg i;

      public b(bwg $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() && super.a();
      }
   }
}
