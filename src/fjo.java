public class fjo extends ffl {
   private static final vq a = vq.c("gui.abuseReport.title");
   private static final vq b = vq.c("gui.abuseReport.message");
   private static final vq c = vq.c("gui.abuseReport.type.chat");
   private static final vq k = vq.c("gui.abuseReport.type.skin");
   private static final vq l = vq.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final ffl n;
   private final frj o;
   private final fjs p;
   private final fde q = fde.d().a(6);

   public fjo(ffl $$0, frj $$1, fjs $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vq i() {
      return vp.a(super.i(), b);
   }

   @Override
   protected void aQ_() {
      this.q.c().b();
      this.q.a(new fav(this.e, this.i), this.q.b().e(6));
      this.q.a(new fai(b, this.i).b(true), this.q.b().e(6));
      ezo $$0 = this.q.a(ezo.a(c, $$0x -> this.f.a(new fjk(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(faz.a(vq.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(faz.a(vq.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(ezo.a(k, $$0x -> this.f.a(new fjq(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(ezo.a(l, $$0x -> this.f.a(new fjn(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(fdf.b(20));
      this.q.a(ezo.a(vp.e, $$0x -> this.d()).a());
      this.q.a($$1 -> {
         ezm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fcy.a(this.q, this.F());
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
