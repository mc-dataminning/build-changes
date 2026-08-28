public class fpb extends fop {
   private final dqr u;
   private fir<dqr.a> v;
   private fir<Boolean> w;
   private fir<Boolean> x;
   private dqr.a y = dqr.a.c;
   private boolean z;
   private boolean A;

   public fpb(dqr $$0) {
      this.u = $$0;
   }

   @Override
   dbx m() {
      return this.u.b();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.v = this.c(fir.<dqr.a>a($$0 -> {
         return switch ($$0) {
            case a -> wz.c("advMode.mode.sequence");
            case b -> wz.c("advMode.mode.auto");
            case c -> wz.c("advMode.mode.redstone");
         };
      }).a(dqr.a.values()).a().a(this.y).a(this.m / 2 - 50 - 100 - 4, 165, 100, 20, wz.c("advMode.mode"), ($$0, $$1) -> this.y = $$1));
      this.w = this.c(
         fir.a(wz.c("advMode.mode.conditional"), wz.c("advMode.mode.unconditional"))
            .a()
            .a(this.z)
            .a(this.m / 2 - 50, 165, 100, 20, wz.c("advMode.type"), ($$0, $$1) -> this.z = $$1)
      );
      this.x = this.c(
         fir.a(wz.c("advMode.mode.autoexec.bat"), wz.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.A)
            .a(this.m / 2 + 50 + 4, 165, 100, 20, wz.c("advMode.triggering"), ($$0, $$1) -> this.A = $$1)
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

   public void E() {
      dbx $$0 = this.u.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.y = this.u.l();
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
   public void a(fgm $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dbx $$0) {
      this.l.L().b(new ahw(jd.a((jw)$$0.g()), this.a.a(), this.y, $$0.p(), this.z, this.A));
   }
}
