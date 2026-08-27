public class fmb extends flq {
   private final dnn s;
   private ffb<dnn.a> u;
   private ffb<Boolean> v;
   private ffb<Boolean> w;
   private dnn.a x = dnn.a.c;
   private boolean y;
   private boolean z;

   public fmb(dnn $$0) {
      this.s = $$0;
   }

   @Override
   cyv m() {
      return this.s.b();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.u = this.c(ffb.<dnn.a>a($$0 -> {
         return switch ($$0) {
            case a -> ws.c("advMode.mode.sequence");
            case b -> ws.c("advMode.mode.auto");
            case c -> ws.c("advMode.mode.redstone");
         };
      }).a(dnn.a.values()).a().a(this.x).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, ws.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         ffb.a(ws.c("advMode.mode.conditional"), ws.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.n / 2 - 50, 165, 100, 20, ws.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         ffb.a(ws.c("advMode.mode.autoexec.bat"), ws.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.z)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, ws.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
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

   public void E() {
      cyv $$0 = this.s.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.x = this.s.l();
      this.y = this.s.t();
      this.z = this.s.d();
      this.r.a($$1);
      this.u.a(this.x);
      this.v.a(this.y);
      this.w.a(this.z);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(fcu $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cyv $$0) {
      this.m.L().b(new ahk(im.a($$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
