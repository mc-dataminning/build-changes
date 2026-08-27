public abstract class ezj extends eym {
   private static final tn m = tn.c("advMode.setCommand");
   private static final tn n = tn.c("advMode.command");
   private static final tn o = tn.c("advMode.previousOutput");
   protected etb a;
   protected etb b;
   protected ess c;
   protected ess k;
   protected esz<Boolean> l;
   esv p;

   public ezj() {
      super(eqp.a);
   }

   @Override
   public void c() {
      if (!this.l().j()) {
         this.az_();
      }
   }

   abstract coy l();

   abstract int D();

   @Override
   protected void aH_() {
      this.c = this.d(ess.a(tm.d, $$0x -> this.E()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.d(ess.a(tm.e, $$0x -> this.az_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.l().o();
      this.l = this.d(esz.a(tn.b("O"), tn.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.D(), 20, 20, tn.c("advMode.trackOutput"), ($$0x, $$1) -> {
         coy $$2 = this.l();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new etb(this.i, this.g / 2 - 150, 50, 300, 20, tn.c("advMode.command")) {
         @Override
         protected ua aE_() {
            return super.aE_().b(ezj.this.p.e());
         }
      };
      this.a.l(32500);
      this.a.b(this::a);
      this.e(this.a);
      this.b = new etb(this.i, this.g / 2 - 150, this.D(), 276, 20, tn.c("advMode.previousOutput"));
      this.b.l(32500);
      this.b.e(false);
      this.b.a("-");
      this.e(this.b);
      this.c(this.a);
      this.p = new esv(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.d();
      this.c($$0);
   }

   @Override
   protected tn A() {
      return this.p.a() ? this.p.b() : super.A();
   }

   @Override
   public void a(eqx $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.p.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.l().l().getString() : "-");
   }

   protected void E() {
      coy $$0 = this.l();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(coy var1);

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
         this.E();
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
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, m, this.g / 2, 20, 16777215);
      $$0.b(this.i, n, this.g / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.D() - 135;
         $$0.b(this.i, o, this.g / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.p.a($$0, $$1, $$2);
   }
}
