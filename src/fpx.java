public class fpx extends fpm {
   private final dqm s;
   private fiu<dqm.a> u;
   private fiu<Boolean> v;
   private fiu<Boolean> w;
   private dqm.a x = dqm.a.c;
   private boolean y;
   private boolean z;

   public fpx(dqm $$0) {
      this.s = $$0;
   }

   @Override
   dbb B() {
      return this.s.b();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.u = this.c(fiu.<dqm.a>a($$0 -> {
         return switch ($$0) {
            case a -> xe.c("advMode.mode.sequence");
            case b -> xe.c("advMode.mode.auto");
            case c -> xe.c("advMode.mode.redstone");
         };
      }).a(dqm.a.values()).a().a(this.x).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, xe.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fiu.a(xe.c("advMode.mode.conditional"), xe.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.n / 2 - 50, 165, 100, 20, xe.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fiu.a(xe.c("advMode.mode.autoexec.bat"), xe.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.z)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, xe.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
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
      dbb $$0 = this.s.b();
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
   public void a(fgj $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(dbb $$0) {
      this.m.L().b(new ahy(ir.a($$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
