public class fol extends foa {
   private final dpr s;
   private fhl<dpr.a> u;
   private fhl<Boolean> v;
   private fhl<Boolean> w;
   private dpr.a x = dpr.a.c;
   private boolean y;
   private boolean z;

   public fol(dpr $$0) {
      this.s = $$0;
   }

   @Override
   daz m() {
      return this.s.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.u = this.c(fhl.<dpr.a>a($$0 -> {
         return switch ($$0) {
            case a -> xp.c("advMode.mode.sequence");
            case b -> xp.c("advMode.mode.auto");
            case c -> xp.c("advMode.mode.redstone");
         };
      }).a(dpr.a.values()).a().a(this.x).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xp.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fhl.a(xp.c("advMode.mode.conditional"), xp.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.n / 2 - 50, 165, 100, 20, xp.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fhl.a(xp.c("advMode.mode.autoexec.bat"), xp.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.z)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xp.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
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

   public void I() {
      daz $$0 = this.s.b();
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
   public void a(fff $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(daz $$0) {
      this.m.L().b(new aik(iz.a($$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
