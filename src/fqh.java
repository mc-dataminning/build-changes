public class fqh extends fra {
   private static final xi a = xi.c("gui.toMenu");
   private static final xi b = xi.c("gui.toTitle");
   private static final xi c = xi.c("gui.report_to_server");
   private static final xi d = xi.c("gui.open_report_dir");
   private final fra s;
   private final we u;
   private final xi v;
   private final fpa w = fpa.d();

   public fqh(fra $$0, xi $$1, xi $$2) {
      this($$0, $$1, new we($$2));
   }

   public fqh(fra $$0, xi $$1, xi $$2, xi $$3) {
      this($$0, $$1, new we($$2), $$3);
   }

   public fqh(fra $$0, xi $$1, we $$2) {
      this($$0, $$1, $$2, a);
   }

   public fqh(fra $$0, xi $$1, we $$2, xi $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aR_() {
      this.w.c().b().a(10);
      this.w.a(new fmo(this.l, this.p));
      this.w.a(new fmb(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(flh.a(c, fpx.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(flh.a(d, $$1x -> ae.m().a($$0.getParent())).a(200).a()));
      flh $$0;
      if (this.m.F()) {
         $$0 = flh.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = flh.a(b, $$0x -> this.m.a(new frc())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fou.a(this.w, this.H());
   }

   @Override
   public xi i() {
      return xh.a(this.l, this.u.a());
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
