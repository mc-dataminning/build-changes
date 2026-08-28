public class foc extends fnr {
   private final dpx s;
   private fht<dpx.a> u;
   private fht<Boolean> v;
   private fht<Boolean> w;
   private dpx.a x = dpx.a.c;
   private boolean y;
   private boolean z;

   public foc(dpx $$0) {
      this.s = $$0;
   }

   @Override
   dbe m() {
      return this.s.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.u = this.c(fht.<dpx.a>a($$0 -> {
         return switch ($$0) {
            case a -> wu.c("advMode.mode.sequence");
            case b -> wu.c("advMode.mode.auto");
            case c -> wu.c("advMode.mode.redstone");
         };
      }).a(dpx.a.values()).a().a(this.x).a(this.m / 2 - 50 - 100 - 4, 165, 100, 20, wu.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fht.a(wu.c("advMode.mode.conditional"), wu.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.m / 2 - 50, 165, 100, 20, wu.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fht.a(wu.c("advMode.mode.autoexec.bat"), wu.c("advMode.mode.redstoneTriggered"))
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
      dbe $$0 = this.s.b();
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
   public void a(ffn $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(dbe $$0) {
      this.l.L().b(new ahp(ja.a($$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
