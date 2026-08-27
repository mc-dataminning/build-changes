public abstract class bzq extends cav implements bzv {
   private static final aie<Boolean> b = aih.a(bzq.class, aig.k);

   public bzq(bnu<? extends bzq> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new bzq.a(this);
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 3.0);
   }

   @Override
   public boolean X() {
      return super.X() || this.w();
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   @Override
   public int fK() {
      return 8;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
   }

   @Override
   public boolean w() {
      return this.am.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bvu(this, 1.25));
      this.bO.a(2, new bui<>(this, chh.class, 8.0F, 1.6, 1.4, bnt.f::test));
      this.bO.a(4, new bzq.b(this));
   }

   @Override
   protected bxp b(cvn $$0) {
      return new bxr(this, $$0);
   }

   @Override
   public void a(ens $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(bol.a, this.dp());
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
      if (!this.aZ() && this.aC() && this.P) {
         this.g(this.dp().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.at = true;
         this.b(this.gh());
      }

      super.d_();
   }

   @Override
   protected blu b(chh $$0, blt $$1) {
      return bzv.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(coz $$0) {
      bzv.a(this, $$0);
   }

   @Override
   public void c(sw $$0) {
      bzv.a(this, $$0);
   }

   @Override
   public atj A() {
      return atk.db;
   }

   protected boolean gg() {
      return true;
   }

   protected abstract atj gh();

   @Override
   protected atj aN() {
      return atk.iG;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
   }

   static class a extends bue {
      private final bzq l;

      a(bzq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(aue.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bue.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.g(bpl.o));
            this.l.w(awh.i(0.125F, this.l.ff(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(awh.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aU = this.l.dC();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bvz {
      private final bzq i;

      public b(bzq $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gg() && super.a();
      }
   }
}
