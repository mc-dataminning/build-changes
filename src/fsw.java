public class fsw extends fsk {
   private final dti u;
   private fmk<dti.a> v;
   private fmk<Boolean> w;
   private fmk<Boolean> x;
   private dti.a y = dti.a.c;
   private boolean z;
   private boolean A;

   public fsw(dti $$0) {
      this.u = $$0;
   }

   @Override
   dem m() {
      return this.u.b();
   }

   @Override
   int F() {
      return 135;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = this.c(fmk.<dti.a>a($$0 -> {
         return switch ($$0) {
            case a -> xj.c("advMode.mode.sequence");
            case b -> xj.c("advMode.mode.auto");
            case c -> xj.c("advMode.mode.redstone");
         };
      }).a(dti.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xj.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fmk.a(xj.c("advMode.mode.conditional"), xj.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xj.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fmk.a(xj.c("advMode.mode.autoexec.bat"), xj.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xj.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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

   public void J() {
      dem $$0 = this.u.b();
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
   public void a(fke $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dem $$0) {
      this.m.L().b(new aim(jh.a((ka)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
