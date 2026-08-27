public class evz extends evo {
   private final czx m;
   private epp<czx.a> n;
   private epp<Boolean> o;
   private epp<Boolean> p;
   private czx.a q = czx.a.c;
   private boolean r;
   private boolean s;

   public evz(czx $$0) {
      this.m = $$0;
   }

   @Override
   cln l() {
      return this.m.c();
   }

   @Override
   int B() {
      return 135;
   }

   @Override
   protected void b() {
      super.b();
      this.n = this.d(epp.<czx.a>a($$0 -> {
         return switch ($$0) {
            case a -> sw.c("advMode.mode.sequence");
            case b -> sw.c("advMode.mode.auto");
            case c -> sw.c("advMode.mode.redstone");
         };
      }).a(czx.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, sw.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         epp.a(sw.c("advMode.mode.conditional"), sw.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, sw.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         epp.a(sw.c("advMode.mode.autoexec.bat"), sw.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.s)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, sw.c("advMode.triggering"), ($$0, $$1) -> this.s = $$1)
      );
      this.e(false);
   }

   private void e(boolean $$0) {
      this.c.r = $$0;
      this.l.r = $$0;
      this.n.r = $$0;
      this.o.r = $$0;
      this.p.r = $$0;
   }

   public void D() {
      cln $$0 = this.m.c();
      this.a.a($$0.m());
      boolean $$1 = $$0.o();
      this.q = this.m.v();
      this.r = this.m.w();
      this.s = this.m.f();
      this.l.a($$1);
      this.n.a(this.q);
      this.o.a(this.r);
      this.p.a(this.s);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(enn $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cln $$0) {
      this.f.I().a(new aap(gu.a($$0.g()), this.a.b(), this.q, $$0.o(), this.r, this.s));
   }
}
