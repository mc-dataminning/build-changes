public abstract class fdr extends fct {
   private static final vd m = vd.c("advMode.setCommand");
   private static final vd n = vd.c("advMode.command");
   private static final vd o = vd.c("advMode.previousOutput");
   protected exh a;
   protected exh b;
   protected ewy c;
   protected ewy k;
   protected exf<Boolean> l;
   exb p;

   public fdr() {
      super(eus.a);
   }

   @Override
   public void d() {
      if (!this.n().j()) {
         this.aE_();
      }
   }

   abstract csj n();

   abstract int C();

   @Override
   protected void aN_() {
      this.c = this.d(ewy.a(vc.d, $$0x -> this.D()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.d(ewy.a(vc.e, $$0x -> this.aE_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.n().o();
      this.l = this.d(exf.a(vd.b("O"), vd.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.C(), 20, 20, vd.c("advMode.trackOutput"), ($$0x, $$1) -> {
         csj $$2 = this.n();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new exh(this.i, this.g / 2 - 150, 50, 300, 20, vd.c("advMode.command")) {
         @Override
         protected vr aK_() {
            return super.aK_().b(fdr.this.p.e());
         }
      };
      this.a.e(32500);
      this.a.b(this::a);
      this.e(this.a);
      this.b = new exh(this.i, this.g / 2 - 150, this.C(), 276, 20, vd.c("advMode.previousOutput"));
      this.b.e(32500);
      this.b.e(false);
      this.b.a("-");
      this.e(this.b);
      this.c(this.a);
      this.p = new exb(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.d();
      this.c($$0);
   }

   @Override
   protected vd z() {
      return this.p.a() ? this.p.b() : super.z();
   }

   @Override
   public void a(eva $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.p.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.n().l().getString() : "-");
   }

   protected void D() {
      csj $$0 = this.n();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(csj var1);

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
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
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
