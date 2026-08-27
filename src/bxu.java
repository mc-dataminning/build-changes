public abstract class bxu extends byz implements bxz {
   private static final agm<Boolean> b = agp.a(bxu.class, ago.k);

   public bxu(bly<? extends bxu> $$0, cto $$1) {
      super($$0, $$1);
      this.bL = new bxu.a(this);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return $$1.b * 0.65F;
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 3.0);
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new btz(this, 1.25));
      this.bO.a(2, new bsn<>(this, cfh.class, 8.0F, 1.6, 1.4, blx.f::test));
      this.bO.a(4, new bxu.b(this));
   }

   @Override
   protected bvu b(cto $$0) {
      return new bvw(this, $$0);
   }

   @Override
   public void a(els $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(bmq.a, this.dp());
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
   protected bka b(cfh $$0, bjz $$1) {
      return bxz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cmx $$0) {
      bxz.a(this, $$0);
   }

   @Override
   public void c(sn $$0) {
      bxz.a(this, $$0);
   }

   @Override
   public arq A() {
      return arr.cM;
   }

   protected boolean ge() {
      return true;
   }

   protected abstract arq gf();

   @Override
   protected arq aN() {
      return arr.ir;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
   }

   static class a extends bsj {
      private final bxu l;

      a(bxu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(asl.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bsj.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.b(bnq.m));
            this.l.w(aun.i(0.125F, this.l.ff(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(aun.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aU = this.l.dC();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bue {
      private final bxu i;

      public b(bxu $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() && super.a();
      }
   }
}
