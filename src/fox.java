public class fox extends fol {
   private final dqp s;
   private fin<dqp.a> u;
   private fin<Boolean> v;
   private fin<Boolean> w;
   private dqp.a x = dqp.a.c;
   private boolean y;
   private boolean z;

   public fox(dqp $$0) {
      this.s = $$0;
   }

   @Override
   dbv m() {
      return this.s.b();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.u = this.c(fin.<dqp.a>a($$0 -> {
         return switch ($$0) {
            case a -> wy.c("advMode.mode.sequence");
            case b -> wy.c("advMode.mode.auto");
            case c -> wy.c("advMode.mode.redstone");
         };
      }).a(dqp.a.values()).a().a(this.x).a(this.m / 2 - 50 - 100 - 4, 165, 100, 20, wy.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fin.a(wy.c("advMode.mode.conditional"), wy.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.m / 2 - 50, 165, 100, 20, wy.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fin.a(wy.c("advMode.mode.autoexec.bat"), wy.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.z)
            .a(this.m / 2 + 50 + 4, 165, 100, 20, wy.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
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
      dbv $$0 = this.s.b();
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
   public void a(fgi $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(dbv $$0) {
      this.l.L().b(new ahv(jd.a((jw)$$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
