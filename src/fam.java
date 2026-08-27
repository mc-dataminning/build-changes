public class fam extends fab {
   private final deh m;
   private etq<deh.a> n;
   private etq<Boolean> o;
   private etq<Boolean> p;
   private deh.a q = deh.a.c;
   private boolean s;
   private boolean t;

   public fam(deh $$0) {
      this.m = $$0;
   }

   @Override
   cqa l() {
      return this.m.c();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.n = this.d(etq.<deh.a>a($$0 -> {
         return switch ($$0) {
            case a -> ui.c("advMode.mode.sequence");
            case b -> ui.c("advMode.mode.auto");
            case c -> ui.c("advMode.mode.redstone");
         };
      }).a(deh.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, ui.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         etq.a(ui.c("advMode.mode.conditional"), ui.c("advMode.mode.unconditional"))
            .a()
            .a(this.s)
            .a(this.g / 2 - 50, 165, 100, 20, ui.c("advMode.type"), ($$0, $$1) -> this.s = $$1)
      );
      this.p = this.d(
         etq.a(ui.c("advMode.mode.autoexec.bat"), ui.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, ui.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      cqa $$0 = this.m.c();
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
   public void a(ero $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cqa $$0) {
      this.f.J().b(new adm(ht.a($$0.g()), this.a.a(), this.q, $$0.o(), this.s, this.t));
   }
}
