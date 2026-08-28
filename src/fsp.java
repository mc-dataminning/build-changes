public class fsp extends fod {
   private static final wz a = wz.c("gui.abuseReport.title");
   private static final wz b = wz.c("gui.abuseReport.message");
   private static final wz c = wz.c("gui.abuseReport.type.chat");
   private static final wz r = wz.c("gui.abuseReport.type.skin");
   private static final wz s = wz.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fod v;
   private final gao w;
   private final fst x;
   private final fmd y = fmd.d().a(6);

   public fsp(fod $$0, gao $$1, fst $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public wz i() {
      return wy.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      this.y.c().b();
      this.y.a(new fjt(this.k, this.o), this.y.b().e(6));
      this.y.a(new fjg(b, this.o).b(true), this.y.b().e(6));
      fim $$0 = this.y.a(fim.a(c, $$0x -> this.l.a(new fsl(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fjx.a(wz.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fjx.a(wz.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fim.a(r, $$0x -> this.l.a(new fsr(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(fim.a(s, $$0x -> this.l.a(new fso(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fme.b(20));
      this.y.a(fim.a(wy.e, $$0x -> this.d()).a());
      this.y.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      flx.a(this.y, this.H());
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }
}
