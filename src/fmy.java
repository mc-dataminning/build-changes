public class fmy extends fon {
   private static final int a = 90;
   private final xe b;
   private fjg c = fjg.a;
   private final Runnable d;
   private final xe r;
   private final boolean s;

   public fmy(Runnable $$0, xe $$1, xe $$2) {
      this($$0, $$1, $$2, xd.k, true);
   }

   public fmy(Runnable $$0, xe $$1, xe $$2, xe $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   @Override
   public xe i() {
      return xd.a(super.i(), this.b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = fjg.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = aym.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fin.a(this.r, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aD_() {
      return this.s;
   }
}
