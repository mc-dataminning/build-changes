public class flf extends fku {
   private final dmy p;
   private fef<dmy.a> q;
   private fef<Boolean> r;
   private fef<Boolean> s;
   private dmy.a u = dmy.a.c;
   private boolean v;
   private boolean w;

   public flf(dmy $$0) {
      this.p = $$0;
   }

   @Override
   cyh m() {
      return this.p.b();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.q = this.c(fef.<dmy.a>a($$0 -> {
         return switch ($$0) {
            case a -> wi.c("advMode.mode.sequence");
            case b -> wi.c("advMode.mode.auto");
            case c -> wi.c("advMode.mode.redstone");
         };
      }).a(dmy.a.values()).a().a(this.u).a(this.k / 2 - 50 - 100 - 4, 165, 100, 20, wi.c("advMode.mode"), ($$0, $$1) -> this.u = $$1));
      this.r = this.c(
         fef.a(wi.c("advMode.mode.conditional"), wi.c("advMode.mode.unconditional"))
            .a()
            .a(this.v)
            .a(this.k / 2 - 50, 165, 100, 20, wi.c("advMode.type"), ($$0, $$1) -> this.v = $$1)
      );
      this.s = this.c(
         fef.a(wi.c("advMode.mode.autoexec.bat"), wi.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.w)
            .a(this.k / 2 + 50 + 4, 165, 100, 20, wi.c("advMode.triggering"), ($$0, $$1) -> this.w = $$1)
      );
      this.e(false);
   }

   private void e(boolean $$0) {
      this.c.j = $$0;
      this.o.j = $$0;
      this.q.j = $$0;
      this.r.j = $$0;
      this.s.j = $$0;
   }

   public void E() {
      cyh $$0 = this.p.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.u = this.p.l();
      this.v = this.p.t();
      this.w = this.p.d();
      this.o.a($$1);
      this.q.a(this.u);
      this.r.a(this.v);
      this.s.a(this.w);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(fby $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cyh $$0) {
      this.j.L().b(new aha(id.a($$0.g()), this.a.a(), this.u, $$0.p(), this.v, this.w));
   }
}
