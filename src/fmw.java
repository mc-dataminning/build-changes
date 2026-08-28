public class fmw extends fod {
   private static final int a = 90;
   private final wz b;
   private fjf c = fjf.a;
   private final Runnable r;
   private final wz s;
   private final boolean u;

   public fmw(Runnable $$0, wz $$1, wz $$2) {
      this($$0, $$1, $$2, wy.k, true);
   }

   public fmw(Runnable $$0, wz $$1, wz $$2, wz $$3, boolean $$4) {
      super($$1);
      this.r = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public wz i() {
      return wy.a(super.i(), this.b);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.c = fjf.a(this.o, this.b, this.m - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ayo.a(90 + $$0 + 12, this.n / 6 + 96, this.n - 24);
      int $$2 = 150;
      this.c(fim.a(this.s, $$0x -> this.r.run()).a((this.m - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 70, 16777215);
      this.c.a($$0, this.m / 2, 90);
   }

   @Override
   public boolean aJ_() {
      return this.u;
   }
}
