public class frf extends fqs<crp> implements fuf {
   private static final alc G = alc.b("textures/gui/container/crafting_table.png");
   private final ftz<?> H;
   private boolean I;

   public frf(crp $$0, cnt $$1, xd $$2) {
      super($$0, $$1, $$2);
      this.H = new ftv($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.I = this.n < 379;
      this.H.a(this.n, this.o, this.m, this.I);
      this.C = this.H.a(this.n, this.s);
      this.c(new fkw(this.C + 5, this.o / 2 - 49, 20, 18, ftz.a, $$0 -> {
         this.H.c();
         this.C = this.H.a(this.n, this.s);
         $$0.c(this.C + 5, this.o / 2 - 49);
      }));
      this.d(this.H);
      this.v = 29;
   }

   @Override
   public void D() {
      super.D();
      this.H.e();
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      if (this.H.d() && this.I) {
         this.b($$0, $$1, $$2, $$3);
         this.H.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.H.a($$0, $$1, $$2, $$3);
         this.H.a($$0, this.C, this.D, true);
      }

      this.a($$0, $$1, $$2);
      this.H.a($$0, $$1, $$2, this.B);
   }

   @Override
   protected void a(fjx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(ghq::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.H.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.H.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.I || !this.H.d()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.H.a($$0, $$1, $$2)) {
         this.a(this.H);
         return true;
      } else {
         return this.I && this.H.d() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
      return this.H.a($$0, $$1, this.C, this.D, this.s, this.u, $$4) && $$5;
   }

   @Override
   protected void a(cst $$0, int $$1, int $$2, crh $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H.b($$0);
   }

   @Override
   public void F() {
      this.H.f();
   }

   @Override
   public ftz G() {
      return this.H;
   }
}
