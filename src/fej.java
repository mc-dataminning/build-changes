public class fej extends fdy {
   private final dhe m;
   private exm<dhe.a> n;
   private exm<Boolean> o;
   private exm<Boolean> p;
   private dhe.a q = dhe.a.c;
   private boolean r;
   private boolean t;

   public fej(dhe $$0) {
      this.m = $$0;
   }

   @Override
   csp n() {
      return this.m.c();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.n = this.d(exm.<dhe.a>a($$0 -> {
         return switch ($$0) {
            case a -> vf.c("advMode.mode.sequence");
            case b -> vf.c("advMode.mode.auto");
            case c -> vf.c("advMode.mode.redstone");
         };
      }).a(dhe.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vf.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         exm.a(vf.c("advMode.mode.conditional"), vf.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vf.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         exm.a(vf.c("advMode.mode.autoexec.bat"), vf.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, vf.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
      );
      this.e(false);
   }

   private void e(boolean $$0) {
      this.c.j = $$0;
      this.l.j = $$0;
      this.n.j = $$0;
      this.o.j = $$0;
      this.p.j = $$0;
   }

   public void H() {
      csp $$0 = this.m.c();
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
   public void a(evh $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(csp $$0) {
      this.f.J().b(new aew(hx.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
