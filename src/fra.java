public class fra extends fmy {
   private static final xl a = xl.c("gui.abuseReport.title");
   private static final xl b = xl.c("gui.abuseReport.message");
   private static final xl c = xl.c("gui.abuseReport.type.chat");
   private static final xl d = xl.c("gui.abuseReport.type.skin");
   private static final xl r = xl.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fmy u;
   private final fyy v;
   private final fre w;
   private final fkq x = fkq.d().a(6);

   public fra(fmy $$0, fyy $$1, fre $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      this.x.c().b();
      this.x.a(new fig(this.l, this.p), this.x.b().e(6));
      this.x.a(new fht(b, this.p).b(true), this.x.b().e(6));
      fgz $$0 = this.x.a(fgz.a(c, $$0x -> this.m.a(new fqw(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fik.a(xl.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fik.a(xl.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fgz.a(d, $$0x -> this.m.a(new frc(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fgz.a(r, $$0x -> this.m.a(new fqz(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fkr.b(20));
      this.x.a(fgz.a(xk.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fgx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fkk.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
