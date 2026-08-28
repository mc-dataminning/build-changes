public class fna extends fnx {
   private fiz a;
   private final Runnable b;
   private final Runnable c;

   public fna(Runnable $$0, Runnable $$1) {
      super(wy.c("datapackFailure.title"));
      this.a = fiz.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a = fiz.a(this.o, this.n(), this.m - 50);
      this.c(fig.a(wy.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.m / 2 - 155, this.n / 6 + 96, 150, 20).a());
      this.c(fig.a(wx.k, $$0 -> this.b.run()).a(this.m / 2 - 155 + 160, this.n / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.m / 2, 70);
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
