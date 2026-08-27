public abstract class bxf extends byk implements bxk {
   private static final afz<Boolean> b = agc.a(bxf.class, agb.k);

   public bxf(blj<? extends bxf> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new bxf.a(this);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.65F;
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 3.0);
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
   public int fI() {
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
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new btk(this, 1.25));
      this.bO.a(2, new bry<>(this, cer.class, 8.0F, 1.6, 1.4, bli.f::test));
      this.bO.a(4, new bxf.b(this));
   }

   @Override
   protected bvf b(csy $$0) {
      return new bvh(this, $$0);
   }

   @Override
   public void a(elb $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(bmb.a, this.dp());
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
      if (!this.aZ() && this.aC() && this.Q) {
         this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.a(this.gf(), this.eW(), this.eX());
      }

      super.d_();
   }

   @Override
   protected bjl b(cer $$0, bjk $$1) {
      return bxk.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cmh $$0) {
      bxk.a(this, $$0);
   }

   @Override
   public void c(sj $$0) {
      bxk.a(this, $$0);
   }

   @Override
   public arb A() {
      return arc.cM;
   }

   protected boolean ge() {
      return true;
   }

   protected abstract arb gf();

   @Override
   protected arb aN() {
      return arc.ir;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
   }

   static class a extends bru {
      private final bxf l;

      a(bxf $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(arw.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bru.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.b(bnb.m));
            this.l.w(aty.i(0.125F, this.l.ff(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(aty.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aU = this.l.dC();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends btp {
      private final bxf i;

      public b(bxf $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() && super.a();
      }
   }
}
