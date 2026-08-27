public class fec extends fdr {
   private final dgy m;
   private exf<dgy.a> n;
   private exf<Boolean> o;
   private exf<Boolean> p;
   private dgy.a q = dgy.a.c;
   private boolean r;
   private boolean t;

   public fec(dgy $$0) {
      this.m = $$0;
   }

   @Override
   csj n() {
      return this.m.c();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.n = this.d(exf.<dgy.a>a($$0 -> {
         return switch ($$0) {
            case a -> vd.c("advMode.mode.sequence");
            case b -> vd.c("advMode.mode.auto");
            case c -> vd.c("advMode.mode.redstone");
         };
      }).a(dgy.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vd.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         exf.a(vd.c("advMode.mode.conditional"), vd.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vd.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         exf.a(vd.c("advMode.mode.autoexec.bat"), vd.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, vd.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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

   public void E() {
      csj $$0 = this.m.c();
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
   public void a(eva $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(csj $$0) {
      this.f.I().b(new aet(hx.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
