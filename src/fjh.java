public class fjh extends ffe {
   private static final vq a = vq.c("gui.abuseReport.title");
   private static final vq b = vq.c("gui.abuseReport.message");
   private static final vq c = vq.c("gui.abuseReport.type.chat");
   private static final vq k = vq.c("gui.abuseReport.type.skin");
   private static final vq l = vq.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final ffe n;
   private final frb o;
   private final fjl p;
   private final fcx q = fcx.d().a(6);

   public fjh(ffe $$0, frb $$1, fjl $$2) {
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
      this.q.a(new fao(this.e, this.i), this.q.b().e(6));
      this.q.a(new fab(b, this.i).b(true), this.q.b().e(6));
      ezh $$0 = this.q.a(ezh.a(c, $$0x -> this.f.a(new fjd(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(fas.a(vq.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(fas.a(vq.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(ezh.a(k, $$0x -> this.f.a(new fjj(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(ezh.a(l, $$0x -> this.f.a(new fjg(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(fcy.b(20));
      this.q.a(ezh.a(vp.e, $$0x -> this.d()).a());
      this.q.a($$1 -> {
         ezf var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fcr.a(this.q, this.F());
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
