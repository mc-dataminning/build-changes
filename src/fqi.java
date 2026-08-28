public class fqi extends frp {
   private static final int a = 90;
   private final xl b;
   private fmp c = fmp.a;
   private final Runnable d;
   private final xl s;
   private final boolean u;

   public fqi(Runnable $$0, xl $$1, xl $$2) {
      this($$0, $$1, $$2, xk.k, true);
   }

   public fqi(Runnable $$0, xl $$1, xl $$2, xl $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), this.b);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.c = fmp.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azn.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(flw.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aH_() {
      return this.u;
   }
}
