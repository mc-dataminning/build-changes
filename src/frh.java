public class frh extends fnf {
   private static final xp a = xp.c("gui.abuseReport.title");
   private static final xp b = xp.c("gui.abuseReport.message");
   private static final xp c = xp.c("gui.abuseReport.type.chat");
   private static final xp d = xp.c("gui.abuseReport.type.skin");
   private static final xp r = xp.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fnf u;
   private final fzf v;
   private final frl w;
   private final fkx x = fkx.d().a(6);

   public frh(fnf $$0, fzf $$1, frl $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public xp i() {
      return xo.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      this.x.c().b();
      this.x.a(new fin(this.l, this.p), this.x.b().e(6));
      this.x.a(new fia(b, this.p).b(true), this.x.b().e(6));
      fhg $$0 = this.x.a(fhg.a(c, $$0x -> this.m.a(new frd(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fir.a(xp.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fir.a(xp.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fhg.a(d, $$0x -> this.m.a(new frj(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fhg.a(r, $$0x -> this.m.a(new frg(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fky.b(20));
      this.x.a(fhg.a(xo.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fhe var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fkr.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
