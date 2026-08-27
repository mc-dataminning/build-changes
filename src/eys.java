public abstract class eys extends exv {
   private static final te m = te.c("advMode.setCommand");
   private static final te n = te.c("advMode.command");
   private static final te o = te.c("advMode.previousOutput");
   protected esr a;
   protected esr b;
   protected esi c;
   protected esi k;
   protected esp<Boolean> l;
   esl p;

   public eys() {
      super(eqf.a);
   }

   @Override
   public void c() {
      if (!this.l().j()) {
         this.au_();
      }
   }

   abstract cok l();

   abstract int B();

   @Override
   protected void aE_() {
      this.c = this.d(esi.a(td.d, $$0x -> this.C()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.d(esi.a(td.e, $$0x -> this.au_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.l().o();
      this.l = this.d(esp.a(te.b("O"), te.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.B(), 20, 20, te.c("advMode.trackOutput"), ($$0x, $$1) -> {
         cok $$2 = this.l();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new esr(this.i, this.g / 2 - 150, 50, 300, 20, te.c("advMode.command")) {
         @Override
         protected tr aB_() {
            return super.aB_().b(eys.this.p.c());
         }
      };
      this.a.k(32500);
      this.a.b(this::a);
      this.e(this.a);
      this.b = new esr(this.i, this.g / 2 - 150, this.B(), 276, 20, te.c("advMode.previousOutput"));
      this.b.k(32500);
      this.b.e(false);
      this.b.a("-");
      this.e(this.b);
      this.c(this.a);
      this.p = new esl(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.b();
      this.c($$0);
   }

   @Override
   public void a(eqn $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.p.b();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.l().l().getString() : "-");
   }

   protected void C() {
      cok $$0 = this.l();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(cok var1);

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
         this.C();
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
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, m, this.g / 2, 20, 16777215);
      $$0.b(this.i, n, this.g / 2 - 150, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.B() - 135;
         $$0.b(this.i, o, this.g / 2 - 150, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.p.a($$0, $$1, $$2);
   }
}
