public class fpt extends fra {
   private static final int a = 90;
   private final xi b;
   private fma c = fma.a;
   private final Runnable d;
   private final xi s;
   private final boolean u;

   public fpt(Runnable $$0, xi $$1, xi $$2) {
      this($$0, $$1, $$2, xh.k, true);
   }

   public fpt(Runnable $$0, xi $$1, xi $$2, xi $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public xi i() {
      return xh.a(super.i(), this.b);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.c = fma.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azk.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(flh.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aH_() {
      return this.u;
   }
}
