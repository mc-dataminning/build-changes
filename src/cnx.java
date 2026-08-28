import javax.annotation.Nullable;

public abstract class cnx extends coi {
   public static final double b = 0.1;
   public static final double c = 0.5;
   public double d = 0.1;

   protected cnx(btq<? extends cnx> $$0, dds $$1) {
      super($$0, $$1);
   }

   protected cnx(btq<? extends cnx> $$0, double $$1, double $$2, double $$3, dds $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cnx(btq<? extends cnx> $$0, double $$1, double $$2, double $$3, eye $$4, dds $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dI(), this.dK());
      this.ax();
      this.a($$4, this.d);
   }

   public cnx(btq<? extends cnx> $$0, buf $$1, eye $$2, dds $$3) {
      this($$0, $$1.dx(), $$1.dz(), $$1.dD(), $$2, $$3);
      this.c($$1);
      this.a($$1.dI(), $$1.dK());
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cO().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dda.a ai_() {
      return dda.a.a;
   }

   @Override
   public void l() {
      btj $$0 = this.s();
      if (this.dS().B || ($$0 == null || !$$0.dN()) && this.dS().B(this.ds())) {
         super.l();
         if (this.o()) {
            this.d(1.0F);
         }

         eyc $$1 = cok.a(this, this::b, this.ai_());
         if ($$1.c() != eyc.a.a) {
            this.b($$1);
         }

         if (!this.dS().w_()) {
            this.aI();
         }

         eye $$2 = this.dv();
         double $$3 = this.dx() + $$2.d;
         double $$4 = this.dz() + $$2.e;
         double $$5 = this.dD() + $$2.f;
         cok.a(this, 0.2F);
         float $$8;
         if (this.bi()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dS().a(ln.d, $$3 - $$2.d * 0.25, $$4 - $$2.e * 0.25, $$5 - $$2.f * 0.25, $$2.d, $$2.e, $$2.f);
            }

            $$8 = this.v();
         } else {
            $$8 = this.t();
         }

         this.h($$2.e($$2.d().c(this.d)).c((double)$$8));
         ll $$10 = this.q();
         if ($$10 != null) {
            this.dS().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.as();
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(btj $$0) {
      return super.b($$0) && !$$0.ae;
   }

   @Override
   protected boolean o() {
      return true;
   }

   @Nullable
   protected ll q() {
      return ln.ae;
   }

   protected float t() {
      return 0.95F;
   }

   protected float v() {
      return 0.8F;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.d);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.d = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   public zk<abz> a(arf $$0) {
      btj $$1 = this.s();
      int $$2 = $$1 == null ? 0 : $$1.ap();
      eye $$3 = $$0.b();
      return new aca(this.ap(), this.cD(), $$3.a(), $$3.b(), $$3.c(), $$0.d(), $$0.e(), this.ao(), $$2, $$0.c(), 0.0);
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      eye $$1 = new eye($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
   }

   private void a(eye $$0, double $$1) {
      this.h($$0.d().c($$1));
      this.as = true;
   }

   @Override
   protected void b(@Nullable btj $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = 0.1;
      } else {
         this.d *= 0.5;
      }
   }
}
