public class frr extends frg {
   private final dsq u;
   private flg<dsq.a> v;
   private flg<Boolean> w;
   private flg<Boolean> x;
   private dsq.a y = dsq.a.c;
   private boolean z;
   private boolean A;

   public frr(dsq $$0) {
      this.u = $$0;
   }

   @Override
   ddv m() {
      return this.u.b();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = this.c(flg.<dsq.a>a($$0 -> {
         return switch ($$0) {
            case a -> xh.c("advMode.mode.sequence");
            case b -> xh.c("advMode.mode.auto");
            case c -> xh.c("advMode.mode.redstone");
         };
      }).a(dsq.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xh.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         flg.a(xh.c("advMode.mode.conditional"), xh.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xh.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         flg.a(xh.c("advMode.mode.autoexec.bat"), xh.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xh.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
      );
      this.f(false);
   }

   private void f(boolean $$0) {
      this.c.j = $$0;
      this.s.j = $$0;
      this.v.j = $$0;
      this.w.j = $$0;
      this.x.j = $$0;
   }

   public void F() {
      ddv $$0 = this.u.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.y = this.u.t();
      this.z = this.u.u();
      this.A = this.u.d();
      this.s.a($$1);
      this.v.a(this.y);
      this.w.a(this.z);
      this.x.a(this.A);
      this.c($$1);
      this.f(true);
   }

   @Override
   public void a(fja $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(ddv $$0) {
      this.m.L().b(new aik(jg.a((jz)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
