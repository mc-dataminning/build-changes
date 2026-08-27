public abstract class fmv extends fly {
   private static final wx s = wx.c("advMode.setCommand");
   private static final wx u = wx.c("advMode.command");
   private static final wx v = wx.c("advMode.previousOutput");
   protected fgi a;
   protected fgi b;
   protected ffz c;
   protected ffz d;
   protected fgg<Boolean> r;
   fgc w;

   public fmv() {
      super(fdr.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.d();
      }
   }

   abstract czy m();

   abstract int C();

   @Override
   protected void aM_() {
      this.c = this.c(ffz.a(ww.d, $$0x -> this.D()).a(this.n / 2 - 4 - 150, this.o / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(ffz.a(ww.e, $$0x -> this.d()).a(this.n / 2 + 4, this.o / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.r = this.c(fgg.a(wx.b("O"), wx.b("X")).a($$0).a().a(this.n / 2 + 150 - 20, this.C(), 20, 20, wx.c("advMode.trackOutput"), ($$0x, $$1) -> {
         czy $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fgi(this.p, this.n / 2 - 150, 50, 300, 20, wx.c("advMode.command")) {
         @Override
         protected xl aK_() {
            return super.aK_().b(fmv.this.w.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fgi(this.p, this.n / 2 - 150, this.C(), 276, 20, wx.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.w = new fgc(this.m, this, this.a, this.p, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.w.a(true);
      this.w.d();
      this.c($$0);
   }

   @Override
   protected void aC_() {
      this.b(this.a);
   }

   @Override
   protected wx z() {
      return this.w.a() ? this.w.b() : super.z();
   }

   @Override
   public void a(fdz $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.w.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.m().l().getString() : "-");
   }

   protected void D() {
      czy $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.m.a(null);
   }

   protected abstract void a(czy var1);

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
         this.D();
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
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, s, this.n / 2, 20, 16777215);
      $$0.b(this.p, u, this.n / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.C() - 135;
         $$0.b(this.p, v, this.n / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.w.a($$0, $$1, $$2);
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
