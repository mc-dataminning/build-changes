public abstract class eyw extends exz {
   private static final tf m = tf.c("advMode.setCommand");
   private static final tf n = tf.c("advMode.command");
   private static final tf o = tf.c("advMode.previousOutput");
   protected esq a;
   protected esq b;
   protected esh c;
   protected esh k;
   protected eso<Boolean> l;
   esk p;

   public eyw() {
      super(eqe.a);
   }

   @Override
   public void c() {
      if (!this.l().j()) {
         this.au_();
      }
   }

   abstract com l();

   abstract int B();

   @Override
   protected void aE_() {
      this.c = this.d(esh.a(te.d, $$0x -> this.C()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
      this.k = this.d(esh.a(te.e, $$0x -> this.au_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.l().o();
      this.l = this.d(eso.a(tf.b("O"), tf.b("X")).a($$0).a().a(this.g / 2 + 150 - 20, this.B(), 20, 20, tf.c("advMode.trackOutput"), ($$0x, $$1) -> {
         com $$2 = this.l();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new esq(this.i, this.g / 2 - 150, 50, 300, 20, tf.c("advMode.command")) {
         @Override
         protected ts aB_() {
            return super.aB_().b(eyw.this.p.c());
         }
      };
      this.a.k(32500);
      this.a.b(this::a);
      this.e(this.a);
      this.b = new esq(this.i, this.g / 2 - 150, this.B(), 276, 20, tf.c("advMode.previousOutput"));
      this.b.k(32500);
      this.b.e(false);
      this.b.a("-");
      this.e(this.b);
      this.c(this.a);
      this.p = new esk(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.p.a(true);
      this.p.b();
      this.c($$0);
   }

   @Override
   public void a(eqm $$0, int $$1, int $$2) {
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
      com $$0 = this.l();
      this.a($$0);
      if (!$$0.o()) {
         $$0.c(null);
      }

      this.f.a(null);
   }

   protected abstract void a(com var1);

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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, m, this.g / 2, 20, 16777215);
      $$0.b(this.i, n, this.g / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.B() - 135;
         $$0.b(this.i, o, this.g / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.p.a($$0, $$1, $$2);
   }
}
