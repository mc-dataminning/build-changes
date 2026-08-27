public class fio extends fid {
   private final dkq m;
   private fbn<dkq.a> n;
   private fbn<Boolean> o;
   private fbn<Boolean> p;
   private dkq.a q = dkq.a.c;
   private boolean r;
   private boolean t;

   public fio(dkq $$0) {
      this.m = $$0;
   }

   @Override
   cwa o() {
      return this.m.b();
   }

   @Override
   int E() {
      return 135;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.n = this.c(fbn.<dkq.a>a($$0 -> {
         return switch ($$0) {
            case a -> vu.c("advMode.mode.sequence");
            case b -> vu.c("advMode.mode.auto");
            case c -> vu.c("advMode.mode.redstone");
         };
      }).a(dkq.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, vu.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.c(
         fbn.a(vu.c("advMode.mode.conditional"), vu.c("advMode.mode.unconditional"))
            .a()
            .a(this.r)
            .a(this.g / 2 - 50, 165, 100, 20, vu.c("advMode.type"), ($$0, $$1) -> this.r = $$1)
      );
      this.p = this.c(
         fbn.a(vu.c("advMode.mode.autoexec.bat"), vu.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, vu.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      cwa $$0 = this.m.b();
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
   public void a(ezg $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(cwa $$0) {
      this.f.L().b(new agm(ib.a($$0.g()), this.a.a(), this.q, $$0.o(), this.r, this.t));
   }
}
