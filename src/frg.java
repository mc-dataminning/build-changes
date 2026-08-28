public class frg extends fne {
   private static final xp a = xp.c("gui.abuseReport.title");
   private static final xp b = xp.c("gui.abuseReport.message");
   private static final xp c = xp.c("gui.abuseReport.type.chat");
   private static final xp d = xp.c("gui.abuseReport.type.skin");
   private static final xp r = xp.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fne u;
   private final fze v;
   private final frk w;
   private final fkw x = fkw.d().a(6);

   public frg(fne $$0, fze $$1, frk $$2) {
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
      this.x.a(new fim(this.l, this.p), this.x.b().e(6));
      this.x.a(new fhz(b, this.p).b(true), this.x.b().e(6));
      fhf $$0 = this.x.a(fhf.a(c, $$0x -> this.m.a(new frc(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fiq.a(xp.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fiq.a(xp.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fhf.a(d, $$0x -> this.m.a(new fri(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fhf.a(r, $$0x -> this.m.a(new frf(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fkx.b(20));
      this.x.a(fhf.a(xo.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fhd var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fkq.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
