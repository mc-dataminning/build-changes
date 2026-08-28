import javax.annotation.Nullable;

public abstract class coz extends cpk {
   public static final double b = 0.1;
   public static final double c = 0.5;
   public double d = 0.1;

   protected coz(bup<? extends coz> $$0, dff $$1) {
      super($$0, $$1);
   }

   protected coz(bup<? extends coz> $$0, double $$1, double $$2, double $$3, dff $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public coz(bup<? extends coz> $$0, double $$1, double $$2, double $$3, ezr $$4, dff $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dO(), this.dQ());
      this.aA();
      this.a($$4, this.d);
   }

   public coz(bup<? extends coz> $$0, bve $$1, ezr $$2, dff $$3) {
      this($$0, $$1.dD(), $$1.dF(), $$1.dJ(), $$2, $$3);
      this.c($$1);
      this.a($$1.dO(), $$1.dQ());
   }

   @Override
   protected void a(aks.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cT().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected den.a ak_() {
      return den.a.a;
   }

   @Override
   public void l() {
      bui $$0 = this.s();
      if (this.dY().C || ($$0 == null || !$$0.dT()) && this.dY().B(this.dy())) {
         ezp $$1 = cpm.a(this, this::b, this.ak_());
         ezr $$2;
         if ($$1.d() != ezp.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dw().e(this.dB());
         }

         cpm.a(this, 0.2F);
         this.b($$2);
         this.aM();
         super.l();
         if (this.o()) {
            this.d(1.0F);
         }

         if ($$1.d() != ezp.a.a && this.bN()) {
            this.b($$1);
         }

         this.w();
         this.x();
      } else {
         this.av();
      }
   }

   private void w() {
      ezr $$0 = this.dB();
      ezr $$1 = this.dw();
      float $$4;
      if (this.bl()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dY().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.v();
      } else {
         $$4 = this.t();
      }

      this.h($$0.e($$0.d().c(this.d)).c((double)$$4));
   }

   private void x() {
      lq $$0 = this.q();
      ezr $$1 = this.dw();
      if ($$0 != null) {
         this.dY().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(bui $$0) {
      return super.b($$0) && !$$0.ae;
   }

   @Override
   protected boolean o() {
      return true;
   }

   @Nullable
   protected lq q() {
      return ls.ae;
   }

   protected float t() {
      return 0.95F;
   }

   protected float v() {
      return 0.8F;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.d);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.d = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bA() {
      return 1.0F;
   }

   @Override
   public zs<ach> a(arp $$0) {
      bui $$1 = this.s();
      int $$2 = $$1 == null ? 0 : $$1.as();
      ezr $$3 = $$0.b();
      return new aci(this.as(), this.cI(), $$3.a(), $$3.b(), $$3.c(), $$0.d(), $$0.e(), this.ar(), $$2, $$0.c(), 0.0);
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      ezr $$1 = new ezr($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
   }

   private void a(ezr $$0, double $$1) {
      this.h($$0.d().c($$1));
      this.as = true;
   }

   @Override
   protected void b(@Nullable bui $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = 0.1;
      } else {
         this.d *= 0.5;
      }
   }
}
