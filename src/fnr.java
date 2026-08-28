public abstract class fnr extends fnd {
   private static final wu s = wu.c("advMode.setCommand");
   private static final wu u = wu.c("advMode.command");
   private static final wu v = wu.c("advMode.previousOutput");
   protected fhv a;
   protected fhv b;
   protected fhm c;
   protected fhm q;
   protected fht<Boolean> r;
   fhp w;

   public fnr() {
      super(fff.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.d();
      }
   }

   abstract dbe m();

   abstract int E();

   @Override
   protected void aO_() {
      this.c = this.c(fhm.a(wt.d, $$0x -> this.F()).a(this.m / 2 - 4 - 150, this.n / 4 + 120 + 12, 150, 20).a());
      this.q = this.c(fhm.a(wt.e, $$0x -> this.d()).a(this.m / 2 + 4, this.n / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.r = this.c(fht.a(wu.b("O"), wu.b("X")).a($$0).a().a(this.m / 2 + 150 - 20, this.E(), 20, 20, wu.c("advMode.trackOutput"), ($$0x, $$1) -> {
         dbe $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fhv(this.o, this.m / 2 - 150, 50, 300, 20, wu.c("advMode.command")) {
         @Override
         protected xi aL_() {
            return super.aL_().b(fnr.this.w.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fhv(this.o, this.m / 2 - 150, this.E(), 276, 20, wu.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.w = new fhp(this.l, this, this.a, this.o, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.w.a(true);
      this.w.d();
      this.c($$0);
   }

   @Override
   protected void aD_() {
      this.b(this.a);
   }

   @Override
   protected wu A() {
      return this.w.a() ? this.w.b() : super.A();
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.w.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.m().l().getString() : "-");
   }

   protected void F() {
      dbe $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.l.a(null);
   }

   protected abstract void a(dbe var1);

   private void a(String $$0) {
      this.w.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.w.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.F();
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.w.a($$3) ? true : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return this.w.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, s, this.m / 2, 20, 16777215);
      $$0.b(this.o, u, this.m / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.E() - 135;
         $$0.b(this.o, v, this.m / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.w.a($$0, $$1, $$2);
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
