public abstract class fro extends fra {
   private static final xi u = xi.c("advMode.setCommand");
   private static final xi v = xi.c("advMode.command");
   private static final xi w = xi.c("advMode.previousOutput");
   protected flq a;
   protected flq b;
   protected flh c;
   protected flh d;
   protected flo<Boolean> s;
   flk x;

   public fro() {
      super(fiz.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.d();
      }
   }

   abstract deb m();

   abstract int D();

   @Override
   protected void aR_() {
      this.c = this.c(flh.a(xh.d, $$0x -> this.E()).a(this.n / 2 - 4 - 150, this.o / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(flh.a(xh.e, $$0x -> this.d()).a(this.n / 2 + 4, this.o / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.s = this.c(flo.a(xi.b("O"), xi.b("X")).a($$0).a().a(this.n / 2 + 150 - 20, this.D(), 20, 20, xi.c("advMode.trackOutput"), ($$0x, $$1) -> {
         deb $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new flq(this.p, this.n / 2 - 150, 50, 300, 20, xi.c("advMode.command")) {
         @Override
         protected xw aO_() {
            return super.aO_().b(fro.this.x.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new flq(this.p, this.n / 2 - 150, this.D(), 276, 20, xi.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.x = new flk(this.m, this, this.a, this.p, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.x.a(true);
      this.x.d();
      this.c($$0);
   }

   @Override
   protected void aG_() {
      this.b(this.a);
   }

   @Override
   protected xi A() {
      return this.x.a() ? this.x.b() : super.A();
   }

   @Override
   public void a(fji $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.x.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.m().l().getString() : "-");
   }

   protected void E() {
      deb $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.m.a(null);
   }

   protected abstract void a(deb var1);

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
         this.E();
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
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, u, this.n / 2, 20, 16777215);
      $$0.b(this.p, v, this.n / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.D() - 135;
         $$0.b(this.p, w, this.n / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.x.a($$0, $$1, $$2);
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
