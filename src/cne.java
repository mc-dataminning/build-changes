import javax.annotation.Nullable;

public abstract class cne extends cnp {
   public static final double b = 0.1;
   public static final double c = 0.5;
   public double d = 0.1;

   protected cne(bsx<? extends cne> $$0, dcw $$1) {
      super($$0, $$1);
   }

   protected cne(bsx<? extends cne> $$0, double $$1, double $$2, double $$3, dcw $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cne(bsx<? extends cne> $$0, double $$1, double $$2, double $$3, exc $$4, dcw $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dE(), this.dG());
      this.av();
      this.a($$4, this.d);
   }

   public cne(bsx<? extends cne> $$0, btn $$1, exc $$2, dcw $$3) {
      this($$0, $$1.dt(), $$1.dv(), $$1.dz(), $$2, $$3);
      this.c($$1);
      this.a($$1.dE(), $$1.dG());
   }

   @Override
   protected void a(aka.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dcf.a aj_() {
      return dcf.a.a;
   }

   @Override
   public void l() {
      bsr $$0 = this.s();
      if (this.dO().B || ($$0 == null || !$$0.dJ()) && this.dO().B(this.do())) {
         super.l();
         if (this.t()) {
            this.d(1.0F);
         }

         exa $$1 = cnr.a(this, this::b, this.aj_());
         if ($$1.c() != exa.a.a) {
            this.b($$1);
         }

         this.aT();
         exc $$2 = this.dr();
         double $$3 = this.dt() + $$2.c;
         double $$4 = this.dv() + $$2.d;
         double $$5 = this.dz() + $$2.e;
         cnr.a(this, 0.2F);
         float $$8;
         if (this.bf()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dO().a(lm.d, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.x();
         } else {
            $$8 = this.w();
         }

         this.i($$2.e($$2.d().a(this.d)).a((double)$$8));
         lk $$10 = this.v();
         if ($$10 != null) {
            this.dO().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.aq();
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(bsr $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   protected boolean t() {
      return true;
   }

   @Nullable
   protected lk v() {
      return lm.ae;
   }

   protected float w() {
      return 0.95F;
   }

   protected float x() {
      return 0.8F;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.d);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.d = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   public zg<abu> a(aqt $$0) {
      bsr $$1 = this.s();
      int $$2 = $$1 == null ? 0 : $$1.an();
      exc $$3 = $$0.b();
      return new abv(this.an(), this.cz(), $$3.a(), $$3.b(), $$3.c(), $$0.d(), $$0.e(), this.am(), $$2, $$0.c(), 0.0);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      exc $$1 = new exc($$0.j(), $$0.k(), $$0.l());
      this.i($$1);
   }

   private void a(exc $$0, double $$1) {
      this.i($$0.d().a($$1));
      this.av = true;
   }

   @Override
   protected void b(@Nullable bsr $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = 0.1;
      } else {
         this.d *= 0.5;
      }
   }
}
