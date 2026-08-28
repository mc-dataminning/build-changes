public class fud extends fpt {
   private static final xd a = xd.c("gui.abuseReport.title");
   private static final xd b = xd.c("gui.abuseReport.message");
   private static final xd c = xd.c("gui.abuseReport.type.chat");
   private static final xd d = xd.c("gui.abuseReport.type.skin");
   private static final xd s = xd.c("gui.abuseReport.type.name");
   private static final int u = 6;
   private final fpt v;
   private final gcf w;
   private final fuh x;
   private final fns y = fns.d().a(6);

   public fud(fpt $$0, gcf $$1, fuh $$2) {
      super(a);
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   public xd i() {
      return xc.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      this.y.c().b();
      this.y.a(new flh(this.l, this.p), this.y.b().e(6));
      this.y.a(new fku(b, this.p).b(true), this.y.b().e(6));
      fka $$0 = this.y.a(fka.a(c, $$0x -> this.m.a(new ftz(this.v, this.w, this.x.d()))).a());
      if (!this.x.k()) {
         $$0.j = false;
         $$0.a(fll.a(xd.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.x.j()) {
         $$0.j = false;
         $$0.a(fll.a(xd.a("gui.socialInteractions.tooltip.report.no_messages", this.x.c())));
      }

      this.y.a(fka.a(d, $$0x -> this.m.a(new fuf(this.v, this.w, this.x.d(), this.x.h()))).a());
      this.y.a(fka.a(s, $$0x -> this.m.a(new fuc(this.v, this.w, this.x.d(), this.x.c()))).a());
      this.y.a(fnt.b(20));
      this.y.a(fka.a(xc.e, $$0x -> this.d()).a());
      this.y.a($$1 -> {
         fjy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fnm.a(this.y, this.H());
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
