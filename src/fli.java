public class fli extends fhf {
   private static final vu a = vu.c("gui.abuseReport.title");
   private static final vu b = vu.c("gui.abuseReport.message");
   private static final vu c = vu.c("gui.abuseReport.type.chat");
   private static final vu k = vu.c("gui.abuseReport.type.skin");
   private static final vu l = vu.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fhf n;
   private final ftg o;
   private final flm p;
   private final fex q = fex.d().a(6);

   public fli(fhf $$0, ftg $$1, flm $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vu i() {
      return vt.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      this.q.c().b();
      this.q.a(new fcn(this.e, this.i), this.q.b().e(6));
      this.q.a(new fca(b, this.i).b(true), this.q.b().e(6));
      fbg $$0 = this.q.a(fbg.a(c, $$0x -> this.f.a(new fle(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(fcr.a(vu.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(fcr.a(vu.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(fbg.a(k, $$0x -> this.f.a(new flk(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(fbg.a(l, $$0x -> this.f.a(new flh(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(fey.b(20));
      this.q.a(fbg.a(vt.e, $$0x -> this.d()).a());
      this.q.a($$1 -> {
         fbe var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fer.a(this.q, this.F());
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
