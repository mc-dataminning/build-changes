public class fmc extends fnj {
   private static final int a = 90;
   private final wu b;
   private fil c = fil.a;
   private final Runnable q;
   private final wu r;
   private final boolean s;

   public fmc(Runnable $$0, wu $$1, wu $$2) {
      this($$0, $$1, $$2, wt.k, true);
   }

   public fmc(Runnable $$0, wu $$1, wu $$2, wu $$3, boolean $$4) {
      super($$1);
      this.q = $$0;
      this.b = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), this.b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = fil.a(this.o, this.b, this.m - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ayg.a(90 + $$0 + 12, this.n / 6 + 96, this.n - 24);
      int $$2 = 150;
      this.c(fhs.a(this.r, $$0x -> this.q.run()).a((this.m - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 70, 16777215);
      this.c.a($$0, this.m / 2, 90);
   }

   @Override
   public boolean aF_() {
      return this.s;
   }
}
