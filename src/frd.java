public class frd extends fnb {
   private static final xo a = xo.c("gui.abuseReport.title");
   private static final xo b = xo.c("gui.abuseReport.message");
   private static final xo c = xo.c("gui.abuseReport.type.chat");
   private static final xo d = xo.c("gui.abuseReport.type.skin");
   private static final xo r = xo.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fnb u;
   private final fzb v;
   private final frh w;
   private final fkt x = fkt.d().a(6);

   public frd(fnb $$0, fzb $$1, frh $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      this.x.c().b();
      this.x.a(new fij(this.l, this.p), this.x.b().e(6));
      this.x.a(new fhw(b, this.p).b(true), this.x.b().e(6));
      fhc $$0 = this.x.a(fhc.a(c, $$0x -> this.m.a(new fqz(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fin.a(xo.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fin.a(xo.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fhc.a(d, $$0x -> this.m.a(new frf(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fhc.a(r, $$0x -> this.m.a(new frc(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fku.b(20));
      this.x.a(fhc.a(xn.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fha var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fkn.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
