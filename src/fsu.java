public class fsu extends fon {
   private static final xe a = xe.c("gui.abuseReport.title");
   private static final xe b = xe.c("gui.abuseReport.message");
   private static final xe c = xe.c("gui.abuseReport.type.chat");
   private static final xe d = xe.c("gui.abuseReport.type.skin");
   private static final xe r = xe.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fon u;
   private final gav v;
   private final fsy w;
   private final fme x = fme.d().a(6);

   public fsu(fon $$0, gav $$1, fsy $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      this.x.c().b();
      this.x.a(new fju(this.l, this.p), this.x.b().e(6));
      this.x.a(new fjh(b, this.p).b(true), this.x.b().e(6));
      fin $$0 = this.x.a(fin.a(c, $$0x -> this.m.a(new fsq(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fjy.a(xe.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fjy.a(xe.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fin.a(d, $$0x -> this.m.a(new fsw(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fin.a(r, $$0x -> this.m.a(new fst(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fmf.b(20));
      this.x.a(fin.a(xd.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fly.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
