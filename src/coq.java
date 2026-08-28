import javax.annotation.Nullable;

public abstract class coq extends cpb {
   public static final double b = 0.1;
   public static final double c = 0.5;
   public double d = 0.1;

   protected coq(bug<? extends coq> $$0, dev $$1) {
      super($$0, $$1);
   }

   protected coq(bug<? extends coq> $$0, double $$1, double $$2, double $$3, dev $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public coq(bug<? extends coq> $$0, double $$1, double $$2, double $$3, ezh $$4, dev $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dN(), this.dP());
      this.az();
      this.a($$4, this.d);
   }

   public coq(bug<? extends coq> $$0, buv $$1, ezh $$2, dev $$3) {
      this($$0, $$1.dC(), $$1.dE(), $$1.dI(), $$2, $$3);
      this.c($$1);
      this.a($$1.dN(), $$1.dP());
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cS().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected ded.a ak_() {
      return ded.a.a;
   }

   @Override
   public void l() {
      btz $$0 = this.s();
      if (this.dX().C || ($$0 == null || !$$0.dS()) && this.dX().B(this.dx())) {
         ezf $$1 = cpd.a(this, this::b, this.ak_());
         ezh $$2;
         if ($$1.d() != ezf.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dv().e(this.dA());
         }

         cpd.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.l();
         if (this.o()) {
            this.d(1.0F);
         }

         if ($$1.d() != ezf.a.a && this.bM()) {
            this.b($$1);
         }

         this.w();
         this.x();
      } else {
         this.au();
      }
   }

   private void w() {
      ezh $$0 = this.dA();
      ezh $$1 = this.dv();
      float $$4;
      if (this.bk()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dX().a(lq.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.v();
      } else {
         $$4 = this.t();
      }

      this.h($$0.e($$0.d().c(this.d)).c((double)$$4));
   }

   private void x() {
      lo $$0 = this.q();
      ezh $$1 = this.dv();
      if ($$0 != null) {
         this.dX().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(btz $$0) {
      return super.b($$0) && !$$0.ae;
   }

   @Override
   protected boolean o() {
      return true;
   }

   @Nullable
   protected lo q() {
      return lq.ae;
   }

   protected float t() {
      return 0.95F;
   }

   protected float v() {
      return 0.8F;
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.d);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.d = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   public zo<acd> a(arl $$0) {
      btz $$1 = this.s();
      int $$2 = $$1 == null ? 0 : $$1.ar();
      ezh $$3 = $$0.b();
      return new ace(this.ar(), this.cH(), $$3.a(), $$3.b(), $$3.c(), $$0.d(), $$0.e(), this.aq(), $$2, $$0.c(), 0.0);
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      ezh $$1 = new ezh($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
   }

   private void a(ezh $$0, double $$1) {
      this.h($$0.d().c($$1));
      this.as = true;
   }

   @Override
   protected void b(@Nullable btz $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = 0.1;
      } else {
         this.d *= 0.5;
      }
   }
}
