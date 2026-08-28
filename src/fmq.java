public class fmq extends fnx {
   private static final int a = 90;
   private final wy b;
   private fiz c = fiz.a;
   private final Runnable q;
   private final wy r;
   private final boolean s;

   public fmq(Runnable $$0, wy $$1, wy $$2) {
      this($$0, $$1, $$2, wx.k, true);
   }

   public fmq(Runnable $$0, wy $$1, wy $$2, wy $$3, boolean $$4) {
      super($$1);
      this.q = $$0;
      this.b = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), this.b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = fiz.a(this.o, this.b, this.m - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ayn.a(90 + $$0 + 12, this.n / 6 + 96, this.n - 24);
      int $$2 = 150;
      this.c(fig.a(this.r, $$0x -> this.q.run()).a((this.m - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 70, 16777215);
      this.c.a($$0, this.m / 2, 90);
   }

   @Override
   public boolean aF_() {
      return this.s;
   }
}
