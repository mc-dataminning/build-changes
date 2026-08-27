public abstract class fku extends fjx {
   private static final wi p = wi.c("advMode.setCommand");
   private static final wi q = wi.c("advMode.command");
   private static final wi r = wi.c("advMode.previousOutput");
   protected feh a;
   protected feh b;
   protected fdy c;
   protected fdy d;
   protected fef<Boolean> o;
   feb s;

   public fku() {
      super(fbq.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.d();
      }
   }

   abstract cyh m();

   abstract int C();

   @Override
   protected void aM_() {
      this.c = this.c(fdy.a(wh.d, $$0x -> this.D()).a(this.k / 2 - 4 - 150, this.l / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(fdy.a(wh.e, $$0x -> this.d()).a(this.k / 2 + 4, this.l / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.o = this.c(fef.a(wi.b("O"), wi.b("X")).a($$0).a().a(this.k / 2 + 150 - 20, this.C(), 20, 20, wi.c("advMode.trackOutput"), ($$0x, $$1) -> {
         cyh $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new feh(this.m, this.k / 2 - 150, 50, 300, 20, wi.c("advMode.command")) {
         @Override
         protected ww aK_() {
            return super.aK_().b(fku.this.s.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new feh(this.m, this.k / 2 - 150, this.C(), 276, 20, wi.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.s = new feb(this.j, this, this.a, this.m, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.s.a(true);
      this.s.d();
      this.c($$0);
   }

   @Override
   protected void aC_() {
      this.b(this.a);
   }

   @Override
   protected wi z() {
      return this.s.a() ? this.s.b() : super.z();
   }

   @Override
   public void a(fby $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.s.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.m().l().getString() : "-");
   }

   protected void D() {
      cyh $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.j.a(null);
   }

   protected abstract void a(cyh var1);

   private void a(String $$0) {
      this.s.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.s.a($$0, $$1, $$2)) {
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
      return this.s.a($$3) ? true : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return this.s.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, p, this.k / 2, 20, 16777215);
      $$0.b(this.m, q, this.k / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.C() - 135;
         $$0.b(this.m, r, this.k / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.s.a($$0, $$1, $$2);
   }
}
