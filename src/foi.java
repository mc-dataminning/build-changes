public class foi extends fnx {
   private final dpz s;
   private fhz<dpz.a> u;
   private fhz<Boolean> v;
   private fhz<Boolean> w;
   private dpz.a x = dpz.a.c;
   private boolean y;
   private boolean z;

   public foi(dpz $$0) {
      this.s = $$0;
   }

   @Override
   dbg m() {
      return this.s.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.u = this.c(fhz.<dpz.a>a($$0 -> {
         return switch ($$0) {
            case a -> wu.c("advMode.mode.sequence");
            case b -> wu.c("advMode.mode.auto");
            case c -> wu.c("advMode.mode.redstone");
         };
      }).a(dpz.a.values()).a().a(this.x).a(this.m / 2 - 50 - 100 - 4, 165, 100, 20, wu.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fhz.a(wu.c("advMode.mode.conditional"), wu.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.m / 2 - 50, 165, 100, 20, wu.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fhz.a(wu.c("advMode.mode.autoexec.bat"), wu.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.z)
            .a(this.m / 2 + 50 + 4, 165, 100, 20, wu.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
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

   public void G() {
      dbg $$0 = this.s.b();
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
   public void a(fft $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(dbg $$0) {
      this.l.L().b(new ahp(ja.a($$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
