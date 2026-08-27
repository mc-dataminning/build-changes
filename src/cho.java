import javax.annotation.Nullable;

public abstract class cho extends chz {
   public double b;
   public double c;
   public double d;

   protected cho(bnu<? extends cho> $$0, cvn $$1) {
      super($$0, $$1);
   }

   protected cho(bnu<? extends cho> $$0, double $$1, double $$2, double $$3, cvn $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cho(bnu<? extends cho> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cvn $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dC(), this.dE());
      this.ar();
      double $$8 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
      if ($$8 != 0.0) {
         this.b = $$4 / $$8 * 0.1;
         this.c = $$5 / $$8 * 0.1;
         this.d = $$6 / $$8 * 0.1;
      }
   }

   public cho(bnu<? extends cho> $$0, bog $$1, double $$2, double $$3, double $$4, cvn $$5) {
      this($$0, $$1.dr(), $$1.dt(), $$1.dx(), $$2, $$3, $$4, $$5);
      this.b($$1);
      this.a($$1.dC(), $$1.dE());
   }

   @Override
   protected void c_() {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected cuw.a ah_() {
      return cuw.a.a;
   }

   @Override
   public void l() {
      bno $$0 = this.w();
      if (this.dM().B || ($$0 == null || !$$0.dH()) && this.dM().B(this.dm())) {
         super.l();
         if (this.s()) {
            this.g(1);
         }

         enq $$1 = cib.a(this, this::a, this.ah_());
         if ($$1.c() != enq.a.a) {
            this.a($$1);
         }

         this.aQ();
         ens $$2 = this.dp();
         double $$3 = this.dr() + $$2.c;
         double $$4 = this.dt() + $$2.d;
         double $$5 = this.dx() + $$2.e;
         cib.a(this, 0.2F);
         float $$8;
         if (this.aZ()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dM().a(jz.e, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.y();
         } else {
            $$8 = this.x();
         }

         this.g($$2.b(this.b, this.c, this.d).a((double)$$8));
         jx $$10 = this.u();
         if ($$10 != null) {
            this.dM().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.am();
      }
   }

   @Override
   protected boolean a(bno $$0) {
      return super.a($$0) && !$$0.ae;
   }

   @Override
   protected boolean s() {
      return true;
   }

   @Nullable
   protected jx u() {
      return jz.ab;
   }

   protected float x() {
      return 0.95F;
   }

   protected float y() {
      return 0.8F;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         tc $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public float bE() {
      return 1.0F;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         bno $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dM().B) {
               ens $$3 = $$2.bF();
               this.g($$3);
               this.b = $$3.c * 0.1;
               this.c = $$3.d * 0.1;
               this.d = $$3.e * 0.1;
               this.b($$2);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public xx<aag> di() {
      bno $$0 = this.w();
      int $$1 = $$0 == null ? 0 : $$0.aj();
      return new aah(this.aj(), this.cw(), this.dr(), this.dt(), this.dx(), this.dE(), this.dC(), this.ai(), $$1, new ens(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
      if ($$4 != 0.0) {
         this.b = $$1 / $$4 * 0.1;
         this.c = $$2 / $$4 * 0.1;
         this.d = $$3 / $$4 * 0.1;
      }
   }
}
