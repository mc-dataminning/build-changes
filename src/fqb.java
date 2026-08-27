public class fqb extends flz {
   private static final wx a = wx.c("gui.abuseReport.title");
   private static final wx b = wx.c("gui.abuseReport.message");
   private static final wx c = wx.c("gui.abuseReport.type.chat");
   private static final wx d = wx.c("gui.abuseReport.type.skin");
   private static final wx r = wx.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final flz u;
   private final fxz v;
   private final fqf w;
   private final fjr x = fjr.d().a(6);

   public fqb(flz $$0, fxz $$1, fqf $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public wx i() {
      return ww.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      this.x.c().b();
      this.x.a(new fhh(this.l, this.p), this.x.b().e(6));
      this.x.a(new fgu(b, this.p).b(true), this.x.b().e(6));
      fga $$0 = this.x.a(fga.a(c, $$0x -> this.m.a(new fpx(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fhl.a(wx.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fhl.a(wx.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fga.a(d, $$0x -> this.m.a(new fqd(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fga.a(r, $$0x -> this.m.a(new fqa(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fjs.b(20));
      this.x.a(fga.a(ww.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         ffy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fjl.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
