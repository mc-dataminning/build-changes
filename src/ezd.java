public class ezd extends eys {
   private final dcu m;
   private esp<dcu.a> n;
   private esp<Boolean> o;
   private esp<Boolean> p;
   private dcu.a q = dcu.a.c;
   private boolean s;
   private boolean t;

   public ezd(dcu $$0) {
      this.m = $$0;
   }

   @Override
   cok l() {
      return this.m.c();
   }

   @Override
   int B() {
      return 135;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.n = this.d(esp.<dcu.a>a($$0 -> {
         return switch ($$0) {
            case a -> te.c("advMode.mode.sequence");
            case b -> te.c("advMode.mode.auto");
            case c -> te.c("advMode.mode.redstone");
         };
      }).a(dcu.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, te.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         esp.a(te.c("advMode.mode.conditional"), te.c("advMode.mode.unconditional"))
            .a()
            .a(this.s)
            .a(this.g / 2 - 50, 165, 100, 20, te.c("advMode.type"), ($$0, $$1) -> this.s = $$1)
      );
      this.p = this.d(
         esp.a(te.c("advMode.mode.autoexec.bat"), te.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, te.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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

   public void D() {
      cok $$0 = this.m.c();
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
   public void a(eqn $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cok $$0) {
      this.f.I().b(new ach(gv.a($$0.g()), this.a.a(), this.q, $$0.o(), this.s, this.t));
   }
}
