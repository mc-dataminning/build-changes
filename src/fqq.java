public class fqq extends fnx {
   private static final int a = 600;
   private final vs b;
   private fig c;
   private int q;
   private final flx r = flx.d();

   public fqq(wy $$0, vs $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.r.c().b().a(10);
      this.r.a(new fjn(this.k, this.o));
      this.c = this.r.a(fig.a(wx.p, $$0 -> this.b.a(fmw.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      flr.a(this.r, this.H());
   }

   @Override
   public void e() {
      super.e();
      this.q++;
      if (this.q == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
