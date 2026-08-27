public class fbq extends fbf {
   private final dfb m;
   private eut<dfb.a> n;
   private eut<Boolean> o;
   private eut<Boolean> p;
   private dfb.a q = dfb.a.c;
   private boolean r;
   private boolean t;

   public fbq(dfb $$0) {
      this.m = $$0;
   }

   @Override
   cqt l() {
      return this.m.c();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.n = this.d(eut.<dfb.a>a($$0 -> {
         return switch ($$0) {
            case a -> ur.c("advMode.mode.sequence");
            case b -> ur.c("advMode.mode.auto");
            case c -> ur.c("advMode.mode.redstone");
         };
      }).a(dfb.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, ur.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         eut.a(ur.c("advMode.mode.conditional"), ur.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, ur.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.d(
         eut.a(ur.c("advMode.mode.autoexec.bat"), ur.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, ur.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      cqt $$0 = this.m.c();
      this.a.a($$0.m());
      boolean $$1 = $$0.o();
      this.q = this.m.v();
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
   public void a(esr $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cqt $$0) {
      this.f.I().b(new adw(ht.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
