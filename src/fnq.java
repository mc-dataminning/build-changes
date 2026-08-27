public class fnq extends fjo {
   private static final wg a = wg.c("gui.abuseReport.title");
   private static final wg b = wg.c("gui.abuseReport.message");
   private static final wg c = wg.c("gui.abuseReport.type.chat");
   private static final wg d = wg.c("gui.abuseReport.type.skin");
   private static final wg o = wg.c("gui.abuseReport.type.name");
   private static final int p = 6;
   private final fjo q;
   private final fvp r;
   private final fnu s;
   private final fhg u = fhg.d().a(6);

   public fnq(fjo $$0, fvp $$1, fnu $$2) {
      super(a);
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   @Override
   public wg i() {
      return wf.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      this.u.c().b();
      this.u.a(new few(this.i, this.m), this.u.b().e(6));
      this.u.a(new fej(b, this.m).b(true), this.u.b().e(6));
      fdp $$0 = this.u.a(fdp.a(c, $$0x -> this.j.a(new fnm(this.q, this.r, this.s.d()))).a());
      if (!this.s.k()) {
         $$0.j = false;
         $$0.a(ffa.a(wg.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.s.j()) {
         $$0.j = false;
         $$0.a(ffa.a(wg.a("gui.socialInteractions.tooltip.report.no_messages", this.s.c())));
      }

      this.u.a(fdp.a(d, $$0x -> this.j.a(new fns(this.q, this.r, this.s.d(), this.s.h()))).a());
      this.u.a(fdp.a(o, $$0x -> this.j.a(new fnp(this.q, this.r, this.s.d(), this.s.c()))).a());
      this.u.a(fhh.b(20));
      this.u.a(fdp.a(wf.e, $$0x -> this.d()).a());
      this.u.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fha.a(this.u, this.G());
   }

   @Override
   public void d() {
      this.j.a(this.q);
   }
}
