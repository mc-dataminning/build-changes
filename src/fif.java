public abstract class fif extends fhh {
   private static final vu m = vu.c("advMode.setCommand");
   private static final vu n = vu.c("advMode.command");
   private static final vu o = vu.c("advMode.previousOutput");
   protected fbr a;
   protected fbr b;
   protected fbi c;
   protected fbi k;
   protected fbp<Boolean> l;
   fbl p;

   public fif() {
      super(eza.a);
   }

   @Override
   public void e() {
      if (!this.o().j()) {
         this.d();
      }
   }

   abstract cwc o();

   abstract int E();

   @Override
   protected void aO_() {
      this.c = this.c(fbi.a(vt.d, $$0x -> this.H()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.c(fbi.a(vt.e, $$0x -> this.d()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.o().o();
      this.l = this.c(fbp.a(vu.b("O"), vu.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.E(), 20, 20, vu.c("advMode.trackOutput"), ($$0x, $$1) -> {
         cwc $$2 = this.o();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fbr(this.i, this.g / 2 - 150, 50, 300, 20, vu.c("advMode.command")) {
         @Override
         protected wi aL_() {
            return super.aL_().b(fif.this.p.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fbr(this.i, this.g / 2 - 150, this.E(), 276, 20, vu.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.p = new fbl(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.d();
      this.c($$0);
   }

   @Override
   protected void aF_() {
      this.b(this.a);
   }

   @Override
   protected vu B() {
      return this.p.a() ? this.p.b() : super.B();
   }

   @Override
   public void a(ezi $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.p.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.o().l().getString() : "-");
   }

   protected void H() {
      cwc $$0 = this.o();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(cwc var1);

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
         this.H();
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, m, this.g / 2, 20, 16777215);
      $$0.b(this.i, n, this.g / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.E() - 135;
         $$0.b(this.i, o, this.g / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.p.a($$0, $$1, $$2);
   }
}
