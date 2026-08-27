public class ezs extends ezh {
   private final ddf m;
   private esx<ddf.a> n;
   private esx<Boolean> o;
   private esx<Boolean> p;
   private ddf.a q = ddf.a.c;
   private boolean s;
   private boolean t;

   public ezs(ddf $$0) {
      this.m = $$0;
   }

   @Override
   cow l() {
      return this.m.c();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aI_() {
      super.aI_();
      this.n = this.d(esx.<ddf.a>a($$0 -> {
         return switch ($$0) {
            case a -> tm.c("advMode.mode.sequence");
            case b -> tm.c("advMode.mode.auto");
            case c -> tm.c("advMode.mode.redstone");
         };
      }).a(ddf.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, tm.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         esx.a(tm.c("advMode.mode.conditional"), tm.c("advMode.mode.unconditional"))
            .a()
            .a(this.s)
            .a(this.g / 2 - 50, 165, 100, 20, tm.c("advMode.type"), ($$0, $$1) -> this.s = $$1)
      );
      this.p = this.d(
         esx.a(tm.c("advMode.mode.autoexec.bat"), tm.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, tm.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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

   public void F() {
      cow $$0 = this.m.c();
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
   public void a(eqv $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cow $$0) {
      this.f.J().b(new acp(gw.a($$0.g()), this.a.a(), this.q, $$0.o(), this.s, this.t));
   }
}
