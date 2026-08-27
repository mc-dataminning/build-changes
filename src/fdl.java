public class fdl extends fda {
   private final dgn m;
   private ewo<dgn.a> n;
   private ewo<Boolean> o;
   private ewo<Boolean> p;
   private dgn.a q = dgn.a.c;
   private boolean r;
   private boolean t;

   public fdl(dgn $$0) {
      this.m = $$0;
   }

   @Override
   crz l() {
      return this.m.c();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.n = this.d(ewo.<dgn.a>a($$0 -> {
         return switch ($$0) {
            case a -> vb.c("advMode.mode.sequence");
            case b -> vb.c("advMode.mode.auto");
            case c -> vb.c("advMode.mode.redstone");
         };
      }).a(dgn.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vb.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         ewo.a(vb.c("advMode.mode.conditional"), vb.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vb.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         ewo.a(vb.c("advMode.mode.autoexec.bat"), vb.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, vb.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      crz $$0 = this.m.c();
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
   public void a(euk $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(crz $$0) {
      this.f.I().b(new aej(hv.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
