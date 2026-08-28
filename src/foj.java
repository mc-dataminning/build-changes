public class foj extends fny {
   private final dpp s;
   private fhj<dpp.a> u;
   private fhj<Boolean> v;
   private fhj<Boolean> w;
   private dpp.a x = dpp.a.c;
   private boolean y;
   private boolean z;

   public foj(dpp $$0) {
      this.s = $$0;
   }

   @Override
   dax m() {
      return this.s.b();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.u = this.c(fhj.<dpp.a>a($$0 -> {
         return switch ($$0) {
            case a -> xo.c("advMode.mode.sequence");
            case b -> xo.c("advMode.mode.auto");
            case c -> xo.c("advMode.mode.redstone");
         };
      }).a(dpp.a.values()).a().a(this.x).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xo.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fhj.a(xo.c("advMode.mode.conditional"), xo.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.n / 2 - 50, 165, 100, 20, xo.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fhj.a(xo.c("advMode.mode.autoexec.bat"), xo.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.z)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xo.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
      );
      this.e(false);
   }

   private void e(boolean $$0) {
      this.c.j = $$0;
      this.r.j = $$0;
      this.u.j = $$0;
      this.v.j = $$0;
      this.w.j = $$0;
   }

   public void F() {
      dax $$0 = this.s.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.x = this.s.l();
      this.y = this.s.u();
      this.z = this.s.d();
      this.r.a($$1);
      this.u.a(this.x);
      this.v.a(this.y);
      this.w.a(this.z);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(ffd $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(dax $$0) {
      this.m.L().b(new aij(iz.a($$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
