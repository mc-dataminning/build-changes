public class fsy extends ftr {
   private static final xk a = xk.c("gui.toMenu");
   private static final xk b = xk.c("gui.toTitle");
   private static final xk c = xk.c("gui.report_to_server");
   private static final xk d = xk.c("gui.open_report_dir");
   private final ftr s;
   private final wg u;
   private final xk v;
   private final frr w = frr.d();

   public fsy(ftr $$0, xk $$1, xk $$2) {
      this($$0, $$1, new wg($$2));
   }

   public fsy(ftr $$0, xk $$1, xk $$2, xk $$3) {
      this($$0, $$1, new wg($$2), $$3);
   }

   public fsy(ftr $$0, xk $$1, wg $$2) {
      this($$0, $$1, $$2, a);
   }

   public fsy(ftr $$0, xk $$1, wg $$2, xk $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aT_() {
      this.w.c().b().a(10);
      this.w.a(new fpg(this.l, this.p));
      this.w.a(new fot(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fny.a(c, fso.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fny.a(d, $$1x -> ae.m().a($$0.getParent())).a(200).a()));
      fny $$0;
      if (this.m.F()) {
         $$0 = fny.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fny.a(b, $$0x -> this.m.a(new ftt())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      frl.a(this.w, this.H());
   }

   @Override
   public xk i() {
      return xj.a(this.l, this.u.a());
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
