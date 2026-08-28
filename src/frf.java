public class frf extends fnd {
   private static final xp a = xp.c("gui.abuseReport.title");
   private static final xp b = xp.c("gui.abuseReport.message");
   private static final xp c = xp.c("gui.abuseReport.type.chat");
   private static final xp d = xp.c("gui.abuseReport.type.skin");
   private static final xp r = xp.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fnd u;
   private final fzd v;
   private final frj w;
   private final fkv x = fkv.d().a(6);

   public frf(fnd $$0, fzd $$1, frj $$2) {
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
      this.x.a(new fil(this.l, this.p), this.x.b().e(6));
      this.x.a(new fhy(b, this.p).b(true), this.x.b().e(6));
      fhe $$0 = this.x.a(fhe.a(c, $$0x -> this.m.a(new frb(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fip.a(xp.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fip.a(xp.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fhe.a(d, $$0x -> this.m.a(new frh(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fhe.a(r, $$0x -> this.m.a(new fre(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fkw.b(20));
      this.x.a(fhe.a(xo.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fhc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fkp.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
