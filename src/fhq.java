public class fhq extends fhf {
   private final djv m;
   private far<djv.a> n;
   private far<Boolean> o;
   private far<Boolean> p;
   private djv.a q = djv.a.c;
   private boolean r;
   private boolean t;

   public fhq(djv $$0) {
      this.m = $$0;
   }

   @Override
   cvf o() {
      return this.m.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.n = this.c(far.<djv.a>a($$0 -> {
         return switch ($$0) {
            case a -> vs.c("advMode.mode.sequence");
            case b -> vs.c("advMode.mode.auto");
            case c -> vs.c("advMode.mode.redstone");
         };
      }).a(djv.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vs.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.c(
         far.a(vs.c("advMode.mode.conditional"), vs.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vs.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.c(
         far.a(vs.c("advMode.mode.autoexec.bat"), vs.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, vs.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      cvf $$0 = this.m.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.o();
      this.q = this.m.l();
      this.r = this.m.s();
      this.t = this.m.d();
      this.l.a($$1);
      this.n.a(this.q);
      this.o.a(this.r);
      this.p.a(this.t);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(eyk $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cvf $$0) {
      this.f.K().b(new agi(ib.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
