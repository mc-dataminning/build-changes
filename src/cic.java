public abstract class cic extends cjl implements cii {
   private static final akg<Boolean> a = akk.a(cic.class, aki.k);

   public cic(bwb<? extends cic> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new cic.a(this);
   }

   public static bxw.a j() {
      return bwt.E().a(bxx.s, 3.0);
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
   public int ai() {
      return 8;
   }

   @Override
   protected void a(akk.a $$0) {
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
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new ceg(this, 1.25));
      this.bB.a(2, new ccu<>(this, cqi.class, 8.0F, 1.6, 1.4, bvz.f::test));
      this.bB.a(4, new cic.b(this));
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cgd(this, $$0);
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bj()) {
         this.a(0.01F, $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void k_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.t());
      }

      super.k_();
   }

   @Override
   protected btq b(cqi $$0, btp $$1) {
      return cii.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void j(cxy $$0) {
      cii.a(this, $$0);
   }

   @Override
   public void h(tw $$0) {
      cii.a(this, $$0);
   }

   @Override
   public awj n() {
      return awk.dl;
   }

   protected boolean q() {
      return true;
   }

   protected abstract awj t();

   @Override
   protected awj aV() {
      return awk.jv;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
   }

   static class a extends ccq {
      private final cic l;

      a(cic $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axf.a)) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == ccq.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(bxx.v));
            this.l.C(azk.h(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dy().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aU = this.l.dL();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cel {
      private final cic i;

      public b(cic $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
