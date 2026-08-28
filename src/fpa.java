public class fpa extends fpt {
   private static final xd a = xd.c("gui.toMenu");
   private static final xd b = xd.c("gui.toTitle");
   private static final xd c = xd.c("gui.report_to_server");
   private static final xd d = xd.c("gui.open_report_dir");
   private final fpt s;
   private final vz u;
   private final xd v;
   private final fns w = fns.d();

   public fpa(fpt $$0, xd $$1, xd $$2) {
      this($$0, $$1, new vz($$2));
   }

   public fpa(fpt $$0, xd $$1, xd $$2, xd $$3) {
      this($$0, $$1, new vz($$2), $$3);
   }

   public fpa(fpt $$0, xd $$1, vz $$2) {
      this($$0, $$1, $$2, a);
   }

   public fpa(fpt $$0, xd $$1, vz $$2, xd $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aT_() {
      this.w.c().b().a(10);
      this.w.a(new flh(this.l, this.p));
      this.w.a(new fku(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fka.a(c, fop.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fka.a(d, $$1x -> ad.m().a($$0.getParent())).a(200).a()));
      fka $$0;
      if (this.m.F()) {
         $$0 = fka.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fka.a(b, $$0x -> this.m.a(new fpv())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fnm.a(this.w, this.H());
   }

   @Override
   public xd i() {
      return xc.a(this.l, this.u.a());
   }

   @Override
   public boolean aJ_() {
      return false;
   }
}
