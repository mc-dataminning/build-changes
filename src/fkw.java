public class fkw extends fkl {
   private final dmp p;
   private fdw<dmp.a> q;
   private fdw<Boolean> r;
   private fdw<Boolean> s;
   private dmp.a u = dmp.a.c;
   private boolean v;
   private boolean w;

   public fkw(dmp $$0) {
      this.p = $$0;
   }

   @Override
   cxy m() {
      return this.p.b();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.q = this.c(fdw.<dmp.a>a($$0 -> {
         return switch ($$0) {
            case a -> wg.c("advMode.mode.sequence");
            case b -> wg.c("advMode.mode.auto");
            case c -> wg.c("advMode.mode.redstone");
         };
      }).a(dmp.a.values()).a().a(this.u).a(this.k / 2 - 50 - 100 - 4, 165, 100, 20, wg.c("advMode.mode"), ($$0, $$1) -> this.u = $$1));
      this.r = this.c(
         fdw.a(wg.c("advMode.mode.conditional"), wg.c("advMode.mode.unconditional"))
            .a()
            .a(this.v)
            .a(this.k / 2 - 50, 165, 100, 20, wg.c("advMode.type"), ($$0, $$1) -> this.v = $$1)
      );
      this.s = this.c(
         fdw.a(wg.c("advMode.mode.autoexec.bat"), wg.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.w)
            .a(this.k / 2 + 50 + 4, 165, 100, 20, wg.c("advMode.triggering"), ($$0, $$1) -> this.w = $$1)
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
      cxy $$0 = this.p.b();
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
   public void a(fbp $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cxy $$0) {
      this.j.L().b(new agy(ib.a($$0.g()), this.a.a(), this.u, $$0.p(), this.v, this.w));
   }
}
