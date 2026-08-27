public class fgn extends fgc {
   private final djd m;
   private ezo<djd.a> n;
   private ezo<Boolean> o;
   private ezo<Boolean> p;
   private djd.a q = djd.a.c;
   private boolean r;
   private boolean t;

   public fgn(djd $$0) {
      this.m = $$0;
   }

   @Override
   cuo o() {
      return this.m.c();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.n = this.d(ezo.<djd.a>a($$0 -> {
         return switch ($$0) {
            case a -> vq.c("advMode.mode.sequence");
            case b -> vq.c("advMode.mode.auto");
            case c -> vq.c("advMode.mode.redstone");
         };
      }).a(djd.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vq.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         ezo.a(vq.c("advMode.mode.conditional"), vq.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vq.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         ezo.a(vq.c("advMode.mode.autoexec.bat"), vq.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, vq.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      cuo $$0 = this.m.c();
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
   public void a(exh $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cuo $$0) {
      this.f.J().b(new age(hz.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
