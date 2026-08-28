import javax.annotation.Nullable;

public abstract class cms extends cnd {
   public static final double b = 0.1;
   public static final double c = 0.5;
   public double d = 0.1;

   protected cms(bsn<? extends cms> $$0, dcg $$1) {
      super($$0, $$1);
   }

   protected cms(bsn<? extends cms> $$0, double $$1, double $$2, double $$3, dcg $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cms(bsn<? extends cms> $$0, double $$1, double $$2, double $$3, ewh $$4, dcg $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dH(), this.dJ());
      this.av();
      this.a($$4, this.d);
   }

   public cms(bsn<? extends cms> $$0, btc $$1, ewh $$2, dcg $$3) {
      this($$0, $$1.dw(), $$1.dy(), $$1.dC(), $$2, $$3);
      this.c($$1);
      this.a($$1.dH(), $$1.dJ());
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cM().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dbp.a af_() {
      return dbp.a.a;
   }

   @Override
   public void l() {
      bsh $$0 = this.s();
      if (this.dR().B || ($$0 == null || !$$0.dM()) && this.dR().B(this.dr())) {
         super.l();
         if (this.t()) {
            this.d(1.0F);
         }

         ewf $$1 = cnf.a(this, this::b, this.af_());
         if ($$1.c() != ewf.a.a) {
            this.b($$1);
         }

         this.aU();
         ewh $$2 = this.du();
         double $$3 = this.dw() + $$2.c;
         double $$4 = this.dy() + $$2.d;
         double $$5 = this.dC() + $$2.e;
         cnf.a(this, 0.2F);
         float $$8;
         if (this.bg()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dR().a(lj.d, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.x();
         } else {
            $$8 = this.w();
         }

         this.j($$2.e($$2.d().a(this.d)).a((double)$$8));
         lh $$10 = this.v();
         if ($$10 != null) {
            this.dR().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.aq();
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(bsh $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   protected boolean t() {
      return true;
   }

   @Nullable
   protected lh v() {
      return lj.ae;
   }

   protected float w() {
      return 0.95F;
   }

   protected float x() {
      return 0.8F;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.d);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.d = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   public zb<abn> dn() {
      bsh $$0 = this.s();
      int $$1 = $$0 == null ? 0 : $$0.an();
      return new abo(this.an(), this.cB(), this.dw(), this.dy(), this.dC(), this.dJ(), this.dH(), this.am(), $$1, this.du(), 0.0);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      ewh $$1 = new ewh($$0.j(), $$0.k(), $$0.l());
      this.j($$1);
   }

   private void a(ewh $$0, double $$1) {
      this.j($$0.d().a($$1));
      this.av = true;
   }

   @Override
   protected void b(@Nullable bsh $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = 0.1;
      } else {
         this.d *= 0.5;
      }
   }
}
