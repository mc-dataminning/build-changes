public class fsj extends fnx {
   private static final wy a = wy.c("gui.abuseReport.title");
   private static final wy b = wy.c("gui.abuseReport.message");
   private static final wy c = wy.c("gui.abuseReport.type.chat");
   private static final wy q = wy.c("gui.abuseReport.type.skin");
   private static final wy r = wy.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fnx u;
   private final gai v;
   private final fsn w;
   private final flx x = flx.d().a(6);

   public fsj(fnx $$0, gai $$1, fsn $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      this.x.c().b();
      this.x.a(new fjn(this.k, this.o), this.x.b().e(6));
      this.x.a(new fja(b, this.o).b(true), this.x.b().e(6));
      fig $$0 = this.x.a(fig.a(c, $$0x -> this.l.a(new fsf(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fjr.a(wy.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fjr.a(wy.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fig.a(q, $$0x -> this.l.a(new fsl(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fig.a(r, $$0x -> this.l.a(new fsi(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fly.b(20));
      this.x.a(fig.a(wx.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      flr.a(this.x, this.H());
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }
}
