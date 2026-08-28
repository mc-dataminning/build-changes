public class fpo extends fqh {
   private static final xe a = xe.c("gui.toMenu");
   private static final xe b = xe.c("gui.toTitle");
   private static final xe c = xe.c("gui.report_to_server");
   private static final xe d = xe.c("gui.open_report_dir");
   private final fqh s;
   private final wa u;
   private final xe v;
   private final fog w = fog.d();

   public fpo(fqh $$0, xe $$1, xe $$2) {
      this($$0, $$1, new wa($$2));
   }

   public fpo(fqh $$0, xe $$1, xe $$2, xe $$3) {
      this($$0, $$1, new wa($$2), $$3);
   }

   public fpo(fqh $$0, xe $$1, wa $$2) {
      this($$0, $$1, $$2, a);
   }

   public fpo(fqh $$0, xe $$1, wa $$2, xe $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aS_() {
      this.w.c().b().a(10);
      this.w.a(new flv(this.l, this.p));
      this.w.a(new fli(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fko.a(c, fpe.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fko.a(d, $$1x -> ad.m().a($$0.getParent())).a(200).a()));
      fko $$0;
      if (this.m.F()) {
         $$0 = fko.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fko.a(b, $$0x -> this.m.a(new fqj())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      foa.a(this.w, this.H());
   }

   @Override
   public xe i() {
      return xd.a(this.l, this.u.a());
   }

   @Override
   public boolean aI_() {
      return false;
   }
}
