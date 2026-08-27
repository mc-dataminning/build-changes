public class ezh extends eyw {
   private final dcw m;
   private eso<dcw.a> n;
   private eso<Boolean> o;
   private eso<Boolean> p;
   private dcw.a q = dcw.a.c;
   private boolean s;
   private boolean t;

   public ezh(dcw $$0) {
      this.m = $$0;
   }

   @Override
   com l() {
      return this.m.c();
   }

   @Override
   int B() {
      return 135;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.n = this.d(eso.<dcw.a>a($$0 -> {
         return switch ($$0) {
            case a -> tf.c("advMode.mode.sequence");
            case b -> tf.c("advMode.mode.auto");
            case c -> tf.c("advMode.mode.redstone");
         };
      }).a(dcw.a.values()).a().a(this.q).a(this.g / 2 - 50 - 100 - 4, 165, 100, 20, tf.c("advMode.mode"), ($$0, $$1) -> this.q = $$1));
      this.o = this.d(
         eso.a(tf.c("advMode.mode.conditional"), tf.c("advMode.mode.unconditional"))
            .a()
            .a(this.s)
            .a(this.g / 2 - 50, 165, 100, 20, tf.c("advMode.type"), ($$0, $$1) -> this.s = $$1)
      );
      this.p = this.d(
         eso.a(tf.c("advMode.mode.autoexec.bat"), tf.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.t)
            .a(this.g / 2 + 50 + 4, 165, 100, 20, tf.c("advMode.triggering"), ($$0, $$1) -> this.t = $$1)
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
      com $$0 = this.m.c();
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
   public void a(eqm $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(com $$0) {
      this.f.J().b(new acj(gu.a($$0.g()), this.a.a(), this.q, $$0.o(), this.s, this.t));
   }
}
