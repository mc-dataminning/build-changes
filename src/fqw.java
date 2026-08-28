public class fqw extends frp {
   private static final xl a = xl.c("gui.toMenu");
   private static final xl b = xl.c("gui.toTitle");
   private static final xl c = xl.c("gui.report_to_server");
   private static final xl d = xl.c("gui.open_report_dir");
   private final frp s;
   private final wh u;
   private final xl v;
   private final fpp w = fpp.d();

   public fqw(frp $$0, xl $$1, xl $$2) {
      this($$0, $$1, new wh($$2));
   }

   public fqw(frp $$0, xl $$1, xl $$2, xl $$3) {
      this($$0, $$1, new wh($$2), $$3);
   }

   public fqw(frp $$0, xl $$1, wh $$2) {
      this($$0, $$1, $$2, a);
   }

   public fqw(frp $$0, xl $$1, wh $$2, xl $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aS_() {
      this.w.c().b().a(10);
      this.w.a(new fnd(this.l, this.p));
      this.w.a(new fmq(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(flw.a(c, fqm.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(flw.a(d, $$1x -> ae.m().a($$0.getParent())).a(200).a()));
      flw $$0;
      if (this.m.F()) {
         $$0 = flw.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = flw.a(b, $$0x -> this.m.a(new frr())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fpj.a(this.w, this.H());
   }

   @Override
   public xl i() {
      return xk.a(this.l, this.u.a());
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
