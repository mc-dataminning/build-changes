public abstract class cel extends cfq implements ceq {
   private static final ajp<Boolean> b = ajt.a(cel.class, ajr.k);

   public cel(bsj<? extends cel> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new cel.a(this);
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   @Override
   public int fM() {
      return 8;
   }

   @Override
   protected void a(ajt.a $$0) {
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cap(this, 1.25));
      this.bU.a(2, new bzd<>(this, cmh.class, 8.0F, 1.6, 1.4, bsi.f::test));
      this.bU.a(4, new cel.b(this));
   }

   @Override
   protected cck b(dcd $$0) {
      return new ccm(this, $$0);
   }

   @Override
   public void a(evz $$0) {
      if (this.db() && this.be()) {
         this.a(0.01F, $$0);
         this.a(btd.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.be() && this.aE() && this.R) {
         this.h(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.go());
      }

      super.n_();
   }

   @Override
   protected bqd b(cmh $$0, bqc $$1) {
      return ceq.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cua $$0) {
      ceq.a(this, $$0);
   }

   @Override
   public void c(tx $$0) {
      ceq.a(this, $$0);
   }

   @Override
   public ave y() {
      return avf.dk;
   }

   protected boolean gn() {
      return true;
   }

   protected abstract ave go();

   @Override
   protected ave aP() {
      return avf.iV;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
   }

   static class a extends byz {
      private final cel l;

      a(cel $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awa.a)) {
            this.l.h(this.l.ds().b(0.0, 0.005, 0.0));
         }

         if (this.k == byz.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(bug.v));
            this.l.z(aye.i(0.125F, this.l.fj(), $$0));
            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.ds().b(0.0, (double)this.l.fj() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(aye.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dF(), $$5, 90.0F));
               this.l.aY = this.l.dF();
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class b extends cau {
      private final cel i;

      public b(cel $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() && super.a();
      }
   }
}
