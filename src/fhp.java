public class fhp extends fdm {
   private static final vg a = vg.c("gui.abuseReport.title");
   private static final vg b = vg.c("gui.abuseReport.message");
   private static final vg c = vg.c("gui.abuseReport.type.chat");
   private static final vg k = vg.c("gui.abuseReport.type.skin");
   private static final vg l = vg.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fdm n;
   private final fpi o;
   private final fht p;
   private final fbf q = fbf.d().a(6);

   public fhp(fdm $$0, fpi $$1, fht $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vg i() {
      return vf.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      this.q.c().b();
      this.q.a(new eyy(this.e, this.i), this.q.b().e(6));
      this.q.a(new eyl(b, this.i).b(true), this.q.b().e(6));
      exr $$0 = this.q.a(exr.a(c, $$0x -> this.f.a(new fhl(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(ezc.a(vg.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(ezc.a(vg.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(exr.a(k, $$0x -> this.f.a(new fhr(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(exr.a(l, $$0x -> this.f.a(new fho(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(fbg.b(20));
      this.q.a(exr.a(vf.e, $$0x -> this.d()).a());
      this.q.a($$1 -> {
         exp var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      faz.a(this.q, this.F());
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
