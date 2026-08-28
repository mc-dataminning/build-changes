public class frd extends frw {
   private static final xj a = xj.c("gui.toMenu");
   private static final xj b = xj.c("gui.toTitle");
   private static final xj c = xj.c("gui.report_to_server");
   private static final xj d = xj.c("gui.open_report_dir");
   private final frw s;
   private final wf u;
   private final xj v;
   private final fpw w = fpw.d();

   public frd(frw $$0, xj $$1, xj $$2) {
      this($$0, $$1, new wf($$2));
   }

   public frd(frw $$0, xj $$1, xj $$2, xj $$3) {
      this($$0, $$1, new wf($$2), $$3);
   }

   public frd(frw $$0, xj $$1, wf $$2) {
      this($$0, $$1, $$2, a);
   }

   public frd(frw $$0, xj $$1, wf $$2, xj $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aR_() {
      this.w.c().b().a(10);
      this.w.a(new fnk(this.l, this.p));
      this.w.a(new fmx(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fmd.a(c, fqt.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fmd.a(d, $$1x -> ae.m().a($$0.getParent())).a(200).a()));
      fmd $$0;
      if (this.m.F()) {
         $$0 = fmd.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fmd.a(b, $$0x -> this.m.a(new fry())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fpq.a(this.w, this.H());
   }

   @Override
   public xj i() {
      return xi.a(this.l, this.u.a());
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
