public abstract class fab extends ezd {
   private static final ui m = ui.c("advMode.setCommand");
   private static final ui n = ui.c("advMode.command");
   private static final ui o = ui.c("advMode.previousOutput");
   protected ets a;
   protected ets b;
   protected etj c;
   protected etj k;
   protected etq<Boolean> l;
   etm p;

   public fab() {
      super(erg.a);
   }

   @Override
   public void d() {
      if (!this.l().j()) {
         this.aC_();
      }
   }

   abstract cqa l();

   abstract int C();

   @Override
   protected void aM_() {
      this.c = this.d(etj.a(uh.d, $$0x -> this.D()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.d(etj.a(uh.e, $$0x -> this.aC_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.l().o();
      this.l = this.d(etq.a(ui.b("O"), ui.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.C(), 20, 20, ui.c("advMode.trackOutput"), ($$0x, $$1) -> {
         cqa $$2 = this.l();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new ets(this.i, this.g / 2 - 150, 50, 300, 20, ui.c("advMode.command")) {
         @Override
         protected uw aI_() {
            return super.aI_().b(fab.this.p.e());
         }
      };
      this.a.l(32500);
      this.a.b(this::a);
      this.e(this.a);
      this.b = new ets(this.i, this.g / 2 - 150, this.C(), 276, 20, ui.c("advMode.previousOutput"));
      this.b.l(32500);
      this.b.e(false);
      this.b.a("-");
      this.e(this.b);
      this.c(this.a);
      this.p = new etm(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.d();
      this.c($$0);
   }

   @Override
   protected ui z() {
      return this.p.a() ? this.p.b() : super.z();
   }

   @Override
   public void a(ero $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.p.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.l().l().getString() : "-");
   }

   protected void D() {
      cqa $$0 = this.l();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(cqa var1);

   private void a(String $$0) {
      this.p.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.p.a($$0, $$1, $$2)) {
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
      return this.p.a($$3) ? true : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return this.p.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, m, this.g / 2, 20, 16777215);
      $$0.b(this.i, n, this.g / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.C() - 135;
         $$0.b(this.i, o, this.g / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.p.a($$0, $$1, $$2);
   }
}
