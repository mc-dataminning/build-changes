public class fhd extends fda {
   private static final vf a = vf.c("gui.abuseReport.title");
   private static final vf b = vf.c("gui.abuseReport.message");
   private static final vf c = vf.c("gui.abuseReport.type.chat");
   private static final vf k = vf.c("gui.abuseReport.type.skin");
   private static final vf l = vf.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fda n;
   private final fov o;
   private final fhh p;
   private final fat q = fat.d().a(6);

   public fhd(fda $$0, fov $$1, fhh $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vf h() {
      return ve.a(super.h(), b);
   }

   @Override
   protected void aN_() {
      this.q.c().b();
      this.q.a(new eym(this.e, this.i), this.q.b().e(6));
      this.q.a(new exz(b, this.i).b(true), this.q.b().e(6));
      exf $$0 = this.q.a(exf.a(c, $$0x -> this.f.a(new fgz(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(eyq.a(vf.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(eyq.a(vf.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(exf.a(k, $$0x -> this.f.a(new fhf(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(exf.a(l, $$0x -> this.f.a(new fhc(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(fau.b(20));
      this.q.a(exf.a(ve.e, $$0x -> this.aE_()).a());
      this.q.a($$1 -> {
         exd var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fan.a(this.q, this.F());
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }
}
