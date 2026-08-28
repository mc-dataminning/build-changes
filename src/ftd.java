public class ftd extends ftw {
   private static final xv a = xv.c("gui.toMenu");
   private static final xv b = xv.c("gui.toTitle");
   private static final xv c = xv.c("gui.report_to_server");
   private static final xv d = xv.c("gui.open_report_dir");
   private final ftw s;
   private final wr u;
   private final xv v;
   private final frw w = frw.d();

   public ftd(ftw $$0, xv $$1, xv $$2) {
      this($$0, $$1, new wr($$2));
   }

   public ftd(ftw $$0, xv $$1, xv $$2, xv $$3) {
      this($$0, $$1, new wr($$2), $$3);
   }

   public ftd(ftw $$0, xv $$1, wr $$2) {
      this($$0, $$1, $$2, a);
   }

   public ftd(ftw $$0, xv $$1, wr $$2, xv $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aT_() {
      this.w.c().b().a(10);
      this.w.a(new fpl(this.l, this.p));
      this.w.a(new foy(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fod.a(c, fst.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fod.a(d, $$1x -> ae.m().a($$0.getParent())).a(200).a()));
      fod $$0;
      if (this.m.F()) {
         $$0 = fod.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fod.a(b, $$0x -> this.m.a(new fty())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      frq.a(this.w, this.H());
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
