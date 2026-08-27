public abstract class ezc extends eyf {
   private static final ti m = ti.c("advMode.setCommand");
   private static final ti n = ti.c("advMode.command");
   private static final ti o = ti.c("advMode.previousOutput");
   protected esu a;
   protected esu b;
   protected esl c;
   protected esl k;
   protected ess<Boolean> l;
   eso p;

   public ezc() {
      super(eqi.a);
   }

   @Override
   public void c() {
      if (!this.l().j()) {
         this.au_();
      }
   }

   abstract cor l();

   abstract int C();

   @Override
   protected void aD_() {
      this.c = this.d(esl.a(th.d, $$0x -> this.D()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.d(esl.a(th.e, $$0x -> this.au_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.l().o();
      this.l = this.d(ess.a(ti.b("O"), ti.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.C(), 20, 20, ti.c("advMode.trackOutput"), ($$0x, $$1) -> {
         cor $$2 = this.l();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new esu(this.i, this.g / 2 - 150, 50, 300, 20, ti.c("advMode.command")) {
         @Override
         protected tv aA_() {
            return super.aA_().b(ezc.this.p.c());
         }
      };
      this.a.l(32500);
      this.a.b(this::a);
      this.e(this.a);
      this.b = new esu(this.i, this.g / 2 - 150, this.C(), 276, 20, ti.c("advMode.previousOutput"));
      this.b.l(32500);
      this.b.e(false);
      this.b.a("-");
      this.e(this.b);
      this.c(this.a);
      this.p = new eso(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.b();
      this.c($$0);
   }

   @Override
   public void a(eqq $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.p.b();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.l().l().getString() : "-");
   }

   protected void D() {
      cor $$0 = this.l();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(cor var1);

   private void a(String $$0) {
      this.p.b();
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
   public void a(esa $$0, int $$1, int $$2, float $$3) {
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
