public class fev extends fek {
   private final dhn m;
   private exy<dhn.a> n;
   private exy<Boolean> o;
   private exy<Boolean> p;
   private dhn.a q = dhn.a.c;
   private boolean r;
   private boolean t;

   public fev(dhn $$0) {
      this.m = $$0;
   }

   @Override
   csy o() {
      return this.m.c();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.n = this.d(exy.<dhn.a>a($$0 -> {
         return switch ($$0) {
            case a -> vg.c("advMode.mode.sequence");
            case b -> vg.c("advMode.mode.auto");
            case c -> vg.c("advMode.mode.redstone");
         };
      }).a(dhn.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vg.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         exy.a(vg.c("advMode.mode.conditional"), vg.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vg.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         exy.a(vg.c("advMode.mode.autoexec.bat"), vg.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, vg.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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

   public void I() {
      csy $$0 = this.m.c();
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
   public void a(evr $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(csy $$0) {
      this.f.J().b(new aex(hx.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
