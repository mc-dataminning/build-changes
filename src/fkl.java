public abstract class fkl extends fjo {
   private static final wg p = wg.c("advMode.setCommand");
   private static final wg q = wg.c("advMode.command");
   private static final wg r = wg.c("advMode.previousOutput");
   protected fdy a;
   protected fdy b;
   protected fdp c;
   protected fdp d;
   protected fdw<Boolean> o;
   fds s;

   public fkl() {
      super(fbh.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.d();
      }
   }

   abstract cxy m();

   abstract int C();

   @Override
   protected void aN_() {
      this.c = this.c(fdp.a(wf.d, $$0x -> this.D()).a(this.k / 2 - 4 - 150, this.l / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(fdp.a(wf.e, $$0x -> this.d()).a(this.k / 2 + 4, this.l / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.o = this.c(fdw.a(wg.b("O"), wg.b("X")).a($$0).a().a(this.k / 2 + 150 - 20, this.C(), 20, 20, wg.c("advMode.trackOutput"), ($$0x, $$1) -> {
         cxy $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fdy(this.m, this.k / 2 - 150, 50, 300, 20, wg.c("advMode.command")) {
         @Override
         protected wu aL_() {
            return super.aL_().b(fkl.this.s.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fdy(this.m, this.k / 2 - 150, this.C(), 276, 20, wg.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.s = new fds(this.j, this, this.a, this.m, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.s.a(true);
      this.s.d();
      this.c($$0);
   }

   @Override
   protected void aD_() {
      this.b(this.a);
   }

   @Override
   protected wg z() {
      return this.s.a() ? this.s.b() : super.z();
   }

   @Override
   public void a(fbp $$0, int $$1, int $$2) {
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
      cxy $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.j.a(null);
   }

   protected abstract void a(cxy var1);

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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
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
