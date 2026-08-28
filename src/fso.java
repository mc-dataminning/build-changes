public class fso extends fsd {
   private final dtb u;
   private fmd<dtb.a> v;
   private fmd<Boolean> w;
   private fmd<Boolean> x;
   private dtb.a y = dtb.a.c;
   private boolean z;
   private boolean A;

   public fso(dtb $$0) {
      this.u = $$0;
   }

   @Override
   def m() {
      return this.u.b();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = this.c(fmd.<dtb.a>a($$0 -> {
         return switch ($$0) {
            case a -> xl.c("advMode.mode.sequence");
            case b -> xl.c("advMode.mode.auto");
            case c -> xl.c("advMode.mode.redstone");
         };
      }).a(dtb.a.values()).a().a(this.y).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xl.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fmd.a(xl.c("advMode.mode.conditional"), xl.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.n / 2 - 50, 165, 100, 20, xl.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fmd.a(xl.c("advMode.mode.autoexec.bat"), xl.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xl.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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
      def $$0 = this.u.b();
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
   public void a(fjx $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(def $$0) {
      this.m.L().b(new aio(jh.a((ka)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
