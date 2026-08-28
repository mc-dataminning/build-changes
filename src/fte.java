public class fte extends ftx {
   private static final xv a = xv.c("gui.toMenu");
   private static final xv b = xv.c("gui.toTitle");
   private static final xv c = xv.c("gui.report_to_server");
   private static final xv d = xv.c("gui.open_report_dir");
   private final ftx s;
   private final wr u;
   private final xv v;
   private final frx w = frx.d();

   public fte(ftx $$0, xv $$1, xv $$2) {
      this($$0, $$1, new wr($$2));
   }

   public fte(ftx $$0, xv $$1, xv $$2, xv $$3) {
      this($$0, $$1, new wr($$2), $$3);
   }

   public fte(ftx $$0, xv $$1, wr $$2) {
      this($$0, $$1, $$2, a);
   }

   public fte(ftx $$0, xv $$1, wr $$2, xv $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aT_() {
      this.w.c().b().a(10);
      this.w.a(new fpm(this.l, this.p));
      this.w.a(new foz(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(foe.a(c, fsu.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(foe.a(d, $$1x -> ae.m().a($$0.getParent())).a(200).a()));
      foe $$0;
      if (this.m.F()) {
         $$0 = foe.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = foe.a(b, $$0x -> this.m.a(new ftz())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      frr.a(this.w, this.H());
   }

   @Override
   public xv i() {
      return xu.a(this.l, this.u.a());
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
