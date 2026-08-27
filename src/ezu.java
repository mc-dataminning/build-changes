public class ezu extends ezj {
   private final ddh m;
   private esz<ddh.a> n;
   private esz<Boolean> o;
   private esz<Boolean> p;
   private ddh.a q = ddh.a.c;
   private boolean s;
   private boolean t;

   public ezu(ddh $$0) {
      this.m = $$0;
   }

   @Override
   coy l() {
      return this.m.c();
   }

   @Override
   int D() {
      return 135;
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.n = this.d(esz.<ddh.a>a($$0 -> {
         return switch ($$0) {
            case a -> tn.c("advMode.mode.sequence");
            case b -> tn.c("advMode.mode.auto");
            case c -> tn.c("advMode.mode.redstone");
         };
      }).a(ddh.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, tn.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         esz.a(tn.c("advMode.mode.conditional"), tn.c("advMode.mode.unconditional"))
            .a()
            .a(this.s)
            .a(this.g / 2 - 50, 165, 100, 20, tn.c("advMode.type"), ($$0, $$1) -> this.s = $$1)
      );
      this.p = this.d(
         esz.a(tn.c("advMode.mode.autoexec.bat"), tn.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, tn.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      coy $$0 = this.m.c();
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
   public void a(eqx $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(coy $$0) {
      this.f.J().b(new acq(gw.a($$0.g()), this.a.a(), this.q, $$0.o(), this.s, this.t));
   }
}
