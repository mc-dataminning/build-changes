public class ezn extends ezc {
   private final dda m;
   private ess<dda.a> n;
   private ess<Boolean> o;
   private ess<Boolean> p;
   private dda.a q = dda.a.c;
   private boolean s;
   private boolean t;

   public ezn(dda $$0) {
      this.m = $$0;
   }

   @Override
   cor l() {
      return this.m.c();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.n = this.d(ess.<dda.a>a($$0 -> {
         return switch ($$0) {
            case a -> ti.c("advMode.mode.sequence");
            case b -> ti.c("advMode.mode.auto");
            case c -> ti.c("advMode.mode.redstone");
         };
      }).a(dda.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, ti.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         ess.a(ti.c("advMode.mode.conditional"), ti.c("advMode.mode.unconditional"))
            .a()
            .a(this.s)
            .a(this.g / 2 - 50, 165, 100, 20, ti.c("advMode.type"), ($$0, $$1) -> this.s = $$1)
      );
      this.p = this.d(
         ess.a(ti.c("advMode.mode.autoexec.bat"), ti.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, ti.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      cor $$0 = this.m.c();
      this.a.a($$0.m());
      boolean $$1 = $$0.o();
      this.q = this.m.v();
      this.s = this.m.w();
      this.t = this.m.f();
      this.l.a($$1);
      this.n.a(this.q);
      this.o.a(this.s);
      this.p.a(this.t);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(eqq $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cor $$0) {
      this.f.J().b(new acm(gw.a($$0.g()), this.a.a(), this.q, $$0.o(), this.s, this.t));
   }
}
