public abstract class ced extends cfi implements cei {
   private static final ajs<Boolean> b = ajw.a(ced.class, aju.k);

   public ced(bsc<? extends ced> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new ced.a(this);
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 3.0);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   @Override
   public int ae() {
      return 8;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean u() {
      return this.ao.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cah(this, 1.25));
      this.bS.a(2, new byv<>(this, cly.class, 8.0F, 1.6, 1.4, bsb.f::test));
      this.bS.a(4, new ced.b(this));
   }

   @Override
   protected ccc b(daz $$0) {
      return new cce(this, $$0);
   }

   @Override
   public void a(eum $$0) {
      if (this.db() && this.be()) {
         this.a(0.01F, $$0);
         this.a(bsv.a, this.ds());
         this.g(this.ds().a(0.9));
         if (this.p() == null) {
            this.g(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.be() && this.aE() && this.R) {
         this.g(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.gq());
      }

      super.n_();
   }

   @Override
   protected bpw b(cly $$0, bpv $$1) {
      return cei.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(ctq $$0) {
      cei.a(this, $$0);
   }

   @Override
   public void c(ud $$0) {
      cei.a(this, $$0);
   }

   @Override
   public avh y() {
      return avi.dk;
   }

   protected boolean gp() {
      return true;
   }

   protected abstract avh gq();

   @Override
   protected avh aP() {
      return avi.iV;
   }

   @Override
   protected void b(io $$0, drd $$1) {
   }

   static class a extends byr {
      private final ced l;

      a(ced $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awc.a)) {
            this.l.g(this.l.ds().b(0.0, 0.005, 0.0));
         }

         if (this.k == byr.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(bty.r));
            this.l.y(ayf.i(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.ds().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayf.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dF(), $$5, 90.0F));
               this.l.aY = this.l.dF();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends cam {
      private final ced i;

      public b(ced $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gp() && super.a();
      }
   }
}
