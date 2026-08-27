public class fow extends fkt {
   private static final ws a = ws.c("gui.abuseReport.title");
   private static final ws b = ws.c("gui.abuseReport.message");
   private static final ws c = ws.c("gui.abuseReport.type.chat");
   private static final ws d = ws.c("gui.abuseReport.type.skin");
   private static final ws r = ws.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fkt u;
   private final fwu v;
   private final fpa w;
   private final fil x = fil.d().a(6);

   public fow(fkt $$0, fwu $$1, fpa $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public ws i() {
      return wr.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      this.x.c().b();
      this.x.a(new fgb(this.l, this.p), this.x.b().e(6));
      this.x.a(new ffo(b, this.p).b(true), this.x.b().e(6));
      feu $$0 = this.x.a(feu.a(c, $$0x -> this.m.a(new fos(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fgf.a(ws.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fgf.a(ws.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(feu.a(d, $$0x -> this.m.a(new foy(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(feu.a(r, $$0x -> this.m.a(new fov(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fim.b(20));
      this.x.a(feu.a(wr.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fif.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
