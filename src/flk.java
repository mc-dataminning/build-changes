public class flk extends fhh {
   private static final vu a = vu.c("gui.abuseReport.title");
   private static final vu b = vu.c("gui.abuseReport.message");
   private static final vu c = vu.c("gui.abuseReport.type.chat");
   private static final vu k = vu.c("gui.abuseReport.type.skin");
   private static final vu l = vu.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fhh n;
   private final fti o;
   private final flo p;
   private final fez q = fez.d().a(6);

   public flk(fhh $$0, fti $$1, flo $$2) {
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
      this.q.a(new fcp(this.e, this.i), this.q.b().e(6));
      this.q.a(new fcc(b, this.i).b(true), this.q.b().e(6));
      fbi $$0 = this.q.a(fbi.a(c, $$0x -> this.f.a(new flg(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(fct.a(vu.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(fct.a(vu.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(fbi.a(k, $$0x -> this.f.a(new flm(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(fbi.a(l, $$0x -> this.f.a(new flj(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(ffa.b(20));
      this.q.a(fbi.a(vt.e, $$0x -> this.d()).a());
      this.q.a($$1 -> {
         fbg var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fet.a(this.q, this.F());
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
