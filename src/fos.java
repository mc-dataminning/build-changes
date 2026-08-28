public abstract class fos extends fod {
   private static final wz u = wz.c("advMode.setCommand");
   private static final wz v = wz.c("advMode.command");
   private static final wz w = wz.c("advMode.previousOutput");
   protected fiv a;
   protected fiv b;
   protected fim c;
   protected fim r;
   protected fit<Boolean> s;
   fip x;

   public fos() {
      super(fgg.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.d();
      }
   }

   abstract dbx m();

   abstract int C();

   @Override
   protected void aT_() {
      this.c = this.c(fim.a(wy.d, $$0x -> this.D()).a(this.m / 2 - 4 - 150, this.n / 4 + 120 + 12, 150, 20).a());
      this.r = this.c(fim.a(wy.e, $$0x -> this.d()).a(this.m / 2 + 4, this.n / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.s = this.c(fit.a(wz.b("O"), wz.b("X")).a($$0).a().a(this.m / 2 + 150 - 20, this.C(), 20, 20, wz.c("advMode.trackOutput"), ($$0x, $$1) -> {
         dbx $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fiv(this.o, this.m / 2 - 150, 50, 300, 20, wz.c("advMode.command")) {
         @Override
         protected xn aQ_() {
            return super.aQ_().b(fos.this.x.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fiv(this.o, this.m / 2 - 150, this.C(), 276, 20, wz.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.x = new fip(this.l, this, this.a, this.o, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.x.a(true);
      this.x.d();
      this.c($$0);
   }

   @Override
   protected void aI_() {
      this.b(this.a);
   }

   @Override
   protected wz z() {
      return this.x.a() ? this.x.b() : super.z();
   }

   @Override
   public void a(fgo $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.x.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.m().l().getString() : "-");
   }

   protected void D() {
      dbx $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.l.a(null);
   }

   protected abstract void a(dbx var1);

   private void a(String $$0) {
      this.x.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.x.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.D();
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.x.a($$3) ? true : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return this.x.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, u, this.m / 2, 20, 16777215);
      $$0.b(this.o, v, this.m / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.C() - 135;
         $$0.b(this.o, w, this.m / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.x.a($$0, $$1, $$2);
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
