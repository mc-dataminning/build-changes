public class fsn extends fob {
   private static final wz a = wz.c("gui.abuseReport.title");
   private static final wz b = wz.c("gui.abuseReport.message");
   private static final wz c = wz.c("gui.abuseReport.type.chat");
   private static final wz r = wz.c("gui.abuseReport.type.skin");
   private static final wz s = wz.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fob v;
   private final gam w;
   private final fsr x;
   private final fmb y = fmb.d().a(6);

   public fsn(fob $$0, gam $$1, fsr $$2) {
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
      this.y.a(new fjr(this.k, this.o), this.y.b().e(6));
      this.y.a(new fje(b, this.o).b(true), this.y.b().e(6));
      fik $$0 = this.y.a(fik.a(c, $$0x -> this.l.a(new fsj(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fjv.a(wz.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fjv.a(wz.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fik.a(r, $$0x -> this.l.a(new fsp(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(fik.a(s, $$0x -> this.l.a(new fsm(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fmc.b(20));
      this.y.a(fik.a(wy.e, $$0x -> this.d()).a());
      this.y.a($$1 -> {
         fii var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      flv.a(this.y, this.H());
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }
}
