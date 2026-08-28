public class fpz extends fqs {
   private static final xh a = xh.c("gui.toMenu");
   private static final xh b = xh.c("gui.toTitle");
   private static final xh c = xh.c("gui.report_to_server");
   private static final xh d = xh.c("gui.open_report_dir");
   private final fqs s;
   private final wd u;
   private final xh v;
   private final fos w = fos.d();

   public fpz(fqs $$0, xh $$1, xh $$2) {
      this($$0, $$1, new wd($$2));
   }

   public fpz(fqs $$0, xh $$1, xh $$2, xh $$3) {
      this($$0, $$1, new wd($$2), $$3);
   }

   public fpz(fqs $$0, xh $$1, wd $$2) {
      this($$0, $$1, $$2, a);
   }

   public fpz(fqs $$0, xh $$1, wd $$2, xh $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aS_() {
      this.w.c().b().a(10);
      this.w.a(new fmg(this.l, this.p));
      this.w.a(new flt(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fkz.a(c, fpp.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fkz.a(d, $$1x -> ad.m().a($$0.getParent())).a(200).a()));
      fkz $$0;
      if (this.m.F()) {
         $$0 = fkz.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fkz.a(b, $$0x -> this.m.a(new fqu())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fol.a(this.w, this.H());
   }

   @Override
   public xh i() {
      return xg.a(this.l, this.u.a());
   }

   @Override
   public boolean aI_() {
      return false;
   }
}
