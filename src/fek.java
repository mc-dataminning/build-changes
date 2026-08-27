public class fek extends fdz {
   private final dhf m;
   private exn<dhf.a> n;
   private exn<Boolean> o;
   private exn<Boolean> p;
   private dhf.a q = dhf.a.c;
   private boolean r;
   private boolean t;

   public fek(dhf $$0) {
      this.m = $$0;
   }

   @Override
   csq n() {
      return this.m.c();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.n = this.d(exn.<dhf.a>a($$0 -> {
         return switch ($$0) {
            case a -> vf.c("advMode.mode.sequence");
            case b -> vf.c("advMode.mode.auto");
            case c -> vf.c("advMode.mode.redstone");
         };
      }).a(dhf.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vf.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         exn.a(vf.c("advMode.mode.conditional"), vf.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vf.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         exn.a(vf.c("advMode.mode.autoexec.bat"), vf.c("advMode.mode.redstoneTriggered"))
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
      csq $$0 = this.m.c();
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
   public void a(evi $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(csq $$0) {
      this.f.J().b(new aew(hx.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
