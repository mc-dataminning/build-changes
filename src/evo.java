public abstract class evo extends euq {
   private static final sw m = sw.c("advMode.setCommand");
   private static final sw n = sw.c("advMode.command");
   private static final sw o = sw.c("advMode.previousOutput");
   protected epr a;
   protected epr b;
   protected epi c;
   protected epi k;
   protected epp<Boolean> l;
   epl p;

   public evo() {
      super(enf.a);
   }

   @Override
   public void f() {
      this.a.a();
      if (!this.l().j()) {
         this.aw_();
      }
   }

   abstract cln l();

   abstract int B();

   @Override
   protected void b() {
      this.c = this.d(epi.a(sv.d, $$0x -> this.C()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.d(epi.a(sv.e, $$0x -> this.aw_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.l().o();
      this.l = this.d(epp.a(sw.b("O"), sw.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.B(), 20, 20, sw.c("advMode.trackOutput"), ($$0x, $$1) -> {
         cln $$2 = this.l();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new epr(this.i, this.g / 2 - 150, 50, 300, 20, sw.c("advMode.command")) {
         @Override
         protected tj aE_() {
            return super.aE_().b(evo.this.p.c());
         }
      };
      this.a.m(32500);
      this.a.b(this::a);
      this.e(this.a);
      this.b = new epr(this.i, this.g / 2 - 150, this.B(), 276, 20, sw.c("advMode.previousOutput"));
      this.b.m(32500);
      this.b.c(false);
      this.b.a("-");
      this.e(this.b);
      this.c(this.a);
      this.p = new epl(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.b();
      this.c($$0);
   }

   @Override
   public void a(enn $$0, int $$1, int $$2) {
      String $$3 = this.a.b();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.p.b();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.l().l().getString() : "-");
   }

   protected void C() {
      cln $$0 = this.l();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(cln var1);

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
   public boolean a(double $$0, double $$1, double $$2) {
      return this.p.a($$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return this.p.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, m, this.g / 2, 20, 16777215);
      $$0.b(this.i, n, this.g / 2 - 150, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.b().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.B() - 135;
         $$0.b(this.i, o, this.g / 2 - 150, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
      this.p.a($$0, $$1, $$2);
   }
}
