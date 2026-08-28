public class flp extends fnd {
   private static final int a = 90;
   private final xp b;
   private fhx c = fhx.a;
   private final Runnable d;
   private final xp r;
   private final boolean s;

   public flp(Runnable $$0, xp $$1, xp $$2) {
      this($$0, $$1, $$2, xo.k, true);
   }

   public flp(Runnable $$0, xp $$1, xp $$2, xp $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   @Override
   public xp i() {
      return xo.a(super.i(), this.b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c = fhx.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ayz.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fhe.a(this.r, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aC_() {
      return this.s;
   }
}
