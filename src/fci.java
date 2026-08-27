public class fci extends fbx {
   private final dfs m;
   private evl<dfs.a> n;
   private evl<Boolean> o;
   private evl<Boolean> p;
   private dfs.a q = dfs.a.c;
   private boolean r;
   private boolean t;

   public fci(dfs $$0) {
      this.m = $$0;
   }

   @Override
   crg l() {
      return this.m.c();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.n = this.d(evl.<dfs.a>a($$0 -> {
         return switch ($$0) {
            case a -> uv.c("advMode.mode.sequence");
            case b -> uv.c("advMode.mode.auto");
            case c -> uv.c("advMode.mode.redstone");
         };
      }).a(dfs.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, uv.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         evl.a(uv.c("advMode.mode.conditional"), uv.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, uv.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         evl.a(uv.c("advMode.mode.autoexec.bat"), uv.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, uv.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
      );
      this.e(false);
   }

   private void e(boolean $$0) {
      this.c.i = $$0;
      this.l.i = $$0;
      this.n.i = $$0;
      this.o.i = $$0;
      this.p.i = $$0;
   }

   public void E() {
      crg $$0 = this.m.c();
      this.a.a($$0.m());
      boolean $$1 = $$0.o();
      this.q = this.m.m();
      this.r = this.m.w();
      this.t = this.m.f();
      this.l.a($$1);
      this.n.a(this.q);
      this.o.a(this.r);
      this.p.a(this.t);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(eti $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(crg $$0) {
      this.f.I().b(new aec(hx.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
